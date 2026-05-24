/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.persistence.PersistentDataContainer
 */
package me.serbob.donuttp;

import java.util.Map;
import me.serbob.donuttp.D;
import me.serbob.donuttp.d;
import org.bukkit.persistence.PersistentDataContainer;

public class Q
extends D {
    private final PersistentDataContainer T;

    public Q(PersistentDataContainer persistentDataContainer) {
        super(null, null);
        this.T = persistentDataContainer;
    }

    @Override
    public Object h(long l2) {
        long l3 = l2 ^ 0x11BA28D3AA64L;
        return d.CRAFT_PERSISTENT_DATA_CONTAINER_TO_TAG.R(l3, this.T, new Object[0]);
    }

    @Override
    protected void x(long l2, Object object) {
        long l3 = l2 ^ 0x474D166F1C2EL;
        Map map = (Map)d.CRAFT_PERSISTENT_DATA_CONTAINER_GET_MAP.R(l3, this.T, new Object[0]);
        map.clear();
        d.CRAFT_PERSISTENT_DATA_CONTAINER_PUT_ALL.R(l3, this.T, object);
    }
}

