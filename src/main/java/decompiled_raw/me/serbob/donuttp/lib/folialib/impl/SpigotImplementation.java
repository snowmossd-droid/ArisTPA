/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.Location
 *  org.bukkit.World
 *  org.bukkit.block.Block
 *  org.bukkit.entity.Entity
 *  org.bukkit.entity.Player
 *  org.bukkit.entity.Projectile
 *  org.bukkit.event.player.PlayerTeleportEvent$TeleportCause
 *  org.bukkit.plugin.Plugin
 *  org.bukkit.scheduler.BukkitScheduler
 *  org.bukkit.scheduler.BukkitTask
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package me.serbob.donuttp.lib.folialib.impl;

import java.util.List;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import me.serbob.donuttp.lib.folialib.FoliaLib;
import me.serbob.donuttp.lib.folialib.enums.EntityTaskResult;
import me.serbob.donuttp.lib.folialib.impl.PlatformScheduler;
import me.serbob.donuttp.lib.folialib.type.Ref;
import me.serbob.donuttp.lib.folialib.util.TimeConverter;
import me.serbob.donuttp.lib.folialib.wrapper.task.WrappedBukkitTask;
import me.serbob.donuttp.lib.folialib.wrapper.task.WrappedTask;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Projectile;
import org.bukkit.event.player.PlayerTeleportEvent;
import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitScheduler;
import org.bukkit.scheduler.BukkitTask;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class SpigotImplementation
implements PlatformScheduler {
    private final Plugin plugin;
    @NotNull
    private final BukkitScheduler scheduler;

    public SpigotImplementation(FoliaLib foliaLib) {
        this.plugin = foliaLib.getPlugin();
        this.scheduler = this.plugin.getServer().getScheduler();
    }

    @Override
    public boolean isOwnedByCurrentRegion(@NotNull Location location) {
        return this.plugin.getServer().isPrimaryThread();
    }

    @Override
    public boolean isOwnedByCurrentRegion(@NotNull Location location, int squareRadiusChunks) {
        return this.plugin.getServer().isPrimaryThread();
    }

    @Override
    public boolean isOwnedByCurrentRegion(@NotNull Block block) {
        return this.plugin.getServer().isPrimaryThread();
    }

    @Override
    public boolean isOwnedByCurrentRegion(@NotNull World world, int chunkX, int chunkZ) {
        return this.plugin.getServer().isPrimaryThread();
    }

    @Override
    public boolean isOwnedByCurrentRegion(@NotNull World world, int chunkX, int chunkZ, int squareRadiusChunks) {
        return this.plugin.getServer().isPrimaryThread();
    }

    @Override
    public boolean isOwnedByCurrentRegion(@NotNull Entity entity) {
        return this.plugin.getServer().isPrimaryThread();
    }

    @Override
    public boolean isGlobalTickThread() {
        return this.plugin.getServer().isPrimaryThread();
    }

    @Override
    @NotNull
    public CompletableFuture<Void> runNextTick(@NotNull Consumer<WrappedTask> consumer) {
        CompletableFuture<Void> completableFuture = new CompletableFuture<Void>();
        this.scheduler.runTask(this.plugin, task -> {
            consumer.accept(this.wrapTask(task));
            completableFuture.complete(null);
        });
        return completableFuture;
    }

    @Override
    @NotNull
    public CompletableFuture<Void> runAsync(@NotNull Consumer<WrappedTask> consumer) {
        CompletableFuture<Void> completableFuture = new CompletableFuture<Void>();
        this.scheduler.runTaskAsynchronously(this.plugin, task -> {
            consumer.accept(this.wrapTask(task));
            completableFuture.complete(null);
        });
        return completableFuture;
    }

    @Override
    public WrappedTask runLater(@NotNull Runnable runnable, long delay) {
        return this.wrapTask(this.scheduler.runTaskLater(this.plugin, runnable, delay));
    }

    @Override
    @NotNull
    public CompletableFuture<Void> runLater(@NotNull Consumer<WrappedTask> consumer, long delay) {
        CompletableFuture<Void> completableFuture = new CompletableFuture<Void>();
        this.scheduler.runTaskLater(this.plugin, task -> {
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
        return this.wrapTask(this.scheduler.runTaskLaterAsynchronously(this.plugin, runnable, delay));
    }

    @Override
    @NotNull
    public CompletableFuture<Void> runLaterAsync(@NotNull Consumer<WrappedTask> consumer, long delay) {
        CompletableFuture<Void> completableFuture = new CompletableFuture<Void>();
        this.scheduler.runTaskLaterAsynchronously(this.plugin, task -> {
            consumer.accept(this.wrapTask(task));
            completableFuture.complete(null);
        }, delay);
        return completableFuture;
    }

    @Override
    public WrappedTask runLaterAsync(@NotNull Runnable runnable, long delay, TimeUnit unit) {
        return this.runLaterAsync(runnable, TimeConverter.toTicks(delay, unit));
    }

    @Override
    @NotNull
    public CompletableFuture<Void> runLaterAsync(@NotNull Consumer<WrappedTask> consumer, long delay, TimeUnit unit) {
        return this.runLaterAsync(consumer, TimeConverter.toTicks(delay, unit));
    }

    @Override
    public WrappedTask runTimer(@NotNull Runnable runnable, long delay, long period) {
        return this.wrapTask(this.scheduler.runTaskTimer(this.plugin, runnable, delay, period));
    }

    @Override
    public void runTimer(@NotNull Consumer<WrappedTask> consumer, long delay, long period) {
        this.scheduler.runTaskTimer(this.plugin, task -> consumer.accept(this.wrapTask(task)), delay, period);
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
        return this.wrapTask(this.scheduler.runTaskTimerAsynchronously(this.plugin, runnable, delay, period));
    }

    @Override
    public void runTimerAsync(@NotNull Consumer<WrappedTask> consumer, long delay, long period) {
        this.scheduler.runTaskTimerAsynchronously(this.plugin, task -> consumer.accept(this.wrapTask(task)), delay, period);
    }

    @Override
    public WrappedTask runTimerAsync(@NotNull Runnable runnable, long delay, long period, TimeUnit unit) {
        return this.runTimerAsync(runnable, TimeConverter.toTicks(delay, unit), TimeConverter.toTicks(period, unit));
    }

    @Override
    public void runTimerAsync(@NotNull Consumer<WrappedTask> consumer, long delay, long period, TimeUnit unit) {
        this.runTimerAsync(consumer, TimeConverter.toTicks(delay, unit), TimeConverter.toTicks(period, unit));
    }

    @Override
    @NotNull
    public CompletableFuture<Void> runAtLocation(Location location, @NotNull Consumer<WrappedTask> consumer) {
        return this.runNextTick(consumer);
    }

    @Override
    public WrappedTask runAtLocationLater(Location location, @NotNull Runnable runnable, long delay) {
        return this.runLater(runnable, delay);
    }

    @Override
    @NotNull
    public CompletableFuture<Void> runAtLocationLater(Location location, @NotNull Consumer<WrappedTask> consumer, long delay) {
        return this.runLater(consumer, delay);
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
        return this.runTimer(runnable, delay, period);
    }

    @Override
    public void runAtLocationTimer(Location location, @NotNull Consumer<WrappedTask> consumer, long delay, long period) {
        this.runTimer(consumer, delay, period);
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
        this.runNextTick(task -> {
            consumer.accept((WrappedTask)task);
            completableFuture.complete(EntityTaskResult.SUCCESS);
        });
        return completableFuture;
    }

    @Override
    @NotNull
    public CompletableFuture<EntityTaskResult> runAtEntityWithFallback(Entity entity, @NotNull Consumer<WrappedTask> consumer, Runnable fallback) {
        CompletableFuture<EntityTaskResult> completableFuture = new CompletableFuture<EntityTaskResult>();
        this.runNextTick(task -> {
            if (this.isValid(entity)) {
                consumer.accept((WrappedTask)task);
                completableFuture.complete(EntityTaskResult.SUCCESS);
            } else {
                fallback.run();
                completableFuture.complete(EntityTaskResult.ENTITY_RETIRED);
            }
        });
        return completableFuture;
    }

    @Override
    public WrappedTask runAtEntityLater(Entity entity, @NotNull Runnable runnable, long delay) {
        return this.runAtEntityLater(entity, runnable, null, delay);
    }

    @Override
    public WrappedTask runAtEntityLater(Entity entity, @NotNull Runnable runnable, Runnable fallback, long delay) {
        if (!this.isValid(entity)) {
            if (fallback != null) {
                fallback.run();
            }
            return null;
        }
        return this.runLater(runnable, delay);
    }

    @Override
    @NotNull
    public CompletableFuture<Void> runAtEntityLater(Entity entity, @NotNull Consumer<WrappedTask> consumer, long delay) {
        return this.runAtEntityLater(entity, consumer, null, delay);
    }

    @Override
    @NotNull
    public CompletableFuture<Void> runAtEntityLater(Entity entity, @NotNull Consumer<WrappedTask> consumer, @Nullable Runnable fallback, long delay) {
        CompletableFuture<Void> completableFuture = new CompletableFuture<Void>();
        if (!this.isValid(entity)) {
            completableFuture.complete(null);
            if (fallback != null) {
                fallback.run();
            }
            return completableFuture;
        }
        this.runLater((WrappedTask task) -> {
            if (!this.isValid(entity)) {
                if (fallback != null) {
                    fallback.run();
                }
                completableFuture.complete(null);
                return;
            }
            consumer.accept((WrappedTask)task);
            completableFuture.complete(null);
        }, delay);
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
    public WrappedTask runAtEntityTimer(Entity entity, @NotNull Runnable runnable, @Nullable Runnable fallback, long delay, long period) {
        if (!this.isValid(entity)) {
            if (fallback != null) {
                fallback.run();
            }
            return null;
        }
        Ref<WrappedTask> ref = new Ref<WrappedTask>();
        WrappedTask wrappedTask = this.runTimer(() -> {
            WrappedTask wrappedTask = (WrappedTask)ref.get();
            if (wrappedTask != null && !this.isValid(entity)) {
                wrappedTask.cancel();
                if (fallback != null) {
                    fallback.run();
                }
                return;
            }
            runnable.run();
        }, delay, period);
        ref.set(wrappedTask);
        return wrappedTask;
    }

    @Override
    public void runAtEntityTimer(Entity entity, @NotNull Consumer<WrappedTask> consumer, long delay, long period) {
        this.runAtEntityTimer(entity, consumer, null, delay, period);
    }

    @Override
    public void runAtEntityTimer(Entity entity, @NotNull Consumer<WrappedTask> consumer, Runnable fallback, long delay, long period) {
        if (!this.isValid(entity)) {
            if (fallback != null) {
                fallback.run();
            }
            return;
        }
        this.runTimer((WrappedTask task) -> {
            if (!this.isValid(entity)) {
                if (fallback != null) {
                    fallback.run();
                }
                return;
            }
            consumer.accept((WrappedTask)task);
        }, delay, period);
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
        this.scheduler.cancelTasks(this.plugin);
    }

    @Override
    public List<WrappedTask> getAllTasks() {
        return this.scheduler.getPendingTasks().stream().filter(task -> task.getOwner().equals(this.plugin)).map(this::wrapTask).collect(Collectors.toList());
    }

    @Override
    public List<WrappedTask> getAllServerTasks() {
        return this.scheduler.getPendingTasks().stream().map(this::wrapTask).collect(Collectors.toList());
    }

    @Override
    public Player getPlayer(String name) {
        return this.getPlayerFromMainThread(() -> this.plugin.getServer().getPlayer(name));
    }

    @Override
    public Player getPlayerExact(String name) {
        return this.getPlayerFromMainThread(() -> this.plugin.getServer().getPlayerExact(name));
    }

    @Override
    public Player getPlayer(UUID uuid) {
        return this.getPlayerFromMainThread(() -> this.plugin.getServer().getPlayer(uuid));
    }

    private Player getPlayerFromMainThread(Supplier<Player> playerSupplier) {
        if (this.plugin.getServer().isPrimaryThread()) {
            return playerSupplier.get();
        }
        try {
            return (Player)this.scheduler.callSyncMethod(this.plugin, playerSupplier::get).get();
        }
        catch (InterruptedException | ExecutionException exception) {
            exception.printStackTrace();
            return null;
        }
    }

    @Override
    public CompletableFuture<Boolean> teleportAsync(Entity entity, Location location) {
        return this.teleportAsync(entity, location, PlayerTeleportEvent.TeleportCause.PLUGIN);
    }

    @Override
    public CompletableFuture<Boolean> teleportAsync(Entity entity, Location location, PlayerTeleportEvent.TeleportCause cause) {
        CompletableFuture<Boolean> completableFuture = new CompletableFuture<Boolean>();
        this.runAtEntity(entity, task -> {
            if (this.isValid(entity)) {
                entity.teleport(location);
                completableFuture.complete(true);
            } else {
                completableFuture.complete(false);
            }
        });
        return completableFuture;
    }

    @Override
    public WrappedTask wrapTask(Object nativeTask) {
        if (!(nativeTask instanceof BukkitTask)) {
            String string = nativeTask == null ? null : nativeTask.getClass().getName();
            throw new IllegalArgumentException("The nativeTask provided must be a BukkitTask. Got: " + string + " instead.");
        }
        return new WrappedBukkitTask((BukkitTask)nativeTask);
    }

    private boolean isValid(Entity entity) {
        if (entity.isValid()) {
            return !(entity instanceof Player) || ((Player)entity).isOnline();
        }
        return entity instanceof Projectile && !entity.isDead();
    }
}

