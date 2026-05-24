/*
 * Decompiled with CFR 0.152.
 */
package me.serbob.donuttp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import me.serbob.donuttp.p;

public interface e<T>
extends Iterable<T> {
    public T get(int var1);

    public int size();

    public p v();

    public boolean isEmpty();

    public boolean contains(Object var1);

    public int indexOf(Object var1);

    public boolean containsAll(Collection<?> var1);

    public int lastIndexOf(Object var1);

    public Object[] toArray();

    public <E> E[] toArray(E[] var1);

    public List<T> subList(int var1, int var2);

    default public List<T> p() {
        ArrayList arrayList = new ArrayList();
        this.iterator().forEachRemaining(arrayList::add);
        return arrayList;
    }
}

