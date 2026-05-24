/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.papermc.paper.threadedregions.scheduler.ScheduledTask
 *  org.bukkit.plugin.Plugin
 */
package me.serbob.donuttp.lib.folialib.wrapper.task;

import io.papermc.paper.threadedregions.scheduler.ScheduledTask;
import me.serbob.donuttp.lib.folialib.wrapper.task.WrappedTask;
import org.bukkit.plugin.Plugin;

public class WrappedFoliaTask
implements WrappedTask {
    private static final Class<? extends ScheduledTask> ASYNC_TASK_CLASS;
    private final ScheduledTask task;
    private final boolean async;

    public WrappedFoliaTask(ScheduledTask task) {
        this.task = task;
        this.async = ASYNC_TASK_CLASS == null ? false : ASYNC_TASK_CLASS.isAssignableFrom(task.getClass());
    }

    @Override
    public void cancel() {
        this.task.cancel();
    }

    @Override
    public boolean isCancelled() {
        return this.task.isCancelled();
    }

    @Override
    public Plugin getOwningPlugin() {
        return this.task.getOwningPlugin();
    }

    @Override
    public boolean isAsync() {
        return this.async;
    }

    static {
        Class<?> clazz = null;
        try {
            clazz = Class.forName("io.papermc.paper.threadedregions.scheduler.FoliaAsyncScheduler.AsyncScheduledTask");
        }
        catch (ClassNotFoundException classNotFoundException) {
            // empty catch block
        }
        ASYNC_TASK_CLASS = clazz;
    }
}

