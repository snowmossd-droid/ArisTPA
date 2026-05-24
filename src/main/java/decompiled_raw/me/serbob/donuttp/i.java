/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  javax.annotation.Nullable
 *  org.bukkit.block.BlockState
 *  org.bukkit.entity.Entity
 *  org.bukkit.inventory.ItemStack
 */
package me.serbob.donuttp;

import com.mojang.authlib.GameProfile;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.logging.Level;
import javax.annotation.Nullable;
import me.serbob.donuttp.B;
import me.serbob.donuttp.C;
import me.serbob.donuttp.D;
import me.serbob.donuttp.F;
import me.serbob.donuttp.I;
import me.serbob.donuttp.P;
import me.serbob.donuttp.R;
import me.serbob.donuttp.VV;
import me.serbob.donuttp.c;
import me.serbob.donuttp.d;
import me.serbob.donuttp.e;
import me.serbob.donuttp.h;
import me.serbob.donuttp.j;
import me.serbob.donuttp.k;
import me.serbob.donuttp.r;
import me.serbob.donuttp.s;
import me.serbob.donuttp.x;
import org.bukkit.block.BlockState;
import org.bukkit.entity.Entity;
import org.bukkit.inventory.ItemStack;

public class i {
    private static final String[] a;
    private static final String[] b;

    private i() {
    }

    public static boolean G(long l2) {
        long l3 = l2 ^ 0x35D69015106DL;
        try {
            boolean bl;
            block12: {
                Enum enum_;
                if (r.M(l3) == r.UNKNOWN) {
                    s.u = true;
                    return false;
                }
                Enum[] enumArray = c.values();
                int n2 = enumArray.length;
                int n3 = 0;
                while (n3 < n2) {
                    block9: {
                        block10: {
                            enum_ = enumArray[n3];
                            if (l2 <= 0L) break block9;
                            if (!((c)enum_).M() || ((c)enum_).E() != null) break block10;
                            s.u = true;
                            return false;
                        }
                        ++n3;
                    }
                    if (l2 > 0L) continue;
                }
                enumArray = d.values();
                n2 = enumArray.length;
                n3 = 0;
                while (n3 < n2) {
                    block11: {
                        block13: {
                            enum_ = enumArray[n3];
                            if (l2 < 0L) break block11;
                            bl = ((d)enum_).g();
                            if (l2 < 0L) break block12;
                            if (!bl || ((d)enum_).I()) break block13;
                            s.u = true;
                            return false;
                        }
                        ++n3;
                    }
                    if (l2 >= 0L) continue;
                }
                bl = true;
            }
            return bl;
        }
        catch (Exception exception) {
            s.u = true;
            r.e().log(Level.WARNING, i.a(-1644011010 + -27597, 1644011010 + 29729, (int)l2), exception);
            return false;
        }
    }

    public static x O(ItemStack itemStack, long l2) {
        long l3 = l2 ^ 0x5C8CB945F76L;
        int n2 = (int)(l3 >>> 32);
        int n3 = (int)(l3 << 32 >>> 48);
        int n4 = (int)(l3 << 48 >>> 48);
        return new F(itemStack.clone(), n2, (char)n3, false, true, (short)n4, false);
    }

    public static Object j(ItemStack itemStack, long l2, Function function) {
        Object r2;
        block5: {
            Object r3;
            F f2;
            long l3;
            block6: {
                long l4;
                block4: {
                    long l5 = l2;
                    l3 = l5 ^ 0x456BA69B88C8L;
                    long l6 = l5 ^ 0x5FAF0BC69D00L;
                    int n2 = (int)(l6 >>> 32);
                    int n3 = (int)(l6 << 32 >>> 48);
                    int n4 = (int)(l6 << 48 >>> 48);
                    l4 = l5 ^ 0x546770FEA946L;
                    f2 = new F(itemStack, n2, (char)n3, false, true, (short)n4, false);
                    r3 = function.apply(f2);
                    if (r3 instanceof x) break block4;
                    r2 = r3;
                    if (l2 <= 0L) break block5;
                    if (!(r2 instanceof e)) break block6;
                }
                throw new s(l4, i.a(952747830 + 6677, -952747830 - -8075, (int)l2));
            }
            f2.z(l3);
            r2 = r3;
        }
        return r2;
    }

    public static void Z(ItemStack itemStack, Consumer consumer, long l2) {
        long l3 = l2;
        long l4 = l3 ^ 0x75758C2068BCL;
        long l5 = l3 ^ 0x6FB1217D7D74L;
        int n2 = (int)(l5 >>> 32);
        int n3 = (int)(l5 << 32 >>> 48);
        int n4 = (int)(l5 << 48 >>> 48);
        F f2 = new F(itemStack, n2, (char)n3, false, true, (short)n4, false);
        consumer.accept(f2);
        f2.z(l4);
    }

    public static Object S(long l2, Entity entity, Function function) {
        Object r2;
        block5: {
            Object r3;
            R r4;
            long l3;
            block6: {
                long l4;
                block4: {
                    long l5 = l2;
                    l4 = l5 ^ 0x200799C17880L;
                    l3 = l5 ^ 0x310B4FA4590EL;
                    long l6 = l5 ^ 0x18F40EB5981AL;
                    r4 = new R(entity, l6, true);
                    r3 = function.apply(r4);
                    if (r3 instanceof x) break block4;
                    r2 = r3;
                    if (l2 < 0L) break block5;
                    if (!(r2 instanceof e)) break block6;
                }
                throw new s(l4, i.a(-772395510 - -643, 772395510 - 18531, (int)l2));
            }
            r4.z(l3);
            r2 = r3;
        }
        return r2;
    }

    public static void c(int n2, Entity entity, Consumer consumer, int n3, byte by) {
        long l2;
        long l3 = l2 = (long)n2 << 32 | (long)n3 << 40 >>> 32 | (long)by << 56 >>> 56;
        long l4 = l3 ^ 0x15ED4F9DEEFCL;
        long l5 = l3 ^ 0x3C120E8C2FE8L;
        R r2 = new R(entity, l5, true);
        consumer.accept(r2);
        r2.z(l4);
    }

