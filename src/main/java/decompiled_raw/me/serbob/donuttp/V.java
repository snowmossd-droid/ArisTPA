/*
 * Decompiled with CFR 0.152.
 */
package me.serbob.donuttp;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import me.serbob.donuttp.B;
import me.serbob.donuttp.VV;
import me.serbob.donuttp.b;
import me.serbob.donuttp.j;
import me.serbob.donuttp.y;

class V<E extends VV>
implements y<E> {
    private final b J;
    private final Class<E> G;

    public V(b b2, Class<E> clazz) {
        this.J = b2;
        this.G = clazz;
    }

    @Override
    public VV x(int n2, short s2, int n3, int n4) {
        long l2 = (long)s2 << 48 | (long)n3 << 32 >>> 16 | (long)n4 << 48 >>> 48;
        long l3 = l2 ^ 0x74A2457613CDL;
        j j2 = (j)this.J.get(n2);
        return new B(l3, j2, this.G).c();
    }

    @Override
    public int Q() {
        return this.J.size();
    }

    @Override
    public void a(int n2) {
        this.J.t(n2);
    }

    @Override
    public Iterator<E> iterator() {
        return new F();
    }

    @Override
    public VV D(long l2) {
        long l3 = l2;
        long l4 = l3 ^ 0x65720E9ED346L;
        long l5 = l3 ^ 0x4439D4454A98L;
        j j2 = this.J.F(l5);
        return new B(l4, j2, this.G).c();
    }

    @Override
    public boolean P() {
        return this.J.isEmpty();
    }

    private class F
    implements Iterator<E> {
        int O = 0;
        int A = -1;

        private F() {
        }

        @Override
        public boolean hasNext() {
            long l2 = 118830054584164L;
            boolean bl = this.O != V.this.Q();
            return bl;
        }

        public VV p(long l2) {
            long l3 = l2 ^ 0x3FFAF29C5C1L;
            int n2 = (int)(l3 >>> 48);
            int n3 = (int)(l3 << 16 >>> 32);
            int n4 = (int)(l3 << 48 >>> 48);
            try {
                int n5 = this.O;
                VV vV = V.this.x(n5, (short)n2, n3, n4);
                this.A = n5;
                this.O = n5 + 1;
                return vV;
            }
            catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                throw new NoSuchElementException();
            }
        }

        @Override
        public void remove() {
            long l2 = 64836175289514L;
            if (this.A < 0) {
                throw new IllegalStateException();
            }
            try {
                V.this.a(this.A);
                if (this.A < this.O) {
                    --this.O;
                }
                this.A = -1;
            }
            catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                throw new ConcurrentModificationException();
            }
        }
    }
}

