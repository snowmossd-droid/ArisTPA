/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  org.bukkit.Material
 *  org.bukkit.inventory.ItemStack
 *  org.bukkit.inventory.meta.ItemMeta
 */
package me.serbob.donuttp;

import java.util.Set;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;
import me.serbob.donuttp.A;
import me.serbob.donuttp.C;
import me.serbob.donuttp.D;
import me.serbob.donuttp.E;
import me.serbob.donuttp.U;
import me.serbob.donuttp.c;
import me.serbob.donuttp.d;
import me.serbob.donuttp.f;
import me.serbob.donuttp.i;
import me.serbob.donuttp.j;
import me.serbob.donuttp.r;
import me.serbob.donuttp.s;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class F
extends D
implements E {
    private ItemStack r;
    private final boolean h;
    private final boolean V;
    private ItemStack Z;
    private Object z;
    private boolean m;
    private static final String[] c;
    private static final String[] e;

    @Deprecated
    public F(long l2, ItemStack itemStack) {
        long l3 = l2 ^ 0x78DDF174A316L;
        this(l3, itemStack, false);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected F(ItemStack itemStack, int n2, char c2, boolean bl, boolean bl2, short s2, boolean bl3) {
        long l2 = (long)n2 << 32 | (long)c2 << 48 >>> 32 | (long)s2 << 48 >>> 48;
        super(null, null, bl2);
        this.Z = null;
        this.z = null;
        this.m = false;
        if (itemStack == null) throw new NullPointerException(F.b(-856673520 - -((char)-29636), -856673520 - -((char)-23329), (int)l2));
        ItemStack itemStack2 = itemStack;
        if (s2 < 0) {
            if (itemStack2.getType() == Material.AIR) throw new NullPointerException(F.b(-856673520 - -((char)-29636), -856673520 - -((char)-23329), (int)l2));
            itemStack2 = itemStack;
        }
        int n3 = itemStack2.getAmount();
        if (c2 > '\u0000') {
            if (n3 <= 0) {
                throw new NullPointerException(F.b(-856673520 - -((char)-29636), -856673520 - -((char)-23329), (int)l2));
            }
            this.V = bl3;
            n3 = bl3 ? 1 : 0;
        }
        if (c2 >= '\u0000') {
            if (n3 != 0) {
                this.r = itemStack;
                this.Z = itemStack;
                this.h = false;
                return;
            }
            n3 = bl2 ? 1 : 0;
        }
        if (c2 >= '\u0000') {
            if (n3 != 0) {
                this.r = itemStack;
                this.h = false;
                return;
            }
            this.h = bl;
            this.r = itemStack.clone();
            if (c2 < '\u0000') return;
            n3 = bl ? 1 : 0;
        }
        if (n3 == 0) return;
        this.Z = itemStack;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Deprecated
    public F(long l2, ItemStack itemStack, boolean bl) {
        super(null, null);
        this.Z = null;
        this.z = null;
        this.m = false;
        ItemStack itemStack2 = itemStack;
        if (l2 >= 0L) {
            if (itemStack2 == null) throw new NullPointerException(F.b(1376103930 + (char)-24219, -1376103930 + -31887, (int)l2));
            itemStack2 = itemStack;
        }
        if (l2 > 0L) {
            if (itemStack2.getType() == Material.AIR) throw new NullPointerException(F.b(1376103930 + (char)-24219, -1376103930 + -31887, (int)l2));
            itemStack2 = itemStack;
        }
        int n2 = itemStack2.getAmount();
        if (l2 > 0L) {
            if (n2 <= 0) {
                throw new NullPointerException(F.b(1376103930 + (char)-24219, -1376103930 + -31887, (int)l2));
            }
            this.V = false;
            this.h = bl;
            this.r = itemStack.clone();
            if (l2 < 0L) return;
            n2 = bl ? 1 : 0;
        }
        if (n2 == 0) return;
        this.Z = itemStack;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public Object h(long l2) {
        Object object;
        block23: {
            boolean bl;
            int n2;
            int n3;
            int n4;
            long l3;
            long l4;
            block19: {
                block20: {
                    Object object2;
                    int n5;
                    int n6;
                    int n7;
                    block21: {
                        block22: {
                            long l5 = l2;
                            l4 = l5 ^ 0x11BA28D3AA64L;
                            long l6 = l5 ^ 0x24F3B2B720BBL;
                            n7 = (int)(l6 >>> 48);
                            n6 = (int)(l6 << 16 >>> 32);
                            n5 = (int)(l6 << 48 >>> 48);
                            l3 = l5 ^ 0x59C7A1FD28E7L;
                            long l7 = l5 ^ 0xC3AD5B4A8F8L;
                            long l8 = l5 ^ 0x6811769013DFL;
                            n4 = (int)(l8 >>> 32);
                            n3 = (int)(l8 << 32 >>> 48);
                            n2 = (int)(l8 << 48 >>> 48);
                            if (this.m) {
                                throw new s(l7, F.b(1652268420 + (char)-31116, -1652268420 + -((char)-29001), (int)l2));
                            }
                            bl = this.L();
                            if (l2 < 0L) break block19;
                            if (!bl) break block20;
                            object2 = this.z;
                            if (l2 < 0L) break block21;
                            if (object2 != null) break block22;
                            bl = me.serbob.donuttp.c.CRAFT_ITEMSTACK.E().isAssignableFrom(this.r.getClass());
                            if (l2 < 0L) break block19;
                            if (!bl) break block20;
                        }
                        object2 = this.z;
                    }
                    if (l2 >= 0L) {
                        if (object2 == null) {
                            this.z = f.L(f.Z(this.r, (short)n7, n6, (char)n5), n4, (char)n3, n2);
                        }
                        object2 = this.z;
                    }
                    return object2;
                }
                object = this;
                if (l2 < 0L) break block23;
                bl = ((F)object).V;
            }
            if (bl) {
                Object object3 = this.z;
                if (l2 >= 0L) {
                    if (object3 == null) {
                        this.U(l3);
                    }
                    object3 = this.z;
                }
                return object3;
            }
            object = f.L(d.ITEMSTACK_NMSCOPY.R(l4, null, this.r), n4, (char)n3, n2);
        }
        return object;
    }

    private void U(long l2) {
        long l3 = l2;
        long l4 = l3 ^ 0x487D892E8283L;
        long l5 = l3 ^ 0x31D6D76D3B38L;
        int n2 = (int)(l5 >>> 32);
        int n3 = (int)(l5 << 32 >>> 48);
        int n4 = (int)(l5 << 48 >>> 48);
        if (this.V) {
            this.z = f.L(d.ITEMSTACK_NMSCOPY.R(l4, null, this.r), n2, (char)n3, n4);
        }
    }

    protected void t(long l2) {
        block15: {
            Object object;
            Object object2;
            long l3;
            long l4;
            block13: {
                block14: {
                    boolean bl;
                    int n2;
                    int n3;
                    int n4;
                    block12: {
                        long l5;
                        block11: {
                            long l6 = l2;
                            l4 = l6 ^ 0x5F3ECFA4F958L;
                            long l7 = l6 ^ 0x6A7755C07387L;
                            n4 = (int)(l7 >>> 48);
                            n3 = (int)(l7 << 16 >>> 32);
                            n2 = (int)(l7 << 48 >>> 48);
                            l5 = l6 ^ 0x32683AE93E9FL;
                            l3 = l6 ^ 0x1ABCF9D457FCL;
                            if (this.V && this.z != null) break block11;
                            return;
                        }
                        bl = f.u(l5, this).isEmpty();
                        if (l2 <= 0L) break block12;
                        if (bl) {
                            this.z = null;
                        }
                        object2 = me.serbob.donuttp.c.CRAFT_ITEMSTACK.E();
                        if (l2 < 0L) break block13;
                        bl = ((Class)object2).isAssignableFrom(this.Z.getClass());
                    }
                    if (!bl) break block14;
                    object = f.Z(this.Z, (short)n4, n3, (char)n2);
                    f.v(object, l3, this.z);
                    this.r = this.Z;
                    if (l2 >= 0L) break block15;
                }
                object2 = d.ITEMSTACK_NMSCOPY.R(l4, null, this.r);
            }
            object = object2;
            f.v(object, l3, this.z);
            this.r = (ItemStack)d.ITEMSTACK_BUKKITMIRROR.R(l4, null, object);
            this.Z.setItemMeta(this.r.getItemMeta());
        }
    }

    @Override
    protected void z(long l2) {
        this.m = true;
    }

    @Override
    protected boolean q(long l2) {
        return this.m;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    protected void x(long l2, Object object) {
        block21: {
            Object object2;
            Object object3;
            long l3;
            long l4;
            block19: {
                block20: {
                    boolean bl;
                    int n2;
                    int n3;
                    int n4;
                    block18: {
                        block17: {
                            Object object4;
                            block16: {
                                block15: {
                                    boolean bl2;
                                    block14: {
                                        long l5 = l2;
                                        l4 = l5 ^ 0x474D166F1C2EL;
                                        long l6 = l5 ^ 0x72048C0B96F1L;
                                        n4 = (int)(l6 >>> 48);
                                        n3 = (int)(l6 << 16 >>> 32);
                                        n2 = (int)(l6 << 48 >>> 48);
                                        l3 = l5 ^ 0x2CF201FB28AL;
                                        long l7 = l5 ^ 0x5ACDEB081EB2L;
                                        if (this.L()) {
                                            throw new s(l7, F.b(1556063040 + (char)-3461, 1556194110 - (char)-15845, (int)l2));
                                        }
                                        bl2 = this.m;
                                        if (l2 < 0L) break block14;
                                        if (bl2) {
                                            throw new s(l7, F.b(1556063040 + (char)-3460, 1556063040 + (char)-1352, (int)l2));
                                        }
                                        object4 = this;
                                        if (l2 < 0L) break block15;
                                        bl2 = ((F)object4).V;
                                    }
                                    if (bl2) {
                                        this.z = object;
                                        return;
                                    }
                                    object4 = object;
                                }
                                if (l2 <= 0L) break block16;
                                if (object4 == null) break block17;
                                object4 = d.COMPOUND_GET_KEYS.R(l4, object, new Object[0]);
                            }
                            bl = ((Set)object4).isEmpty();
                            if (l2 < 0L) break block18;
                            if (bl) {
                                object = null;
                            }
                        }
                        object3 = me.serbob.donuttp.c.CRAFT_ITEMSTACK.E();
                        if (l2 < 0L) break block19;
                        bl = ((Class)object3).isAssignableFrom(this.r.getClass());
                    }
                    if (!bl) break block20;
                    object2 = f.Z(this.r, (short)n4, n3, (char)n2);
                    f.v(object2, l3, object);
                    if (l2 >= 0L) break block21;
                }
                object3 = d.ITEMSTACK_NMSCOPY.R(l4, null, this.r);
            }
            object2 = object3;
            f.v(object2, l3, object);
            this.r = (ItemStack)d.ITEMSTACK_BUKKITMIRROR.R(l4, null, object2);
        }
    }

    @Deprecated
    public void N(long l2, ItemStack itemStack) {
        long l3;
        long l4;
        block4: {
            long l5 = l2;
            l4 = l5 ^ 0xF033EE0CC54L;
            l3 = l5 ^ 0x2E50F775F258L;
            if (itemStack != null && itemStack.getType() != Material.AIR) break block4;
            throw new NullPointerException(F.b(-1651350930 + -16983, -1651350930 + -1838, (int)l2));
        }
        F f2 = new F(l4, new ItemStack(itemStack.getType()));
        f2.S(l3, this);
        itemStack.setItemMeta(f2.M().getItemMeta());
    }

    @Deprecated
    public void p(short s2, int n2, ItemStack itemStack, char c2) {
        long l2;
        long l3 = l2 = (long)s2 << 48 | (long)n2 << 32 >>> 16 | (long)c2 << 48 >>> 48;
        long l4 = l3 ^ 0x64D2E33248ECL;
        long l5 = l3 ^ 0x45812AA776E0L;
        F f2 = new F(l4, itemStack);
        f2.S(l5, this);
        itemStack.setItemMeta(f2.M().getItemMeta());
    }

    @Deprecated
    public void m(long l2, ItemStack itemStack) {
        long l3;
        block9: {
            long l4;
            int n2;
            long l5;
            block8: {
                long l6 = l2;
                long l7 = l6 ^ 0x74C3F4599A33L;
                l5 = l7 >>> 16;
                n2 = (int)(l7 << 48 >>> 48);
                l4 = l6 ^ 0x76242A083A5L;
                l3 = l6 ^ 0x7F8DCED53CECL;
                if (itemStack != null && itemStack.getType() != Material.AIR) break block8;
                throw new NullPointerException(F.b(-274329510 - -((char)-29511), -274329510 - -((char)-7415), (int)l2));
            }
            if (l2 >= 0L) {
                if (!me.serbob.donuttp.r.m(me.serbob.donuttp.r.MC1_20_R4, l4)) break block9;
                i.S(itemStack, l5, e2 -> {
                    long l2 = 45432094406924L;
                    long l3 = l2 ^ 0x13A38DDB961DL;
                    e2.X(this, l3);
                }, (char)n2);
            }
            return;
        }
        ItemMeta itemMeta = itemStack.getItemMeta();
        f.n(itemMeta, l3).putAll(f.n(this.r.getItemMeta(), l3));
        itemStack.setItemMeta(itemMeta);
    }

    @Override
    @Deprecated
    public boolean i(long l2) {
        long l3 = l2;
        long l4 = l3 ^ 0x4F4C50E47313L;
        long l5 = l3 ^ 0x70B078E91D69L;
        long l6 = l3 ^ 0x37A3DC91CC5AL;
        long l7 = l3 ^ 0x7F2F674CF8BL;
        if (me.serbob.donuttp.r.m(me.serbob.donuttp.r.MC1_20_R4, l4)) {
            return this.k(l7);
        }
        this.t(l5);
        ItemMeta itemMeta = this.r.getItemMeta();
        boolean bl = f.n(itemMeta, l6).isEmpty();
        if (l2 >= 0L) {
            bl = !bl;
        }
        return bl;
    }

    @Override
    @Deprecated
    public void l(long l2) {
        long l3 = l2;
        long l4 = l3 ^ 0x6CC305216879L;
        long l5 = l3 ^ 0x4B4CF4E7E375L;
        long l6 = l3 ^ 0x533F2D2C0603L;
        long l7 = l3 ^ 0x447C6BA67DD8L;
        long l8 = l3 ^ 0x142C8954D730L;
        this.t(l6);
        if (me.serbob.donuttp.r.m(me.serbob.donuttp.r.MC1_20_R4, l4)) {
            this.x(l5, null);
            return;
        }
        ItemMeta itemMeta = this.r.getItemMeta();
        f.n(itemMeta, l8).clear();
        this.r.setItemMeta(itemMeta);
        this.U(l7);
    }

    public ItemStack M() {
        return this.r;
    }

    protected void f(ItemStack itemStack) {
        this.r = itemStack;
    }

    @Override
    public boolean k(long l2) {
        long l3 = l2 ^ 0x39C669EA81DEL;
        boolean bl = this.h(l3) != null;
        return bl;
    }

    @Override
    public void W(long l2, BiConsumer biConsumer) {
        block4: {
            long l3;
            block5: {
                long l4 = l2;
                l3 = l4 ^ 0x68C5D455AB14L;
                long l5 = l4 ^ 0x1539948539FFL;
                long l6 = l4 ^ 0x457FE4C195B1L;
                long l7 = l4 ^ 0x36612F21602FL;
                long l8 = l4 ^ 0x7A83CCCCFBCBL;
                long l9 = l4 ^ 0x6DC08A468010L;
                long l10 = l4 ^ 0x383DFE0F000FL;
                this.t(l8);
                ItemMeta itemMeta = this.r.getItemMeta();
                biConsumer.accept(new C(this.g(l5), l7).M(true), itemMeta);
                this.r.setItemMeta(itemMeta);
                this.U(l9);
                if (!this.h) break block4;
                if (!me.serbob.donuttp.r.m(me.serbob.donuttp.r.MC1_20_R4, l6)) break block5;
                throw new s(l10, F.b(1237825080 - 11056, 1237825080 - 5280, (int)l2));
            }
            this.N(l3, this.Z);
        }
    }

    @Override
    public void H(Class clazz, BiConsumer biConsumer, long l2) {
        long l3 = l2;
        long l4 = l3 ^ 0x11DAEA66B394L;
        long l5 = l3 ^ 0x6C26AAB6217FL;
        long l6 = l3 ^ 0x4F7E111278AFL;
        long l7 = l3 ^ 0x39CF2FFE34BL;
        long l8 = l3 ^ 0x14DFB4759890L;
        this.t(l7);
        ItemMeta itemMeta = this.r.getItemMeta();
        biConsumer.accept(new C(this.g(l5), l6).M(true), itemMeta);
        this.r.setItemMeta(itemMeta);
        this.U(l8);
        if (this.h) {
            this.N(l4, this.Z);
        }
    }

    @Deprecated
    public static C P(long l2, ItemStack itemStack) {
        long l3 = l2;
        long l4 = l3 ^ 0x3401C380D502L;
        long l5 = l3 ^ 0x44A3297E730BL;
        long l6 = l5 >>> 8;
        int n2 = (int)(l5 << 56 >>> 56);
        return f.r(d.ITEMSTACK_NMSCOPY.R(l4, null, itemStack), l6, (byte)n2);
    }

    @Nullable
    @Deprecated
    public static ItemStack S(D d2, long l2) {
        long l3 = l2;
        long l4 = l3 ^ 0x645A9A93D330L;
        long l5 = l3 ^ 0x3D0B57C6F477L;
        return (ItemStack)d.ITEMSTACK_BUKKITMIRROR.R(l4, null, f.d(d2, l5));
    }

    @Deprecated
    public static C t(ItemStack[] itemStackArray, long l2) {
        long l3 = l2;
        long l4 = l3 ^ 0x4AD5B1F11DBDL;
        long l5 = l4 >>> 32;
        int n2 = (int)(l4 << 32 >>> 32);
        long l6 = l3 ^ 0x698674B95F0FL;
        long l7 = l3 ^ 0x622C0A3EA6B6L;
        long l8 = l3 ^ 0x506FDDAAB6B3L;
        long l9 = l3 ^ 0x7463E62386EL;
        long l10 = l3 ^ 0x6FE9E268F55BL;
        int n3 = (int)(l10 >>> 32);
        int n4 = (int)(l10 << 32 >>> 48);
        int n5 = (int)(l10 << 48 >>> 48);
        C c2 = new C(n3, n4, (short)n5);
        c2.V(l6, F.b(-1219606350 + -((char)-7245), -1219737420 - -((char)-5685), (int)l2), itemStackArray.length);
        A a2 = c2.G(l7, F.b(-1219606350 + -((char)-7234), 1219606350 + (char)-12134, (int)l2));
        int n6 = 0;
        while (n6 < itemStackArray.length) {
            block5: {
                block7: {
                    ItemStack itemStack;
                    block6: {
                        itemStack = itemStackArray[n6];
                        if (l2 <= 0L) break block5;
                        if (itemStack != null && itemStack.getType() != Material.AIR) break block6;
                        break block7;
                    }
                    U u2 = a2.g(l5, n2);
                    u2.V(l6, F.b(-1219606350 + -((char)-7231), -1219606350 + -((char)-13997), (int)l2), n6);
                    u2.S(l8, F.P(l9, itemStack));
                }
                ++n6;
            }
            if (l2 > 0L) continue;
        }
        return c2;
    }

    @Nullable
    @Deprecated
    public static ItemStack[] V(long l2, D d2) {
        String string;
        long l3;
        D d3;
        ItemStack[] itemStackArray;
        long l4;
        long l5;
        block16: {
            long l6 = l2;
            long l7 = l6 ^ 0x64DACE569497L;
            l5 = l6 ^ 0x64DACE569497L;
            long l8 = l6 ^ 0x170460449ED4L;
            l4 = l6 ^ 0x5842B8B48872L;
            long l9 = l6 ^ 0x6D73D5FB1098L;
            if (!d2.k(l8, F.b(1753847670 - (char)-15199, 1753847670 - (char)-10064, (int)l2))) {
                return null;
            }
            itemStackArray = new ItemStack[d2.t(F.b(1753847670 - (char)-15199, 1753847670 - (char)-10064, (int)l2), l7).intValue()];
            for (int i2 = 0; i2 < itemStackArray.length; ++i2) {
                itemStackArray[i2] = new ItemStack(Material.AIR);
                if (l2 >= 0L) {
                    continue;
                }
                break;
            }
            d3 = d2;
            l3 = l8;
            string = F.b(1753847670 - (char)-15205, 1753847670 - (char)-14229, (int)l2);
            if (l2 <= 0L) break block16;
            if (!d3.k(l3, string)) {
                return itemStackArray;
            }
            d3 = d2;
            l3 = l9;
            string = F.b(1753847670 - (char)-15205, 1753847670 - (char)-14229, (int)l2);
        }
        A a2 = d3.G(l3, string);
        for (j j2 : a2) {
            block18: {
                int n2;
                block17: {
                    n2 = j2 instanceof D;
                    if (l2 <= 0L) break block17;
                    if (n2 == 0) break block18;
                    n2 = j2.t(F.b(1753847670 - (char)-15197, -1753847670 - -((char)-18800), (int)l2), l5);
                }
                int n3 = n2;
                itemStackArray[n3] = F.S((D)j2, l4);
            }
            if (l2 > 0L) continue;
        }
        return itemStackArray;
    }

    @Override
    protected void a(long l2) {
        long l3 = l2 ^ 0x217C0370103L;
        if (this.h) {
            this.N(l3, this.Z);
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block20: {
            block19: {
                var5 = new String[14];
                var3_1 = 0;
                var2_2 = "\u00f7\u0010K\u00b26\u00b3/\u0090Wx\u00b2z\u00ae\"\u0019\u0004\u0096\r\u0095\u0017\u001a\u0099'\u00cd\u00af\u00c5[DF\r\u009bV;\u00b7}Y=\u00cd/\u00e0\u00d33\u00ea\bzO\u00f9\u008cw\u0014\u00189a*7\fT\u00ed\u0080\u0004\u000f\u00f7e\u00fa\u001ck29:\u00f7BN~0_\u0000\u0098\u0004v\u0081\u00174\u00be\u009f\u009d\u00b8\u0001vy\u00aeC\u0015\u009e%\u0082^\u0004\u00b7P\u00f3\u00bc^\u00b5\u0095\u0000\u00d6\u00cftw\u0080\u0091\u0019\u0018\u00ebdx\u0016\u00ad\u00ba\u00e8\u00d6\u00b7\u00f1S\u0007\u008e+v\u00ecH\u001f\u001c\u00ed\u00eb[\u00cf\u0001\u00a1U\u00cc\u00c7U\u00b8\u001f\u009a\u00a4\u00e5<\u00c7\u00e3\u00067\u00bcHk$\u00e8\u00d7\u00ea\u00b2\u0004\u00ff\u00a8{\u0011B\u00cf\u001c\u001f1\u0089~D7\u00e5*\u00fc\u00f0\u0012Y\u00f4\u0083\u00e5\u0014B\u00c94\u0097z\u00df\u00ea\u00a8\u008eS\u00ed\u0086|@\u0093K\u00dc\u009d\u0092\u00f2\u00ed\u00abG\t\u00c5\u00ddM\u00fa-\u00e4\u00ec\u008e\u009d\u00e54\u00d7n\u00d4\u00ca\u0002\u00f1\u00eb\u00ee\u00eb\u00f2M\\\u00b0\u0005\u00c51z\u0094\u0005\u0005<\u00e9E\u008f\u00e2l\u00d2\u00f9\u0007;O6\u00eb<bY{\u00dcB\u008db^H&]i2\u00e4\u00d7Q\u0093\u00b4\u0095\u0091\u0015\u0081\u00a8l\u00ae\u00e7]J\u0003'\u000e\u00ff\u00c4\u00ce\u009e\u00d8\u0004\u00f0I@\u00e3u\u0097\u0007\u00b3\u0082\u0090X\u00a8\u001a\u00f5\u00a6\u00f3V\u00e8\u00e3i\u001f\u00b2;\u0087\u00f0\u00c2!V&\u00a8\u0007)\u00ca\u00b4L\u00ff\u00e6VU\u00e0E\u0018\u0017T\u0012JE\u00d1o\u00ac\u0099\u00dd\u00f5T\u00c8\u00e3\u0019\u00d1\u00a6/.uJB\u00c1\u00b5\u00de\u0004\u00b1\u00d8C\u00e3\u0005\u00b0\u00e0\u00a3\u00913\u0084\u00ce\u00eb\u00bd\u0083\u00fc\f1}\u000b\n2\u0092\u0000n\u00ec\f\r\u009d\u00e2\u001d\u00a8\u00aaT\u00ea\u007f\u00a7\u0093\u00d9\u008e\u00ce\u0090]\u00a9\u00e2'\\\u00d0\fqi\u0000*\u0098\u00ed\u00b8m\u0081\u0082\u0000R\u0019";
                var4_3 = "\u00f7\u0010K\u00b26\u00b3/\u0090Wx\u00b2z\u00ae\"\u0019\u0004\u0096\r\u0095\u0017\u001a\u0099'\u00cd\u00af\u00c5[DF\r\u009bV;\u00b7}Y=\u00cd/\u00e0\u00d33\u00ea\bzO\u00f9\u008cw\u0014\u00189a*7\fT\u00ed\u0080\u0004\u000f\u00f7e\u00fa\u001ck29:\u00f7BN~0_\u0000\u0098\u0004v\u0081\u00174\u00be\u009f\u009d\u00b8\u0001vy\u00aeC\u0015\u009e%\u0082^\u0004\u00b7P\u00f3\u00bc^\u00b5\u0095\u0000\u00d6\u00cftw\u0080\u0091\u0019\u0018\u00ebdx\u0016\u00ad\u00ba\u00e8\u00d6\u00b7\u00f1S\u0007\u008e+v\u00ecH\u001f\u001c\u00ed\u00eb[\u00cf\u0001\u00a1U\u00cc\u00c7U\u00b8\u001f\u009a\u00a4\u00e5<\u00c7\u00e3\u00067\u00bcHk$\u00e8\u00d7\u00ea\u00b2\u0004\u00ff\u00a8{\u0011B\u00cf\u001c\u001f1\u0089~D7\u00e5*\u00fc\u00f0\u0012Y\u00f4\u0083\u00e5\u0014B\u00c94\u0097z\u00df\u00ea\u00a8\u008eS\u00ed\u0086|@\u0093K\u00dc\u009d\u0092\u00f2\u00ed\u00abG\t\u00c5\u00ddM\u00fa-\u00e4\u00ec\u008e\u009d\u00e54\u00d7n\u00d4\u00ca\u0002\u00f1\u00eb\u00ee\u00eb\u00f2M\\\u00b0\u0005\u00c51z\u0094\u0005\u0005<\u00e9E\u008f\u00e2l\u00d2\u00f9\u0007;O6\u00eb<bY{\u00dcB\u008db^H&]i2\u00e4\u00d7Q\u0093\u00b4\u0095\u0091\u0015\u0081\u00a8l\u00ae\u00e7]J\u0003'\u000e\u00ff\u00c4\u00ce\u009e\u00d8\u0004\u00f0I@\u00e3u\u0097\u0007\u00b3\u0082\u0090X\u00a8\u001a\u00f5\u00a6\u00f3V\u00e8\u00e3i\u001f\u00b2;\u0087\u00f0\u00c2!V&\u00a8\u0007)\u00ca\u00b4L\u00ff\u00e6VU\u00e0E\u0018\u0017T\u0012JE\u00d1o\u00ac\u0099\u00dd\u00f5T\u00c8\u00e3\u0019\u00d1\u00a6/.uJB\u00c1\u00b5\u00de\u0004\u00b1\u00d8C\u00e3\u0005\u00b0\u00e0\u00a3\u00913\u0084\u00ce\u00eb\u00bd\u0083\u00fc\f1}\u000b\n2\u0092\u0000n\u00ec\f\r\u009d\u00e2\u001d\u00a8\u00aaT\u00ea\u007f\u00a7\u0093\u00d9\u008e\u00ce\u0090]\u00a9\u00e2'\\\u00d0\fqi\u0000*\u0098\u00ed\u00b8m\u0081\u0082\u0000R\u0019".length();
                var1_4 = 4;
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
                    var2_2 = "\u0083\u00c5\u00c5\b\u001c\u00f6\"\u008a8\u0081\u0002\u0080v\u00e9^;\u00b8crm\u0097\u00a9\u00ae,\u009f\u00ceA\u00b8qwB.\u00be";
                    var4_3 = "\u0083\u00c5\u00c5\b\u001c\u00f6\"\u008a8\u0081\u0002\u0080v\u00e9^;\u00b8crm\u0097\u00a9\u00ae,\u009f\u00ceA\u00b8qwB.\u00be".length();
                    var1_4 = 4;
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
                            v13 = 109;
                            break;
                        }
                        case 1: {
                            v13 = 10;
                            break;
                        }
                        case 2: {
                            v13 = 78;
                            break;
                        }
                        case 3: {
                            v13 = 100;
                            break;
                        }
                        case 4: {
                            v13 = 57;
                            break;
                        }
                        case 5: {
                            v13 = 96;
                            break;
                        }
                        default: {
                            v13 = 10;
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
        F.c = var5;
        F.e = new String[14];
    }

    private static String b(int n2, int n3, int n4) {
        int n5 = (n2 ^ n4 ^ 0x6136) & 0xFFFF;
        if (e[n5] == null) {
            int n6;
            int n7;
            char[] cArray = c[n5].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n7 = 132;
                    break;
                }
                case 1: {
                    n7 = 119;
                    break;
                }
                case 2: {
                    n7 = 123;
                    break;
                }
                case 3: {
                    n7 = 241;
                    break;
                }
                case 4: {
                    n7 = 67;
                    break;
                }
                case 5: {
                    n7 = 124;
                    break;
                }
                case 6: {
                    n7 = 31;
                    break;
                }
                case 7: {
                    n7 = 244;
                    break;
                }
                case 8: {
                    n7 = 226;
                    break;
                }
                case 9: {
                    n7 = 130;
                    break;
                }
                case 10: {
                    n7 = 174;
                    break;
                }
                case 11: {
                    n7 = 142;
                    break;
                }
                case 12: {
                    n7 = 126;
                    break;
                }
                case 13: {
                    n7 = 107;
                    break;
                }
                case 14: {
                    n7 = 173;
                    break;
                }
                case 15: {
                    n7 = 236;
                    break;
                }
                case 16: {
                    n7 = 249;
                    break;
                }
                case 17: {
                    n7 = 213;
                    break;
                }
                case 18: {
                    n7 = 62;
                    break;
                }
                case 19: {
                    n7 = 190;
                    break;
                }
                case 20: {
                    n7 = 3;
                    break;
                }
                case 21: {
                    n7 = 98;
                    break;
                }
                case 22: {
                    n7 = 172;
                    break;
                }
                case 23: {
                    n7 = 200;
                    break;
                }
                case 24: {
                    n7 = 211;
                    break;
                }
                case 25: {
                    n7 = 248;
                    break;
                }
                case 26: {
                    n7 = 214;
                    break;
                }
                case 27: {
                    n7 = 111;
                    break;
                }
                case 28: {
                    n7 = 91;
                    break;
                }
                case 29: {
                    n7 = 90;
                    break;
                }
                case 30: {
                    n7 = 63;
                    break;
                }
                case 31: {
                    n7 = 182;
                    break;
                }
                case 32: {
                    n7 = 24;
                    break;
                }
                case 33: {
                    n7 = 53;
                    break;
                }
                case 34: {
                    n7 = 161;
                    break;
                }
                case 35: {
                    n7 = 5;
                    break;
                }
                case 36: {
                    n7 = 131;
                    break;
                }
                case 37: {
                    n7 = 218;
                    break;
                }
                case 38: {
                    n7 = 41;
                    break;
                }
                case 39: {
                    n7 = 222;
                    break;
                }
                case 40: {
                    n7 = 65;
                    break;
                }
                case 41: {
                    n7 = 16;
                    break;
                }
                case 42: {
                    n7 = 171;
                    break;
                }
                case 43: {
                    n7 = 93;
                    break;
                }
                case 44: {
                    n7 = 225;
                    break;
                }
                case 45: {
                    n7 = 81;
                    break;
                }
                case 46: {
                    n7 = 89;
                    break;
                }
                case 47: {
                    n7 = 95;
                    break;
                }
                case 48: {
                    n7 = 110;
                    break;
                }
                case 49: {
                    n7 = 79;
                    break;
                }
                case 50: {
                    n7 = 82;
                    break;
                }
                case 51: {
                    n7 = 30;
                    break;
                }
                case 52: {
                    n7 = 97;
                    break;
                }
                case 53: {
                    n7 = 109;
                    break;
                }
                case 54: {
                    n7 = 28;
                    break;
                }
                case 55: {
                    n7 = 141;
                    break;
                }
                case 56: {
                    n7 = 127;
                    break;
                }
                case 57: {
                    n7 = 64;
                    break;
                }
                case 58: {
                    n7 = 202;
                    break;
                }
                case 59: {
                    n7 = 56;
                    break;
                }
                case 60: {
                    n7 = 252;
                    break;
                }
                case 61: {
                    n7 = 71;
                    break;
                }
                case 62: {
                    n7 = 158;
                    break;
                }
                case 63: {
                    n7 = 169;
                    break;
                }
                case 64: {
                    n7 = 159;
                    break;
                }
                case 65: {
                    n7 = 27;
                    break;
                }
                case 66: {
                    n7 = 69;
                    break;
                }
                case 67: {
                    n7 = 25;
                    break;
                }
                case 68: {
                    n7 = 199;
                    break;
                }
                case 69: {
                    n7 = 138;
                    break;
                }
                case 70: {
                    n7 = 227;
                    break;
                }
                case 71: {
                    n7 = 205;
                    break;
                }
                case 72: {
                    n7 = 250;
                    break;
                }
                case 73: {
                    n7 = 8;
                    break;
                }
                case 74: {
                    n7 = 52;
                    break;
                }
                case 75: {
                    n7 = 237;
                    break;
                }
                case 76: {
                    n7 = 247;
                    break;
                }
                case 77: {
                    n7 = 184;
                    break;
                }
                case 78: {
                    n7 = 240;
                    break;
                }
                case 79: {
                    n7 = 198;
                    break;
                }
                case 80: {
                    n7 = 206;
                    break;
                }
                case 81: {
                    n7 = 235;
                    break;
                }
                case 82: {
                    n7 = 59;
                    break;
                }
                case 83: {
                    n7 = 37;
                    break;
                }
                case 84: {
                    n7 = 94;
                    break;
                }
                case 85: {
                    n7 = 242;
                    break;
                }
                case 86: {
                    n7 = 36;
                    break;
                }
                case 87: {
                    n7 = 88;
                    break;
                }
                case 88: {
                    n7 = 194;
                    break;
                }
                case 89: {
                    n7 = 216;
                    break;
                }
                case 90: {
                    n7 = 176;
                    break;
                }
                case 91: {
                    n7 = 183;
                    break;
                }
                case 92: {
                    n7 = 44;
                    break;
                }
                case 93: {
                    n7 = 75;
                    break;
                }
                case 94: {
                    n7 = 2;
                    break;
                }
                case 95: {
                    n7 = 40;
                    break;
                }
                case 96: {
                    n7 = 255;
                    break;
                }
                case 97: {
                    n7 = 29;
                    break;
                }
                case 98: {
                    n7 = 163;
                    break;
                }
                case 99: {
                    n7 = 121;
                    break;
                }
                case 100: {
                    n7 = 144;
                    break;
                }
                case 101: {
                    n7 = 125;
                    break;
                }
                case 102: {
                    n7 = 104;
                    break;
                }
                case 103: {
                    n7 = 153;
                    break;
                }
                case 104: {
                    n7 = 212;
                    break;
                }
                case 105: {
                    n7 = 100;
                    break;
                }
                case 106: {
                    n7 = 133;
                    break;
                }
                case 107: {
                    n7 = 208;
                    break;
                }
                case 108: {
                    n7 = 175;
                    break;
                }
                case 109: {
                    n7 = 17;
                    break;
                }
                case 110: {
                    n7 = 0;
                    break;
                }
                case 111: {
                    n7 = 151;
                    break;
                }
                case 112: {
                    n7 = 87;
                    break;
                }
                case 113: {
                    n7 = 14;
                    break;
                }
                case 114: {
                    n7 = 128;
                    break;
                }
                case 115: {
                    n7 = 4;
                    break;
                }
                case 116: {
                    n7 = 145;
                    break;
                }
                case 117: {
                    n7 = 180;
                    break;
                }
                case 118: {
                    n7 = 19;
                    break;
                }
                case 119: {
                    n7 = 34;
                    break;
                }
                case 120: {
                    n7 = 12;
                    break;
                }
                case 121: {
                    n7 = 112;
                    break;
                }
                case 122: {
                    n7 = 210;
                    break;
                }
                case 123: {
                    n7 = 165;
                    break;
                }
                case 124: {
                    n7 = 13;
                    break;
                }
                case 125: {
                    n7 = 6;
                    break;
                }
                case 126: {
                    n7 = 26;
                    break;
                }
                case 127: {
                    n7 = 120;
                    break;
                }
                case 128: {
                    n7 = 122;
                    break;
                }
                case 129: {
                    n7 = 117;
                    break;
                }
                case 130: {
                    n7 = 229;
                    break;
                }
                case 131: {
                    n7 = 139;
                    break;
                }
                case 132: {
                    n7 = 204;
                    break;
                }
                case 133: {
                    n7 = 192;
                    break;
                }
                case 134: {
                    n7 = 189;
                    break;
                }
                case 135: {
                    n7 = 134;
                    break;
                }
                case 136: {
                    n7 = 108;
                    break;
                }
                case 137: {
                    n7 = 113;
                    break;
                }
                case 138: {
                    n7 = 43;
                    break;
                }
                case 139: {
                    n7 = 203;
                    break;
                }
                case 140: {
                    n7 = 78;
                    break;
                }
                case 141: {
                    n7 = 137;
                    break;
                }
                case 142: {
                    n7 = 22;
                    break;
                }
                case 143: {
                    n7 = 129;
                    break;
                }
                case 144: {
                    n7 = 76;
                    break;
                }
                case 145: {
                    n7 = 21;
                    break;
                }
                case 146: {
                    n7 = 66;
                    break;
                }
                case 147: {
                    n7 = 35;
                    break;
                }
                case 148: {
                    n7 = 164;
                    break;
                }
                case 149: {
                    n7 = 246;
                    break;
                }
                case 150: {
                    n7 = 146;
                    break;
                }
                case 151: {
                    n7 = 47;
                    break;
                }
                case 152: {
                    n7 = 84;
                    break;
                }
                case 153: {
                    n7 = 85;
                    break;
                }
                case 154: {
                    n7 = 54;
                    break;
                }
                case 155: {
                    n7 = 55;
                    break;
                }
                case 156: {
                    n7 = 157;
                    break;
                }
                case 157: {
                    n7 = 245;
                    break;
                }
                case 158: {
                    n7 = 207;
                    break;
                }
                case 159: {
                    n7 = 11;
                    break;
                }
                case 160: {
                    n7 = 20;
                    break;
                }
                case 161: {
                    n7 = 152;
                    break;
                }
                case 162: {
                    n7 = 167;
                    break;
                }
                case 163: {
                    n7 = 209;
                    break;
                }
                case 164: {
                    n7 = 217;
                    break;
                }
                case 165: {
                    n7 = 7;
                    break;
                }
                case 166: {
                    n7 = 60;
                    break;
                }
                case 167: {
                    n7 = 118;
                    break;
                }
                case 168: {
                    n7 = 45;
                    break;
                }
                case 169: {
                    n7 = 46;
                    break;
                }
                case 170: {
                    n7 = 178;
                    break;
                }
                case 171: {
                    n7 = 102;
                    break;
                }
                case 172: {
                    n7 = 48;
                    break;
                }
                case 173: {
                    n7 = 72;
                    break;
                }
                case 174: {
                    n7 = 254;
                    break;
                }
                case 175: {
                    n7 = 101;
                    break;
                }
                case 176: {
                    n7 = 197;
                    break;
                }
                case 177: {
                    n7 = 148;
                    break;
                }
                case 178: {
                    n7 = 49;
                    break;
                }
                case 179: {
                    n7 = 143;
                    break;
                }
                case 180: {
                    n7 = 154;
                    break;
                }
                case 181: {
                    n7 = 115;
                    break;
                }
                case 182: {
                    n7 = 50;
                    break;
                }
                case 183: {
                    n7 = 186;
                    break;
                }
                case 184: {
                    n7 = 219;
                    break;
                }
                case 185: {
                    n7 = 155;
                    break;
                }
                case 186: {
                    n7 = 73;
                    break;
                }
                case 187: {
                    n7 = 156;
                    break;
                }
                case 188: {
                    n7 = 92;
                    break;
                }
                case 189: {
                    n7 = 228;
                    break;
                }
                case 190: {
                    n7 = 83;
                    break;
                }
                case 191: {
                    n7 = 177;
                    break;
                }
                case 192: {
                    n7 = 188;
                    break;
                }
                case 193: {
                    n7 = 232;
                    break;
                }
                case 194: {
                    n7 = 1;
                    break;
                }
                case 195: {
                    n7 = 140;
                    break;
                }
                case 196: {
                    n7 = 230;
                    break;
                }
                case 197: {
                    n7 = 105;
                    break;
                }
                case 198: {
                    n7 = 57;
                    break;
                }
                case 199: {
                    n7 = 99;
                    break;
                }
                case 200: {
                    n7 = 18;
                    break;
                }
                case 201: {
                    n7 = 185;
                    break;
                }
                case 202: {
                    n7 = 32;
                    break;
                }
                case 203: {
                    n7 = 195;
                    break;
                }
                case 204: {
                    n7 = 231;
                    break;
                }
                case 205: {
                    n7 = 116;
                    break;
                }
                case 206: {
                    n7 = 23;
                    break;
                }
                case 207: {
                    n7 = 68;
                    break;
                }
                case 208: {
                    n7 = 233;
                    break;
                }
                case 209: {
                    n7 = 114;
                    break;
                }
                case 210: {
                    n7 = 191;
                    break;
                }
                case 211: {
                    n7 = 162;
                    break;
                }
                case 212: {
                    n7 = 42;
                    break;
                }
                case 213: {
                    n7 = 39;
                    break;
                }
                case 214: {
                    n7 = 234;
                    break;
                }
                case 215: {
                    n7 = 96;
                    break;
                }
                case 216: {
                    n7 = 136;
                    break;
                }
                case 217: {
                    n7 = 253;
                    break;
                }
                case 218: {
                    n7 = 80;
                    break;
                }
                case 219: {
                    n7 = 149;
                    break;
                }
                case 220: {
                    n7 = 9;
                    break;
                }
                case 221: {
                    n7 = 166;
                    break;
                }
                case 222: {
                    n7 = 201;
                    break;
                }
                case 223: {
                    n7 = 168;
                    break;
                }
                case 224: {
                    n7 = 243;
                    break;
                }
                case 225: {
                    n7 = 15;
                    break;
                }
                case 226: {
                    n7 = 61;
                    break;
                }
                case 227: {
                    n7 = 251;
                    break;
                }
                case 228: {
                    n7 = 193;
                    break;
                }
                case 229: {
                    n7 = 70;
                    break;
                }
                case 230: {
                    n7 = 51;
                    break;
                }
                case 231: {
                    n7 = 58;
                    break;
                }
                case 232: {
                    n7 = 106;
                    break;
                }
                case 233: {
                    n7 = 179;
                    break;
                }
                case 234: {
                    n7 = 223;
                    break;
                }
                case 235: {
                    n7 = 86;
                    break;
                }
                case 236: {
                    n7 = 38;
                    break;
                }
                case 237: {
                    n7 = 33;
                    break;
                }
                case 238: {
                    n7 = 215;
                    break;
                }
                case 239: {
                    n7 = 239;
                    break;
                }
                case 240: {
                    n7 = 170;
                    break;
                }
                case 241: {
                    n7 = 238;
                    break;
                }
                case 242: {
                    n7 = 150;
                    break;
                }
                case 243: {
                    n7 = 160;
                    break;
                }
                case 244: {
                    n7 = 196;
                    break;
                }
                case 245: {
                    n7 = 74;
                    break;
                }
                case 246: {
                    n7 = 224;
                    break;
                }
                case 247: {
                    n7 = 147;
                    break;
                }
                case 248: {
                    n7 = 135;
                    break;
                }
                case 249: {
                    n7 = 181;
                    break;
                }
                case 250: {
                    n7 = 77;
                    break;
                }
                case 251: {
                    n7 = 10;
                    break;
                }
                case 252: {
                    n7 = 221;
                    break;
                }
                case 253: {
                    n7 = 220;
                    break;
                }
                case 254: {
                    n7 = 103;
                    break;
                }
                default: {
                    n7 = 187;
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
            F.e[n5] = new String(cArray).intern();
        }
        return e[n5];
    }
}