    public static Object A(short s2, BlockState blockState, long l2, Function function) {
        Object r2;
        block5: {
            Object r3;
            I i2;
            long l3;
            block6: {
                long l4;
                long l5;
                block4: {
                    long l6 = l5 = (long)s2 << 48 | l2 << 16 >>> 16;
                    long l7 = l6 ^ 0xF327AEA7231L;
                    l4 = l6 ^ 0x5B0983DDEDBDL;
                    l3 = l6 ^ 0x4A0555B8CC33L;
                    i2 = new I(blockState, true, l7);
                    r3 = function.apply(i2);
                    if (r3 instanceof x) break block4;
                    r2 = r3;
                    if (l2 <= 0L) break block5;
                    if (!(r2 instanceof e)) break block6;
                }
                throw new s(l4, i.a(-873843690 - -29082, 873843690 - (char)-20676, (int)l5));
            }
            i2.z(l3);
            r2 = r3;
        }
        return r2;
    }

    public static void a(long l2, BlockState blockState, Consumer consumer) {
        long l3 = l2;
        long l4 = l3 ^ 0x7DBAD69FE4D2L;
        long l5 = l3 ^ 0x388DF9CD5AD0L;
        I i2 = new I(blockState, true, l4);
        consumer.accept(i2);
        i2.z(l5);
    }

    public static Object i(long l2, Entity entity, Function function) {
        Object r2;
        block5: {
            Object r3;
            block6: {
                long l3;
                block4: {
                    long l4 = l2;
                    long l5 = l4 ^ 0x10D1F96A49AFL;
                    l3 = l4 ^ 0x1C11C990E93EL;
                    long l6 = l4 ^ 0x26501966F5CCL;
                    r3 = function.apply(new R(l5, entity).S(l6));
                    if (r3 instanceof x) break block4;
                    r2 = r3;
                    if (l2 < 0L) break block5;
                    if (!(r2 instanceof e)) break block6;
                }
                throw new s(l3, i.a(-2119664040 + -((char)-8923), 2119664040 + (char)-27003, (int)l2));
            }
            r2 = r3;
        }
        return r2;
    }

    public static Object q(short s2, int n2, BlockState blockState, Function function, int n3) {
        Object r2;
        block5: {
            Object r3;
            block6: {
                long l2;
                long l3;
                block4: {
                    long l4 = l3 = (long)s2 << 48 | (long)n2 << 32 >>> 16 | (long)n3 << 48 >>> 48;
                    long l5 = l4 ^ 0x7963A39EA118L;
                    long l6 = l4 ^ 0x4114A7161C41L;
                    l2 = l4 ^ 0x578D673C7B62L;
                    r3 = function.apply(new I(blockState, l6).P(l5));
                    if (r3 instanceof x) break block4;
                    r2 = r3;
                    if (s2 < 0) break block5;
                    if (!(r2 instanceof e)) break block6;
                }
                throw new s(l2, i.a(789303540 - (char)-25211, -789303540 - -23397, (int)l3));
            }
            r2 = r3;
        }
        return r2;
    }

    public static Object v(ItemStack itemStack, Function function, long l2) {
        Object r2;
        block5: {
            Object r3;
            F f2;
            long l3;
            block6: {
                long l4;
                block4: {
                    long l5 = l2;
                    l3 = l5 ^ 0x2FF0261444C0L;
                    long l6 = l5 ^ 0x35348B495108L;
                    int n2 = (int)(l6 >>> 32);
                    int n3 = (int)(l6 << 32 >>> 48);
                    int n4 = (int)(l6 << 48 >>> 48);
                    long l7 = l5 ^ 0x7C42C2B29E8AL;
                    l4 = l5 ^ 0x3EFCF071654EL;
                    f2 = new F(itemStack, n2, (char)n3, false, false, (short)n4, true);
                    r3 = function.apply(f2);
                    f2.t(l7);
                    if (r3 instanceof x) break block4;
                    r2 = r3;
                    if (l2 <= 0L) break block5;
                    if (!(r2 instanceof e)) break block6;
                }
                throw new s(l4, i.a(-1203353670 + -6775, 1203353670 - 9193, (int)l2));
            }
            f2.z(l3);
            r2 = r3;
        }
        return r2;
    }

    public static void S(ItemStack itemStack, long l2, Consumer consumer, char c2) {
        long l3;
        long l4 = l3 = l2 << 16 | (long)c2 << 48 >>> 48;
        long l5 = l4 ^ 0x1FEF7A52ADA6L;
        long l6 = l4 ^ 0x52BD70FB86EL;
        int n2 = (int)(l6 >>> 32);
        int n3 = (int)(l6 << 32 >>> 48);
        int n4 = (int)(l6 << 48 >>> 48);
        long l7 = l4 ^ 0x4C5D9EF477ECL;
        F f2 = new F(itemStack, n2, (char)n3, false, false, (short)n4, true);
        consumer.accept(f2);
        f2.t(l7);
        f2.z(l5);
    }

    public static Object K(long l2, Entity entity, Function function) {
        Object r2;
        block5: {
            Object r3;
            R r4;
            long l3;
            block6: {
                long l4;
                block4: {
                    long l5 = l2;
                    long l6 = l5 ^ 0x3979E3131751L;
                    long l7 = l5 ^ 0x6F8EDDAFA11BL;
                    long l8 = l5 ^ 0x6DE8D93569C3L;
                    long l9 = l5 ^ 0x6F7438E1A972L;
                    l4 = l5 ^ 0x63B4081B09E3L;
                    l3 = l5 ^ 0x72B8DE7E286DL;
                    long l10 = l5 ^ 0x6F8EDDAFA11BL;
                    r4 = new R(l9, entity);
                    C c2 = new C(r4.h(l10), l8);
                    r3 = function.apply(c2);
                    r4.x(l6, c2.h(l7));
                    if (r3 instanceof x) break block4;
                    r2 = r3;
                    if (l2 < 0L) break block5;
                    if (!(r2 instanceof e)) break block6;
                }
                throw new s(l4, i.a(1076608980 + (char)-32230, -1076608980 + -18236, (int)l2));
            }
            r4.z(l3);
            r2 = r3;
        }
        return r2;
    }

