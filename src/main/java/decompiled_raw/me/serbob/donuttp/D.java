/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.inventory.ItemStack
 */
package me.serbob.donuttp;

import java.io.OutputStream;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import me.serbob.donuttp.A;
import me.serbob.donuttp.F;
import me.serbob.donuttp.K;
import me.serbob.donuttp.U;
import me.serbob.donuttp.V7;
import me.serbob.donuttp.d;
import me.serbob.donuttp.f;
import me.serbob.donuttp.j;
import me.serbob.donuttp.n;
import me.serbob.donuttp.p;
import me.serbob.donuttp.r;
import me.serbob.donuttp.s;
import me.serbob.donuttp.u;
import me.serbob.donuttp.x;
import org.bukkit.inventory.ItemStack;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class D
implements j {
    private final ReadWriteLock M = new ReentrantReadWriteLock();
    private final Lock B = this.M.readLock();
    private final Lock R = this.M.writeLock();
    private String o;
    private D d;
    private final boolean n;
    private Object i;
    private static final String[] a;
    private static final String[] b;

    protected D(D d2, String string) {
        this(d2, string, false);
    }

    protected D(D d2, String string, boolean bl) {
        this.o = string;
        this.d = d2;
        this.n = bl;
    }

    protected Lock m() {
        return this.B;
    }

    protected Lock H() {
        return this.R;
    }

    protected void a(long l2) {
        long l3 = l2 ^ 0L;
        if (this.d != null) {
            this.d.a(l3);
        }
    }

    protected void Z(Object object, char c2, int n2, char c3) {
        block7: {
            long l2;
            long l3 = l2 = (long)c2 << 48 | (long)n2 << 32 >>> 16 | (long)c3 << 48 >>> 48;
            long l4 = l3 ^ 0x3ED4126B22ABL;
            long l5 = l3 ^ 0x3CAE91A2E17EL;
            if (this.q(l4)) {
                throw new s(l5, D.a(644471190 + (char)-31453, -644471190 + -30740, (int)l2));
            }
            D d2 = this;
            if (c2 >= '\u0000') {
                if (!d2.n) break block7;
                d2 = this;
            }
            d2.i = object;
        }
    }

    protected void z(long l2) {
        long l3 = l2 ^ 0L;
        if (this.d != null) {
            this.d.z(l3);
        }
    }

    protected boolean q(long l2) {
        long l3 = l2 ^ 0L;
        if (this.d != null) {
            return this.d.q(l3);
        }
        return false;
    }

    protected boolean L() {
        return this.n;
    }

    protected Object g(long l2) {
        Object object;
        block17: {
            short s2;
            Object object2;
            int n2;
            int n3;
            block16: {
                Object object3;
                int n4;
                long l3;
                int n5;
                int n6;
                int n7;
                block15: {
                    long l4 = l2;
                    long l5 = l4 ^ 0x2F7EE943FA25L;
                    long l6 = l4 ^ 0x213EBF3E9108L;
                    long l7 = l4 ^ 0x585061FB2AA1L;
                    n7 = (int)(l7 >>> 48);
                    n6 = (int)(l7 << 16 >>> 48);
                    n5 = (int)(l7 << 32 >>> 32);
                    l3 = l4 ^ 0x2D046A8A39F0L;
                    long l8 = l4 ^ 0x7800182B1722L;
                    n4 = (int)(l8 >>> 48);
                    n3 = (int)(l8 << 16 >>> 32);
                    n2 = (int)(l8 << 48 >>> 48);
                    if (this.q(l5)) {
                        throw new s(l3, D.a(-582868290 - -25460, -582868290 - -27189, (int)l2));
                    }
                    object3 = this.i;
                    if (l2 <= 0L) break block15;
                    if (object3 != null) {
                        return this.i;
                    }
                    object3 = this.h(l6);
                }
                object2 = object3;
                if (l2 > 0L && object2 == null) {
                    return null;
                }
                s2 = f.V((char)n7, (char)n6, this, n5);
                if (l2 <= 0L) break block16;
                if (s2 == 0) {
                    throw new s(l3, D.a(-582868290 - -25466, 582868290 - (char)-16704, (int)l2));
                }
                s2 = (short)n4;
            }
            Object object4 = f.Z(s2, n3, (short)n2, object2, this);
            object = this;
            if (l2 <= 0L) break block17;
            if (((D)object).n) {
                this.i = object4;
            }
            object = object4;
        }
        return object;
    }

    public String P() {
        return this.o;
    }

    public Object h(long l2) {
        long l3 = l2 ^ 0L;
        return this.d.h(l3);
    }

    protected void x(long l2, Object object) {
        long l3 = l2 ^ 0L;
        this.d.x(l3, object);
    }

    public D k() {
        return this.d;
    }

    public void S(long l2, D d2) {
        long l3 = l2;
        long l4 = l3 ^ 0x2C473742F35BL;
        long l5 = l3 ^ 0x75515524475FL;
        if (d2 == null) {
            return;
        }
        try {
            this.R.lock();
            f.k(this, d2, l5);
            this.a(l4);
        }
        finally {
            this.R.unlock();
        }
    }

    @Override
    public void X(x x2, long l2) {
        long l3 = l2;
        long l4 = l3 ^ 0x6632C1CA452AL;
        long l5 = l3 ^ 0x189A1CE51C69L;
        if (x2 instanceof D) {
            this.S(l5, (D)x2);
        }
        throw new s(l4, D.a(1979943420 - (char)-28904, 1979943420 - (char)-24601, (int)l2) + x2);
    }

    @Override
    public void I(String string, String string2, long l2) {
        long l3 = l2;
        long l4 = l3 ^ 0x2DBB730A47C4L;
        long l5 = l3 ^ 0x1F0B93D79913L;
        try {
            this.R.lock();
            f.R(this, l5, me.serbob.donuttp.d.COMPOUND_SET_STRING, string, string2);
            this.a(l4);
        }
        finally {
            this.R.unlock();
        }
    }

    @Override
    public String G(long l2, String string) {
        long l3 = l2 ^ 0x2D91091F256FL;
        try {
            this.B.lock();
            String string2 = (String)f.Y(this, l3, me.serbob.donuttp.d.COMPOUND_GET_STRING, string);
            return string2;
        }
        finally {
            this.B.unlock();
        }
    }

    @Override
    public void V(long l2, String string, Integer n2) {
        long l3 = l2;
        long l4 = l3 ^ 0x15AE9E511AE7L;
        long l5 = l3 ^ 0x271E7E8CC430L;
        try {
            this.R.lock();
            f.R(this, l5, me.serbob.donuttp.d.COMPOUND_SET_INT, string, n2);
            this.a(l4);
        }
        finally {
            this.R.unlock();
        }
    }

    @Override
    public Integer t(String string, long l2) {
        long l3 = l2 ^ 0xE861346335L;
        try {
            this.B.lock();
            Integer n2 = (Integer)f.Y(this, l3, me.serbob.donuttp.d.COMPOUND_GET_INT, string);
            return n2;
        }
        finally {
            this.B.unlock();
        }
    }

    @Override
    public void x(char c2, String string, short s2, int n2, Double d2) {
        long l2;
        long l3 = l2 = (long)c2 << 48 | (long)s2 << 48 >>> 16 | (long)n2 << 32 >>> 32;
        long l4 = l3 ^ 0x23AC4C6EC5F2L;
        long l5 = l3 ^ 0x111CACB31B25L;
        try {
            this.R.lock();
            f.R(this, l5, me.serbob.donuttp.d.COMPOUND_SET_DOUBLE, string, d2);
            this.a(l4);
        }
        finally {
            this.R.unlock();
        }
    }

    @Override
    public Double p(short s2, String string, int n2, int n3) {
        long l2 = (long)s2 << 48 | (long)n2 << 32 >>> 16 | (long)n3 << 48 >>> 48;
        long l3 = l2 ^ 0xC0EABCC3D64L;
        try {
            this.B.lock();
            Double d2 = (Double)f.Y(this, l3, me.serbob.donuttp.d.COMPOUND_GET_DOUBLE, string);
            return d2;
        }
        finally {
            this.B.unlock();
        }
    }

    @Override
    public void j(String string, Byte by, long l2) {
        long l3 = l2;
        long l4 = l3 ^ 0x319AFCA6C98BL;
        long l5 = l3 ^ 0x32A1C7B175CL;
        try {
            this.R.lock();
            f.R(this, l5, me.serbob.donuttp.d.COMPOUND_SET_BYTE, string, by);
            this.a(l4);
        }
        finally {
            this.R.unlock();
        }
    }

    @Override
    public Byte h(String string, long l2, short s2) {
        long l3 = l2 << 16 | (long)s2 << 48 >>> 48;
        long l4 = l3 ^ 0x52079DFF03B9L;
        try {
            this.B.lock();
            Byte by = (Byte)f.Y(this, l4, me.serbob.donuttp.d.COMPOUND_GET_BYTE, string);
            return by;
        }
        finally {
            this.B.unlock();
        }
    }

    @Override
    public void q(String string, Short s2, long l2) {
        long l3 = l2;
        long l4 = l3 ^ 0x58D5F7930179L;
        long l5 = l3 ^ 0x6A65174EDFAEL;
        try {
            this.R.lock();
            f.R(this, l5, me.serbob.donuttp.d.COMPOUND_SET_SHORT, string, s2);
            this.a(l4);
        }
        finally {
            this.R.unlock();
        }
    }

    @Override
    public Short c(String string, long l2, int n2) {
        long l3 = l2 << 32 | (long)n2 << 32 >>> 32;
        long l4 = l3 ^ 0x19CD9A58E200L;
        try {
            this.B.lock();
            Short s2 = (Short)f.Y(this, l4, me.serbob.donuttp.d.COMPOUND_GET_SHORT, string);
            return s2;
        }
        finally {
            this.B.unlock();
        }
    }

    @Override
    public void V(short s2, short s3, String string, int n2, Long l2) {
        long l3;
        long l4 = l3 = (long)s2 << 48 | (long)s3 << 48 >>> 16 | (long)n2 << 32 >>> 32;
        long l5 = l4 ^ 0x3A646868E6CFL;
        long l6 = l4 ^ 0x8D488B53818L;
        try {
            this.R.lock();
            f.R(this, l6, me.serbob.donuttp.d.COMPOUND_SET_LONG, string, l2);
            this.a(l5);
        }
        finally {
            this.R.unlock();
        }
    }

    @Override
    public Long c(String string, long l2) {
        long l3 = l2 ^ 0x5A35CC71D8C7L;
        try {
            this.B.lock();
            Long l4 = (Long)f.Y(this, l3, me.serbob.donuttp.d.COMPOUND_GET_LONG, string);
            return l4;
        }
        finally {
            this.B.unlock();
        }
    }

    @Override
    public void w(String string, Float f2, long l2) {
        long l3 = l2;
        long l4 = l3 ^ 0xB2DF43C2410L;
        long l5 = l3 ^ 0x399D14E1FAC7L;
        try {
            this.R.lock();
            f.R(this, l5, me.serbob.donuttp.d.COMPOUND_SET_FLOAT, string, f2);
            this.a(l4);
        }
        finally {
            this.R.unlock();
        }
    }

    @Override
    public Float o(char c2, int n2, String string, int n3) {
        long l2 = (long)c2 << 48 | (long)n2 << 32 >>> 16 | (long)n3 << 48 >>> 48;
        long l3 = l2 ^ 0x151ED061FEAFL;
        try {
            this.B.lock();
            Float f2 = (Float)f.Y(this, l3, me.serbob.donuttp.d.COMPOUND_GET_FLOAT, string);
            return f2;
        }
        finally {
            this.B.unlock();
        }
    }

    @Override
    public void r(String string, long l2, byte[] byArray) {
        long l3 = l2;
        long l4 = l3 ^ 0x657C6BA7222EL;
        long l5 = l3 ^ 0x57CC8B7AFCF9L;
        try {
            this.R.lock();
            f.R(this, l5, me.serbob.donuttp.d.COMPOUND_SET_BYTEARRAY, string, byArray);
            this.a(l4);
        }
        finally {
            this.R.unlock();
        }
    }

    @Override
    public byte[] q(int n2, int n3, int n4, String string) {
        long l2 = (long)n2 << 32 | (long)n3 << 48 >>> 32 | (long)n4 << 48 >>> 48;
        long l3 = l2 ^ 0x2F1F4C8DC515L;
        try {
            this.B.lock();
            byte[] byArray = (byte[])f.Y(this, l3, me.serbob.donuttp.d.COMPOUND_GET_BYTEARRAY, string);
            return byArray;
        }
        finally {
            this.B.unlock();
        }
    }

    @Override
    public void U(long l2, String string, int[] nArray) {
        long l3 = l2;
        long l4 = l3 ^ 0x64451EA644CEL;
        long l5 = l3 ^ 0x56F5FE7B9A19L;
        try {
            this.R.lock();
            f.R(this, l5, me.serbob.donuttp.d.COMPOUND_SET_INTARRAY, string, nArray);
            this.a(l4);
        }
        finally {
            this.R.unlock();
        }
    }

    @Override
    public int[] d(int n2, short s2, String string, char c2) {
        long l2 = (long)n2 << 32 | (long)s2 << 48 >>> 32 | (long)c2 << 48 >>> 48;
        long l3 = l2 ^ 0x69BFD525EF29L;
        try {
            this.B.lock();
            int[] nArray = (int[])f.Y(this, l3, me.serbob.donuttp.d.COMPOUND_GET_INTARRAY, string);
            return nArray;
        }
        finally {
            this.B.unlock();
        }
    }

    @Override
    public void d(long l2, String string, long[] lArray) {
        long l3 = l2;
        long l4 = l3 ^ 0xEF58A19A85DL;
        long l5 = l3 ^ 0x8D50762BE62L;
        long l6 = l3 ^ 0x3A65E7BF60B5L;
        me.serbob.donuttp.J.G(r.MC1_16_R1, l4);
        try {
            this.R.lock();
            f.R(this, l6, me.serbob.donuttp.d.COMPOUND_SET_LONGARRAY, string, lArray);
            this.a(l5);
        }
        finally {
            this.R.unlock();
        }
    }

    @Override
    public long[] P(long l2, int n2, String string) {
        long l3;
        long l4 = l3 = l2 << 32 | (long)n2 << 32 >>> 32;
        long l5 = l4 ^ 0x40484DE2CB13L;
        long l6 = l4 ^ 0x512D5AD6D948L;
        me.serbob.donuttp.J.G(r.MC1_16_R1, l5);
        try {
            this.B.lock();
            long[] lArray = (long[])f.Y(this, l6, me.serbob.donuttp.d.COMPOUND_GET_LONGARRAY, string);
            return lArray;
        }
        finally {
            this.B.unlock();
        }
    }

    @Override
    public void y(String string, Boolean bl, long l2) {
        long l3 = l2;
        long l4 = l3 ^ 0x7916074FE26AL;
        long l5 = l3 ^ 0x4BA6E7923CBDL;
        try {
            this.R.lock();
            f.R(this, l5, me.serbob.donuttp.d.COMPOUND_SET_BOOLEAN, string, bl);
            this.a(l4);
        }
        finally {
            this.R.unlock();
        }
    }

    protected void L(String string, Object object, long l2) {
        long l3 = l2;
        long l4 = l3 ^ 0x579D32A58C5AL;
        long l5 = l3 ^ 0x3AD9A147EAF3L;
        f.F(this, l5, string, object);
        this.a(l4);
    }

    @Override
    public Boolean l(long l2, String string) {
        long l3 = l2 ^ 0x227D4F193EDCL;
        try {
            this.B.lock();
            Boolean bl = (Boolean)f.Y(this, l3, me.serbob.donuttp.d.COMPOUND_GET_BOOLEAN, string);
            return bl;
        }
        finally {
            this.B.unlock();
        }
    }

    @Deprecated
    public void u(char c2, char c3, String string, Object object, int n2) {
        long l2;
        long l3 = l2 = (long)c2 << 48 | (long)c3 << 48 >>> 16 | (long)n2 << 32 >>> 32;
        long l4 = l3 ^ 0x9E22847BC48L;
        long l5 = l3 ^ 0x639D75CBD739L;
        try {
            this.R.lock();
            f.y(l5, this, string, object);
            this.a(l4);
        }
        finally {
            this.R.unlock();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Deprecated
    public Object b(String string, long l2, Class clazz) {
        long l3 = l2 ^ 0x39779BC0EA1DL;
        try {
            this.B.lock();
            Object object = f.Y(this, l3, string, clazz);
            return object;
        }
        finally {
            this.B.unlock();
        }
    }

    @Override
    public void o(String string, ItemStack itemStack, long l2) {
        long l3 = l2;
        long l4 = l3 ^ 0x4AAEE3077703L;
        int n2 = (int)(l4 >>> 48);
        int n3 = (int)(l4 << 16 >>> 32);
        int n4 = (int)(l4 << 48 >>> 48);
        long l5 = l3 ^ 0x706EF25852F8L;
        long l6 = l3 ^ 0x50CDC76AA903L;
        long l7 = l3 ^ 0x7E424A227DEL;
        try {
            this.R.lock();
            this.m(string, l5);
            this.B((short)n2, string, n3, (char)n4).S(l6, F.P(l7, itemStack));
        }
        finally {
            this.R.unlock();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public ItemStack G(String string, long l2) {
        long l3 = l2;
        long l4 = l3 ^ 0x28791371D84L;
        long l5 = l3 ^ 0x226037F87413L;
        try {
            this.B.lock();
            D d2 = this.z(l4, string);
            if (d2 == null) {
                ItemStack itemStack = null;
                return itemStack;
            }
            ItemStack itemStack = F.S(d2, l5);
            return itemStack;
        }
        finally {
            this.B.unlock();
        }
    }

    @Override
    public void c(String string, ItemStack[] itemStackArray, long l2) {
        long l3 = l2;
        long l4 = l3 ^ 0x1A9F0B893FCBL;
        int n2 = (int)(l4 >>> 48);
        int n3 = (int)(l4 << 16 >>> 32);
        int n4 = (int)(l4 << 48 >>> 48);
        long l5 = l3 ^ 0x5093F24E5778L;
        long l6 = l3 ^ 0x205F1AD61A30L;
        long l7 = l3 ^ 0xFC2FE4E1CBL;
        try {
            this.R.lock();
            this.m(string, l6);
            this.B((short)n2, string, n3, (char)n4).S(l7, F.t(itemStackArray, l5));
        }
        finally {
            this.R.unlock();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public ItemStack[] T(String string, long l2) {
        long l3 = l2;
        long l4 = l3 ^ 0x7EAB88B42E1BL;
        long l5 = l3 ^ 0x60E96CFCFFEL;
        try {
            this.B.lock();
            D d2 = this.z(l5, string);
            if (d2 == null) {
                ItemStack[] itemStackArray = null;
                return itemStackArray;
            }
            ItemStack[] itemStackArray = F.V(l4, d2);
            return itemStackArray;
        }
        finally {
            this.B.unlock();
        }
    }

    @Override
    public void f(int n2, String string, char c2, char c3, UUID uUID) {
        long l2;
        long l3 = l2 = (long)n2 << 32 | (long)c2 << 48 >>> 32 | (long)c3 << 48 >>> 48;
        long l4 = l3 ^ 0x614DA48CE16EL;
        long l5 = l3 ^ 0x4EE0542FDEC8L;
        long l6 = l3 ^ 0x4CF6D786A6AAL;
        long l7 = l3 ^ 0x53FD44513FB9L;
        try {
            block6: {
                block5: {
                    this.R.lock();
                    if (!r.m(r.MC1_16_R1, l5)) break block5;
                    f.R(this, l7, me.serbob.donuttp.d.COMPOUND_SET_UUID, string, uUID);
                    break block6;
                }
                this.I(string, uUID.toString(), l6);
            }
            this.a(l4);
        }
        finally {
            this.R.unlock();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     */
    @Override
    public UUID D(String var1_1, long var2_2) {
        v0 = var2_2;
        var4_3 = v0 ^ 34888424890059L;
        var6_4 = v0 ^ 11830418145382L;
        var8_5 = v0 ^ 43239360963849L;
        var10_6 = v0 ^ 73829491736744L;
        try {
            block14: {
                block13: {
                    block12: {
                        this.B.lock();
                        if (!r.m(r.MC1_16_R1, var4_3)) break block12;
                        v1 = this.n(var10_6, var1_1);
                        v2 = p.NBTTagIntArray;
                        if (var2_2 < 0L) break block13;
                        if (v1 != v2) break block12;
                        var12_7 = (UUID)f.Y(this, var8_5, me.serbob.donuttp.d.COMPOUND_GET_UUID, var1_1);
                        return var12_7;
                    }
                    v4 = this;
                    v5 = var10_6;
                    v6 = var1_1;
                    if (var2_2 < 0L) ** GOTO lbl33
                    v1 = v4.n(v5, v6);
                    v2 = p.NBTTagString;
                }
                if (v1 != v2) break block14;
                try {
                    v4 = this;
                    v5 = var6_4;
                    v6 = var1_1;
lbl33:
                    // 2 sources

                    var12_8 = UUID.fromString(v4.G(v5, v6));
                    return var12_8;
                }
                catch (IllegalArgumentException var12_9) {
                    var13_11 = null;
                    this.B.unlock();
                    return var13_11;
                }
            }
            var12_10 = null;
            return var12_10;
            {
                catch (Throwable var14_12) {
                    throw var14_12;
                }
            }
        }
        finally {
            this.B.unlock();
        }
    }

    @Deprecated
    public Boolean K(int n2, int n3, String string, byte by) {
        long l2 = (long)n2 << 32 | (long)n3 << 40 >>> 32 | (long)by << 56 >>> 56;
        long l3 = l2 ^ 0x59507BCA5178L;
        return this.k(l3, string);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean k(long l2, String string) {
        long l3 = l2 ^ 0x7336CF266976L;
        try {
            this.B.lock();
            Boolean bl = (Boolean)f.Y(this, l3, me.serbob.donuttp.d.COMPOUND_HAS_KEY, string);
            if (bl == null) {
                boolean bl2 = false;
                return bl2;
            }
            boolean bl3 = bl;
            return bl3;
        }
        finally {
            this.B.unlock();
        }
    }

    @Override
    public void m(String string, long l2) {
        long l3 = l2;
        long l4 = l3 ^ 0x62D558D3FDB1L;
        int n2 = (int)(l4 >>> 32);
        int n3 = (int)(l4 << 32 >>> 48);
        int n4 = (int)(l4 << 48 >>> 48);
        long l5 = l3 ^ 0xCE4027008A0L;
        try {
            this.R.lock();
            f.m(n2, this, string, n3, (short)n4);
            this.a(l5);
        }
        finally {
            this.R.unlock();
        }
    }

    @Override
    public Set o(long l2) {
        long l3 = l2 ^ 0x5EDFC33B69C9L;
        try {
            this.B.lock();
            HashSet hashSet = new HashSet(f.u(l3, this));
            return hashSet;
        }
        finally {
            this.B.unlock();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public D B(short s2, String string, int n2, char c2) {
        long l2;
        long l3 = l2 = (long)s2 << 48 | (long)n2 << 32 >>> 16 | (long)c2 << 48 >>> 48;
        long l4 = l3 ^ 0x3DF638793F78L;
        long l5 = l3 ^ 0x3624132F2D5BL;
        long l6 = l3 ^ 0x64CBF9428743L;
        long l7 = l3 ^ 0x6639BC1748C6L;
        long l8 = l3 ^ 0x45173F010C9EL;
        try {
            D d2;
            block8: {
                this.R.lock();
                if (this.n(l8, string) == p.NBTTagCompound) {
                    D d3 = this.z(l4, string);
                    return d3;
                }
                f.o(this, l7, string);
                D d4 = this.z(l4, string);
                d2 = d4;
                if (n2 <= 0) break block8;
                if (d2 == null) {
                    throw new s(l6, D.a(1317646710 + (char)-30960, 1317646710 + (char)-19601, (int)l2));
                }
                this.a(l5);
                d2 = d4;
            }
            D d5 = d2;
            return d5;
        }
        finally {
            this.R.unlock();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public D z(long l2, String string) {
        long l3 = l2;
        long l4 = l3 ^ 0x2C69CA4AAB6AL;
        int n2 = (int)(l4 >>> 48);
        int n3 = (int)(l4 << 16 >>> 48);
        int n4 = (int)(l4 << 32 >>> 32);
        long l5 = l3 ^ 0x78E1077833E6L;
        try {
            this.B.lock();
            if (this.n(l5, string) != p.NBTTagCompound) {
                D d2 = null;
                return d2;
            }
            D d3 = new D(this, string, this.n);
            if (f.V((char)n2, (char)n3, d3, n4)) {
                D d4 = d3;
                return d4;
            }
            D d5 = null;
            return d5;
        }
        finally {
            this.B.unlock();
        }
    }

    public D o(long l2, String string) {
        long l3 = l2 ^ 0x77329E7BE01AL;
        int n2 = (int)(l3 >>> 48);
        int n3 = (int)(l3 << 16 >>> 32);
        int n4 = (int)(l3 << 48 >>> 48);
        return this.B((short)n2, string, n3, (char)n4);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public n k(String string, long l2) {
        long l3 = l2;
        long l4 = l3 ^ 0x320F659381C3L;
        long l5 = l3 ^ 0x387A03759EBFL;
        try {
            this.R.lock();
            n n2 = f.t(this, string, p.NBTTagString, String.class, l5);
            this.a(l4);
            n n3 = n2;
            return n3;
        }
        finally {
            this.R.unlock();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public n Z(String string, long l2) {
        long l3 = l2;
        long l4 = l3 ^ 0x673FE4E28164L;
        long l5 = l3 ^ 0x6D4A82049E18L;
        try {
            this.R.lock();
            n n2 = f.t(this, string, p.NBTTagInt, Integer.class, l5);
            this.a(l4);
            n n3 = n2;
            return n3;
        }
        finally {
            this.R.unlock();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public n B(long l2, String string) {
        long l3 = l2;
        long l4 = l3 ^ 0x40B5783EFBC7L;
        long l5 = l3 ^ 0x4AC01ED8E4BBL;
        try {
            this.R.lock();
            n n2 = f.t(this, string, p.NBTTagIntArray, int[].class, l5);
            this.a(l4);
            n n3 = n2;
            return n3;
        }
        finally {
            this.R.unlock();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public n u(String string, long l2) {
        long l3 = l2;
        long l4 = l3 ^ 0x12CB59D83AA5L;
        long l5 = l3 ^ 0x18BE3F3E25D9L;
        try {
            this.R.lock();
            n n2 = f.t(this, string, p.NBTTagIntArray, UUID.class, l5);
            this.a(l4);
            n n3 = n2;
            return n3;
        }
        finally {
            this.R.unlock();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public n O(long l2, String string) {
        long l3 = l2;
        long l4 = l3 ^ 0x3A541E302E00L;
        long l5 = l3 ^ 0x302178D6317CL;
        try {
            this.R.lock();
            n n2 = f.t(this, string, p.NBTTagFloat, Float.class, l5);
            this.a(l4);
            n n3 = n2;
            return n3;
        }
        finally {
            this.R.unlock();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public n o(String string, long l2) {
        long l3 = l2;
        long l4 = l3 ^ 0x5A58C1548593L;
        long l5 = l3 ^ 0x502DA7B29AEFL;
        try {
            this.R.lock();
            n n2 = f.t(this, string, p.NBTTagDouble, Double.class, l5);
            this.a(l4);
            n n3 = n2;
            return n3;
        }
        finally {
            this.R.unlock();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public n D(long l2, String string) {
        long l3 = l2;
        long l4 = l3 ^ 0x5B3A8866C020L;
        long l5 = l3 ^ 0x514FEE80DF5CL;
        try {
            this.R.lock();
            n n2 = f.t(this, string, p.NBTTagLong, Long.class, l5);
            this.a(l4);
            n n3 = n2;
            return n3;
        }
        finally {
            this.R.unlock();
        }
    }

    @Override
    public p l(String string, long l2) {
        long l3 = l2;
        long l4 = l3 ^ 0x33800A907D74L;
        long l5 = l3 ^ 0x46A76606D22BL;
        try {
            this.B.lock();
            if (this.n(l5, string) != p.NBTTagList) {
                p p2 = null;
                return p2;
            }
            p p3 = f.M(this, string, l4);
            return p3;
        }
        finally {
            this.B.unlock();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public A G(long l2, String string) {
        long l3 = l2;
        long l4 = l3 ^ 0x1E04E0D6E35EL;
        long l5 = l3 ^ 0x14718630FC22L;
        try {
            this.R.lock();
            A a2 = (A)f.t(this, string, p.NBTTagCompound, U.class, l5);
            this.a(l4);
            A a3 = a2;
            return a3;
        }
        finally {
            this.R.unlock();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public Object t(short s2, String string, Object object, int n2, int n3) {
        Object object2;
        Class<?> clazz;
        Class<?> clazz2;
        long l2;
        long l3;
        long l4;
        block60: {
            Class clazz3;
            long l5;
            block59: {
                long l6 = l4 = (long)s2 << 48 | (long)n2 << 32 >>> 16 | (long)n3 << 48 >>> 48;
                long l7 = l6 ^ 0x7F1A95AF7BA2L;
                long l8 = l6 ^ 0x5D8FBB82264BL;
                long l9 = l6 ^ 0xF60474946C7L;
                long l10 = l9 >>> 16;
                int n4 = (int)(l9 << 48 >>> 48);
                l5 = l6 ^ 0x7A34A8766077L;
                long l11 = l6 ^ 0x7278963B806BL;
                int n5 = (int)(l11 >>> 32);
                int n6 = (int)(l11 << 32 >>> 48);
                int n7 = (int)(l11 << 48 >>> 48);
                long l12 = l6 ^ 0x44AA40EEA77EL;
                long l13 = l12 >>> 32;
                int n8 = (int)(l12 << 32 >>> 32);
                long l14 = l6 ^ 0x75216C79DB9L;
                long l15 = l6 ^ 0x48790AD7BBD1L;
                int n9 = (int)(l15 >>> 48);
                int n10 = (int)(l15 << 16 >>> 32);
                int n11 = (int)(l15 << 48 >>> 48);
                long l16 = l6 ^ 0x2E5115902C08L;
                l3 = l6 ^ 0x6905CFD8C909L;
                long l17 = l6 ^ 0x5169717A781AL;
                int n12 = (int)(l17 >>> 48);
                int n13 = (int)(l17 << 16 >>> 32);
                int n14 = (int)(l17 << 48 >>> 48);
                long l18 = l6 ^ 0x34D80F93AA57L;
                int n15 = (int)(l18 >>> 32);
                int n16 = (int)(l18 << 32 >>> 48);
                int n17 = (int)(l18 << 48 >>> 48);
                long l19 = l6 ^ 0x70F6D3A96011L;
                l2 = l6 ^ 0x18CDAA94EB02L;
                long l20 = l6 ^ 0xC4A80609C36L;
                long l21 = l20 >>> 32;
                int n18 = (int)(l20 << 32 >>> 32);
                if (object == null) {
                    throw new NullPointerException(D.a(492561060 + 29226, -492561060 + -15657, (int)l4));
                }
                Object object3 = this;
                if (n2 >= 0) {
                    if (!((D)object3).k(l16, string)) {
                        return object;
                    }
                    object3 = object;
                }
                clazz = clazz2 = object3.getClass();
                clazz3 = Boolean.class;
                if (n3 >= 0) {
                    if (clazz == clazz3) return this.l(l7, string);
                    clazz = clazz2;
                    clazz3 = Boolean.TYPE;
                }
                if (n3 >= 0) {
                    if (clazz == clazz3) {
                        return this.l(l7, string);
                    }
                    clazz = clazz2;
                    clazz3 = Byte.class;
                }
                if (n2 >= 0) {
                    if (clazz == clazz3) return this.h(string, l10, (short)n4);
                    clazz = clazz2;
                    clazz3 = Byte.TYPE;
                }
                if (s2 >= 0) {
                    if (clazz == clazz3) {
                        return this.h(string, l10, (short)n4);
                    }
                    clazz = clazz2;
                    clazz3 = Short.class;
                }
                if (s2 >= 0) {
                    if (clazz == clazz3) return this.c(string, l13, n8);
                    clazz = clazz2;
                    clazz3 = Short.TYPE;
                }
                if (s2 >= 0) {
                    if (clazz == clazz3) {
                        return this.c(string, l13, n8);
                    }
                    clazz = clazz2;
                    clazz3 = Integer.class;
                }
                if (n2 >= 0) {
                    if (clazz == clazz3) return this.t(string, l8);
                    clazz = clazz2;
                    clazz3 = Integer.TYPE;
                }
                if (n3 > 0) {
                    if (clazz == clazz3) {
                        return this.t(string, l8);
                    }
                    clazz = clazz2;
                    clazz3 = Long.class;
                }
                if (s2 >= 0) {
                    if (clazz == clazz3) return this.c(string, l14);
                    clazz = clazz2;
                    clazz3 = Long.TYPE;
                }
                if (n2 >= 0) {
                    if (clazz == clazz3) {
                        return this.c(string, l14);
                    }
                    clazz = clazz2;
                    clazz3 = Float.class;
                }
                if (n3 > 0) {
                    if (clazz == clazz3) return this.o((char)n9, n10, string, n11);
                    clazz = clazz2;
                    clazz3 = Float.TYPE;
                }
                if (n3 >= 0) {
                    if (clazz == clazz3) {
                        return this.o((char)n9, n10, string, n11);
                    }
                    clazz = clazz2;
                    clazz3 = Double.class;
                }
                if (s2 >= 0) {
                    if (clazz == clazz3) return this.p((short)n12, string, n13, n14);
                    clazz = clazz2;
                    clazz3 = Double.TYPE;
                }
                if (n3 >= 0) {
                    if (clazz == clazz3) {
                        return this.p((short)n12, string, n13, n14);
                    }
                    clazz = clazz2;
                    clazz3 = byte[].class;
                }
                if (n3 >= 0) {
                    if (clazz == clazz3) {
                        return this.q(n5, n6, n7, string);
                    }
                    clazz = clazz2;
                    clazz3 = int[].class;
                }
                if (n3 >= 0) {
                    if (clazz == clazz3) {
                        return this.d(n15, (short)n16, string, (char)n17);
                    }
                    clazz = clazz2;
                    clazz3 = long[].class;
                }
                if (n2 >= 0) {
                    if (clazz == clazz3) {
                        return this.P(l21, n18, string);
                    }
                    clazz = clazz2;
                    clazz3 = String.class;
                }
                if (n2 < 0) break block59;
                if (clazz == clazz3) {
                    return this.G(l19, string);
                }
                clazz = clazz2;
                if (n3 <= 0) break block60;
                clazz3 = UUID.class;
            }
            if (clazz == clazz3) {
                UUID uUID = this.D(string, l5);
                Object object4 = uUID;
                if (n3 < 0) return object4;
                if (object4 == null) {
                    object4 = object;
                    return object4;
                }
                object4 = uUID;
                return object4;
            }
            clazz = clazz2;
        }
        if (!clazz.isEnum()) throw new s(l2, D.a(492561060 + 29216, -492561060 + -10873, (int)l4) + clazz2.getName());
        Object object5 = object2 = this.D(string, l3, object.getClass());
        if (n3 < 0) return object5;
        if (object5 == null) {
            object5 = object;
            return object5;
        }
        object5 = object2;
        return object5;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public Object D(String string, long l2, Class clazz) {
        Class clazz2;
        long l3;
        long l4;
        block86: {
            Class clazz3;
            long l5;
            block85: {
                int n2;
                long l6;
                long l7;
                int n3;
                int n4;
                int n5;
                int n6;
                int n7;
                int n8;
                block83: {
                    block84: {
                        int n9;
                        int n10;
                        int n11;
                        block82: {
                            block81: {
                                block79: {
                                    block80: {
                                        int n12;
                                        int n13;
                                        int n14;
                                        block78: {
                                            block77: {
                                                block75: {
                                                    block76: {
                                                        long l8;
                                                        block74: {
                                                            block73: {
                                                                block71: {
                                                                    block72: {
                                                                        long l9;
                                                                        block70: {
                                                                            block69: {
                                                                                block67: {
                                                                                    block68: {
                                                                                        int n15;
                                                                                        long l10;
                                                                                        block66: {
                                                                                            block65: {
                                                                                                block63: {
                                                                                                    block64: {
                                                                                                        int n16;
                                                                                                        long l11;
                                                                                                        block62: {
                                                                                                            block61: {
                                                                                                                block59: {
                                                                                                                    block60: {
                                                                                                                        long l12;
                                                                                                                        block58: {
                                                                                                                            block57: {
                                                                                                                                long l13 = l2;
                                                                                                                                l12 = l13 ^ 0x1766AE8AE102L;
                                                                                                                                l9 = l13 ^ 0x35F380A7BCEBL;
                                                                                                                                long l14 = l13 ^ 0x671C7C6CDC67L;
                                                                                                                                l11 = l14 >>> 16;
                                                                                                                                n16 = (int)(l14 << 48 >>> 48);
                                                                                                                                l5 = l13 ^ 0x12489353FAD7L;
                                                                                                                                long l15 = l13 ^ 0x1A04AD1E1ACBL;
                                                                                                                                n8 = (int)(l15 >>> 32);
                                                                                                                                n7 = (int)(l15 << 32 >>> 48);
                                                                                                                                n6 = (int)(l15 << 48 >>> 48);
                                                                                                                                long l16 = l13 ^ 0x2CD67BCB3DDEL;
                                                                                                                                l10 = l16 >>> 32;
                                                                                                                                n15 = (int)(l16 << 32 >>> 32);
                                                                                                                                l8 = l13 ^ 0x6F2E2DE20719L;
                                                                                                                                long l17 = l13 ^ 0x200531F22171L;
                                                                                                                                n14 = (int)(l17 >>> 48);
                                                                                                                                n13 = (int)(l17 << 16 >>> 32);
                                                                                                                                n12 = (int)(l17 << 48 >>> 48);
                                                                                                                                long l18 = l13 ^ 0x462D2EB5B6A8L;
                                                                                                                                l4 = l13 ^ 0x179F4FD53A9L;
                                                                                                                                long l19 = l13 ^ 0x39154A5FE2BAL;
                                                                                                                                n11 = (int)(l19 >>> 48);
                                                                                                                                n10 = (int)(l19 << 16 >>> 32);
                                                                                                                                n9 = (int)(l19 << 48 >>> 48);
                                                                                                                                long l20 = l13 ^ 0x5CA434B630F7L;
                                                                                                                                n5 = (int)(l20 >>> 32);
                                                                                                                                n4 = (int)(l20 << 32 >>> 48);
                                                                                                                                n3 = (int)(l20 << 48 >>> 48);
                                                                                                                                l7 = l13 ^ 0x188AE88CFAB1L;
                                                                                                                                l3 = l13 ^ 0x70B191B171A2L;
                                                                                                                                long l21 = l13 ^ 0x6436BB450696L;
                                                                                                                                l6 = l21 >>> 32;
                                                                                                                                n2 = (int)(l21 << 32 >>> 32);
                                                                                                                                if (clazz == null) {
                                                                                                                                    throw new NullPointerException(D.a(645519750 - 2843, -645519750 - -14368, (int)l2));
                                                                                                                                }
                                                                                                                                if (l2 >= 0L && !this.k(l18, string)) {
                                                                                                                                    return null;
                                                                                                                                }
                                                                                                                                Class clazz3 = clazz;
                                                                                                                                clazz3 = Boolean.class;
                                                                                                                                if (l2 < 0L) break block57;
                                                                                                                                if (clazz2 == clazz3) break block58;
                                                                                                                                Class clazz3 = clazz;
                                                                                                                                clazz3 = Boolean.TYPE;
                                                                                                                            }
                                                                                                                            if (l2 < 0L) break block59;
                                                                                                                            if (clazz2 != clazz3) break block60;
                                                                                                                        }
                                                                                                                        return this.l(l12, string);
                                                                                                                    }
                                                                                                                    Class clazz3 = clazz;
                                                                                                                    clazz3 = Byte.class;
                                                                                                                }
                                                                                                                if (l2 < 0L) break block61;
                                                                                                                if (clazz2 == clazz3) break block62;
                                                                                                                Class clazz3 = clazz;
                                                                                                                clazz3 = Byte.TYPE;
                                                                                                            }
                                                                                                            if (l2 <= 0L) break block63;
                                                                                                            if (clazz2 != clazz3) break block64;
                                                                                                        }
                                                                                                        return this.h(string, l11, (short)n16);
                                                                                                    }
                                                                                                    Class clazz3 = clazz;
                                                                                                    clazz3 = Short.class;
                                                                                                }
                                                                                                if (l2 <= 0L) break block65;
                                                                                                if (clazz2 == clazz3) break block66;
                                                                                                Class clazz3 = clazz;
                                                                                                clazz3 = Short.TYPE;
                                                                                            }
                                                                                            if (l2 < 0L) break block67;
                                                                                            if (clazz2 != clazz3) break block68;
                                                                                        }
                                                                                        return this.c(string, l10, n15);
                                                                                    }
                                                                                    Class clazz3 = clazz;
                                                                                    clazz3 = Integer.class;
                                                                                }
                                                                                if (l2 < 0L) break block69;
                                                                                if (clazz2 == clazz3) break block70;
                                                                                Class clazz3 = clazz;
                                                                                clazz3 = Integer.TYPE;
                                                                            }
                                                                            if (l2 < 0L) break block71;
                                                                            if (clazz2 != clazz3) break block72;
                                                                        }
                                                                        return this.t(string, l9);
                                                                    }
                                                                    Class clazz3 = clazz;
                                                                    clazz3 = Long.class;
                                                                }
                                                                if (l2 <= 0L) break block73;
                                                                if (clazz2 == clazz3) break block74;
                                                                Class clazz3 = clazz;
                                                                clazz3 = Long.TYPE;
                                                            }
                                                            if (l2 <= 0L) break block75;
                                                            if (clazz2 != clazz3) break block76;
                                                        }
                                                        return this.c(string, l8);
                                                    }
                                                    Class clazz3 = clazz;
                                                    clazz3 = Float.class;
                                                }
                                                if (l2 <= 0L) break block77;
                                                if (clazz2 == clazz3) break block78;
                                                Class clazz3 = clazz;
                                                clazz3 = Float.TYPE;
                                            }
                                            if (l2 <= 0L) break block79;
                                            if (clazz2 != clazz3) break block80;
                                        }
                                        return this.o((char)n14, n13, string, n12);
                                    }
                                    Class clazz3 = clazz;
                                    clazz3 = Double.class;
                                }
                                if (l2 < 0L) break block81;
                                if (clazz2 == clazz3) break block82;
                                Class clazz3 = clazz;
                                clazz3 = Double.TYPE;
                            }
                            if (l2 <= 0L) break block83;
                            if (clazz2 != clazz3) break block84;
                        }
                        return this.p((short)n11, string, n10, n9);
                    }
                    Class clazz3 = clazz;
                    clazz3 = byte[].class;
                }
                if (l2 >= 0L) {
                    if (clazz2 == clazz3) {
                        return this.q(n8, n7, n6, string);
                    }
                    Class clazz3 = clazz;
                    clazz3 = int[].class;
                }
                if (l2 > 0L) {
                    if (clazz2 == clazz3) {
                        return this.d(n5, (short)n4, string, (char)n3);
                    }
                    Class clazz3 = clazz;
                    clazz3 = long[].class;
                }
                if (l2 > 0L) {
                    if (clazz2 == clazz3) {
                        return this.P(l6, n2, string);
                    }
                    Class clazz3 = clazz;
                    clazz3 = String.class;
                }
                if (l2 < 0L) break block85;
                if (clazz2 == clazz3) {
                    return this.G(l7, string);
                }
                clazz2 = clazz;
                if (l2 < 0L) break block86;
                clazz3 = UUID.class;
            }
            if (clazz2 == clazz3) {
                return this.D(string, l5);
            }
            clazz2 = clazz;
        }
        if (clazz2.isEnum()) {
            return this.D(string, l4, clazz);
        }
        throw new s(l3, D.a(645519750 - 2853, 645519750 - 8892, (int)l2) + clazz.getName());
    }

    @Override
    public Object c(long l2, String string, Class clazz) {
        Object object;
        block20: {
            V7.O o2;
            D d2;
            long l3;
            long l4;
            long l5;
            block17: {
                long l6 = l2;
                long l7 = l6 ^ 0x29543457EF8BL;
                long l8 = l6 ^ 0x3C7460A52B2DL;
                int n2 = (int)(l8 >>> 32);
                int n3 = (int)(l8 << 32 >>> 40);
                int n4 = (int)(l8 << 56 >>> 56);
                long l9 = l6 ^ 0x42027A3267A7L;
                l5 = l6 ^ 0x236F549ED9EDL;
                long l10 = l6 ^ 0x7C441B4C866AL;
                long l11 = l6 ^ 0x57D4B1B296DAL;
                l4 = l6 ^ 0x6B8E2AB8AE3EL;
                long l12 = l6 ^ 0x3AE37D4A5441L;
                l3 = l6 ^ 0x7A1CE6C04EE2L;
                List list = V7.F(l7, string);
                d2 = this;
                int n5 = 0;
                while (n5 < list.size() - 1) {
                    block18: {
                        block19: {
                            A a2;
                            V7.O o3;
                            block21: {
                                o3 = (V7.O)list.get(n5);
                                if (l2 > 0L) {
                                    o2 = o3;
                                    if (l2 <= 0L) break block17;
                                    if (!o2.d(l5)) {
                                        d2 = d2.z(l9, o3.z());
                                        if (l2 < 0L) break block18;
                                        if (d2 == null) {
                                            return null;
                                        }
                                        break block19;
                                    }
                                }
                                if (l2 <= 0L) break block18;
                                if (d2.n(l12, o3.z()) == p.NBTTagList && d2.l(o3.z(), l10) == p.NBTTagCompound) {
                                }
                                break block19;
                                a2 = d2.G(l11, o3.z());
                                if (o3.q() < 0) break block21;
                                d2 = a2.h(n2, n3, (byte)n4, o3.q());
                                if (l2 > 0L) break block19;
                            }
                            d2 = a2.h(n2, n3, (byte)n4, a2.size() + o3.q());
                        }
                        ++n5;
                    }
                    if (l2 >= 0L) continue;
                }
                o2 = (V7.O)list.get(list.size() - 1);
            }
            V7.O o4 = o2;
            object = o4;
            if (l2 <= 0L) break block20;
            if (!((V7.O)object).d(l5)) {
                return d2.D(o4.z(), l4, clazz);
            }
            object = this.e(d2, o4, l3, clazz);
        }
        return object;
    }

    @Override
    public Object B(String string, Object object, long l2) {
        Object object2;
        block20: {
            V7.O o2;
            D d2;
            long l3;
            int n2;
            int n3;
            int n4;
            long l4;
            block17: {
                long l5 = l2;
                long l6 = l5 ^ 0x65A357D0D23CL;
                long l7 = l5 ^ 0x70830322169AL;
                int n5 = (int)(l7 >>> 32);
                int n6 = (int)(l7 << 32 >>> 40);
                int n7 = (int)(l7 << 56 >>> 56);
                long l8 = l5 ^ 0xEF519B55A10L;
                l4 = l5 ^ 0x6F983719E45AL;
                long l9 = l5 ^ 0x30B378CBBBDDL;
                long l10 = l5 ^ 0x4F05721A0929L;
                n4 = (int)(l10 >>> 48);
                n3 = (int)(l10 << 16 >>> 32);
                n2 = (int)(l10 << 48 >>> 48);
                long l11 = l5 ^ 0x1B23D235AB6DL;
                long l12 = l5 ^ 0x76141ECD69F6L;
                l3 = l5 ^ 0x36EB85477355L;
                List list = V7.F(l6, string);
                d2 = this;
                int n8 = 0;
                while (n8 < list.size() - 1) {
                    block18: {
                        block19: {
                            A a2;
                            V7.O o3;
                            block21: {
                                o3 = (V7.O)list.get(n8);
                                if (l2 > 0L) {
                                    o2 = o3;
                                    if (l2 <= 0L) break block17;
                                    if (!o2.d(l4)) {
                                        d2 = d2.z(l8, o3.z());
                                        if (l2 <= 0L) break block18;
                                        if (d2 == null) {
                                            return object;
                                        }
                                        break block19;
                                    }
                                }
                                if (l2 <= 0L) break block18;
                                if (d2.n(l12, o3.z()) == p.NBTTagList && d2.l(o3.z(), l9) == p.NBTTagCompound) {
                                }
                                break block19;
                                a2 = d2.G(l11, o3.z());
                                if (o3.q() < 0) break block21;
                                d2 = a2.h(n5, n6, (byte)n7, o3.q());
                                if (l2 > 0L) break block19;
                            }
                            d2 = a2.h(n5, n6, (byte)n7, a2.size() + o3.q());
                        }
                        ++n8;
                    }
                    if (l2 > 0L) continue;
                }
                o2 = (V7.O)list.get(list.size() - 1);
            }
            V7.O o4 = o2;
            object2 = o4;
            if (l2 < 0L) break block20;
            if (!((V7.O)object2).d(l4)) {
                return d2.t((short)n4, o4.z(), object, n3, n2);
            }
            object2 = this.e(d2, o4, l3, object.getClass());
        }
        return object2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private Object e(D var1_1, V7.O var2_2, long var3_3, Class var5_4) {
        block147: {
            block148: {
                block149: {
                    block150: {
                        block144: {
                            block145: {
                                block146: {
                                    block141: {
                                        block142: {
                                            block143: {
                                                block138: {
                                                    block139: {
                                                        block140: {
                                                            block132: {
                                                                block135: {
                                                                    block136: {
                                                                        block137: {
                                                                            block133: {
                                                                                block134: {
                                                                                    block126: {
                                                                                        block129: {
                                                                                            block130: {
                                                                                                block131: {
                                                                                                    block127: {
                                                                                                        block128: {
                                                                                                            block123: {
                                                                                                                block124: {
                                                                                                                    block125: {
                                                                                                                        v0 = var3_3;
                                                                                                                        var6_5 = v0 ^ 10551284733286L;
                                                                                                                        var8_6 = v0 ^ 1940557118117L;
                                                                                                                        var10_7 = v0 ^ 93404050930178L;
                                                                                                                        var12_8 = v0 ^ 116086371565301L;
                                                                                                                        var14_9 = v0 ^ 6979280750728L;
                                                                                                                        v1 = v0 ^ 84898497876011L;
                                                                                                                        var16_10 = (int)(v1 >>> 32);
                                                                                                                        var17_11 = (int)(v1 << 32 >>> 48);
                                                                                                                        var18_12 = (int)(v1 << 48 >>> 48);
                                                                                                                        var19_13 = v0 ^ 115406840986438L;
                                                                                                                        var21_14 = v0 ^ 106804525240702L;
                                                                                                                        var23_15 = v0 ^ 126967011262625L;
                                                                                                                        v2 = v0 ^ 12740507138583L;
                                                                                                                        var25_16 = (int)(v2 >>> 32);
                                                                                                                        var26_17 = (int)(v2 << 32 >>> 48);
                                                                                                                        var27_18 = (int)(v2 << 48 >>> 48);
                                                                                                                        var28_19 = v0 ^ 71466570357411L;
                                                                                                                        v3 = v0 ^ 129349235631690L;
                                                                                                                        var30_20 = v3 >>> 32;
                                                                                                                        var32_21 = (int)(v3 << 32 >>> 32);
                                                                                                                        if (var5_4 != String.class) break block123;
                                                                                                                        if (var1_1.n(var28_19, var2_2.z()) != p.NBTTagList) break block124;
                                                                                                                        if (var1_1.l(var2_2.z(), var14_9) != p.NBTTagString) break block124;
                                                                                                                        if (var2_2.q() < 0) break block125;
                                                                                                                        return var1_1.k(var2_2.z(), var8_6).get(var2_2.q());
                                                                                                                    }
                                                                                                                    var33_22 = var1_1.k(var2_2.z(), var8_6);
                                                                                                                    return var33_22.get(var33_22.size() + var2_2.q());
                                                                                                                }
                                                                                                                throw new s(var21_14, D.a(-368962050 + -((char)-6323), -368962050 + -((char)-5935), (int)var3_3) + var2_2.z() + D.a(-368962050 + -((char)-6325), 368962050 + (char)-8157, (int)var3_3) + var5_4);
                                                                                                            }
                                                                                                            if (var3_3 <= 0L || var5_4 == Integer.TYPE) ** GOTO lbl68
                                                                                                            v8 = var5_4;
                                                                                                            v9 /* !! */  = Integer.class;
                                                                                                            if (var3_3 > 0L) {
                                                                                                                if (v8 == v9 /* !! */ ) {
                                                                                                                }
                                                                                                                break block126;
                                                                                                            }
                                                                                                            ** GOTO lbl136
lbl68:
                                                                                                            // 2 sources

                                                                                                            v11 = var1_1.n(var28_19, var2_2.z());
                                                                                                            v12 = p.NBTTagList;
                                                                                                            if (var3_3 >= 0L) {
                                                                                                                if (v11 != v12) break block127;
                                                                                                            }
                                                                                                            ** GOTO lbl99
                                                                                                            v11 = var1_1.l(var2_2.z(), var14_9);
                                                                                                            v12 = p.NBTTagInt;
                                                                                                            if (var3_3 >= 0L) {
                                                                                                                if (v11 != v12) break block127;
                                                                                                            }
                                                                                                            ** GOTO lbl99
                                                                                                            if (var2_2.q() < 0) break block128;
                                                                                                            return var1_1.Z(var2_2.z(), var10_7).get(var2_2.q());
                                                                                                        }
                                                                                                        var33_23 = var1_1.Z(var2_2.z(), var10_7);
                                                                                                        return var33_23.get(var33_23.size() + var2_2.q());
                                                                                                    }
                                                                                                    v11 = var1_1.n(var28_19, var2_2.z());
                                                                                                    v12 = p.NBTTagIntArray;
lbl99:
                                                                                                    // 3 sources

                                                                                                    if (v11 != v12) break block129;
                                                                                                    if (var2_2.q() < 0) break block130;
                                                                                                    var33_24 = var1_1.d(var16_10, (short)var17_11, var2_2.z(), (char)var18_12);
                                                                                                    v18 = var33_24;
                                                                                                    if (var3_3 >= 0L) {
                                                                                                        if (v18 == null) break block131;
                                                                                                        v18 = var33_24;
                                                                                                    }
                                                                                                    return v18[var2_2.q()];
                                                                                                }
                                                                                                if (var3_3 > 0L) break block129;
                                                                                            }
                                                                                            var33_24 = var1_1.d(var16_10, (short)var17_11, var2_2.z(), (char)var18_12);
                                                                                            v20 = var33_24;
                                                                                            if (var3_3 > 0L) {
                                                                                                if (v20 == null) break block129;
                                                                                                v20 = var33_24;
                                                                                            }
                                                                                            return v20[var33_24.length + var2_2.q()];
                                                                                        }
                                                                                        throw new s(var21_14, D.a(-368962050 + -((char)-6327), -368962050 + -((char)-22681), (int)var3_3) + var2_2.z() + D.a(-368962050 + -((char)-6326), -368962050 + -((char)-24108), (int)var3_3) + var5_4);
                                                                                    }
                                                                                    if (var3_3 < 0L) ** GOTO lbl146
                                                                                    v8 = var5_4;
                                                                                    v9 /* !! */  = Long.TYPE;
lbl136:
                                                                                    // 2 sources

                                                                                    if (v8 == v9 /* !! */ ) ** GOTO lbl146
                                                                                    v22 = var5_4;
                                                                                    v23 /* !! */  = Long.class;
                                                                                    if (var3_3 >= 0L) {
                                                                                        if (v22 == v23 /* !! */ ) {
                                                                                        }
                                                                                        break block132;
                                                                                    }
                                                                                    ** GOTO lbl217
lbl146:
                                                                                    // 3 sources

                                                                                    v25 = var1_1.n(var28_19, var2_2.z());
                                                                                    v26 = p.NBTTagList;
                                                                                    if (var3_3 >= 0L) {
                                                                                        if (v25 != v26) break block133;
                                                                                    }
                                                                                    ** GOTO lbl178
                                                                                    v25 = var1_1.l(var2_2.z(), var14_9);
                                                                                    v26 = p.NBTTagLong;
                                                                                    if (var3_3 >= 0L) {
                                                                                        if (v25 != v26) break block133;
                                                                                    }
                                                                                    ** GOTO lbl178
                                                                                    if (var2_2.q() >= 0) {
                                                                                    }
                                                                                    break block134;
                                                                                    return var1_1.D(var19_13, var2_2.z()).get(var2_2.q());
                                                                                }
                                                                                var33_25 = var1_1.D(var19_13, var2_2.z());
                                                                                return var33_25.get(var33_25.size() + var2_2.q());
                                                                            }
                                                                            v25 = var1_1.n(var28_19, var2_2.z());
                                                                            v26 = p.NBTTagLongArray;
lbl178:
                                                                            // 3 sources

                                                                            if (v25 != v26) break block135;
                                                                            if (var2_2.q() >= 0) {
                                                                            }
                                                                            break block136;
                                                                            var33_26 = var1_1.P(var30_20, var32_21, var2_2.z());
                                                                            v32 = var33_26;
                                                                            if (var3_3 >= 0L) {
                                                                                if (v32 == null) break block137;
                                                                                v32 = var33_26;
                                                                            }
                                                                            return v32[var2_2.q()];
                                                                        }
                                                                        if (var3_3 > 0L) break block135;
                                                                    }
                                                                    var33_26 = var1_1.P(var30_20, var32_21, var2_2.z());
                                                                    v34 = var33_26;
                                                                    if (var3_3 > 0L) {
                                                                        if (v34 == null) break block135;
                                                                        v34 = var33_26;
                                                                    }
                                                                    return v34[var33_26.length + var2_2.q()];
                                                                }
                                                                throw new s(var21_14, D.a(-368962050 + -((char)-6327), -368962050 + -((char)-22681), (int)var3_3) + var2_2.z() + D.a(-368962050 + -((char)-6326), -368962050 + -((char)-24108), (int)var3_3) + var5_4);
                                                            }
                                                            if (var3_3 < 0L) ** GOTO lbl227
                                                            v22 = var5_4;
                                                            v23 /* !! */  = Float.TYPE;
lbl217:
                                                            // 2 sources

                                                            if (v22 == v23 /* !! */ ) ** GOTO lbl227
                                                            v36 = var5_4;
                                                            v37 /* !! */  = Float.class;
                                                            if (var3_3 > 0L) {
                                                                if (v36 == v37 /* !! */ ) {
                                                                }
                                                                break block138;
                                                            }
                                                            ** GOTO lbl257
lbl227:
                                                            // 3 sources

                                                            if (var1_1.n(var28_19, var2_2.z()) != p.NBTTagList) break block139;
                                                            if (var1_1.l(var2_2.z(), var14_9) != p.NBTTagFloat) break block139;
                                                            if (var2_2.q() >= 0) {
                                                            }
                                                            break block140;
                                                            return var1_1.O(var6_5, var2_2.z()).get(var2_2.q());
                                                        }
                                                        var33_27 = var1_1.O(var6_5, var2_2.z());
                                                        return var33_27.get(var33_27.size() + var2_2.q());
                                                    }
                                                    throw new s(var21_14, D.a(-368962050 + -((char)-6327), -368962050 + -((char)-22681), (int)var3_3) + var2_2.z() + D.a(-368962050 + -((char)-6326), -368962050 + -((char)-24108), (int)var3_3) + var5_4);
                                                }
                                                if (var3_3 < 0L) ** GOTO lbl267
                                                v36 = var5_4;
                                                v37 /* !! */  = Double.TYPE;
lbl257:
                                                // 2 sources

                                                if (v36 == v37 /* !! */ ) ** GOTO lbl267
                                                v43 = var5_4;
                                                v44 /* !! */  = Double.class;
                                                if (var3_3 > 0L) {
                                                    if (v43 == v44 /* !! */ ) {
                                                    }
                                                    break block141;
                                                }
                                                ** GOTO lbl294
lbl267:
                                                // 3 sources

                                                if (var1_1.n(var28_19, var2_2.z()) != p.NBTTagList) break block142;
                                                if (var1_1.l(var2_2.z(), var14_9) != p.NBTTagDouble) break block142;
                                                if (var2_2.q() < 0) break block143;
                                                return var1_1.o(var2_2.z(), var12_8).get(var2_2.q());
                                            }
                                            var33_28 = var1_1.o(var2_2.z(), var12_8);
                                            return var33_28.get(var33_28.size() + var2_2.q());
                                        }
                                        throw new s(var21_14, D.a(-368962050 + -((char)-6327), -368962050 + -((char)-22681), (int)var3_3) + var2_2.z() + D.a(-368962050 + -((char)-6326), -368962050 + -((char)-24108), (int)var3_3) + var5_4);
                                    }
                                    v43 = var5_4;
                                    v44 /* !! */  = int[].class;
lbl294:
                                    // 2 sources

                                    if (var3_3 >= 0L) {
                                        if (v43 != v44 /* !! */ ) break block144;
                                        if (var1_1.n(var28_19, var2_2.z()) != p.NBTTagList) break block145;
                                    }
                                    ** GOTO lbl326
                                    if (var1_1.l(var2_2.z(), var14_9) != p.NBTTagIntArray) break block145;
                                    if (var2_2.q() >= 0) {
                                    }
                                    break block146;
                                    return var1_1.B(var23_15, var2_2.z()).get(var2_2.q());
                                }
                                var33_29 = var1_1.B(var23_15, var2_2.z());
                                return var33_29.get(var33_29.size() + var2_2.q());
                            }
                            throw new s(var21_14, D.a(-368962050 + -((char)-6327), -368962050 + -((char)-22681), (int)var3_3) + var2_2.z() + D.a(-368962050 + -((char)-6326), -368962050 + -((char)-24108), (int)var3_3) + var5_4);
                        }
                        if (var3_3 <= 0L) ** GOTO lbl331
                        v43 = var5_4;
                        v44 /* !! */  = Byte.TYPE;
lbl326:
                        // 2 sources

                        if (v43 == v44 /* !! */  || var5_4 == Byte.class) {
                        }
                        break block147;
lbl331:
                        // 2 sources

                        if (var1_1.n(var28_19, var2_2.z()) != p.NBTTagByteArray) break block148;
                        if (var2_2.q() < 0) break block149;
                        var33_30 = var1_1.q(var25_16, var26_17, var27_18, var2_2.z());
                        v57 = var33_30;
                        if (var3_3 >= 0L) {
                            if (v57 == null) break block150;
                            v57 = var33_30;
                        }
                        return v57[var2_2.q()];
                    }
                    if (var3_3 > 0L) break block148;
                }
                var33_30 = var1_1.q(var25_16, var26_17, var27_18, var2_2.z());
                v59 = var33_30;
                if (var3_3 >= 0L) {
                    if (v59 == null) break block148;
                    v59 = var33_30;
                }
                return v59[var33_30.length + var2_2.q()];
            }
            throw new s(var21_14, D.a(-368962050 + -((char)-6327), -368962050 + -((char)-22681), (int)var3_3) + var2_2.z() + D.a(-368962050 + -((char)-6326), -368962050 + -((char)-24108), (int)var3_3) + var5_4);
        }
        throw new s(var21_14, D.a(-368962050 + -((char)-6337), 368962050 + (char)-15693, (int)var3_3) + var5_4);
    }

    @Override
    public j K(String string, long l2) {
        long l3 = l2;
        long l4 = l3 ^ 0x2EB9A425D2CEL;
        long l5 = l3 ^ 0x3B99F0D71668L;
        int n2 = (int)(l5 >>> 32);
        int n3 = (int)(l5 << 32 >>> 40);
        int n4 = (int)(l5 << 56 >>> 56);
        long l6 = l3 ^ 0x45EFEA405AE2L;
        long l7 = l3 ^ 0x2482C4ECE4A8L;
        long l8 = l3 ^ 0x7BA98B3EBB2FL;
        long l9 = l3 ^ 0x503921C0AB9FL;
        long l10 = l3 ^ 0x3D0EED386904L;
        List list = V7.F(l4, string);
        D d2 = this;
        int n5 = 0;
        while (n5 < list.size()) {
            block13: {
                block14: {
                    A a2;
                    V7.O o2;
                    block15: {
                        o2 = (V7.O)list.get(n5);
                        if (l2 > 0L && !o2.d(l7)) {
                            d2 = d2.z(l6, o2.z());
                            if (l2 < 0L) break block13;
                            if (d2 == null) {
                                return null;
                            }
                            break block14;
                        }
                        if (l2 <= 0L) break block13;
                        if (d2.n(l10, o2.z()) == p.NBTTagList && d2.l(o2.z(), l8) == p.NBTTagCompound) {
                        }
                        break block14;
                        a2 = d2.G(l9, o2.z());
                        if (o2.q() < 0) break block15;
                        d2 = a2.h(n2, n3, (byte)n4, o2.q());
                        if (l2 > 0L) break block14;
                    }
                    d2 = a2.h(n2, n3, (byte)n4, a2.size() + o2.q());
                }
                ++n5;
            }
            if (l2 >= 0L) continue;
        }
        return d2;
    }

    @Override
    public j s(String string, long l2) {
        long l3 = l2;
        long l4 = l3 ^ 0x1631FEDCED39L;
        long l5 = l3 ^ 0x311AA2E299FL;
        int n2 = (int)(l5 >>> 32);
        int n3 = (int)(l5 << 32 >>> 40);
        int n4 = (int)(l5 << 56 >>> 56);
        long l6 = l3 ^ 0x37A316BBBA77L;
        long l7 = l3 ^ 0x1C0A9E15DB5FL;
        long l8 = l3 ^ 0x4321D1C784D8L;
        long l9 = l3 ^ 0x68B17B399468L;
        long l10 = l3 ^ 0x586B7C156F3L;
        List list = V7.F(l4, string);
        D d2 = this;
        int n5 = 0;
        while (n5 < list.size()) {
            block13: {
                block14: {
                    A a2;
                    V7.O o2;
                    block15: {
                        o2 = (V7.O)list.get(n5);
                        if (l2 >= 0L && !o2.d(l7)) {
                            d2 = d2.o(l6, o2.z());
                            if (l2 < 0L) break block13;
                            if (d2 == null) {
                                return null;
                            }
                            break block14;
                        }
                        if (l2 <= 0L) break block13;
                        if (d2.n(l10, o2.z()) == p.NBTTagList && d2.l(o2.z(), l8) == p.NBTTagCompound) {
                        }
                        break block14;
                        a2 = d2.G(l9, o2.z());
                        if (o2.q() < 0) break block15;
                        d2 = a2.h(n2, n3, (byte)n4, o2.q());
                        if (l2 > 0L) break block14;
                    }
                    d2 = a2.h(n2, n3, (byte)n4, a2.size() + o2.q());
                }
                ++n5;
            }
            if (l2 > 0L) continue;
        }
        return d2;
    }

    @Override
    public void X(String string, Enum enum_, long l2) {
        long l3 = l2;
        long l4 = l3 ^ 0x3BCC61047DD7L;
        long l5 = l3 ^ 0x1A93107E32B3L;
        if (enum_ == null) {
            this.m(string, l5);
            return;
        }
        this.I(string, enum_.name(), l4);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public Enum D(String string, long l2, Class clazz) {
        long l3 = l2 ^ 0x19F31C71A918L;
        if (string == null || clazz == null) {
            return null;
        }
        String string2 = this.G(l3, string);
        if (string2 == null) {
            return null;
        }
        try {
            return Enum.valueOf(clazz, string2);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return null;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public p n(long l2, String string) {
        long l3 = l2;
        long l4 = l3 ^ 0x3C5C3B248941L;
        long l5 = l3 ^ 0x29918060258BL;
        long l6 = l3 ^ 0x55F305B8245EL;
        int n2 = (int)(l6 >>> 32);
        long l7 = l6 << 32 >>> 32;
        long l8 = l3 ^ 0x6476B66125A1L;
        try {
            Object object;
            this.B.lock();
            if (r.M(l5) == r.MC1_7_R4) {
                Object object2;
                Object object3 = object2 = f.Y(this, l8, me.serbob.donuttp.d.COMPOUND_GET, string);
                if (l2 > 0L) {
                    if (object3 == null) {
                        p p2 = null;
                        return p2;
                    }
                    object3 = me.serbob.donuttp.d.COMPOUND_OWN_TYPE.R(l4, object2, new Object[0]);
                }
                p p3 = p.y(((Byte)object3).byteValue(), n2, l7);
                return p3;
            }
            Object object4 = object = f.Y(this, l8, me.serbob.donuttp.d.COMPOUND_GET_TYPE, string);
            if (l2 >= 0L) {
                if (object4 == null) {
                    p p4 = null;
                    return p4;
                }
                object4 = object;
            }
            p p5 = p.y(((Byte)object4).byteValue(), n2, l7);
            return p5;
        }
        finally {
            this.B.unlock();
        }
    }

    @Override
    public void Y(OutputStream outputStream, long l2) {
        long l3 = l2 ^ 0x512D9A667121L;
        try {
            this.R.lock();
            f.k(this, outputStream, l3);
        }
        finally {
            this.R.unlock();
        }
    }

    @Override
    public Object J(long l2, String string, u u2) {
        long l3 = l2 ^ 0x60EF5416A367L;
        return u2.c(l3, this, string);
    }

    @Override
    public void F(String string, Object object, long l2, u u2) {
        long l3 = l2 ^ 0x2345B115EF9FL;
        u2.n(l3, this, string, object);
    }

    @Override
    public String toString() {
        long l2 = 49633755165777L;
        long l3 = l2 ^ 0x2060EF70EE79L;
        return this.k(l3);
    }

    @Deprecated
    public String z(long l2, String string) {
        long l3 = l2 ^ 0x74C202C418E6L;
        return this.k(l3);
    }

    @Override
    public void O(long l2) {
        long l3 = l2;
        long l4 = l3 ^ 0x10AD96E4E780L;
        long l5 = l3 ^ 0x60AFB5E8E9AAL;
        for (String string : this.o(l4)) {
            this.m(string, l5);
            if (l2 >= 0L) continue;
        }
    }

    @Deprecated
    public String k(long l2) {
        long l3 = l2;
        long l4 = l3 ^ 0x7C80706A49E3L;
        long l5 = l3 ^ 0x69C0B133BBE8L;
        long l6 = l3 ^ 0x59C95CC3DE45L;
        long l7 = l3 ^ 0x5EE92625CD10L;
        try {
            Object object;
            block10: {
                Object object2;
                block9: {
                    this.B.lock();
                    object2 = this.g(l4);
                    if (object2 == null) {
                        String string = D.a(-1389866280 - -31999, 1389866280 - 22378, (int)l2);
                        return string;
                    }
                    long l8 = l7;
                    if (l2 > 0L) {
                        if (!r.X(l8)) break block9;
                        l8 = l6;
                    }
                    object = r.M(l8);
                    if (l2 < 0L) break block10;
                    if (object != r.MC1_7_R4) break block9;
                    String string = K.J(l5, object2);
                    return string;
                }
                object = object2;
            }
            String string = object.toString();
            return string;
        }
        finally {
            this.B.unlock();
        }
    }

    public int hashCode() {
        return this.toString().hashCode();
    }

    public boolean equals(Object object) {
        long l2;
        long l3 = l2 = 127620914326548L;
        long l4 = l3 ^ 0x6DB739AEABDL;
        long l5 = l3 ^ 0x3B44A87A726BL;
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (object instanceof D) {
            D d2 = (D)object;
            if (this.o(l4).equals(d2.o(l4))) {
                for (String string : this.o(l4)) {
                    if (D.S(l5, this, d2, string)) continue;
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static boolean S(long l2, D d2, D d3, String string) {
        long l3 = l2;
        long l4 = l3 ^ 0x56D401E7F90DL;
        long l5 = l3 ^ 0x4AABD1CA8C7FL;
        long l6 = l3 ^ 0x55F2C7CE8FFDL;
        long l7 = l3 ^ 0x43BFD2C9981L;
        long l8 = l7 >>> 16;
        int n2 = (int)(l7 << 48 >>> 48);
        long l9 = l3 ^ 0x79232C5E5F2DL;
        int n3 = (int)(l9 >>> 32);
        int n4 = (int)(l9 << 32 >>> 48);
        int n5 = (int)(l9 << 48 >>> 48);
        long l10 = l3 ^ 0x324AD6B2BF99L;
        long l11 = l3 ^ 0x4FF1FA8B7838L;
        long l12 = l11 >>> 32;
        int n6 = (int)(l11 << 32 >>> 32);
        long l13 = l3 ^ 0x4322B0B26497L;
        int n7 = (int)(l13 >>> 48);
        int n8 = (int)(l13 << 16 >>> 32);
        int n9 = (int)(l13 << 48 >>> 48);
        long l14 = l3 ^ 0xC09ACA242FFL;
        long l15 = l3 ^ 0x5A32CB1FA75CL;
        int n10 = (int)(l15 >>> 48);
        int n11 = (int)(l15 << 16 >>> 32);
        int n12 = (int)(l15 << 48 >>> 48);
        long l16 = l3 ^ 0x3F83B5F67511L;
        int n13 = (int)(l16 >>> 32);
        int n14 = (int)(l16 << 32 >>> 48);
        int n15 = (int)(l16 << 48 >>> 48);
        long l17 = l3 ^ 0x7BAD69CCBF57L;
        long l18 = l3 ^ 0x7113A054370L;
        long l19 = l18 >>> 32;
        int n16 = (int)(l18 << 32 >>> 32);
        if (d2.n(l10, string) != d3.n(l10, string)) {
            return false;
        }
        boolean bl = J.x[d2.n(l10, string).ordinal()];
        if (l2 <= 0L) return bl;
        switch (bl) {
            case 1: {
                return d2.h(string, l8, (short)n2).equals(d3.h(string, l8, (short)n2));
            }
            case 2: {
                return Arrays.equals(d2.q(n3, n4, n5, string), d3.q(n3, n4, n5, string));
            }
            case 3: {
                D d4;
                D d5 = d4 = d2.z(l5, string);
                if (l2 > 0L) {
                    if (d5 == null) return false;
                    d5 = d4;
                }
                if (!d5.equals(d3.z(l5, string))) return false;
                return true;
            }
            case 4: {
                return d2.p((short)n10, string, n11, n12).equals(d3.p((short)n10, string, n11, n12));
            }
            case 5: {
                return true;
            }
            case 6: {
                return d2.o((char)n7, n8, string, n9).equals(d3.o((char)n7, n8, string, n9));
            }
            case 7: {
                return d2.t(string, l4).equals(d3.t(string, l4));
            }
            case 8: {
                return Arrays.equals(d2.d(n13, (short)n14, string, (char)n15), d3.d(n13, (short)n14, string, (char)n15));
            }
            case 9: {
                return f.m(d2, string, l6).toString().equals(f.m(d3, string, l6).toString());
            }
            case 10: {
                return d2.c(string, l14).equals(d3.c(string, l14));
            }
            case 11: {
                return d2.c(string, l12, n6).equals(d3.c(string, l12, n6));
            }
            case 12: {
                return d2.G(l17, string).equals(d3.G(l17, string));
            }
            case 13: {
                return Arrays.equals(d2.P(l19, n16, string), d3.P(l19, n16, string));
            }
        }
        return false;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block20: {
            block19: {
                var5 = new String[15];
                var3_1 = 0;
                var2_2 = "\u00d2\u00f4\u009a\u000e\u00b9\u00c8\u00bc\u00c8\u001d]T\u00eb\u0010Tp\u00a6\u00f2\u0018\u00c6\u0089&\u001e\u00ea\u00ef\u00f6\u00b6\u00b6\u00ee\u001a\u0088\u00fc\u00c7\u0014\u008b\u00de\u0082b\u009eO\u0084\u0012cC\u00cb\u00e5\u001fAI}\nf\u00d3\u00c1\t\u00c8\u00c5<n\u00feG\u00ee\u0099\u009d+$\u00cdIeQZ>\u00c8W#\u0014\u00f0\u000b\u0005i\u00da\u008en\u0089\u009c\u00023\u0007\u00ab<\rq\u00b5\u00ad1\u00973?f\u00bf\u0016\u00a8\u00ab\u00c6\u0083\u00c0|\u009a \u00f6\u0003\u001e\u00f0)\u0017\u00ae3_\"\u001c\u0004\u0019\u00a9Q\u0019\u00d6\u00efBw\u00b6\u00c1\u00f8\u0014\u00b4\u00c9\u00fe\u0001\u0013u\u00ddx\t\u009b\u00a5Vb\u00b3\u00c6G\u00a9\u00a8(b\u001c\u0081_H\u001d\u001d 3>\u0098S\u009aq[T\u00c8\u00bfA\u00a6\u001b~4CE\u000e\u00fd?\u009c\u0093#\u00e5[*\u00de\u00a0\u0094\u00bcQ\u00f07#\u0082\u00b8a:\u00b0\u00ba\u00a6\u00e6\u00b8D\u000f\u00dc\u00c5\u009cL\u00d7\u00c7\u008a\u00ccq\u009d\u0011\u009f\u0097\u00e9n\\o\u00d4\u0084Kz1\u00db\u00a2\u0007\u00da\u001e\u00b9Y\u00aaF9\u00e4\u0089\u00cd\u00aa\u009dR\u0016f\u00e5\u009d\u00c8\u001c\u0004\u0081P\u001d\u008d\u009d\u0097\u00a6^\u00c0\u009c<\u00act\u00b7\u0002vM\u0080\u00d8\u00cd\u008a\u008d\u008c\u0080\u00aa\u00eb5#\u00bd\u00fc\\=A\u00db\u00825\u00b8\u0098\u00fd]\u00f4MV\u0084\u00f3K\u0092fK\u00d56\"4k\u00b3\u008f\u009eGk\u00bde\u00bb\u00cd&&\u00ac<\u00b2n#=jI#|\u0002\u00f0\u00bbu\u00e8OJ\u00cdVI\u00ce\u00c5\u0011\u00c7i\u0090\u0019\u0098\u00f3?\u00f5\u00e2\u00fd\u00b62\u007f\u00e1\u0002\u00d4\n \u001b\u00d7\u0088X\u00dbw\u00d1\u00a0\u00d2*\u00b0\u000b]\u0087c\u00ddU`F\u0003\u00d1ye\u00b7^\u00d9\u00f4\u00c97\u0090Z\u00a7";
                var4_3 = "\u00d2\u00f4\u009a\u000e\u00b9\u00c8\u00bc\u00c8\u001d]T\u00eb\u0010Tp\u00a6\u00f2\u0018\u00c6\u0089&\u001e\u00ea\u00ef\u00f6\u00b6\u00b6\u00ee\u001a\u0088\u00fc\u00c7\u0014\u008b\u00de\u0082b\u009eO\u0084\u0012cC\u00cb\u00e5\u001fAI}\nf\u00d3\u00c1\t\u00c8\u00c5<n\u00feG\u00ee\u0099\u009d+$\u00cdIeQZ>\u00c8W#\u0014\u00f0\u000b\u0005i\u00da\u008en\u0089\u009c\u00023\u0007\u00ab<\rq\u00b5\u00ad1\u00973?f\u00bf\u0016\u00a8\u00ab\u00c6\u0083\u00c0|\u009a \u00f6\u0003\u001e\u00f0)\u0017\u00ae3_\"\u001c\u0004\u0019\u00a9Q\u0019\u00d6\u00efBw\u00b6\u00c1\u00f8\u0014\u00b4\u00c9\u00fe\u0001\u0013u\u00ddx\t\u009b\u00a5Vb\u00b3\u00c6G\u00a9\u00a8(b\u001c\u0081_H\u001d\u001d 3>\u0098S\u009aq[T\u00c8\u00bfA\u00a6\u001b~4CE\u000e\u00fd?\u009c\u0093#\u00e5[*\u00de\u00a0\u0094\u00bcQ\u00f07#\u0082\u00b8a:\u00b0\u00ba\u00a6\u00e6\u00b8D\u000f\u00dc\u00c5\u009cL\u00d7\u00c7\u008a\u00ccq\u009d\u0011\u009f\u0097\u00e9n\\o\u00d4\u0084Kz1\u00db\u00a2\u0007\u00da\u001e\u00b9Y\u00aaF9\u00e4\u0089\u00cd\u00aa\u009dR\u0016f\u00e5\u009d\u00c8\u001c\u0004\u0081P\u001d\u008d\u009d\u0097\u00a6^\u00c0\u009c<\u00act\u00b7\u0002vM\u0080\u00d8\u00cd\u008a\u008d\u008c\u0080\u00aa\u00eb5#\u00bd\u00fc\\=A\u00db\u00825\u00b8\u0098\u00fd]\u00f4MV\u0084\u00f3K\u0092fK\u00d56\"4k\u00b3\u008f\u009eGk\u00bde\u00bb\u00cd&&\u00ac<\u00b2n#=jI#|\u0002\u00f0\u00bbu\u00e8OJ\u00cdVI\u00ce\u00c5\u0011\u00c7i\u0090\u0019\u0098\u00f3?\u00f5\u00e2\u00fd\u00b62\u007f\u00e1\u0002\u00d4\n \u001b\u00d7\u0088X\u00dbw\u00d1\u00a0\u00d2*\u00b0\u000b]\u0087c\u00ddU`F\u0003\u00d1ye\u00b7^\u00d9\u00f4\u00c97\u0090Z\u00a7".length();
                var1_4 = 32;
                var0_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = ++var0_5;
                    v1 = var2_2.substring(v0, v0 + var1_4);
                    v2 = -1;
                    break block19;
                    break;
                }
lbl12:
                // 1 sources

                while (true) {
                    var5[var3_1++] = v3.intern();
                    if ((var0_5 += var1_4) < var4_3) {
                        var1_4 = var2_2.charAt(var0_5);
                        ** continue;
                    }
                    var2_2 = "M]y\u0086\u00a8\u00ee3\u00c8\u00ca\r\u000e\u0085\u00feC\u00fd\u00e4?\u0091\u00a9C\u00e8\u00f9)\u00e2\u0014gy\u008c%H}\u00f0\u001a\u0098\u00dfi\u0004x=\u009eA\u00fbz\u00ae\u001b\u0092\u00d1eA\u0004\u0083\u0000R\u00a0\u00d5G\u00fa\u0005\n\u001f\u0097\fx\u00b0~V";
                    var4_3 = "M]y\u0086\u00a8\u00ee3\u00c8\u00ca\r\u000e\u0085\u00feC\u00fd\u00e4?\u0091\u00a9C\u00e8\u00f9)\u00e2\u0014gy\u008c%H}\u00f0\u001a\u0098\u00dfi\u0004x=\u009eA\u00fbz\u00ae\u001b\u0092\u00d1eA\u0004\u0083\u0000R\u00a0\u00d5G\u00fa\u0005\n\u001f\u0097\fx\u00b0~V".length();
                    var1_4 = 28;
                    var0_5 = -1;
lbl21:
                    // 2 sources

                    while (true) {
                        v4 = ++var0_5;
                        v1 = var2_2.substring(v4, v4 + var1_4);
                        v2 = 0;
                        break block19;
                        break;
                    }
                    break;
                }
lbl26:
                // 1 sources

                while (true) {
                    var5[var3_1++] = v3.intern();
                    if ((var0_5 += var1_4) < var4_3) {
                        var1_4 = var2_2.charAt(var0_5);
                        ** continue;
                    }
                    break block20;
                    break;
                }
            }
            v5 = v1.toCharArray();
            var6_6 = 0;
            v6 = v5.length;
            v7 = v5;
            v8 = v6;
            if (v6 > 1) ** GOTO lbl76
            do {
                v9 = v7;
                v10 = v7;
                v11 = var6_6;
                while (true) {
                    v12 = v9[v11];
                    switch (var6_6 % 7) {
                        case 0: {
                            v13 = 65;
                            break;
                        }
                        case 1: {
                            v13 = 80;
                            break;
                        }
                        case 2: {
                            v13 = 79;
                            break;
                        }
                        case 3: {
                            v13 = 126;
                            break;
                        }
                        case 4: {
                            v13 = 78;
                            break;
                        }
                        case 5: {
                            v13 = 24;
                            break;
                        }
                        default: {
                            v13 = 114;
                        }
                    }
                    v9[v11] = (char)(v12 ^ v13);
                    ++var6_6;
                    v7 = v10;
                    v8 = v8;
                    if (v8 != 0) break;
                    v10 = v7;
                    v14 = v8;
                    v11 = v8;
                    v9 = v7;
                }
lbl76:
                // 2 sources

                v15 = v7;
                v14 = v8;
            } while (v8 > var6_6);
            v3 = new String(v15);
            switch (v2) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl85:
                // 1 sources

                ** continue;
            }
        }
        D.a = var5;
        D.b = new String[15];
    }

    private static String a(int n2, int n3, int n4) {
        int n5 = (n2 ^ n4 ^ 0x55F4) & 0xFFFF;
        if (b[n5] == null) {
            int n6;
            int n7;
            char[] cArray = a[n5].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n7 = 136;
                    break;
                }
                case 1: {
                    n7 = 238;
                    break;
                }
                case 2: {
                    n7 = 151;
                    break;
                }
                case 3: {
                    n7 = 26;
                    break;
                }
                case 4: {
                    n7 = 57;
                    break;
                }
                case 5: {
                    n7 = 234;
                    break;
                }
                case 6: {
                    n7 = 137;
                    break;
                }
                case 7: {
                    n7 = 177;
                    break;
                }
                case 8: {
                    n7 = 222;
                    break;
                }
                case 9: {
                    n7 = 148;
                    break;
                }
                case 10: {
                    n7 = 84;
                    break;
                }
                case 11: {
                    n7 = 0;
                    break;
                }
                case 12: {
                    n7 = 224;
                    break;
                }
                case 13: {
                    n7 = 192;
                    break;
                }
                case 14: {
                    n7 = 193;
                    break;
                }
                case 15: {
                    n7 = 133;
                    break;
                }
                case 16: {
                    n7 = 39;
                    break;
                }
                case 17: {
                    n7 = 237;
                    break;
                }
                case 18: {
                    n7 = 110;
                    break;
                }
                case 19: {
                    n7 = 98;
                    break;
                }
                case 20: {
                    n7 = 251;
                    break;
                }
                case 21: {
                    n7 = 109;
                    break;
                }
                case 22: {
                    n7 = 121;
                    break;
                }
                case 23: {
                    n7 = 146;
                    break;
                }
                case 24: {
                    n7 = 11;
                    break;
                }
                case 25: {
                    n7 = 195;
                    break;
                }
                case 26: {
                    n7 = 145;
                    break;
                }
                case 27: {
                    n7 = 175;
                    break;
                }
                case 28: {
                    n7 = 174;
                    break;
                }
                case 29: {
                    n7 = 219;
                    break;
                }
                case 30: {
                    n7 = 215;
                    break;
                }
                case 31: {
                    n7 = 249;
                    break;
                }
                case 32: {
                    n7 = 25;
                    break;
                }
                case 33: {
                    n7 = 124;
                    break;
                }
                case 34: {
                    n7 = 235;
                    break;
                }
                case 35: {
                    n7 = 156;
                    break;
                }
                case 36: {
                    n7 = 185;
                    break;
                }
                case 37: {
                    n7 = 96;
                    break;
                }
                case 38: {
                    n7 = 13;
                    break;
                }
                case 39: {
                    n7 = 236;
                    break;
                }
                case 40: {
                    n7 = 119;
                    break;
                }
                case 41: {
                    n7 = 246;
                    break;
                }
                case 42: {
                    n7 = 243;
                    break;
                }
                case 43: {
                    n7 = 86;
                    break;
                }
                case 44: {
                    n7 = 113;
                    break;
                }
                case 45: {
                    n7 = 227;
                    break;
                }
                case 46: {
                    n7 = 158;
                    break;
                }
                case 47: {
                    n7 = 169;
                    break;
                }
                case 48: {
                    n7 = 140;
                    break;
                }
                case 49: {
                    n7 = 32;
                    break;
                }
                case 50: {
                    n7 = 61;
                    break;
                }
                case 51: {
                    n7 = 45;
                    break;
                }
                case 52: {
                    n7 = 24;
                    break;
                }
                case 53: {
                    n7 = 62;
                    break;
                }
                case 54: {
                    n7 = 205;
                    break;
                }
                case 55: {
                    n7 = 239;
                    break;
                }
                case 56: {
                    n7 = 108;
                    break;
                }
                case 57: {
                    n7 = 40;
                    break;
                }
                case 58: {
                    n7 = 114;
                    break;
                }
                case 59: {
                    n7 = 48;
                    break;
                }
                case 60: {
                    n7 = 203;
                    break;
                }
                case 61: {
                    n7 = 172;
                    break;
                }
                case 62: {
                    n7 = 97;
                    break;
                }
                case 63: {
                    n7 = 88;
                    break;
                }
                case 64: {
                    n7 = 15;
                    break;
                }
                case 65: {
                    n7 = 211;
                    break;
                }
                case 66: {
                    n7 = 173;
                    break;
                }
                case 67: {
                    n7 = 17;
                    break;
                }
                case 68: {
                    n7 = 184;
                    break;
                }
                case 69: {
                    n7 = 2;
                    break;
                }
                case 70: {
                    n7 = 12;
                    break;
                }
                case 71: {
                    n7 = 79;
                    break;
                }
                case 72: {
                    n7 = 35;
                    break;
                }
                case 73: {
                    n7 = 74;
                    break;
                }
                case 74: {
                    n7 = 225;
                    break;
                }
                case 75: {
                    n7 = 248;
                    break;
                }
                case 76: {
                    n7 = 85;
                    break;
                }
                case 77: {
                    n7 = 194;
                    break;
                }
                case 78: {
                    n7 = 187;
                    break;
                }
                case 79: {
                    n7 = 186;
                    break;
                }
                case 80: {
                    n7 = 141;
                    break;
                }
                case 81: {
                    n7 = 250;
                    break;
                }
                case 82: {
                    n7 = 196;
                    break;
                }
                case 83: {
                    n7 = 37;
                    break;
                }
                case 84: {
                    n7 = 138;
                    break;
                }
                case 85: {
                    n7 = 170;
                    break;
                }
                case 86: {
                    n7 = 52;
                    break;
                }
                case 87: {
                    n7 = 144;
                    break;
                }
                case 88: {
                    n7 = 64;
                    break;
                }
                case 89: {
                    n7 = 176;
                    break;
                }
                case 90: {
                    n7 = 68;
                    break;
                }
                case 91: {
                    n7 = 28;
                    break;
                }
                case 92: {
                    n7 = 126;
                    break;
                }
                case 93: {
                    n7 = 232;
                    break;
                }
                case 94: {
                    n7 = 46;
                    break;
                }
                case 95: {
                    n7 = 207;
                    break;
                }
                case 96: {
                    n7 = 115;
                    break;
                }
                case 97: {
                    n7 = 150;
                    break;
                }
                case 98: {
                    n7 = 19;
                    break;
                }
                case 99: {
                    n7 = 95;
                    break;
                }
                case 100: {
                    n7 = 72;
                    break;
                }
                case 101: {
                    n7 = 233;
                    break;
                }
                case 102: {
                    n7 = 78;
                    break;
                }
                case 103: {
                    n7 = 123;
                    break;
                }
                case 104: {
                    n7 = 105;
                    break;
                }
                case 105: {
                    n7 = 103;
                    break;
                }
                case 106: {
                    n7 = 178;
                    break;
                }
                case 107: {
                    n7 = 54;
                    break;
                }
                case 108: {
                    n7 = 201;
                    break;
                }
                case 109: {
                    n7 = 20;
                    break;
                }
                case 110: {
                    n7 = 1;
                    break;
                }
                case 111: {
                    n7 = 132;
                    break;
                }
                case 112: {
                    n7 = 87;
                    break;
                }
                case 113: {
                    n7 = 66;
                    break;
                }
                case 114: {
                    n7 = 221;
                    break;
                }
                case 115: {
                    n7 = 33;
                    break;
                }
                case 116: {
                    n7 = 252;
                    break;
                }
                case 117: {
                    n7 = 63;
                    break;
                }
                case 118: {
                    n7 = 51;
                    break;
                }
                case 119: {
                    n7 = 23;
                    break;
                }
                case 120: {
                    n7 = 214;
                    break;
                }
                case 121: {
                    n7 = 56;
                    break;
                }
                case 122: {
                    n7 = 167;
                    break;
                }
                case 123: {
                    n7 = 76;
                    break;
                }
                case 124: {
                    n7 = 199;
                    break;
                }
                case 125: {
                    n7 = 220;
                    break;
                }
                case 126: {
                    n7 = 3;
                    break;
                }
                case 127: {
                    n7 = 65;
                    break;
                }
                case 128: {
                    n7 = 34;
                    break;
                }
                case 129: {
                    n7 = 130;
                    break;
                }
                case 130: {
                    n7 = 94;
                    break;
                }
                case 131: {
                    n7 = 181;
                    break;
                }
                case 132: {
                    n7 = 191;
                    break;
                }
                case 133: {
                    n7 = 231;
                    break;
                }
                case 134: {
                    n7 = 223;
                    break;
                }
                case 135: {
                    n7 = 198;
                    break;
                }
                case 136: {
                    n7 = 112;
                    break;
                }
                case 137: {
                    n7 = 183;
                    break;
                }
                case 138: {
                    n7 = 80;
                    break;
                }
                case 139: {
                    n7 = 164;
                    break;
                }
                case 140: {
                    n7 = 143;
                    break;
                }
                case 141: {
                    n7 = 16;
                    break;
                }
                case 142: {
                    n7 = 116;
                    break;
                }
                case 143: {
                    n7 = 188;
                    break;
                }
                case 144: {
                    n7 = 208;
                    break;
                }
                case 145: {
                    n7 = 212;
                    break;
                }
                case 146: {
                    n7 = 42;
                    break;
                }
                case 147: {
                    n7 = 139;
                    break;
                }
                case 148: {
                    n7 = 149;
                    break;
                }
                case 149: {
                    n7 = 168;
                    break;
                }
                case 150: {
                    n7 = 58;
                    break;
                }
                case 151: {
                    n7 = 50;
                    break;
                }
                case 152: {
                    n7 = 106;
                    break;
                }
                case 153: {
                    n7 = 218;
                    break;
                }
                case 154: {
                    n7 = 171;
                    break;
                }
                case 155: {
                    n7 = 253;
                    break;
                }
                case 156: {
                    n7 = 8;
                    break;
                }
                case 157: {
                    n7 = 14;
                    break;
                }
                case 158: {
                    n7 = 229;
                    break;
                }
                case 159: {
                    n7 = 230;
                    break;
                }
                case 160: {
                    n7 = 43;
                    break;
                }
                case 161: {
                    n7 = 73;
                    break;
                }
                case 162: {
                    n7 = 200;
                    break;
                }
                case 163: {
                    n7 = 83;
                    break;
                }
                case 164: {
                    n7 = 5;
                    break;
                }
                case 165: {
                    n7 = 255;
                    break;
                }
                case 166: {
                    n7 = 204;
                    break;
                }
                case 167: {
                    n7 = 160;
                    break;
                }
                case 168: {
                    n7 = 147;
                    break;
                }
                case 169: {
                    n7 = 111;
                    break;
                }
                case 170: {
                    n7 = 6;
                    break;
                }
                case 171: {
                    n7 = 197;
                    break;
                }
                case 172: {
                    n7 = 31;
                    break;
                }
                case 173: {
                    n7 = 29;
                    break;
                }
                case 174: {
                    n7 = 30;
                    break;
                }
                case 175: {
                    n7 = 41;
                    break;
                }
                case 176: {
                    n7 = 102;
                    break;
                }
                case 177: {
                    n7 = 81;
                    break;
                }
                case 178: {
                    n7 = 180;
                    break;
                }
                case 179: {
                    n7 = 134;
                    break;
                }
                case 180: {
                    n7 = 166;
                    break;
                }
                case 181: {
                    n7 = 47;
                    break;
                }
                case 182: {
                    n7 = 18;
                    break;
                }
                case 183: {
                    n7 = 217;
                    break;
                }
                case 184: {
                    n7 = 82;
                    break;
                }
                case 185: {
                    n7 = 206;
                    break;
                }
                case 186: {
                    n7 = 36;
                    break;
                }
                case 187: {
                    n7 = 165;
                    break;
                }
                case 188: {
                    n7 = 161;
                    break;
                }
                case 189: {
                    n7 = 247;
                    break;
                }
                case 190: {
                    n7 = 53;
                    break;
                }
                case 191: {
                    n7 = 118;
                    break;
                }
                case 192: {
                    n7 = 27;
                    break;
                }
                case 193: {
                    n7 = 190;
                    break;
                }
                case 194: {
                    n7 = 244;
                    break;
                }
                case 195: {
                    n7 = 254;
                    break;
                }
                case 196: {
                    n7 = 209;
                    break;
                }
                case 197: {
                    n7 = 104;
                    break;
                }
                case 198: {
                    n7 = 77;
                    break;
                }
                case 199: {
                    n7 = 213;
                    break;
                }
                case 200: {
                    n7 = 90;
                    break;
                }
                case 201: {
                    n7 = 55;
                    break;
                }
                case 202: {
                    n7 = 101;
                    break;
                }
                case 203: {
                    n7 = 245;
                    break;
                }
                case 204: {
                    n7 = 159;
                    break;
                }
                case 205: {
                    n7 = 228;
                    break;
                }
                case 206: {
                    n7 = 202;
                    break;
                }
                case 207: {
                    n7 = 189;
                    break;
                }
                case 208: {
                    n7 = 107;
                    break;
                }
                case 209: {
                    n7 = 89;
                    break;
                }
                case 210: {
                    n7 = 22;
                    break;
                }
                case 211: {
                    n7 = 135;
                    break;
                }
                case 212: {
                    n7 = 67;
                    break;
                }
                case 213: {
                    n7 = 92;
                    break;
                }
                case 214: {
                    n7 = 99;
                    break;
                }
                case 215: {
                    n7 = 142;
                    break;
                }
                case 216: {
                    n7 = 21;
                    break;
                }
                case 217: {
                    n7 = 125;
                    break;
                }
                case 218: {
                    n7 = 117;
                    break;
                }
                case 219: {
                    n7 = 100;
                    break;
                }
                case 220: {
                    n7 = 69;
                    break;
                }
                case 221: {
                    n7 = 153;
                    break;
                }
                case 222: {
                    n7 = 128;
                    break;
                }
                case 223: {
                    n7 = 216;
                    break;
                }
                case 224: {
                    n7 = 44;
                    break;
                }
                case 225: {
                    n7 = 179;
                    break;
                }
                case 226: {
                    n7 = 242;
                    break;
                }
                case 227: {
                    n7 = 241;
                    break;
                }
                case 228: {
                    n7 = 59;
                    break;
                }
                case 229: {
                    n7 = 122;
                    break;
                }
                case 230: {
                    n7 = 131;
                    break;
                }
                case 231: {
                    n7 = 9;
                    break;
                }
                case 232: {
                    n7 = 157;
                    break;
                }
                case 233: {
                    n7 = 154;
                    break;
                }
                case 234: {
                    n7 = 10;
                    break;
                }
                case 235: {
                    n7 = 162;
                    break;
                }
                case 236: {
                    n7 = 93;
                    break;
                }
                case 237: {
                    n7 = 75;
                    break;
                }
                case 238: {
                    n7 = 4;
                    break;
                }
                case 239: {
                    n7 = 163;
                    break;
                }
                case 240: {
                    n7 = 152;
                    break;
                }
                case 241: {
                    n7 = 70;
                    break;
                }
                case 242: {
                    n7 = 240;
                    break;
                }
                case 243: {
                    n7 = 120;
                    break;
                }
                case 244: {
                    n7 = 38;
                    break;
                }
                case 245: {
                    n7 = 71;
                    break;
                }
                case 246: {
                    n7 = 210;
                    break;
                }
                case 247: {
                    n7 = 155;
                    break;
                }
                case 248: {
                    n7 = 182;
                    break;
                }
                case 249: {
                    n7 = 127;
                    break;
                }
                case 250: {
                    n7 = 226;
                    break;
                }
                case 251: {
                    n7 = 91;
                    break;
                }
                case 252: {
                    n7 = 49;
                    break;
                }
                case 253: {
                    n7 = 7;
                    break;
                }
                case 254: {
                    n7 = 60;
                    break;
                }
                default: {
                    n7 = 129;
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
            D.b[n5] = new String(cArray).intern();
        }
        return b[n5];
    }
}

