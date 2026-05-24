/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.papermc.paper.threadedregions.scheduler.AsyncScheduler
 *  io.papermc.paper.threadedregions.scheduler.GlobalRegionScheduler
 *  io.papermc.paper.threadedregions.scheduler.RegionScheduler
 *  io.papermc.paper.threadedregions.scheduler.ScheduledTask
 *  it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap
 *  org.bukkit.Location
 *  org.bukkit.World
 *  org.bukkit.block.Block
 *  org.bukkit.entity.Entity
 *  org.bukkit.entity.Player
 *  org.bukkit.event.player.PlayerTeleportEvent$TeleportCause
 *  org.bukkit.plugin.Plugin
 *  org.jetbrains.annotations.NotNull
 */
package me.serbob.donuttp.lib.folialib.impl;

import io.papermc.paper.threadedregions.scheduler.AsyncScheduler;
import io.papermc.paper.threadedregions.scheduler.GlobalRegionScheduler;
import io.papermc.paper.threadedregions.scheduler.RegionScheduler;
import io.papermc.paper.threadedregions.scheduler.ScheduledTask;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import me.serbob.donuttp.lib.folialib.FoliaLib;
import me.serbob.donuttp.lib.folialib.enums.EntityTaskResult;
import me.serbob.donuttp.lib.folialib.impl.PlatformScheduler;
import me.serbob.donuttp.lib.folialib.util.InvalidTickDelayNotifier;
import me.serbob.donuttp.lib.folialib.util.TimeConverter;
import me.serbob.donuttp.lib.folialib.wrapper.task.WrappedFoliaTask;
import me.serbob.donuttp.lib.folialib.wrapper.task.WrappedTask;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerTeleportEvent;
import org.bukkit.plugin.Plugin;
import org.jetbrains.annotations.NotNull;

