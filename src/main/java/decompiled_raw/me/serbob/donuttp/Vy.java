/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.Chunk
 */
package me.serbob.donuttp;

import me.serbob.donuttp.D;
import me.serbob.donuttp.J;
import me.serbob.donuttp.Q;
import me.serbob.donuttp.r;
import org.bukkit.Chunk;

public class Vy {
    private final Chunk W;

    public Vy(Chunk chunk) {
        this.W = chunk;
    }

    public D e(long l2) {
        long l3 = l2 ^ 0x7A2335C085C0L;
        J.G(r.MC1_16_R3, l3);
        return new Q(this.W.getPersistentDataContainer());
    }
}

