/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.Bukkit
 *  org.bukkit.plugin.Plugin
 *  org.bukkit.scheduler.BukkitScheduler
 *  org.bukkit.scheduler.BukkitTask
 */
package me.serbob.donuttp.lib.folialib.wrapper.task;

import me.serbob.donuttp.lib.folialib.wrapper.task.WrappedTask;
import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitScheduler;
import org.bukkit.scheduler.BukkitTask;

public class WrappedLegacyBukkitTask
implements WrappedTask {
    private final BukkitTask task;

    public WrappedLegacyBukkitTask(BukkitTask task) {
        this.task = task;
    }

    @Override
    public void cancel() {
        this.task.cancel();
    }

    @Override
    public boolean isCancelled() {
        int n2 = this.task.getTaskId();
        BukkitScheduler bukkitScheduler = Bukkit.getScheduler();
        return !bukkitScheduler.isCurrentlyRunning(n2) && !bukkitScheduler.isQueued(n2);
    }

    @Override
    public Plugin getOwningPlugin() {
        return this.task.getOwner();
    }

    @Override
    public boolean isAsync() {
        return !this.task.isSync();
    }
}