    public static void R(ItemStack itemStack, long l2, Consumer consumer) {
        long l3 = l2;
        long l4 = l3 ^ 0x3482802E7EFCL;
        long l5 = l3 ^ 0x65C530F6801EL;
        long l6 = l3 ^ 0x4C5D53080B4EL;
        long l7 = l3 ^ 0x6B18EAB44BDBL;
        long l8 = l3 ^ 0x311F49C69EF0L;
        if (!r.m(r.MC1_20_R4, l6)) {
            throw new s(l8, i.a(32636430 - 10005, -32636430 - -19955, (int)l2));
        }
        j j2 = i.o(itemStack, l4);
        consumer.accept(j2.m(i.a(32636430 - 10000, 32636430 - 12547, (int)l2), l5));
        ItemStack itemStack2 = i.E(j2, l7);
        itemStack.setItemMeta(itemStack2.getItemMeta());
    }

    public static Object u(ItemStack itemStack, Function function, long l2) {
        long l3 = l2;
        long l4 = l3 ^ 0x77EB3254054FL;
        long l5 = l3 ^ 0x26AC828CFBADL;
        long l6 = l3 ^ 0xF34E17270FDL;
        long l7 = l3 ^ 0x287158CE3068L;
        long l8 = l3 ^ 0x7276FBBCE543L;
        if (!r.m(r.MC1_20_R4, l6)) {
            throw new s(l8, i.a(-1282651020 + -((char)-24788), -1282651020 + -((char)-32451), (int)l2));
        }
        j j2 = i.o(itemStack, l4);
        Object r2 = function.apply(j2.m(i.a(-1282651020 + -((char)-24792), -1282651020 + -((char)-20638), (int)l2), l5));
        ItemStack itemStack2 = i.E(j2, l7);
        itemStack.setItemMeta(itemStack2.getItemMeta());
        return r2;
    }

    public static void X(long l2, ItemStack itemStack, Consumer consumer) {
        long l3 = l2;
        long l4 = l3 ^ 0x73C6AD77276FL;
        long l5 = l3 ^ 0x22811DAFD98DL;
        long l6 = l3 ^ 0xB197E5152DDL;
        long l7 = l3 ^ 0x765B649FC763L;
        if (!r.m(r.MC1_20_R4, l6)) {
            throw new s(l7, i.a(749196120 + (char)-17392, 749327190 - (char)-5569, (int)l2));
        }
        j j2 = i.o(itemStack, l4);
        consumer.accept(j2.m(i.a(749196120 + (char)-17388, 749196120 + (char)-5158, (int)l2), l5));
    }

    public static Object t(short s2, char c2, int n2, ItemStack itemStack, Function function) {
        long l2;
        long l3 = l2 = (long)s2 << 48 | (long)c2 << 48 >>> 16 | (long)n2 << 32 >>> 32;
        long l4 = l3 ^ 0x14E1A27EE18DL;
        long l5 = l3 ^ 0x45A612A61F6FL;
        long l6 = l3 ^ 0x6C3E7158943FL;
        long l7 = l3 ^ 0x117C6B960181L;
        if (!r.m(r.MC1_20_R4, l6)) {
            throw new s(l7, i.a(597810270 - (char)-27948, 597810270 - (char)-21399, (int)l2));
        }
        j j2 = i.o(itemStack, l4);
        return function.apply(j2.m(i.a(597810270 - (char)-27952, 597810270 - 25230, (int)l2), l5));
    }

    public static void K(Entity entity, long l2, Consumer consumer, short s2) {
        long l3;
        long l4 = l3 = l2 << 16 | (long)s2 << 48 >>> 48;
        long l5 = l4 ^ 0x5CE50D417AC3L;
        long l6 = l4 ^ 0xA1233FDCC89L;
        long l7 = l4 ^ 0x87437670451L;
        long l8 = l4 ^ 0xAE8D6B3C4E0L;
        long l9 = l4 ^ 0x1724302C45FFL;
        long l10 = l4 ^ 0xA1233FDCC89L;
        R r2 = new R(l8, entity);
        C c2 = new C(r2.h(l10), l7);
        consumer.accept(c2);
        r2.x(l5, c2.h(l6));
        r2.z(l9);
    }

    public static Object B(Entity entity, long l2, Function function) {
        Object r2;
        block5: {
            Object r3;
            block6: {
                long l3;
                block4: {
                    long l4 = l2;
                    long l5 = l4 ^ 0xF3C020D8931L;
                    l3 = l4 ^ 0x3FC32F729A0L;
                    long l6 = l4 ^ 0x39BDE2013552L;
                    r3 = function.apply(new R(l5, entity).S(l6));
                    if (r3 instanceof x) break block4;
                    r2 = r3;
                    if (l2 < 0L) break block5;
                    if (!(r2 instanceof e)) break block6;
                }
                throw new s(l3, i.a(2059371840 + (char)-9107, -2059371840 + -((char)-24051), (int)l2));
            }
            r2 = r3;
        }
        return r2;
    }

    public static void l(Entity entity, Consumer consumer, long l2) {
        long l3 = l2;
        long l4 = l3 ^ 0x14B0E33B6DE0L;
        long l5 = l3 ^ 0x22310337D183L;
        consumer.accept(new R(l4, entity).S(l5));
    }

    public static Object H(long l2, BlockState blockState, Function function) {
        Object r2;
        block5: {
            Object r3;
            I i2;
            long l3;
            block6: {
                long l4;
                block4: {
                    long l5 = l2;
                    long l6 = l5 ^ 0x327DA3073C19L;
                    long l7 = l5 ^ 0x648A9DBB8A53L;
                    long l8 = l5 ^ 0x66EC9921428BL;
                    long l9 = l5 ^ 0x648A9DBB8A53L;
                    long l10 = l5 ^ 0x7E2988254588L;
                    l4 = l5 ^ 0x68B0480F22ABL;
                    l3 = l5 ^ 0x79BC9E6A0325L;
                    i2 = new I(blockState, l10);
                    C c2 = new C(i2.h(l9), l8);
                    r3 = function.apply(c2);
                    i2.x(l6, c2.h(l7));
                    if (r3 instanceof x) break block4;
                    r2 = r3;
                    if (l2 < 0L) break block5;
                    if (!(r2 instanceof e)) break block6;
                }
                throw new s(l4, i.a(3669960 + 27358, -3669960 + -11392, (int)l2));
            }
            i2.z(l3);
            r2 = r3;
        }
        return r2;
    }