public class FoliaImplementation
implements PlatformScheduler {
    private final Plugin plugin;
    private final GlobalRegionScheduler globalRegionScheduler;
    private final RegionScheduler regionScheduler;
    private final AsyncScheduler asyncScheduler;

    public FoliaImplementation(FoliaLib foliaLib) {
        this.plugin = foliaLib.getPlugin();
        this.globalRegionScheduler = this.plugin.getServer().getGlobalRegionScheduler();
        this.regionScheduler = this.plugin.getServer().getRegionScheduler();
        this.asyncScheduler = this.plugin.getServer().getAsyncScheduler();
    }

    @Override
    public boolean isOwnedByCurrentRegion(@NotNull Location location) {
        return this.plugin.getServer().isOwnedByCurrentRegion(location);
    }

    @Override
    public boolean isOwnedByCurrentRegion(@NotNull Location location, int squareRadiusChunks) {
        return this.plugin.getServer().isOwnedByCurrentRegion(location, squareRadiusChunks);
    }

    @Override
    public boolean isOwnedByCurrentRegion(@NotNull Block block) {
        return this.plugin.getServer().isOwnedByCurrentRegion(block);
    }

    @Override
    public boolean isOwnedByCurrentRegion(@NotNull World world, int chunkX, int chunkZ) {
        return this.plugin.getServer().isOwnedByCurrentRegion(world, chunkX, chunkZ);
    }

    @Override
    public boolean isOwnedByCurrentRegion(@NotNull World world, int chunkX, int chunkZ, int squareRadiusChunks) {
        return this.plugin.getServer().isOwnedByCurrentRegion(world, chunkX, chunkZ, squareRadiusChunks);
    }

    @Override
    public boolean isOwnedByCurrentRegion(@NotNull Entity entity) {
        return this.plugin.getServer().isOwnedByCurrentRegion(entity);
    }

    @Override
    public boolean isGlobalTickThread() {
        return this.plugin.getServer().isGlobalTickThread();
    }

    @Override
    @NotNull
    public CompletableFuture<Void> runNextTick(@NotNull Consumer<WrappedTask> consumer) {
        CompletableFuture<Void> completableFuture = new CompletableFuture<Void>();
        this.globalRegionScheduler.run(this.plugin, task -> {
            consumer.accept(this.wrapTask(task));
            completableFuture.complete(null);
        });
        return completableFuture;
    }

    @Override
    @NotNull
    public CompletableFuture<Void> runAsync(@NotNull Consumer<WrappedTask> consumer) {
        CompletableFuture<Void> completableFuture = new CompletableFuture<Void>();
        this.asyncScheduler.runNow(this.plugin, task -> {
            consumer.accept(this.wrapTask(task));
            completableFuture.complete(null);
        });
        return completableFuture;
    }

    @Override
    public WrappedTask runLater(@NotNull Runnable runnable, long delay) {
        if (delay <= 0L) {
            InvalidTickDelayNotifier.notifyOnce(this.plugin.getLogger(), delay);
            delay = 1L;
        }
        return this.wrapTask(this.globalRegionScheduler.runDelayed(this.plugin, task -> runnable.run(), delay));
    }

    @Override
    @NotNull
    public CompletableFuture<Void> runLater(@NotNull Consumer<WrappedTask> consumer, long delay) {
        CompletableFuture<Void> completableFuture = new CompletableFuture<Void>();
        if (delay <= 0L) {
            InvalidTickDelayNotifier.notifyOnce(this.plugin.getLogger(), delay);
            delay = 1L;
        }
        this.globalRegionScheduler.runDelayed(this.plugin, task -> {
            consumer.accept(this.wrapTask(task));
            completableFuture.complete(null);
        }, delay);
        return completableFuture;
    }

    @Override
    public WrappedTask runLater(@NotNull Runnable runnable, long delay, TimeUnit unit) {
        return this.runLater(runnable, TimeConverter.toTicks(delay, unit));
    }

    @Override
    @NotNull
    public CompletableFuture<Void> runLater(@NotNull Consumer<WrappedTask> consumer, long delay, TimeUnit unit) {
        return this.runLater(consumer, TimeConverter.toTicks(delay, unit));
    }

    @Override
    public WrappedTask runLaterAsync(@NotNull Runnable runnable, long delay) {
        return this.runLaterAsync(runnable, TimeConverter.toMillis(delay), TimeUnit.MILLISECONDS);
    }

    @Override
    @NotNull
    public CompletableFuture<Void> runLaterAsync(@NotNull Consumer<WrappedTask> consumer, long delay) {
        return this.runLaterAsync(consumer, TimeConverter.toMillis(delay), TimeUnit.MILLISECONDS);
    }

    @Override
    public WrappedTask runLaterAsync(@NotNull Runnable runnable, long delay, TimeUnit unit) {
        return this.wrapTask(this.asyncScheduler.runDelayed(this.plugin, task -> runnable.run(), delay, unit));
    }

    @Override
    @NotNull
    public CompletableFuture<Void> runLaterAsync(@NotNull Consumer<WrappedTask> consumer, long delay, TimeUnit unit) {
        CompletableFuture<Void> completableFuture = new CompletableFuture<Void>();
        this.asyncScheduler.runDelayed(this.plugin, task -> {
            consumer.accept(this.wrapTask(task));
            completableFuture.complete(null);
        }, delay, unit);
        return completableFuture;
    }

    @Override
    public WrappedTask runTimer(@NotNull Runnable runnable, long delay, long period) {
        if (delay <= 0L) {
            InvalidTickDelayNotifier.notifyOnce(this.plugin.getLogger(), delay);
            delay = 1L;
        }
        if (period <= 0L) {
            InvalidTickDelayNotifier.notifyOnce(this.plugin.getLogger(), period);
            period = 1L;
        }
        return this.wrapTask(this.globalRegionScheduler.runAtFixedRate(this.plugin, task -> runnable.run(), delay, period));
    }

    @Override
    public void runTimer(@NotNull Consumer<WrappedTask> consumer, long delay, long period) {
        if (delay <= 0L) {
            InvalidTickDelayNotifier.notifyOnce(this.plugin.getLogger(), delay);
            delay = 1L;
        }
        if (period <= 0L) {
            InvalidTickDelayNotifier.notifyOnce(this.plugin.getLogger(), period);
            period = 1L;
        }
        this.globalRegionScheduler.runAtFixedRate(this.plugin, task -> consumer.accept(this.wrapTask(task)), delay, period);
    }

    @Override
    public WrappedTask runTimer(@NotNull Runnable runnable, long delay, long period, TimeUnit unit) {
        return this.runTimer(runnable, TimeConverter.toTicks(delay, unit), TimeConverter.toTicks(period, unit));
    }

    @Override
    public void runTimer(@NotNull Consumer<WrappedTask> consumer, long delay, long period, TimeUnit unit) {
        this.runTimer(consumer, TimeConverter.toTicks(delay, unit), TimeConverter.toTicks(period, unit));
    }

    @Override
    public WrappedTask runTimerAsync(@NotNull Runnable runnable, long delay, long period) {
        return this.runTimerAsync(runnable, TimeConverter.toMillis(delay), TimeConverter.toMillis(period), TimeUnit.MILLISECONDS);
    }

    @Override
    public void runTimerAsync(@NotNull Consumer<WrappedTask> consumer, long delay, long period) {
        this.runTimerAsync(consumer, TimeConverter.toMillis(delay), TimeConverter.toMillis(period), TimeUnit.MILLISECONDS);
    }

    @Override
    public WrappedTask runTimerAsync(@NotNull Runnable runnable, long delay, long period, TimeUnit unit) {
        return this.wrapTask(this.asyncScheduler.runAtFixedRate(this.plugin, task -> runnable.run(), delay, period, unit));
    }

    @Override
    public void runTimerAsync(@NotNull Consumer<WrappedTask> consumer, long delay, long period, TimeUnit unit) {
        this.asyncScheduler.runAtFixedRate(this.plugin, task -> consumer.accept(this.wrapTask(task)), delay, period, unit);
    }

    @Override
    @NotNull
    public CompletableFuture<Void> runAtLocation(Location location, @NotNull Consumer<WrappedTask> consumer) {
        CompletableFuture<Void> completableFuture = new CompletableFuture<Void>();
        this.regionScheduler.run(this.plugin, location, task -> {
            consumer.accept(this.wrapTask(task));
            completableFuture.complete(null);
        });
        return completableFuture;
    }

    @Override
    public WrappedTask runAtLocationLater(Location location, @NotNull Runnable runnable, long delay) {
        if (delay <= 0L) {
            InvalidTickDelayNotifier.notifyOnce(this.plugin.getLogger(), delay);
            delay = 1L;
        }
        return this.wrapTask(this.regionScheduler.runDelayed(this.plugin, location, task -> runnable.run(), delay));
    }

    @Override
    @NotNull
    public CompletableFuture<Void> runAtLocationLater(Location location, @NotNull Consumer<WrappedTask> consumer, long delay) {
        CompletableFuture<Void> completableFuture = new CompletableFuture<Void>();
        if (delay <= 0L) {
            InvalidTickDelayNotifier.notifyOnce(this.plugin.getLogger(), delay);
            delay = 1L;
        }
        this.regionScheduler.runDelayed(this.plugin, location, task -> {
            consumer.accept(this.wrapTask(task));
            completableFuture.complete(null);
        }, delay);
        return completableFuture;
    }

    @Override
    public WrappedTask runAtLocationLater(Location location, @NotNull Runnable runnable, long delay, TimeUnit unit) {
        return this.runAtLocationLater(location, runnable, TimeConverter.toTicks(delay, unit));
    }

    @Override
    @NotNull
    public CompletableFuture<Void> runAtLocationLater(Location location, @NotNull Consumer<WrappedTask> consumer, long delay, TimeUnit unit) {
        return this.runAtLocationLater(location, consumer, TimeConverter.toTicks(delay, unit));
    }

    @Override
    public WrappedTask runAtLocationTimer(Location location, @NotNull Runnable runnable, long delay, long period) {
        if (delay <= 0L) {
            InvalidTickDelayNotifier.notifyOnce(this.plugin.getLogger(), delay);
            delay = 1L;
        }
        if (period <= 0L) {
            InvalidTickDelayNotifier.notifyOnce(this.plugin.getLogger(), period);
            period = 1L;
        }
        return this.wrapTask(this.regionScheduler.runAtFixedRate(this.plugin, location, task -> runnable.run(), delay, period));
    }

    @Override
    public void runAtLocationTimer(Location location, @NotNull Consumer<WrappedTask> consumer, long delay, long period) {
        if (delay <= 0L) {
            InvalidTickDelayNotifier.notifyOnce(this.plugin.getLogger(), delay);
            delay = 1L;
        }
        if (period <= 0L) {
            InvalidTickDelayNotifier.notifyOnce(this.plugin.getLogger(), period);
            period = 1L;
        }
        this.regionScheduler.runAtFixedRate(this.plugin, location, task -> consumer.accept(this.wrapTask(task)), delay, period);
    }

    @Override
    public WrappedTask runAtLocationTimer(Location location, @NotNull Runnable runnable, long delay, long period, TimeUnit unit) {
        return this.runAtLocationTimer(location, runnable, TimeConverter.toTicks(delay, unit), TimeConverter.toTicks(period, unit));
    }

    @Override
    public void runAtLocationTimer(Location location, @NotNull Consumer<WrappedTask> consumer, long delay, long period, TimeUnit unit) {
        this.runAtLocationTimer(location, consumer, TimeConverter.toTicks(delay, unit), TimeConverter.toTicks(period, unit));
    }

    @Override
    @NotNull
    public CompletableFuture<EntityTaskResult> runAtEntity(Entity entity, @NotNull Consumer<WrappedTask> consumer) {
        CompletableFuture<EntityTaskResult> completableFuture = new CompletableFuture<EntityTaskResult>();
        ScheduledTask scheduledTask = entity.getScheduler().run(this.plugin, task -> {
            consumer.accept(this.wrapTask(task));
            completableFuture.complete(EntityTaskResult.SUCCESS);
        }, null);
        if (scheduledTask == null) {
            completableFuture.complete(EntityTaskResult.SCHEDULER_RETIRED);
        }
        return completableFuture;
    }

    @Override
    @NotNull
    public CompletableFuture<EntityTaskResult> runAtEntityWithFallback(Entity entity, @NotNull Consumer<WrappedTask> consumer, Runnable fallback) {
        CompletableFuture<EntityTaskResult> completableFuture = new CompletableFuture<EntityTaskResult>();
        ScheduledTask scheduledTask = entity.getScheduler().run(this.plugin, task -> {
            consumer.accept(this.wrapTask(task));
            completableFuture.complete(EntityTaskResult.SUCCESS);
        }, () -> {
            fallback.run();
            completableFuture.complete(EntityTaskResult.ENTITY_RETIRED);
        });
        if (scheduledTask == null) {
            completableFuture.complete(EntityTaskResult.SCHEDULER_RETIRED);
        }
        return completableFuture;
    }

    @Override
    public WrappedTask runAtEntityLater(Entity entity, @NotNull Runnable runnable, long delay) {
        return this.runAtEntityLater(entity, runnable, null, delay);
    }

    @Override
    public WrappedTask runAtEntityLater(Entity entity, @NotNull Runnable runnable, Runnable fallback, long delay) {
        if (delay <= 0L) {
            InvalidTickDelayNotifier.notifyOnce(this.plugin.getLogger(), delay);
            delay = 1L;
        }
        return this.wrapTask(entity.getScheduler().runDelayed(this.plugin, task -> runnable.run(), fallback, delay));
    }

    @Override
    @NotNull
    public CompletableFuture<Void> runAtEntityLater(Entity entity, @NotNull Consumer<WrappedTask> consumer, long delay) {
        return this.runAtEntityLater(entity, consumer, null, delay);
    }

    @Override
    @NotNull
    public CompletableFuture<Void> runAtEntityLater(Entity entity, @NotNull Consumer<WrappedTask> consumer, Runnable fallback, long delay) {
        CompletableFuture<Void> completableFuture = new CompletableFuture<Void>();
        if (fallback != null) {
            Runnable runnable = fallback;
            fallback = () -> {
                runnable.run();
                completableFuture.complete(null);
            };
        }
        if (delay <= 0L) {
            InvalidTickDelayNotifier.notifyOnce(this.plugin.getLogger(), delay);
            delay = 1L;
        }
        entity.getScheduler().runDelayed(this.plugin, task -> {
            consumer.accept(this.wrapTask(task));
            completableFuture.complete(null);
        }, fallback, delay);
        return completableFuture;
    }

    @Override
    public WrappedTask runAtEntityLater(Entity entity, @NotNull Runnable runnable, long delay, TimeUnit unit) {
        return this.runAtEntityLater(entity, runnable, TimeConverter.toTicks(delay, unit));
    }

    @Override
    @NotNull
    public CompletableFuture<Void> runAtEntityLater(Entity entity, @NotNull Consumer<WrappedTask> consumer, long delay, TimeUnit unit) {
        return this.runAtEntityLater(entity, consumer, TimeConverter.toTicks(delay, unit));
    }

    @Override
    public WrappedTask runAtEntityTimer(Entity entity, @NotNull Runnable runnable, long delay, long period) {
        return this.runAtEntityTimer(entity, runnable, null, delay, period);
    }

    @Override
    public WrappedTask runAtEntityTimer(Entity entity, @NotNull Runnable runnable, Runnable fallback, long delay, long period) {
        if (delay <= 0L) {
            InvalidTickDelayNotifier.notifyOnce(this.plugin.getLogger(), delay);
            delay = 1L;
        }
        if (period <= 0L) {
            InvalidTickDelayNotifier.notifyOnce(this.plugin.getLogger(), period);
            period = 1L;
        }
        return this.wrapTask(entity.getScheduler().runAtFixedRate(this.plugin, task -> runnable.run(), fallback, delay, period));
    }

    @Override
    public void runAtEntityTimer(Entity entity, @NotNull Consumer<WrappedTask> consumer, long delay, long period) {
        this.runAtEntityTimer(entity, consumer, null, delay, period);
    }

    @Override
    public void runAtEntityTimer(Entity entity, @NotNull Consumer<WrappedTask> consumer, Runnable fallback, long delay, long period) {
        if (delay <= 0L) {
            InvalidTickDelayNotifier.notifyOnce(this.plugin.getLogger(), delay);
            delay = 1L;
        }
        if (period <= 0L) {
            InvalidTickDelayNotifier.notifyOnce(this.plugin.getLogger(), period);
            period = 1L;
        }
        entity.getScheduler().runAtFixedRate(this.plugin, task -> consumer.accept(this.wrapTask(task)), fallback, delay, period);
    }

    @Override
    public WrappedTask runAtEntityTimer(Entity entity, @NotNull Runnable runnable, long delay, long period, TimeUnit unit) {
        return this.runAtEntityTimer(entity, runnable, TimeConverter.toTicks(delay, unit), TimeConverter.toTicks(period, unit));
    }

    @Override
    public void runAtEntityTimer(Entity entity, @NotNull Consumer<WrappedTask> consumer, long delay, long period, TimeUnit unit) {
        this.runAtEntityTimer(entity, consumer, TimeConverter.toTicks(delay, unit), TimeConverter.toTicks(period, unit));
    }

    @Override
    public void cancelTask(WrappedTask task) {
        task.cancel();
    }

    @Override
    public void cancelAllTasks() {
        this.globalRegionScheduler.cancelTasks(this.plugin);
        this.asyncScheduler.cancelTasks(this.plugin);
    }

    @Override
    public List<WrappedTask> getAllTasks() {
        try {
            return this.getAllScheduledTasks().stream().filter(task -> task.getOwningPlugin().equals(this.plugin)).map(this::wrapTask).collect(Collectors.toList());
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

    @Override
    public List<WrappedTask> getAllServerTasks() {
        try {
            return this.getAllScheduledTasks().stream().map(this::wrapTask).collect(Collectors.toList());
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

    @NotNull
    private List<ScheduledTask> getAllScheduledTasks() throws NoSuchFieldException, IllegalAccessException {
        Class<?> clazz = this.globalRegionScheduler.getClass();
        Field field = clazz.getDeclaredField("tasksByDeadline");
        boolean bl = field.isAccessible();
        field.setAccessible(true);
        Long2ObjectOpenHashMap long2ObjectOpenHashMap = (Long2ObjectOpenHashMap)field.get(this.globalRegionScheduler);
        field.setAccessible(bl);
        Class<?> clazz2 = this.asyncScheduler.getClass();
        Field field2 = clazz2.getDeclaredField("tasks");
        bl = field2.isAccessible();
        field2.setAccessible(true);
        Set set = (Set)field2.get(this.asyncScheduler);
        field2.setAccessible(bl);
        ArrayList arrayList = new ArrayList();
        for (List list : long2ObjectOpenHashMap.values()) {
            arrayList.addAll(list);
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size() + set.size());
        arrayList2.addAll(arrayList);
        arrayList2.addAll(set);
        return arrayList2;
    }

    @Override
    public Player getPlayer(String name) {
        return this.plugin.getServer().getPlayer(name);
    }

    @Override
    public Player getPlayerExact(String name) {
        return this.plugin.getServer().getPlayerExact(name);
    }

    @Override
    public Player getPlayer(UUID uuid) {
        return this.plugin.getServer().getPlayer(uuid);
    }

    @Override
    public CompletableFuture<Boolean> teleportAsync(Entity entity, Location location) {
        return entity.teleportAsync(location);
    }

    @Override
    public CompletableFuture<Boolean> teleportAsync(Entity entity, Location location, PlayerTeleportEvent.TeleportCause cause) {
        return entity.teleportAsync(location, cause);
    }

    @Override
    public WrappedTask wrapTask(Object nativeTask) {
        if (nativeTask == null) {
            return null;
        }
        if (!(nativeTask instanceof ScheduledTask)) {
            String string = nativeTask.getClass().getName();
            throw new IllegalArgumentException("The nativeTask provided must be a ScheduledTask. Got: " + string + " instead.");
        }
        return new WrappedFoliaTask((ScheduledTask)nativeTask);
    }
}

