/*
 * Decompiled with CFR 0.152.
 */
package me.serbob.donuttp;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import me.serbob.donuttp.O;
import me.serbob.donuttp.u;

public interface VV {
    public static final Map<Class<?>, u<Object>> G = new HashMap();

    default public void i() {
    }

    default public O g() {
        return O.PascalCase;
    }

    default public <T> u<T> A(Class<T> clazz) {
        return G.get(clazz);
    }

    default public Collection<u<Object>> t() {
        return G.values();
    }

    default public <T> void c(Class<T> clazz, u<T> u2) {
        G.put(clazz, u2);
    }
}

