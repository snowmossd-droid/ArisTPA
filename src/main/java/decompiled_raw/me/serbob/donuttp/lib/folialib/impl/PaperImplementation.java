/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.Location
 *  org.bukkit.entity.Entity
 *  org.bukkit.event.player.PlayerTeleportEvent$TeleportCause
 */
package me.serbob.donuttp.lib.folialib.impl;

import java.lang.reflect.Method;
import java.util.concurrent.CompletableFuture;
import me.serbob.donuttp.lib.folialib.FoliaLib;
import me.serbob.donuttp.lib.folialib.impl.SpigotImplementation;
import me.serbob.donuttp.lib.folialib.util.ImplementationTestsUtil;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.event.player.PlayerTeleportEvent;

public class PaperImplementation
extends SpigotImplementation {
    private Method teleportAsyncMethod;

    public PaperImplementation(FoliaLib foliaLib) {
        super(foliaLib);
        if (ImplementationTestsUtil.isAsyncTeleportSupported()) {
            try {
                this.teleportAsyncMethod = Entity.class.getMethod("teleportAsync", Location.class, PlayerTeleportEvent.TeleportCause.class);
            }
            catch (NoSuchMethodException noSuchMethodException) {
                throw new RuntimeException("Failed to initialize PaperImplementation", noSuchMethodException);
            }
        }
    }

    @Override
    public CompletableFuture<Boolean> teleportAsync(Entity entity, Location location) {
        return this.teleportAsync(entity, location, PlayerTeleportEvent.TeleportCause.PLUGIN);
    }

    @Override
    public CompletableFuture<Boolean> teleportAsync(Entity entity, Location location, PlayerTeleportEvent.TeleportCause cause) {
        if (!ImplementationTestsUtil.isAsyncTeleportSupported()) {
            return super.teleportAsync(entity, location, cause);
        }
        try {
            return (CompletableFuture)this.teleportAsyncMethod.invoke(entity, location, cause);
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return super.teleportAsync(entity, location, cause);
        }
    }
}