    public static void r(BlockState blockState, Consumer consumer, long l2) {
        long l3 = l2;
        long l4 = l3 ^ 0x1C3D2D741226L;
        long l5 = l3 ^ 0x4ACA13C8A46CL;
        long l6 = l3 ^ 0x48AC17526CB4L;
        long l7 = l3 ^ 0x4ACA13C8A46CL;
        long l8 = l3 ^ 0x506906566BB7L;
        long l9 = l3 ^ 0x57FC10192D1AL;
        I i2 = new I(blockState, l8);
        C c2 = new C(i2.h(l7), l6);
        consumer.accept(c2);
        i2.x(l4, c2.h(l5));
        i2.z(l9);
    }

    public static Object D(BlockState blockState, Function function, long l2) {
        Object r2;
        block5: {
            Object r3;
            block6: {
                long l3;
                block4: {
                    long l4 = l2;
                    long l5 = l4 ^ 0x570E335AAC28L;
                    long l6 = l4 ^ 0x6F7937D21171L;
                    l3 = l4 ^ 0x79E0F7F87652L;
                    r3 = function.apply(new I(blockState, l6).P(l5));
                    if (r3 instanceof x) break block4;
                    r2 = r3;
                    if (l2 < 0L) break block5;
                    if (!(r2 instanceof e)) break block6;
                }
                throw new s(l3, i.a(-1077002190 - -((char)-472), -1077002190 - -((char)-7201), (int)l2));
            }
            r2 = r3;
        }
        return r2;
    }

    public static void F(int n2, BlockState blockState, Consumer consumer, int n3) {
        long l2;
        long l3 = l2 = (long)n2 << 32 | (long)n3 << 32 >>> 32;
        long l4 = l3 ^ 0x592FFDD04D92L;
        long l5 = l3 ^ 0x6158F958F0CBL;
        consumer.accept(new I(blockState, l5).P(l4));
    }

    public static j x(GameProfile gameProfile, long l2) {
        long l3 = l2 ^ 0x4C04144074BCL;
        return k.r(l3, gameProfile);
    }

    public static GameProfile I(x x2, long l2) {
        long l3 = l2 ^ 0x39A9AE2ECBA8L;
        long l4 = l3 >>> 16;
        int n2 = (int)(l3 << 48 >>> 48);
        return k.C((D)x2, l4, (char)n2);
    }

    public static j o(ItemStack itemStack, long l2) {
        long l3 = l2 ^ 0x2C1CF70F3792L;
        return F.P(l3, itemStack);
    }

    @Nullable
    public static ItemStack E(x x2, long l2) {
        long l3 = l2 ^ 0x23DDC4860487L;
        return F.S((D)x2, l3);
    }

    public static j I(ItemStack[] itemStackArray, long l2) {
        long l3 = l2 ^ 0x13CE5B9177F7L;
        return F.t(itemStackArray, l3);
    }

    @Nullable
    public static ItemStack[] Z(x x2, long l2) {
        long l3 = l2 ^ 0x79F5EE4F6C76L;
        return F.V(l3, (D)x2);
    }

    public static j I(long l2) {
        long l3 = l2 ^ 0x55A4DC728853L;
        int n2 = (int)(l3 >>> 32);
        int n3 = (int)(l3 << 32 >>> 48);
        int n4 = (int)(l3 << 48 >>> 48);
        return new C(n2, n3, (short)n4);
    }

    public static j D(short s2, int n2, short s3, String string) {
        long l2 = (long)s2 << 48 | (long)n2 << 32 >>> 16 | (long)s3 << 48 >>> 48;
        long l3 = l2 ^ 0xF94A00CD21EL;
        return new C(l3, string);
    }

    public static j q(InputStream inputStream, long l2) {
        long l3 = l2 ^ 0xFD8694B6620L;
        return new C(l3, inputStream);
    }

    public static j V(long l2, Object object) {
        long l3 = l2 ^ 0x45C4BB1D316EL;
        return new C(object, l3);
    }

    public static h x(File file, long l2) throws IOException {
        long l3 = l2 ^ 0x4B38A16A3389L;
        long l4 = l3 >>> 8;
        int n2 = (int)(l3 << 56 >>> 56);
        return new P(file, l4, (byte)n2);
    }

    public static j i(File file, long l2) throws IOException {
        long l3 = l2 ^ 0x2DEFDA45D247L;
        int n2 = (int)(l3 >>> 32);
        int n3 = (int)(l3 << 32 >>> 48);
        int n4 = (int)(l3 << 48 >>> 48);
        return P.X(n2, n3, (short)n4, file);
    }

    public static void w(long l2, File file, j j2) throws IOException {
        long l3 = l2 ^ 0x14EBD2C9CD4AL;
        P.Q(file, l3, (D)j2);
    }

    public static VV m(ItemStack itemStack, short s2, short s3, int n2, Class clazz) {
        long l2;
        long l3 = l2 = (long)s2 << 48 | (long)s3 << 48 >>> 16 | (long)n2 << 32 >>> 32;
        long l4 = l3 ^ 0x42799BB27F7BL;
        long l5 = l3 ^ 0x5021ECCE05B0L;
        int n3 = (int)(l5 >>> 32);
        int n4 = (int)(l5 << 32 >>> 48);
        int n5 = (int)(l5 << 48 >>> 48);
        return new B(l4, new F(itemStack, n3, (char)n4, false, true, (short)n5, false), clazz).D().c();
    }

    public static VV C(long l2, Entity entity, Class clazz) {
        long l3 = l2;
        long l4 = l3 ^ 0x5072ADEEA6FBL;
        long l5 = l3 ^ 0x711136DE08ECL;
        return new B(l4, new R(entity, l5, true), clazz).D().c();
    }

    public static VV S(long l2, BlockState blockState, Class clazz) {
        long l3 = l2;
        long l4 = l3 ^ 0x322F22A4081CL;
        long l5 = l3 ^ 0x7F84D7D7D91DL;
        return new B(l4, new I(blockState, true, l5), clazz).D().c();
    }

