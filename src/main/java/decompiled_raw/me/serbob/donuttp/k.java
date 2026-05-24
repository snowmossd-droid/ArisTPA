/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 */
package me.serbob.donuttp;

import com.mojang.authlib.GameProfile;
import me.serbob.donuttp.C;
import me.serbob.donuttp.D;
import me.serbob.donuttp.d;
import me.serbob.donuttp.f;
import me.serbob.donuttp.i;
import me.serbob.donuttp.m;
import me.serbob.donuttp.r;
import me.serbob.donuttp.v;

public class k {
    @Deprecated
    public static D r(long l2, GameProfile gameProfile) {
        long l3 = l2;
        long l4 = l3 ^ 0x20E5F41CEFC3L;
        long l5 = l3 ^ 0x336688CB24DEL;
        long l6 = l3 ^ 0x402713B578E1L;
        long l7 = l3 ^ 0x7F7A44815B9FL;
        long l8 = l3 ^ 0x3339D8558D7FL;
        long l9 = l3 ^ 0x29EF37E47FA7L;
        if (r.m(r.MC1_20_R4, l6)) {
            return (D)m.P(i.I(l9), gameProfile, l5);
        }
        Object[] objectArray = new Object[2];
        objectArray[0] = v.NMS_NBTTAGCOMPOUND.h(l7, new Object[0]);
        objectArray[1] = gameProfile;
        return new C(d.GAMEPROFILE_SERIALIZE.R(l4, null, objectArray), l8);
    }

    @Deprecated
    public static GameProfile C(D d2, long l2, char c2) {
        long l3;
        long l4 = l3 = l2 << 16 | (long)c2 << 48 >>> 48;
        long l5 = l4 ^ 0x628D7E5FDD2DL;
        long l6 = l4 ^ 0x24F99F64A0FL;
        long l7 = l4 ^ 0x7337568C7749L;
        long l8 = l4 ^ 0x2A09F199F163L;
        int n2 = (int)(l8 >>> 48);
        int n3 = (int)(l8 << 16 >>> 32);
        int n4 = (int)(l8 << 48 >>> 48);
        long l9 = l4 ^ 0x732054F64E1AL;
        if (r.m(r.MC1_20_R4, l6)) {
            return m.o(d2, l9);
        }
        return (GameProfile)d.GAMEPROFILE_DESERIALIZE.R(l5, null, f.Z((short)n2, n3, (short)n4, d2.h(l7), d2));
    }
}

