/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.plugin.Plugin
 */
package me.serbob.donuttp.lib.folialib;

import java.lang.reflect.InvocationTargetException;
import java.util.logging.Logger;
import me.serbob.donuttp.lib.folialib.enums.ImplementationType;
import me.serbob.donuttp.lib.folialib.impl.PlatformScheduler;
import me.serbob.donuttp.lib.folialib.util.InvalidTickDelayNotifier;
import org.bukkit.plugin.Plugin;

public class FoliaLib {
    private final Plugin plugin;
    private final ImplementationType implementationType;
    private final PlatformScheduler scheduler;

    public FoliaLib(Plugin plugin) {
        this.plugin = plugin;
        ImplementationType implementationType = ImplementationType.UNKNOWN;
        for (ImplementationType implementationType2 : ImplementationType.values()) {
            if (!implementationType2.selfCheck()) continue;
            implementationType = implementationType2;
            break;
        }
        this.implementationType = implementationType;
        this.scheduler = this.createServerImpl(this.implementationType.getImplementationClassName());
        if (this.scheduler == null) {
            throw new IllegalStateException("Failed to create server implementation. Please report this to the FoliaLib GitHub issues page. Forks of server software may not all be supported. If you are using an unofficial fork, please report this to the fork's developers first.");
        }
        String string = "com,tcoded,folialib,".replace(",", ".");
        if (this.getClass().getName().startsWith(string)) {
            Logger logger = this.plugin.getLogger();
            logger.severe("****************************************************************");
            logger.severe("FoliaLib is not be relocated correctly! This will cause conflicts");
            logger.severe("with other plugins using FoliaLib. Please contact the developers");
            logger.severe(String.format("of '%s' and inform them of this issue immediately!", this.plugin.getDescription().getName()));
            logger.severe("****************************************************************");
        }
    }

    public ImplementationType getImplType() {
        return this.implementationType;
    }

    @Deprecated
    public PlatformScheduler getImpl() {
        return this.getScheduler();
    }

    public PlatformScheduler getScheduler() {
        return this.scheduler;
    }

    public boolean isFolia() {
        return this.implementationType == ImplementationType.FOLIA;
    }

    public boolean isPaper() {
        return this.implementationType == ImplementationType.PAPER || this.implementationType == ImplementationType.LEGACY_PAPER;
    }

    public boolean isSpigot() {
        return this.implementationType == ImplementationType.SPIGOT || this.implementationType == ImplementationType.LEGACY_SPIGOT;
    }

    public boolean isUnsupported() {
        return this.implementationType == ImplementationType.UNKNOWN;
    }

    public Plugin getPlugin() {
        return this.plugin;
    }

    public void disableInvalidTickValueWarning() {
        InvalidTickDelayNotifier.disableNotifications = true;
    }

    public void enableInvalidTickValueDebug() {
        InvalidTickDelayNotifier.debugMode = true;
    }

    private PlatformScheduler createServerImpl(String implName) {
        String string = this.getClass().getPackage().getName() + ".impl.";
        try {
            return (PlatformScheduler)Class.forName(string + implName).getConstructor(this.getClass()).newInstance(this);
        }
        catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException reflectiveOperationException) {
            reflectiveOperationException.printStackTrace();
            return null;
        }
    }
}