    public static Object I(ItemStack itemStack, Class clazz, Function function, long l2) {
        Object r2;
        block5: {
            Object r3;
            F f2;
            long l3;
            block6: {
                long l4;
                block4: {
                    long l5 = l2;
                    long l6 = l5 ^ 0x34E8F114819BL;
                    l3 = l5 ^ 0x3C742B35EE98L;
                    long l7 = l5 ^ 0x26B08668FB50L;
                    int n2 = (int)(l7 >>> 32);
                    int n3 = (int)(l7 << 32 >>> 48);
                    int n4 = (int)(l7 << 48 >>> 48);
                    long l8 = l5 ^ 0x6FC6CF9334D2L;
                    l4 = l5 ^ 0x2D78FD50CF16L;
                    f2 = new F(itemStack, n2, (char)n3, false, false, (short)n4, true);
                    r3 = function.apply(new B(l6, f2, clazz).c());
                    f2.t(l8);
                    if (r3 instanceof x) break block4;
                    r2 = r3;
                    if (l2 <= 0L) break block5;
                    if (!(r2 instanceof e)) break block6;
                }
                throw new s(l4, i.a(-1251456360 + -((char)-15491), 1251456360 + (char)-30563, (int)l2));
            }
            f2.z(l3);
            r2 = r3;
        }
        return r2;
    }

    public static void W(ItemStack itemStack, Class clazz, long l2, Consumer consumer) {
        long l3 = l2;
        long l4 = l3 ^ 0x4D62D712EBC8L;
        long l5 = l3 ^ 0x45FE0D3384CBL;
        long l6 = l3 ^ 0x5F3AA06E9103L;
        int n2 = (int)(l6 >>> 32);
        int n3 = (int)(l6 << 32 >>> 48);
        int n4 = (int)(l6 << 48 >>> 48);
        long l7 = l3 ^ 0x164CE9955E81L;
        F f2 = new F(itemStack, n2, (char)n3, false, false, (short)n4, true);
        consumer.accept(new B(l4, f2, clazz).c());
        f2.t(l7);
        f2.z(l5);
    }

    public static void b(long l2, Entity entity, Class clazz, Consumer consumer) {
        long l3 = l2;
        long l4 = l3 ^ 0x53D744051109L;
        long l5 = l3 ^ 0x108AA3494136L;
        long l6 = l3 ^ 0x467D9DF5F77CL;
        long l7 = l3 ^ 0x441B996F3FA4L;
        long l8 = l3 ^ 0x468778BBFF15L;
        long l9 = l3 ^ 0x467D9DF5F77CL;
        long l10 = l3 ^ 0x5B4B9E247E0AL;
        R r2 = new R(l8, entity);
        C c2 = new C(r2.h(l9), l7);
        consumer.accept(new B(l4, c2, clazz).c());
        r2.x(l5, c2.h(l6));
        c2.z(l10);
    }

    public static Object P(Entity entity, Class clazz, Function function, long l2) {
        long l3 = l2;
        long l4 = l3 ^ 0x5190277BCAAAL;
        long l5 = l3 ^ 0x12CDC0379A95L;
        long l6 = l3 ^ 0x443AFE8B2CDFL;
        long l7 = l3 ^ 0x465CFA11E407L;
        long l8 = l3 ^ 0x44C01BC524B6L;
        long l9 = l3 ^ 0x443AFE8B2CDFL;
        long l10 = l3 ^ 0x590CFD5AA5A9L;
        R r2 = new R(l8, entity);
        C c2 = new C(r2.h(l9), l7);
        Object r3 = function.apply(new B(l4, c2, clazz).c());
        r2.x(l5, c2.h(l6));
        c2.z(l10);
        return r3;
    }

    public static void r(BlockState blockState, long l2, Class clazz, Consumer consumer) {
        long l3 = l2;
        long l4 = l3 ^ 0xFEBBEC781B0L;
        long l5 = l3 ^ 0x4CB6598BD18FL;
        long l6 = l3 ^ 0x182763ADAF1DL;
        long l7 = l3 ^ 0x1A41673767C5L;
        long l8 = l3 ^ 0xE272A9A81EL;
        long l9 = l3 ^ 0x77764E6EEB3L;
        I i2 = new I(blockState, l8);
        C c2 = new C(i2.h(l7), l6);
        consumer.accept(new B(l4, c2, clazz).c());
        i2.x(l5, c2);
        c2.z(l9);
    }

