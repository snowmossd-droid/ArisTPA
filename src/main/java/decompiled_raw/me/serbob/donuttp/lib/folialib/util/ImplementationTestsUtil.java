/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.Location
 *  org.bukkit.entity.Entity
 *  org.bukkit.event.player.PlayerTeleportEvent$TeleportCause
 *  org.bukkit.plugin.Plugin
 *  org.bukkit.scheduler.BukkitScheduler
 *  org.bukkit.scheduler.BukkitTask
 */
package me.serbob.donuttp.lib.folialib.util;

import java.util.function.Consumer;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.event.player.PlayerTeleportEvent;
import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitScheduler;
import org.bukkit.scheduler.BukkitTask;

public class ImplementationTestsUtil {
    private static final boolean IS_CANCELLED_SUPPORTED;
    private static final boolean IS_TASK_CONSUMERS_SUPPORTED;
    private static final boolean IS_ASYNC_TELEPORT_SUPPORTED;

    public static boolean isCancelledSupported() {
        return IS_CANCELLED_SUPPORTED;
    }

    public static boolean isTaskConsumersSupported() {
        return IS_TASK_CONSUMERS_SUPPORTED;
    }

    public static boolean isAsyncTeleportSupported() {
        return IS_ASYNC_TELEPORT_SUPPORTED;
    }

    static {
        boolean bl = false;
        try {
            Class<BukkitTask> clazz = BukkitTask.class;
            clazz.getDeclaredMethod("isCancelled", new Class[0]);
            bl = true;
        }
        catch (NoSuchMethodException noSuchMethodException) {
            // empty catch block
        }
        IS_CANCELLED_SUPPORTED = bl;
        boolean bl2 = false;
        try {
            Class<BukkitScheduler> clazz = BukkitScheduler.class;
            clazz.getDeclaredMethod("runTask", Plugin.class, Consumer.class);
            bl2 = true;
        }
        catch (NoSuchMethodException noSuchMethodException) {
            // empty catch block
        }
        IS_TASK_CONSUMERS_SUPPORTED = bl2;
        boolean bl3 = false;
        try {
            Class<Entity> clazz = Entity.class;
            clazz.getDeclaredMethod("teleportAsync", Location.class, PlayerTeleportEvent.TeleportCause.class);
            bl3 = true;
        }
        catch (NoSuchMethodException noSuchMethodException) {
            // empty catch block
        }
        IS_ASYNC_TELEPORT_SUPPORTED = bl3;
    }
}

