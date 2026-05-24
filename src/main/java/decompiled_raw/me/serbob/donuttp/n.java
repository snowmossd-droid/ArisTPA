/*
 * Decompiled with CFR 0.152.
 */
package me.serbob.donuttp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.function.Predicate;
import me.serbob.donuttp.D;
import me.serbob.donuttp.N;
import me.serbob.donuttp.d;
import me.serbob.donuttp.p;
import me.serbob.donuttp.r;
import me.serbob.donuttp.s;

public abstract class n<T>
implements List<T>,
N<T> {
    private String H;
    private D P;
    private p V;
    protected Object a;
    private static final String[] b;
    private static final String[] c;

    protected n(D d2, String string, p p2, Object object) {
        this.P = d2;
        this.H = string;
        this.V = p2;
        this.a = object;
    }

    public String Y() {
        return this.H;
    }

    public D b() {
        return this.P;
    }

    private void h(long l2) {
        long l3 = l2;
        long l4 = l3 ^ 0x67F0EDF0A83DL;
        long l5 = l3 ^ 0x658A6E396BE8L;
        if (this.P.q(l4)) {
            throw new s(l5, n.a(-638441970 + -((char)-28756), -638441970 + -((char)-28822), (int)l2));
        }
    }

    private void a(long l2) {
        long l3 = l2 ^ 0x3220AADA1115L;
        if (this.b().L()) {
            throw new s(l3, n.a(487842540 - (char)-2480, 487842540 - (char)-4342, (int)l2));
        }
    }

    protected void r(long l2) {
        long l3 = l2;
        long l4 = l3 ^ 0x74C0466DF798L;
        long l5 = l3 ^ 0x1438F09CBA32L;
        this.h(l5);
        this.P.L(this.H, this.a, l4);
    }

    protected abstract Object J(Object var1, long var2);

    @Override
    public boolean add(T t2) {
        long l2;
        long l3 = l2 = 137635973756256L;
        long l4 = l3 ^ 0x3C6D95FD1DC7L;
        long l5 = l3 ^ 0x283EAF4C2FCCL;
        long l6 = l3 ^ 0x446706A374B3L;
        long l7 = l3 ^ 0x13CDC2400E4EL;
        long l8 = l3 ^ 0x505FF63FCE81L;
        long l9 = l3 ^ 0x29A02EB9B10DL;
        long l10 = l3 ^ 0x6B77EEBDEAC6L;
        this.h(l6);
        this.a(l7);
        try {
            this.P.H().lock();
            if (r.M(l9).o() >= r.MC1_14_R1.o()) {
                d.LIST_ADD.R(l4, this.a, this.size(), this.J(t2, l10));
            } else {
                d.LEGACY_LIST_ADD.R(l4, this.a, this.J(t2, l10));
            }
            this.r(l8);
            boolean bl = true;
            return bl;
        }
        catch (Exception exception) {
            throw new s(l5, (Throwable)exception);
        }
        finally {
            this.P.H().unlock();
        }
    }

    @Override
    public void add(int n2, T t2) {
        long l2;
        long l3 = l2 = 23720483953463L;
        long l4 = l3 ^ 0x54D291AAF390L;
        long l5 = l3 ^ 0x4081AB1BC19BL;
        long l6 = l3 ^ 0x2CD802F49AE4L;
        long l7 = l3 ^ 0x7B72C617E019L;
        long l8 = l3 ^ 0x38E0F26820D6L;
        long l9 = l3 ^ 0x411F2AEE5F5AL;
        long l10 = l3 ^ 0x3C8EAEA0491L;
        this.h(l6);
        this.a(l7);
        try {
            this.P.H().lock();
            if (r.M(l9).o() >= r.MC1_14_R1.o()) {
                d.LIST_ADD.R(l4, this.a, n2, this.J(t2, l10));
            } else {
                d.LEGACY_LIST_ADD.R(l4, this.a, this.J(t2, l10));
            }
            this.r(l8);
        }
        catch (Exception exception) {
            throw new s(l5, (Throwable)exception);
        }
        finally {
            this.P.H().unlock();
        }
    }

    @Override
    public T set(int n2, T t2) {
        long l2;
        long l3 = l2 = 82868084426145L;
        long l4 = l3 ^ 0xA1E7013AD06L;
        long l5 = l3 ^ 0x1E4D4AA29F0DL;
        long l6 = l3 ^ 0x7214E34DC472L;
        long l7 = l3 ^ 0x25BE27AEBE8FL;
        long l8 = l3 ^ 0x662C13D17E40L;
        long l9 = l3 ^ 0x5D040B535A07L;
        this.h(l6);
        this.a(l7);
        try {
            this.P.H().lock();
            Object e2 = this.get(n2);
            d.LIST_SET.R(l4, this.a, n2, this.J(t2, l9));
            this.r(l8);
            Object e3 = e2;
            return (T)e3;
        }
        catch (Exception exception) {
            throw new s(l5, (Throwable)exception);
        }
        finally {
            this.P.H().unlock();
        }
    }

    @Override
    public T remove(int n2) {
        long l2;
        long l3 = l2 = 79690712045258L;
        long l4 = l3 ^ 0x93A3A3ABE6DL;
        long l5 = l3 ^ 0x1D69008B8C66L;
        long l6 = l3 ^ 0x7130A964D719L;
        long l7 = l3 ^ 0x269A6D87ADE4L;
        long l8 = l3 ^ 0x650859F86D2BL;
        this.h(l6);
        this.a(l7);
        try {
            this.P.H().lock();
            Object e2 = this.get(n2);
            d.LIST_REMOVE_KEY.R(l4, this.a, n2);
            this.r(l8);
            Object e3 = e2;
            return (T)e3;
        }
        catch (Exception exception) {
            throw new s(l5, (Throwable)exception);
        }
        finally {
            this.P.H().unlock();
        }
    }

    @Override
    public int size() {
        long l2;
        long l3 = l2 = 95537276829619L;
        long l4 = l3 ^ 0x17A44BDD5714L;
        long l5 = l3 ^ 0x3F7716C651FL;
        long l6 = l3 ^ 0x6FAED8833E60L;
        this.h(l6);
        try {
            this.P.m().lock();
            int n2 = (Integer)d.LIST_SIZE.R(l4, this.a, new Object[0]);
            return n2;
        }
        catch (Exception exception) {
            throw new s(l5, (Throwable)exception);
        }
        finally {
            this.P.m().unlock();
        }
    }

    @Override
    public p v() {
        return this.V;
    }

    @Override
    public boolean isEmpty() {
        long l2 = 12397916830854L;
        boolean bl = this.size() == 0;
        return bl;
    }

    @Override
    public void clear() {
        long l2 = 100628986392838L;
        while (!this.isEmpty()) {
            this.remove(0);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean contains(Object object) {
        long l2 = 46293467513658L;
        long l3 = l2 ^ 0x1350505E42E9L;
        this.h(l3);
        try {
            this.P.m().lock();
            boolean bl = false;
            while (true) {
                block7: {
                    if (bl >= this.size()) break;
                    if (!object.equals(this.get(bl ? 1 : 0))) break block7;
                    boolean bl2 = true;
                    return bl2;
                }
                bl += 1;
            }
            bl = false;
            return bl;
        }
        finally {
            this.P.m().unlock();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public int indexOf(Object object) {
        long l2 = 63897258212693L;
        long l3 = l2 ^ 0x357E4913C86L;
        this.h(l3);
        try {
            this.P.m().lock();
            int n2 = 0;
            while (true) {
                block7: {
                    if (n2 >= this.size()) break;
                    if (!object.equals(this.get(n2))) break block7;
                    int n3 = n2;
                    return n3;
                }
                ++n2;
            }
            n2 = -1;
            return n2;
        }
        finally {
            this.P.m().unlock();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean addAll(Collection<? extends T> collection) {
        long l2 = 117075630923122L;
        long l3 = l2 ^ 0x533012951CA1L;
        this.h(l3);
        try {
            this.P.H().lock();
            int n2 = this.size();
            for (T t2 : collection) {
                this.add(t2);
            }
            boolean bl = n2 != this.size();
            boolean bl2 = bl;
            return bl2;
        }
        finally {
            this.P.H().unlock();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean addAll(int n2, Collection<? extends T> collection) {
        long l2 = 71346863044493L;
        long l3 = l2 ^ 0x79A9659CF65EL;
        this.h(l3);
        try {
            this.P.H().lock();
            int n3 = this.size();
            for (T t2 : collection) {
                this.add(n2++, t2);
            }
            boolean bl = n3 != this.size();
            boolean bl2 = bl;
            return bl2;
        }
        finally {
            this.P.H().unlock();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean containsAll(Collection<?> collection) {
        long l2 = 77078032769521L;
        long l3 = l2 ^ 0x7F50F932E022L;
        this.h(l3);
        try {
            this.P.m().lock();
            for (Object obj : collection) {
                if (this.contains(obj)) continue;
                boolean bl = false;
                return bl;
            }
            boolean bl = true;
            return bl;
        }
        finally {
            this.P.m().unlock();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public int lastIndexOf(Object object) {
        long l2 = 66058247578682L;
        long l3 = l2 ^ 0x55EBB9025E9L;
        this.h(l3);
        try {
            this.P.m().lock();
            int n2 = -1;
            int n3 = 0;
            while (true) {
                block6: {
                    if (n3 >= this.size()) break;
                    if (!object.equals(this.get(n3))) break block6;
                    n2 = n3;
                }
                ++n3;
            }
            n3 = n2;
            return n3;
        }
        finally {
            this.P.m().unlock();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean removeAll(Collection<?> collection) {
        long l2 = 86204329586742L;
        long l3 = l2 ^ 0x772DDB80F1E5L;
        this.h(l3);
        try {
            this.P.H().lock();
            int n2 = this.size();
            for (Object obj : collection) {
                this.remove(obj);
            }
            boolean bl = n2 != this.size();
            boolean bl2 = bl;
            return bl2;
        }
        finally {
            this.P.H().unlock();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public boolean retainAll(Collection<?> collection) {
        long l2 = 51310064025390L;
        long l3 = l2 ^ 0x17E057D23EFDL;
        this.h(l3);
        try {
            this.P.H().lock();
            int n2 = this.size();
            for (Object obj : collection) {
                for (int n3 = 0; n3 < this.size(); ++n3) {
                    if (obj.equals(this.get(n3))) continue;
                    this.remove(n3--);
                }
            }
            boolean bl2 = n2 != this.size();
            return bl2;
        }
        finally {
            this.P.H().unlock();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean remove(Object object) {
        long l2 = 74506125973695L;
        long l3 = l2 ^ 0x7A8996DD996CL;
        this.h(l3);
        try {
            this.P.H().lock();
            int n2 = this.size();
            int n3 = -1;
            while (true) {
                n3 = this.indexOf(object);
                if (n3 == -1) break;
                this.remove(n3);
            }
            boolean bl = n2 != this.size();
            boolean bl2 = bl;
            return bl2;
        }
        finally {
            this.P.H().unlock();
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>(){
            private int E = -1;

            @Override
            public boolean hasNext() {
                long l2 = 10825271117810L;
                boolean bl = n.this.size() > this.E + 1;
                return bl;
            }

            @Override
            public T next() {
                long l2 = 38964099720819L;
                if (!this.hasNext()) {
                    throw new NoSuchElementException();
                }
                return n.this.get(++this.E);
            }

            @Override
            public void remove() {
                n.this.remove(this.E);
                --this.E;
            }
        };
    }

    @Override
    public ListIterator<T> listIterator() {
        return this.listIterator(0);
    }

    @Override
    public ListIterator<T> listIterator(final int n2) {
        final n n3 = this;
        return new ListIterator<T>(){
            int q;
            private static final String a;
            {
                this.q = n2 - 1;
            }

            @Override
            public void add(T t2) {
                n3.add(this.q, t2);
            }

            @Override
            public boolean hasNext() {
                long l2 = 65588335094887L;
                boolean bl = n.this.size() > this.q + 1;
                return bl;
            }

            @Override
            public boolean hasPrevious() {
                boolean bl;
                block5: {
                    block4: {
                        long l2 = 80131487244289L;
                        if (this.q < 0 || this.q > n.this.size()) break block4;
                        bl = true;
                        break block5;
                    }
                    bl = false;
                }
                return bl;
            }

            @Override
            public T next() {
                long l2 = 117661561300969L;
                if (!this.hasNext()) {
                    throw new NoSuchElementException();
                }
                return n.this.get(++this.q);
            }

            @Override
            public int nextIndex() {
                return this.q + 1;
            }

            @Override
            public T previous() {
                long l2 = 51132213332417L;
                if (!this.hasPrevious()) {
                    throw new NoSuchElementException(a + (this.q - 1));
                }
                return n.this.get(this.q--);
            }

            @Override
            public int previousIndex() {
                return this.q - 1;
            }

            @Override
            public void remove() {
                n3.remove(this.q);
                --this.q;
            }

            @Override
            public void set(T t2) {
                n3.set(this.q, t2);
            }

            /*
             * Handled impossible loop by duplicating code
             * Enabled aggressive block sorting
             */
            static {
                char[] cArray;
                block12: {
                    int n22;
                    int n32;
                    char[] cArray2;
                    int n4;
                    block11: {
                        char[] cArray3 = "\b\u0014n\u001e".toCharArray();
                        n4 = 0;
                        int n5 = cArray3.length;
                        cArray2 = cArray3;
                        n32 = n5;
                        if (n5 <= 1) break block11;
                        cArray = cArray2;
                        n22 = n32;
                        if (n32 <= n4) break block12;
                    }
                    do {
                        char[] cArray4 = cArray2;
                        char[] cArray5 = cArray2;
                        int n6 = n4;
                        while (true) {
                            int n7;
                            char c2 = cArray4[n6];
                            switch (n4 % 7) {
                                case 0: {
                                    n7 = 65;
                                    break;
                                }
                                case 1: {
                                    n7 = 112;
                                    break;
                                }
                                case 2: {
                                    n7 = 84;
                                    break;
                                }
                                case 3: {
                                    n7 = 62;
                                    break;
                                }
                                case 4: {
                                    n7 = 17;
                                    break;
                                }
                                case 5: {
                                    n7 = 59;
                                    break;
                                }
                                default: {
                                    n7 = 109;
                                }
                            }
                            cArray4[n6] = (char)(c2 ^ n7);
                            ++n4;
                            cArray2 = cArray5;
                            n32 = n32;
                            if (n32 != 0) break;
                            cArray5 = cArray2;
                            n22 = n32;
                            n6 = n32;
                            cArray4 = cArray2;
                        }
                        cArray = cArray2;
                        n22 = n32;
                    } while (n32 > n4);
                }
                a = new String(cArray).intern();
            }
        };
    }

    @Override
    public Object[] toArray() {
        long l2 = 86899881225988L;
        long l3 = l2 ^ 0x76422D7CAED7L;
        this.h(l3);
        try {
            this.P.m().lock();
            Object[] objectArray = new Object[this.size()];
            for (int i2 = 0; i2 < this.size(); ++i2) {
                objectArray[i2] = this.get(i2);
            }
            Object[] objectArray2 = objectArray;
            return objectArray2;
        }
        finally {
            this.P.m().unlock();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public <E> E[] toArray(E[] EArray) {
        long l2 = 125192370220773L;
        long l3 = l2 ^ 0x48964730EF36L;
        this.h(l3);
        try {
            this.P.m().lock();
            Object[] objectArray = Arrays.copyOf(EArray, this.size());
            Arrays.fill(objectArray, null);
            Class<?> clazz = EArray.getClass().getComponentType();
            for (int i2 = 0; i2 < this.size(); ++i2) {
                Object e2 = this.get(i2);
                if (clazz.isInstance(e2)) {
                    objectArray[i2] = this.get(i2);
                    continue;
                }
                throw new ArrayStoreException(n.a(-1631428290 + -((char)-6167), 1631559360 - (char)-8121, (int)l2));
            }
            Object[] objectArray2 = objectArray;
            return objectArray2;
        }
        finally {
            this.P.m().unlock();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public List<T> subList(int n2, int n3) {
        long l2 = 76657327382867L;
        long l3 = l2 ^ 0x7CF2F5352080L;
        this.h(l3);
        try {
            this.P.m().lock();
            ArrayList arrayList = new ArrayList();
            for (int i2 = n2; i2 < n3; ++i2) {
                arrayList.add(this.get(i2));
            }
            ArrayList arrayList2 = arrayList;
            return arrayList2;
        }
        finally {
            this.P.m().unlock();
        }
    }

    @Override
    public boolean removeIf(Predicate<? super T> predicate) {
        return List.super.removeIf(predicate);
    }

    public String toString() {
        long l2 = 91150350335531L;
        long l3 = l2 ^ 0x6BAC41B13FF8L;
        this.h(l3);
        try {
            this.P.m().lock();
            String string = this.a.toString();
            return string;
        }
        finally {
            this.P.m().unlock();
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var5 = new String[3];
            var3_1 = 0;
            var2_2 = "\\8\u00fbaQ\u00e1\u00fd\u00a2j\u00f2\\\u0093\u009dk\u0099\u008e\u00b3%R\u00a8\u00e7bB\u0015D5_\u00d1m\f J\u00c9\u0096lm\u00c7\b\u008b\u00f5b\u00b1\u00d7O\u00b0\u0080\u00f4\\:\u00d7\u0092\u00b4<\u00a6,\u000f\u001c\u00bd/\u00cb\u009f\u00df\u0081\u008e\u00a4\u00f3,~\u0080\u00bc\u00b04\u0014\u00aa\u00d8:&\u00c9\u00d4\u0083\u00eb\u0016gu\u00df%\u00fe\u0088\u00a3k\u00d2\u001f)a\u00dcZ+Y\u00dd@\u0097\u00dd\u00a5\u00b4\u00e8)\u00bf\u0082\u00b6\u00da\u00a8p\u00e3a\u00f5R\u00af\u00a8H\u00c5E\u009c\u00f1";
            var4_3 = "\\8\u00fbaQ\u00e1\u00fd\u00a2j\u00f2\\\u0093\u009dk\u0099\u008e\u00b3%R\u00a8\u00e7bB\u0015D5_\u00d1m\f J\u00c9\u0096lm\u00c7\b\u008b\u00f5b\u00b1\u00d7O\u00b0\u0080\u00f4\\:\u00d7\u0092\u00b4<\u00a6,\u000f\u001c\u00bd/\u00cb\u009f\u00df\u0081\u008e\u00a4\u00f3,~\u0080\u00bc\u00b04\u0014\u00aa\u00d8:&\u00c9\u00d4\u0083\u00eb\u0016gu\u00df%\u00fe\u0088\u00a3k\u00d2\u001f)a\u00dcZ+Y\u00dd@\u0097\u00dd\u00a5\u00b4\u00e8)\u00bf\u0082\u00b6\u00da\u00a8p\u00e3a\u00f5R\u00af\u00a8H\u00c5E\u009c\u00f1".length();
            var1_4 = 56;
            var0_5 = -1;
lbl7:
            // 2 sources

            while (true) {
                continue;
                break;
            }
lbl9:
            // 1 sources

            while (true) {
                var5[var3_1++] = new String(v0).intern();
                if ((var0_5 += var1_4) < var4_3) {
                    var1_4 = var2_2.charAt(var0_5);
                    ** continue;
                }
                break block13;
                break;
            }
            v1 = ++var0_5;
            v2 = var2_2.substring(v1, v1 + var1_4).toCharArray();
            var6_6 = 0;
            v3 = v2.length;
            v4 = v2;
            v5 = v3;
            if (v3 > 1) ** GOTO lbl59
            do {
                v6 = v4;
                v7 = v4;
                v8 = var6_6;
                while (true) {
                    v9 = v6[v8];
                    switch (var6_6 % 7) {
                        case 0: {
                            v10 = 36;
                            break;
                        }
                        case 1: {
                            v10 = 48;
                            break;
                        }
                        case 2: {
                            v10 = 79;
                            break;
                        }
                        case 3: {
                            v10 = 37;
                            break;
                        }
                        case 4: {
                            v10 = 111;
                            break;
                        }
                        case 5: {
                            v10 = 63;
                            break;
                        }
                        default: {
                            v10 = 5;
                        }
                    }
                    v6[v8] = (char)(v9 ^ v10);
                    ++var6_6;
                    v4 = v7;
                    v5 = v5;
                    if (v5 != 0) break;
                    v7 = v4;
                    v11 = v5;
                    v8 = v5;
                    v6 = v4;
                }
lbl59:
                // 2 sources

                v0 = v4;
                v11 = v5;
            } while (v5 > var6_6);
            ** while (true)
        }
        n.b = var5;
        n.c = new String[3];
    }

    private static String a(int n2, int n3, int n4) {
        int n5 = (n2 ^ n4 ^ 0x17B0) & 0xFFFF;
        if (c[n5] == null) {
            int n6;
            int n7;
            char[] cArray = b[n5].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n7 = 52;
                    break;
                }
                case 1: {
                    n7 = 151;
                    break;
                }
                case 2: {
                    n7 = 215;
                    break;
                }
                case 3: {
                    n7 = 38;
                    break;
                }
                case 4: {
                    n7 = 77;
                    break;
                }
                case 5: {
                    n7 = 209;
                    break;
                }
                case 6: {
                    n7 = 192;
                    break;
                }
                case 7: {
                    n7 = 72;
                    break;
                }
                case 8: {
                    n7 = 86;
                    break;
                }
                case 9: {
                    n7 = 23;
                    break;
                }
                case 10: {
                    n7 = 136;
                    break;
                }
                case 11: {
                    n7 = 183;
                    break;
                }
                case 12: {
                    n7 = 249;
                    break;
                }
                case 13: {
                    n7 = 250;
                    break;
                }
                case 14: {
                    n7 = 85;
                    break;
                }
                case 15: {
                    n7 = 146;
                    break;
                }
                case 16: {
                    n7 = 164;
                    break;
                }
                case 17: {
                    n7 = 168;
                    break;
                }
                case 18: {
                    n7 = 127;
                    break;
                }
                case 19: {
                    n7 = 20;
                    break;
                }
                case 20: {
                    n7 = 248;
                    break;
                }
                case 21: {
                    n7 = 105;
                    break;
                }
                case 22: {
                    n7 = 188;
                    break;
                }
                case 23: {
                    n7 = 25;
                    break;
                }
                case 24: {
                    n7 = 174;
                    break;
                }
                case 25: {
                    n7 = 219;
                    break;
                }
                case 26: {
                    n7 = 111;
                    break;
                }
                case 27: {
                    n7 = 232;
                    break;
                }
                case 28: {
                    n7 = 141;
                    break;
                }
                case 29: {
                    n7 = 91;
                    break;
                }
                case 30: {
                    n7 = 93;
                    break;
                }
                case 31: {
                    n7 = 152;
                    break;
                }
                case 32: {
                    n7 = 243;
                    break;
                }
                case 33: {
                    n7 = 128;
                    break;
                }
                case 34: {
                    n7 = 53;
                    break;
                }
                case 35: {
                    n7 = 184;
                    break;
                }
                case 36: {
                    n7 = 126;
                    break;
                }
                case 37: {
                    n7 = 97;
                    break;
                }
                case 38: {
                    n7 = 54;
                    break;
                }
                case 39: {
                    n7 = 254;
                    break;
                }
                case 40: {
                    n7 = 190;
                    break;
                }
                case 41: {
                    n7 = 84;
                    break;
                }
                case 42: {
                    n7 = 45;
                    break;
                }
                case 43: {
                    n7 = 48;
                    break;
                }
                case 44: {
                    n7 = 110;
                    break;
                }
                case 45: {
                    n7 = 239;
                    break;
                }
                case 46: {
                    n7 = 226;
                    break;
                }
                case 47: {
                    n7 = 134;
                    break;
                }
                case 48: {
                    n7 = 247;
                    break;
                }
                case 49: {
                    n7 = 5;
                    break;
                }
                case 50: {
                    n7 = 202;
                    break;
                }
                case 51: {
                    n7 = 79;
                    break;
                }
                case 52: {
                    n7 = 66;
                    break;
                }
                case 53: {
                    n7 = 8;
                    break;
                }
                case 54: {
                    n7 = 4;
                    break;
                }
                case 55: {
                    n7 = 201;
                    break;
                }
                case 56: {
                    n7 = 169;
                    break;
                }
                case 57: {
                    n7 = 225;
                    break;
                }
                case 58: {
                    n7 = 76;
                    break;
                }
                case 59: {
                    n7 = 118;
                    break;
                }
                case 60: {
                    n7 = 231;
                    break;
                }
                case 61: {
                    n7 = 235;
                    break;
                }
                case 62: {
                    n7 = 42;
                    break;
                }
                case 63: {
                    n7 = 173;
                    break;
                }
                case 64: {
                    n7 = 159;
                    break;
                }
                case 65: {
                    n7 = 185;
                    break;
                }
                case 66: {
                    n7 = 132;
                    break;
                }
                case 67: {
                    n7 = 252;
                    break;
                }
                case 68: {
                    n7 = 103;
                    break;
                }
                case 69: {
                    n7 = 63;
                    break;
                }
                case 70: {
                    n7 = 56;
                    break;
                }
                case 71: {
                    n7 = 55;
                    break;
                }
                case 72: {
                    n7 = 108;
                    break;
                }
                case 73: {
                    n7 = 200;
                    break;
                }
                case 74: {
                    n7 = 181;
                    break;
                }
                case 75: {
                    n7 = 102;
                    break;
                }
                case 76: {
                    n7 = 160;
                    break;
                }
                case 77: {
                    n7 = 197;
                    break;
                }
                case 78: {
                    n7 = 98;
                    break;
                }
                case 79: {
                    n7 = 238;
                    break;
                }
                case 80: {
                    n7 = 167;
                    break;
                }
                case 81: {
                    n7 = 210;
                    break;
                }
                case 82: {
                    n7 = 172;
                    break;
                }
                case 83: {
                    n7 = 207;
                    break;
                }
                case 84: {
                    n7 = 47;
                    break;
                }
                case 85: {
                    n7 = 74;
                    break;
                }
                case 86: {
                    n7 = 166;
                    break;
                }
                case 87: {
                    n7 = 22;
                    break;
                }
                case 88: {
                    n7 = 83;
                    break;
                }
                case 89: {
                    n7 = 18;
                    break;
                }
                case 90: {
                    n7 = 144;
                    break;
                }
                case 91: {
                    n7 = 10;
                    break;
                }
                case 92: {
                    n7 = 75;
                    break;
                }
                case 93: {
                    n7 = 223;
                    break;
                }
                case 94: {
                    n7 = 39;
                    break;
                }
                case 95: {
                    n7 = 114;
                    break;
                }
                case 96: {
                    n7 = 140;
                    break;
                }
                case 97: {
                    n7 = 129;
                    break;
                }
                case 98: {
                    n7 = 99;
                    break;
                }
                case 99: {
                    n7 = 88;
                    break;
                }
                case 100: {
                    n7 = 251;
                    break;
                }
                case 101: {
                    n7 = 31;
                    break;
                }
                case 102: {
                    n7 = 216;
                    break;
                }
                case 103: {
                    n7 = 117;
                    break;
                }
                case 104: {
                    n7 = 189;
                    break;
                }
                case 105: {
                    n7 = 70;
                    break;
                }
                case 106: {
                    n7 = 19;
                    break;
                }
                case 107: {
                    n7 = 130;
                    break;
                }
                case 108: {
                    n7 = 120;
                    break;
                }
                case 109: {
                    n7 = 142;
                    break;
                }
                case 110: {
                    n7 = 182;
                    break;
                }
                case 111: {
                    n7 = 156;
                    break;
                }
                case 112: {
                    n7 = 236;
                    break;
                }
                case 113: {
                    n7 = 81;
                    break;
                }
                case 114: {
                    n7 = 27;
                    break;
                }
                case 115: {
                    n7 = 191;
                    break;
                }
                case 116: {
                    n7 = 58;
                    break;
                }
                case 117: {
                    n7 = 61;
                    break;
                }
                case 118: {
                    n7 = 176;
                    break;
                }
                case 119: {
                    n7 = 139;
                    break;
                }
                case 120: {
                    n7 = 112;
                    break;
                }
                case 121: {
                    n7 = 204;
                    break;
                }
                case 122: {
                    n7 = 240;
                    break;
                }
                case 123: {
                    n7 = 65;
                    break;
                }
                case 124: {
                    n7 = 6;
                    break;
                }
                case 125: {
                    n7 = 82;
                    break;
                }
                case 126: {
                    n7 = 230;
                    break;
                }
                case 127: {
                    n7 = 135;
                    break;
                }
                case 128: {
                    n7 = 222;
                    break;
                }
                case 129: {
                    n7 = 24;
                    break;
                }
                case 130: {
                    n7 = 195;
                    break;
                }
                case 131: {
                    n7 = 150;
                    break;
                }
                case 132: {
                    n7 = 69;
                    break;
                }
                case 133: {
                    n7 = 7;
                    break;
                }
                case 134: {
                    n7 = 218;
                    break;
                }
                case 135: {
                    n7 = 107;
                    break;
                }
                case 136: {
                    n7 = 123;
                    break;
                }
                case 137: {
                    n7 = 133;
                    break;
                }
                case 138: {
                    n7 = 214;
                    break;
                }
                case 139: {
                    n7 = 94;
                    break;
                }
                case 140: {
                    n7 = 255;
                    break;
                }
                case 141: {
                    n7 = 100;
                    break;
                }
                case 142: {
                    n7 = 3;
                    break;
                }
                case 143: {
                    n7 = 26;
                    break;
                }
                case 144: {
                    n7 = 194;
                    break;
                }
                case 145: {
                    n7 = 50;
                    break;
                }
                case 146: {
                    n7 = 196;
                    break;
                }
                case 147: {
                    n7 = 220;
                    break;
                }
                case 148: {
                    n7 = 193;
                    break;
                }
                case 149: {
                    n7 = 68;
                    break;
                }
                case 150: {
                    n7 = 11;
                    break;
                }
                case 151: {
                    n7 = 16;
                    break;
                }
                case 152: {
                    n7 = 109;
                    break;
                }
                case 153: {
                    n7 = 170;
                    break;
                }
                case 154: {
                    n7 = 221;
                    break;
                }
                case 155: {
                    n7 = 212;
                    break;
                }
                case 156: {
                    n7 = 1;
                    break;
                }
                case 157: {
                    n7 = 96;
                    break;
                }
                case 158: {
                    n7 = 49;
                    break;
                }
                case 159: {
                    n7 = 145;
                    break;
                }
                case 160: {
                    n7 = 217;
                    break;
                }
                case 161: {
                    n7 = 163;
                    break;
                }
                case 162: {
                    n7 = 125;
                    break;
                }
                case 163: {
                    n7 = 12;
                    break;
                }
                case 164: {
                    n7 = 244;
                    break;
                }
                case 165: {
                    n7 = 51;
                    break;
                }
                case 166: {
                    n7 = 213;
                    break;
                }
                case 167: {
                    n7 = 119;
                    break;
                }
                case 168: {
                    n7 = 224;
                    break;
                }
                case 169: {
                    n7 = 154;
                    break;
                }
                case 170: {
                    n7 = 35;
                    break;
                }
                case 171: {
                    n7 = 113;
                    break;
                }
                case 172: {
                    n7 = 122;
                    break;
                }
                case 173: {
                    n7 = 0;
                    break;
                }
                case 174: {
                    n7 = 206;
                    break;
                }
                case 175: {
                    n7 = 161;
                    break;
                }
                case 176: {
                    n7 = 131;
                    break;
                }
                case 177: {
                    n7 = 57;
                    break;
                }
                case 178: {
                    n7 = 211;
                    break;
                }
                case 179: {
                    n7 = 46;
                    break;
                }
                case 180: {
                    n7 = 253;
                    break;
                }
                case 181: {
                    n7 = 71;
                    break;
                }
                case 182: {
                    n7 = 60;
                    break;
                }
                case 183: {
                    n7 = 242;
                    break;
                }
                case 184: {
                    n7 = 158;
                    break;
                }
                case 185: {
                    n7 = 177;
                    break;
                }
                case 186: {
                    n7 = 41;
                    break;
                }
                case 187: {
                    n7 = 157;
                    break;
                }
                case 188: {
                    n7 = 245;
                    break;
                }
                case 189: {
                    n7 = 205;
                    break;
                }
                case 190: {
                    n7 = 33;
                    break;
                }
                case 191: {
                    n7 = 241;
                    break;
                }
                case 192: {
                    n7 = 149;
                    break;
                }
                case 193: {
                    n7 = 78;
                    break;
                }
                case 194: {
                    n7 = 9;
                    break;
                }
                case 195: {
                    n7 = 37;
                    break;
                }
                case 196: {
                    n7 = 237;
                    break;
                }
                case 197: {
                    n7 = 153;
                    break;
                }
                case 198: {
                    n7 = 44;
                    break;
                }
                case 199: {
                    n7 = 171;
                    break;
                }
                case 200: {
                    n7 = 36;
                    break;
                }
                case 201: {
                    n7 = 87;
                    break;
                }
                case 202: {
                    n7 = 227;
                    break;
                }
                case 203: {
                    n7 = 233;
                    break;
                }
                case 204: {
                    n7 = 73;
                    break;
                }
                case 205: {
                    n7 = 104;
                    break;
                }
                case 206: {
                    n7 = 15;
                    break;
                }
                case 207: {
                    n7 = 89;
                    break;
                }
                case 208: {
                    n7 = 90;
                    break;
                }
                case 209: {
                    n7 = 2;
                    break;
                }
                case 210: {
                    n7 = 137;
                    break;
                }
                case 211: {
                    n7 = 175;
                    break;
                }
                case 212: {
                    n7 = 180;
                    break;
                }
                case 213: {
                    n7 = 64;
                    break;
                }
                case 214: {
                    n7 = 106;
                    break;
                }
                case 215: {
                    n7 = 28;
                    break;
                }
                case 216: {
                    n7 = 59;
                    break;
                }
                case 217: {
                    n7 = 186;
                    break;
                }
                case 218: {
                    n7 = 62;
                    break;
                }
                case 219: {
                    n7 = 199;
                    break;
                }
                case 220: {
                    n7 = 203;
                    break;
                }
                case 221: {
                    n7 = 34;
                    break;
                }
                case 222: {
                    n7 = 143;
                    break;
                }
                case 223: {
                    n7 = 234;
                    break;
                }
                case 224: {
                    n7 = 162;
                    break;
                }
                case 225: {
                    n7 = 67;
                    break;
                }
                case 226: {
                    n7 = 115;
                    break;
                }
                case 227: {
                    n7 = 29;
                    break;
                }
                case 228: {
                    n7 = 121;
                    break;
                }
                case 229: {
                    n7 = 92;
                    break;
                }
                case 230: {
                    n7 = 17;
                    break;
                }
                case 231: {
                    n7 = 30;
                    break;
                }
                case 232: {
                    n7 = 198;
                    break;
                }
                case 233: {
                    n7 = 95;
                    break;
                }
                case 234: {
                    n7 = 80;
                    break;
                }
                case 235: {
                    n7 = 228;
                    break;
                }
                case 236: {
                    n7 = 14;
                    break;
                }
                case 237: {
                    n7 = 124;
                    break;
                }
                case 238: {
                    n7 = 165;
                    break;
                }
                case 239: {
                    n7 = 208;
                    break;
                }
                case 240: {
                    n7 = 116;
                    break;
                }
                case 241: {
                    n7 = 179;
                    break;
                }
                case 242: {
                    n7 = 13;
                    break;
                }
                case 243: {
                    n7 = 40;
                    break;
                }
                case 244: {
                    n7 = 178;
                    break;
                }
                case 245: {
                    n7 = 187;
                    break;
                }
                case 246: {
                    n7 = 21;
                    break;
                }
                case 247: {
                    n7 = 43;
                    break;
                }
                case 248: {
                    n7 = 229;
                    break;
                }
                case 249: {
                    n7 = 32;
                    break;
                }
                case 250: {
                    n7 = 155;
                    break;
                }
                case 251: {
                    n7 = 101;
                    break;
                }
                case 252: {
                    n7 = 148;
                    break;
                }
                case 253: {
                    n7 = 138;
                    break;
                }
                case 254: {
                    n7 = 246;
                    break;
                }
                default: {
                    n7 = 147;
                }
            }
            int n8 = n7;
            int n9 = ((n3 ^= n4) & 0xFF) - n8;
            if (n9 < 0) {
                n9 += 256;
            }
            if ((n6 = ((n3 & 0xFFFF) >>> 8) - n8) < 0) {
                n6 += 256;
            }
            int n10 = 0;
            while (n10 < cArray.length) {
                int n11 = n10 % 2;
                int n12 = n10;
                char[] cArray2 = cArray;
                char c2 = cArray[n12];
                if (n11 == 0) {
                    cArray2[n12] = (char)(c2 ^ n9);
                    n9 = ((n9 >>> 3 | n9 << 5) ^ cArray[n10]) & 0xFF;
                } else {
                    cArray2[n12] = (char)(c2 ^ n6);
                    n6 = ((n6 >>> 3 | n6 << 5) ^ cArray[n10]) & 0xFF;
                }
                ++n10;
            }
            n.c[n5] = new String(cArray).intern();
        }
        return c[n5];
    }
}

