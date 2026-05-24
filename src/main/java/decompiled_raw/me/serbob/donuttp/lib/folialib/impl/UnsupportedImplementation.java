/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.plugin.Plugin
 */
package me.serbob.donuttp.lib.folialib.impl;

import java.util.logging.Logger;
import me.serbob.donuttp.lib.folialib.FoliaLib;
import me.serbob.donuttp.lib.folialib.impl.LegacySpigotImplementation;
import org.bukkit.plugin.Plugin;

public class UnsupportedImplementation
extends LegacySpigotImplementation {
    public UnsupportedImplementation(FoliaLib foliaLib) {
        super(foliaLib);
        Plugin plugin = foliaLib.getPlugin();
        Logger logger = plugin.getLogger();
        logger.warning(String.format("\n---------------------------------------------------------------------\nFoliaLib does not support this server software! (%s)\nFoliaLib will attempt to use the legacy spigot implementation.\n---------------------------------------------------------------------\n", plugin.getServer().getVersion()));
    }
}

