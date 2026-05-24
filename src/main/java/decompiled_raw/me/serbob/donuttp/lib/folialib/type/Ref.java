/*
 * Decompiled with CFR 0.152.
 */
package me.serbob.donuttp.lib.folialib.type;

public class Ref<T> {
    private T value;

    public Ref() {
        this.value = null;
    }

    public Ref(T value) {
        this.value = value;
    }

    public T get() {
        return this.value;
    }

    public void set(T value) {
        this.value = value;
    }
}

