/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.plugin.Plugin
 */
package me.serbob.donuttp.lib.folialib.wrapper.task;

import org.bukkit.plugin.Plugin;

public interface WrappedTask {
    public void cancel();

    public boolean isCancelled();

    public Plugin getOwningPlugin();

    public boolean isAsync();
}