    public static Object y(BlockState blockState, long l2, Class clazz, Function function) {
        long l3 = l2;
        long l4 = l3 ^ 0x4F869536C4F9L;
        long l5 = l3 ^ 0xCDB727A94C6L;
        long l6 = l3 ^ 0x584A485CEA54L;
        long l7 = l3 ^ 0x5A2C4CC6228CL;
        long l8 = l3 ^ 0x408F5958ED57L;
        long l9 = l3 ^ 0x471A4F17ABFAL;
        I i2 = new I(blockState, l8);
        C c2 = new C(i2.h(l7), l6);
        Object r2 = function.apply(new B(l4, c2, clazz).c());
        i2.x(l5, c2);
        c2.z(l9);
        return r2;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block20: {
            block19: {
                var5 = new String[7];
                var3_1 = 0;
                var2_2 = "\u00ab$\u00859P\u0007b\u0001\u0099\u00f2\u0099x\u00e4l'#b\u00ee\u0083f\u00b0\u00d6D\u00e6h\u0080\u00ff4\u00a0\u00d7\u0088\u000b\u0096\u00f1I$Oi\u00dcUTt\u0083\u00dcDou\u00f6\u00ad\u00b9B\u001b^R\u00fdH\u00b5\u00df=\u00f0\u0093\u00df\u0098\u00937\u00a9#\\\u008a\u00dd\u00da\u00c0#\u0085\u00aa@\u00e8\u00e8=uF{\u001a\u00c5eo\u00cfVWL`F\u00b7\b\u00ecS\u00a1\u008ah\u00a3)+t\u00f9\u007f\u00b8\u007f\u008c<\u009e\u00f6#,\u00c0<\u00ab\u0093I\u0089\n\u0000D\u00e4\u00fekc\u0083\u00e4\u0019\u00a9\u00e3\u0003\u0099\u0015\u00fbm\u0013\u007fp{\u008fA\u00ea\u00db\u00e5^\r\u00c8\u00b60\u00de\u009b\tv(\u0094\u0019$3wG\u0096F/\u00a6\u00c2\u00df\u00f8\u000f\nA\u009b\r*\u008a\u0005\u009f8:\u0090";
                var4_3 = "\u00ab$\u00859P\u0007b\u0001\u0099\u00f2\u0099x\u00e4l'#b\u00ee\u0083f\u00b0\u00d6D\u00e6h\u0080\u00ff4\u00a0\u00d7\u0088\u000b\u0096\u00f1I$Oi\u00dcUTt\u0083\u00dcDou\u00f6\u00ad\u00b9B\u001b^R\u00fdH\u00b5\u00df=\u00f0\u0093\u00df\u0098\u00937\u00a9#\\\u008a\u00dd\u00da\u00c0#\u0085\u00aa@\u00e8\u00e8=uF{\u001a\u00c5eo\u00cfVWL`F\u00b7\b\u00ecS\u00a1\u008ah\u00a3)+t\u00f9\u007f\u00b8\u007f\u008c<\u009e\u00f6#,\u00c0<\u00ab\u0093I\u0089\n\u0000D\u00e4\u00fekc\u0083\u00e4\u0019\u00a9\u00e3\u0003\u0099\u0015\u00fbm\u0013\u007fp{\u008fA\u00ea\u00db\u00e5^\r\u00c8\u00b60\u00de\u009b\tv(\u0094\u0019$3wG\u0096F/\u00a6\u00c2\u00df\u00f8\u000f\nA\u009b\r*\u008a\u0005\u009f8:\u0090".length();
                var1_4 = 35;
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
                    var2_2 = "<\u00c7\u00a2\u00a1\u007ft!\u0016\u00edU<\u00aa\u00bf\u00a5\u0005\u0010\u0019\u00b17\n\u001db\u0092I\u00b6_!W\u00cab0y\u00c6\u0019=Vo\u0005\u0081r\"\u00da\u00c5u\u00a3]\u00cc\u008e(\u00d2\u0012sJ\u00f3\u009b{z5S\u0010z\u00f1nFc5\u0002\u0081K\u0090\u009d";
                    var4_3 = "<\u00c7\u00a2\u00a1\u007ft!\u0016\u00edU<\u00aa\u00bf\u00a5\u0005\u0010\u0019\u00b17\n\u001db\u0092I\u00b6_!W\u00cab0y\u00c6\u0019=Vo\u0005\u0081r\"\u00da\u00c5u\u00a3]\u00cc\u008e(\u00d2\u0012sJ\u00f3\u009b{z5S\u0010z\u00f1nFc5\u0002\u0081K\u0090\u009d".length();
                    var1_4 = 10;
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
                            v13 = 91;
                            break;
                        }
                        case 1: {
                            v13 = 85;
                            break;
                        }
                        case 2: {
                            v13 = 44;
                            break;
                        }
                        case 3: {
                            v13 = 1;
                            break;
                        }
                        case 4: {
                            v13 = 1;
                            break;
                        }
                        case 5: {
                            v13 = 112;
                            break;
                        }
                        default: {
                            v13 = 9;
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
        i.a = var5;
        i.b = new String[7];
    }

    private static String a(int n2, int n3, int n4) {
        int n5 = (n2 ^ n4 ^ 0xFFFFA230) & 0xFFFF;
        if (b[n5] == null) {
            int n6;
            int n7;
            char[] cArray = a[n5].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n7 = 41;
                    break;
                }
                case 1: {
                    n7 = 236;
                    break;
                }
                case 2: {
                    n7 = 127;
                    break;
                }
                case 3: {
                    n7 = 2;
                    break;
                }
                case 4: {
                    n7 = 57;
                    break;
                }
                case 5: {
                    n7 = 75;
                    break;
                }
                case 6: {
                    n7 = 168;
                    break;
                }
                case 7: {
                    n7 = 199;
                    break;
                }
                case 8: {
                    n7 = 42;
                    break;
                }
                case 9: {
                    n7 = 140;
                    break;
                }
                case 10: {
                    n7 = 63;
                    break;
                }
                case 11: {
                    n7 = 128;
                    break;
                }
                case 12: {
                    n7 = 53;
                    break;
                }
                case 13: {
                    n7 = 59;
                    break;
                }
                case 14: {
                    n7 = 15;
                    break;
                }
                case 15: {
                    n7 = 70;
                    break;
                }
                case 16: {
                    n7 = 252;
                    break;
                }
                case 17: {
                    n7 = 82;
                    break;
                }
                case 18: {
                    n7 = 20;
                    break;
                }
                case 19: {
                    n7 = 195;
                    break;
                }
                case 20: {
                    n7 = 212;
                    break;
                }
                case 21: {
                    n7 = 220;
                    break;
                }
                case 22: {
                    n7 = 147;
                    break;
                }
                case 23: {
                    n7 = 120;
                    break;
                }
                case 24: {
                    n7 = 144;
                    break;
                }
                case 25: {
                    n7 = 182;
                    break;
                }
                case 26: {
                    n7 = 241;
                    break;
                }
                case 27: {
                    n7 = 208;
                    break;
                }
                case 28: {
                    n7 = 211;
                    break;
                }
                case 29: {
                    n7 = 136;
                    break;
                }
                case 30: {
                    n7 = 203;
                    break;
                }
                case 31: {
                    n7 = 134;
                    break;
                }
                case 32: {
                    n7 = 52;
                    break;
                }
                case 33: {
                    n7 = 145;
                    break;
                }
                case 34: {
                    n7 = 32;
                    break;
                }
                case 35: {
                    n7 = 165;
                    break;
                }
                case 36: {
                    n7 = 33;
                    break;
                }
                case 37: {
                    n7 = 77;
                    break;
                }
                case 38: {
                    n7 = 114;
                    break;
                }
                case 39: {
                    n7 = 29;
                    break;
                }
                case 40: {
                    n7 = 190;
                    break;
                }
                case 41: {
                    n7 = 251;
                    break;
                }
                case 42: {
                    n7 = 214;
                    break;
                }
                case 43: {
                    n7 = 47;
                    break;
                }
                case 44: {
                    n7 = 119;
                    break;
                }
                case 45: {
                    n7 = 64;
                    break;
                }
                case 46: {
                    n7 = 80;
                    break;
                }
                case 47: {
                    n7 = 56;
                    break;
                }
                case 48: {
                    n7 = 215;
                    break;
                }
                case 49: {
                    n7 = 132;
                    break;
                }
                case 50: {
                    n7 = 36;
                    break;
                }
                case 51: {
                    n7 = 66;
                    break;
                }
                case 52: {
                    n7 = 113;
                    break;
                }
                case 53: {
                    n7 = 61;
                    break;
                }
                case 54: {
                    n7 = 126;
                    break;
                }
                case 55: {
                    n7 = 40;
                    break;
                }
                case 56: {
                    n7 = 169;
                    break;
                }
                case 57: {
                    n7 = 19;
                    break;
                }
                case 58: {
                    n7 = 158;
                    break;
                }
                case 59: {
                    n7 = 228;
                    break;
                }
                case 60: {
                    n7 = 122;
                    break;
                }
                case 61: {
                    n7 = 14;
                    break;
                }
                case 62: {
                    n7 = 16;
                    break;
                }
                case 63: {
                    n7 = 191;
                    break;
                }
                case 64: {
                    n7 = 10;
                    break;
                }
                case 65: {
                    n7 = 216;
                    break;
                }
                case 66: {
                    n7 = 130;
                    break;
                }
                case 67: {
                    n7 = 176;
                    break;
                }
                case 68: {
                    n7 = 222;
                    break;
                }
                case 69: {
                    n7 = 125;
                    break;
                }
                case 70: {
                    n7 = 34;
                    break;
                }
                case 71: {
                    n7 = 207;
                    break;
                }
                case 72: {
                    n7 = 146;
                    break;
                }
                case 73: {
                    n7 = 4;
                    break;
                }
                case 74: {
                    n7 = 43;
                    break;
                }
                case 75: {
                    n7 = 9;
                    break;
                }
                case 76: {
                    n7 = 196;
                    break;
                }
                case 77: {
                    n7 = 6;
                    break;
                }
                case 78: {
                    n7 = 8;
                    break;
                }
                case 79: {
                    n7 = 104;
                    break;
                }
                case 80: {
                    n7 = 226;
                    break;
                }
                case 81: {
                    n7 = 7;
                    break;
                }
                case 82: {
                    n7 = 68;
                    break;
                }
                case 83: {
                    n7 = 161;
                    break;
                }
                case 84: {
                    n7 = 69;
                    break;
                }
                case 85: {
                    n7 = 108;
                    break;
                }
                case 86: {
                    n7 = 112;
                    break;
                }
                case 87: {
                    n7 = 48;
                    break;
                }
                case 88: {
                    n7 = 133;
                    break;
                }
                case 89: {
                    n7 = 253;
                    break;
                }
                case 90: {
                    n7 = 67;
                    break;
                }
                case 91: {
                    n7 = 172;
                    break;
                }
                case 92: {
                    n7 = 153;
                    break;
                }
                case 93: {
                    n7 = 118;
                    break;
                }
                case 94: {
                    n7 = 245;
                    break;
                }
                case 95: {
                    n7 = 93;
                    break;
                }
                case 96: {
                    n7 = 255;
                    break;
                }
                case 97: {
                    n7 = 73;
                    break;
                }
                case 98: {
                    n7 = 94;
                    break;
                }
                case 99: {
                    n7 = 24;
                    break;
                }
                case 100: {
                    n7 = 3;
                    break;
                }
                case 101: {
                    n7 = 22;
                    break;
                }
                case 102: {
                    n7 = 92;
                    break;
                }
                case 103: {
                    n7 = 188;
                    break;
                }
                case 104: {
                    n7 = 240;
                    break;
                }
                case 105: {
                    n7 = 81;
                    break;
                }
                case 106: {
                    n7 = 85;
                    break;
                }
                case 107: {
                    n7 = 175;
                    break;
                }
                case 108: {
                    n7 = 87;
                    break;
                }
                case 109: {
                    n7 = 248;
                    break;
                }
                case 110: {
                    n7 = 162;
                    break;
                }
                case 111: {
                    n7 = 237;
                    break;
                }
                case 112: {
                    n7 = 202;
                    break;
                }
                case 113: {
                    n7 = 111;
                    break;
                }
                case 114: {
                    n7 = 205;
                    break;
                }
                case 115: {
                    n7 = 123;
                    break;
                }
                case 116: {
                    n7 = 12;
                    break;
                }
                case 117: {
                    n7 = 135;
                    break;
                }
                case 118: {
                    n7 = 201;
                    break;
                }
                case 119: {
                    n7 = 5;
                    break;
                }
                case 120: {
                    n7 = 51;
                    break;
                }
                case 121: {
                    n7 = 238;
                    break;
                }
                case 122: {
                    n7 = 155;
                    break;
                }
                case 123: {
                    n7 = 129;
                    break;
                }
                case 124: {
                    n7 = 250;
                    break;
                }
                case 125: {
                    n7 = 84;
                    break;
                }
                case 126: {
                    n7 = 143;
                    break;
                }
                case 127: {
                    n7 = 139;
                    break;
                }
                case 128: {
                    n7 = 233;
                    break;
                }
                case 129: {
                    n7 = 142;
                    break;
                }
                case 130: {
                    n7 = 187;
                    break;
                }
                case 131: {
                    n7 = 35;
                    break;
                }
                case 132: {
                    n7 = 26;
                    break;
                }
                case 133: {
                    n7 = 18;
                    break;
                }
                case 134: {
                    n7 = 109;
                    break;
                }
                case 135: {
                    n7 = 97;
                    break;
                }
                case 136: {
                    n7 = 235;
                    break;
                }
                case 137: {
                    n7 = 150;
                    break;
                }
                case 138: {
                    n7 = 45;
                    break;
                }
                case 139: {
                    n7 = 232;
                    break;
                }
                case 140: {
                    n7 = 239;
                    break;
                }
                case 141: {
                    n7 = 30;
                    break;
                }
                case 142: {
                    n7 = 60;
                    break;
                }
                case 143: {
                    n7 = 254;
                    break;
                }
                case 144: {
                    n7 = 95;
                    break;
                }
                case 145: {
                    n7 = 218;
                    break;
                }
                case 146: {
                    n7 = 39;
                    break;
                }
                case 147: {
                    n7 = 74;
                    break;
                }
                case 148: {
                    n7 = 223;
                    break;
                }
                case 149: {
                    n7 = 44;
                    break;
                }
                case 150: {
                    n7 = 13;
                    break;
                }
                case 151: {
                    n7 = 83;
                    break;
                }
                case 152: {
                    n7 = 209;
                    break;
                }
                case 153: {
                    n7 = 229;
                    break;
                }
                case 154: {
                    n7 = 246;
                    break;
                }
                case 155: {
                    n7 = 91;
                    break;
                }
                case 156: {
                    n7 = 183;
                    break;
                }
                case 157: {
                    n7 = 200;
                    break;
                }
                case 158: {
                    n7 = 137;
                    break;
                }
                case 159: {
                    n7 = 167;
                    break;
                }
                case 160: {
                    n7 = 102;
                    break;
                }
                case 161: {
                    n7 = 244;
                    break;
                }
                case 162: {
                    n7 = 49;
                    break;
                }
                case 163: {
                    n7 = 198;
                    break;
                }
                case 164: {
                    n7 = 194;
                    break;
                }
                case 165: {
                    n7 = 149;
                    break;
                }
                case 166: {
                    n7 = 86;
                    break;
                }
                case 167: {
                    n7 = 78;
                    break;
                }
                case 168: {
                    n7 = 17;
                    break;
                }
                case 169: {
                    n7 = 227;
                    break;
                }
                case 170: {
                    n7 = 179;
                    break;
                }
                case 171: {
                    n7 = 221;
                    break;
                }
                case 172: {
                    n7 = 65;
                    break;
                }
                case 173: {
                    n7 = 28;
                    break;
                }
                case 174: {
                    n7 = 46;
                    break;
                }
                case 175: {
                    n7 = 157;
                    break;
                }
                case 176: {
                    n7 = 11;
                    break;
                }
                case 177: {
                    n7 = 174;
                    break;
                }
                case 178: {
                    n7 = 189;
                    break;
                }
                case 179: {
                    n7 = 25;
                    break;
                }
                case 180: {
                    n7 = 192;
                    break;
                }
                case 181: {
                    n7 = 105;
                    break;
                }
                case 182: {
                    n7 = 89;
                    break;
                }
                case 183: {
                    n7 = 184;
                    break;
                }
                case 184: {
                    n7 = 197;
                    break;
                }
                case 185: {
                    n7 = 181;
                    break;
                }
                case 186: {
                    n7 = 148;
                    break;
                }
                case 187: {
                    n7 = 219;
                    break;
                }
                case 188: {
                    n7 = 159;
                    break;
                }
                case 189: {
                    n7 = 0;
                    break;
                }
                case 190: {
                    n7 = 234;
                    break;
                }
                case 191: {
                    n7 = 62;
                    break;
                }
                case 192: {
                    n7 = 230;
                    break;
                }
                case 193: {
                    n7 = 90;
                    break;
                }
                case 194: {
                    n7 = 151;
                    break;
                }
                case 195: {
                    n7 = 242;
                    break;
                }
                case 196: {
                    n7 = 96;
                    break;
                }
                case 197: {
                    n7 = 231;
                    break;
                }
                case 198: {
                    n7 = 154;
                    break;
                }
                case 199: {
                    n7 = 72;
                    break;
                }
                case 200: {
                    n7 = 23;
                    break;
                }
                case 201: {
                    n7 = 79;
                    break;
                }
                case 202: {
                    n7 = 55;
                    break;
                }
                case 203: {
                    n7 = 247;
                    break;
                }
                case 204: {
                    n7 = 178;
                    break;
                }
                case 205: {
                    n7 = 101;
                    break;
                }
                case 206: {
                    n7 = 180;
                    break;
                }
                case 207: {
                    n7 = 173;
                    break;
                }
                case 208: {
                    n7 = 138;
                    break;
                }
                case 209: {
                    n7 = 177;
                    break;
                }
                case 210: {
                    n7 = 121;
                    break;
                }
                case 211: {
                    n7 = 210;
                    break;
                }
                case 212: {
                    n7 = 37;
                    break;
                }
                case 213: {
                    n7 = 170;
                    break;
                }
                case 214: {
                    n7 = 186;
                    break;
                }
                case 215: {
                    n7 = 1;
                    break;
                }
                case 216: {
                    n7 = 206;
                    break;
                }
                case 217: {
                    n7 = 76;
                    break;
                }
                case 218: {
                    n7 = 243;
                    break;
                }
                case 219: {
                    n7 = 160;
                    break;
                }
                case 220: {
                    n7 = 115;
                    break;
                }
                case 221: {
                    n7 = 217;
                    break;
                }
                case 222: {
                    n7 = 164;
                    break;
                }
                case 223: {
                    n7 = 103;
                    break;
                }
                case 224: {
                    n7 = 163;
                    break;
                }
                case 225: {
                    n7 = 193;
                    break;
                }
                case 226: {
                    n7 = 225;
                    break;
                }
                case 227: {
                    n7 = 38;
                    break;
                }
                case 228: {
                    n7 = 213;
                    break;
                }
                case 229: {
                    n7 = 204;
                    break;
                }
                case 230: {
                    n7 = 31;
                    break;
                }
                case 231: {
                    n7 = 185;
                    break;
                }
                case 232: {
                    n7 = 88;
                    break;
                }
                case 233: {
                    n7 = 156;
                    break;
                }
                case 234: {
                    n7 = 249;
                    break;
                }
                case 235: {
                    n7 = 27;
                    break;
                }
                case 236: {
                    n7 = 21;
                    break;
                }
                case 237: {
                    n7 = 224;
                    break;
                }
                case 238: {
                    n7 = 99;
                    break;
                }
                case 239: {
                    n7 = 124;
                    break;
                }
                case 240: {
                    n7 = 171;
                    break;
                }
                case 241: {
                    n7 = 131;
                    break;
                }
                case 242: {
                    n7 = 152;
                    break;
                }
                case 243: {
                    n7 = 71;
                    break;
                }
                case 244: {
                    n7 = 98;
                    break;
                }
                case 245: {
                    n7 = 107;
                    break;
                }
                case 246: {
                    n7 = 50;
                    break;
                }
                case 247: {
                    n7 = 100;
                    break;
                }
                case 248: {
                    n7 = 106;
                    break;
                }
                case 249: {
                    n7 = 110;
                    break;
                }
                case 250: {
                    n7 = 54;
                    break;
                }
                case 251: {
                    n7 = 141;
                    break;
                }
                case 252: {
                    n7 = 117;
                    break;
                }
                case 253: {
                    n7 = 116;
                    break;
                }
                case 254: {
                    n7 = 166;
                    break;
                }
                default: {
                    n7 = 58;
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
            i.b[n5] = new String(cArray).intern();
        }
        return b[n5];
    }
}

