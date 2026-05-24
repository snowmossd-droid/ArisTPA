/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.Bukkit
 *  org.bukkit.block.BlockState
 *  org.bukkit.entity.Entity
 *  org.bukkit.inventory.ItemStack
 *  org.bukkit.inventory.meta.ItemMeta
 */
package me.serbob.donuttp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import me.serbob.donuttp.A;
import me.serbob.donuttp.C;
import me.serbob.donuttp.D;
import me.serbob.donuttp.H;
import me.serbob.donuttp.T;
import me.serbob.donuttp.U;
import me.serbob.donuttp.VD;
import me.serbob.donuttp.VJ;
import me.serbob.donuttp.VR;
import me.serbob.donuttp.V_;
import me.serbob.donuttp.Vh;
import me.serbob.donuttp.Vi;
import me.serbob.donuttp.W;
import me.serbob.donuttp.c;
import me.serbob.donuttp.d;
import me.serbob.donuttp.i8;
import me.serbob.donuttp.n;
import me.serbob.donuttp.o;
import me.serbob.donuttp.p;
import me.serbob.donuttp.r;
import me.serbob.donuttp.s;
import me.serbob.donuttp.v;
import org.bukkit.Bukkit;
import org.bukkit.block.BlockState;
import org.bukkit.entity.Entity;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class f {
    private static Field I;
    private static Field X;
    private static Object Z;
    private static Object d;
    private static final C N;
    private static final String[] a;
    private static final String[] b;
    private static final long c;

    private f() {
    }

    public static Object r(long l2, Entity entity) {
        long l3 = l2;
        long l4 = l3 ^ 0x1AD7BBE115BCL;
        long l5 = l3 ^ 0x58BCE0901052L;
        try {
            return me.serbob.donuttp.d.CRAFT_ENTITY_GET_HANDLE.R(l4, me.serbob.donuttp.c.CRAFT_ENTITY.E().cast(entity), new Object[0]);
        }
        catch (Exception exception) {
            throw new s(f.a(246542670 - (char)-6316, 246542670 - (char)-27632, (int)l2), exception, l5);
        }
    }

    public static Object u(InputStream inputStream, long l2, byte by) {
        long l3;
        long l4 = l3 = l2 << 8 | (long)by << 56 >>> 56;
        long l5 = l4 ^ 0x65E6596C1CF8L;
        long l6 = l4 ^ 0x524BEC58BDAL;
        long l7 = l4 ^ 0x278D021D1916L;
        try {
            if (r.m(r.MC1_20_R3, l6)) {
                return me.serbob.donuttp.d.NBTFILE_READV2.R(l5, null, inputStream, me.serbob.donuttp.d.NBTACCOUNTER_CREATE_UNLIMITED.R(l5, null, new Object[0]));
            }
            return me.serbob.donuttp.d.NBTFILE_READ.R(l5, null, inputStream);
        }
        catch (Exception exception) {
            try {
                inputStream.close();
            }
            catch (IOException iOException) {
                // empty catch block
            }
            throw new s(f.a(-331607100 + -4903, 331607100 - 12144, (int)l3), exception, l7);
        }
    }

    public static Object K(Object object, OutputStream outputStream, long l2) {
        long l3 = l2;
        long l4 = l3 ^ 0x401444DE896CL;
        long l5 = l3 ^ 0x27F1FAF8C82L;
        try {
            return me.serbob.donuttp.d.NBTFILE_WRITE.R(l4, null, object, outputStream);
        }
        catch (Exception exception) {
            throw new s(f.a(-242348430 - -((char)-31083), 242348430 - (char)-7226, (int)l2), exception, l5);
        }
    }

    public static Object Z(ItemStack itemStack, short s2, int n2, char c2) {
        long l2 = (long)s2 << 48 | (long)n2 << 32 >>> 16 | (long)c2 << 48 >>> 48;
        long l3 = l2 ^ 0x7722C1158F31L;
        try {
            return X.get(itemStack);
        }
        catch (IllegalAccessException | IllegalArgumentException exception) {
            throw new s(f.a(791924940 + (char)-14874, -791924940 + -((char)-7893), (int)l2) + itemStack.getClass(), exception, l3);
        }
    }

    public static void k(D d2, OutputStream outputStream, long l2) {
        long l3 = l2;
        long l4 = l3 ^ 0x2FD0A6AC1FL;
        long l5 = l3 ^ 0x30AB474B9773L;
        long l6 = l3 ^ 0x42448BD7A9F1L;
        try {
            Object object = d2.g(l5);
            if (object == null) {
                object = me.serbob.donuttp.c.NMS_NBTTAGCOMPOUND.E().newInstance();
            }
            me.serbob.donuttp.d.NBTFILE_WRITE.R(l4, null, object, outputStream);
        }
        catch (Exception exception) {
            throw new s(f.a(1710725640 - (char)-5718, -1710725640 - -((char)-24748), (int)l2), exception, l6);
        }
    }

    public static Object L(Object object, int n2, char c2, int n3) {
        long l2;
        long l3 = l2 = (long)n2 << 32 | (long)c2 << 48 >>> 32 | (long)n3 << 48 >>> 48;
        long l4 = l3 ^ 0x79AB5E43B9BBL;
        long l5 = l3 ^ 0x1969B9EA2E99L;
        long l6 = l3 ^ 0x3BC00532BC55L;
        try {
            if (r.m(r.MC1_20_R4, l5)) {
                Object object2;
                Object object3 = object2 = me.serbob.donuttp.d.NMSDATACOMPONENTHOLDER_GET.R(l4, object, Z);
                if (n2 >= 0) {
                    if (object3 == null) {
                        return null;
                    }
                    object3 = me.serbob.donuttp.d.NMSCUSTOMDATA_GETCOPY.R(l4, object2, new Object[0]);
                }
                return object3;
            }
            Object object4 = me.serbob.donuttp.d.NMSITEM_GETTAG.R(l4, object, new Object[0]);
            return object4;
        }
        catch (Exception exception) {
            throw new s(f.a(-351005460 + -28446, -351005460 + -((char)-28566), (int)l2), exception, l6);
        }
    }

    public static void v(Object object, long l2, Object object2) {
        block9: {
            long l3;
            block6: {
                block7: {
                    Object object3;
                    long l4;
                    block8: {
                        long l5 = l2;
                        l3 = l5 ^ 0x45823670AEA4L;
                        long l6 = l5 ^ 0x2540D1D93986L;
                        l4 = l5 ^ 0x1A1D86ED1AF8L;
                        if (!r.m(r.MC1_20_R4, l6)) break block6;
                        object3 = object2;
                        if (l2 <= 0L) break block7;
                        if (object3 != null) break block8;
                        me.serbob.donuttp.d.NMSITEM_SET.R(l3, object, Z, null);
                        break block9;
                    }
                    Object[] objectArray = new Object[2];
                    objectArray[0] = Z;
                    objectArray[1] = v.NMS_CUSTOMDATA.h(l4, object2);
                    object3 = me.serbob.donuttp.d.NMSITEM_SET.R(l3, object, objectArray);
                }
                if (l2 >= 0L) break block9;
            }
            me.serbob.donuttp.d.ITEMSTACK_SET_TAG.R(l3, object, object2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Object d(D d2, long l2) {
        long l3 = l2;
        long l4 = l3 ^ 0x5951CD552747L;
        long l5 = l3 ^ 0x4A50238A113FL;
        long l6 = l3 ^ 0x39932AFCB065L;
        long l7 = l3 ^ 0x6CE7DC8931BL;
        long l8 = l3 ^ 0x48EBE5868D23L;
        long l9 = l3 ^ 0x724D8F36E2D1L;
        long l10 = l3 ^ 0x468E92E4AD37L;
        long l11 = l3 ^ 0x4C9C76118B8DL;
        long l12 = l3 ^ 0x11D542930B09L;
        int n2 = (int)(l12 >>> 48);
        int n3 = (int)(l12 << 16 >>> 32);
        int n4 = (int)(l12 << 48 >>> 48);
        long l13 = l3 ^ 0x1B3A962422A9L;
        try {
            Object object;
            block9: {
                Object object2;
                block12: {
                    block13: {
                        long l14;
                        Object object3;
                        block10: {
                            block11: {
                                object = f.Z((short)n2, n3, (short)n4, d2.h(l8), d2);
                                if (!r.m(r.MC1_20_R4, l6)) break block9;
                                object3 = d2;
                                l14 = l9;
                                if (l2 < 0L) break block10;
                                if (((D)object3).k(l14, f.a(2013628410 - 19644, -2013628410 - -3481, (int)l2))) break block11;
                                object2 = d2;
                                if (l2 <= 0L) break block12;
                                if (!((D)object2).k(l9, f.a(2013628410 - 19670, -2013628410 - -5547, (int)l2))) break block13;
                            }
                            object3 = object;
                            l14 = c;
                        }
                        object = W.L(object3, (int)l14, l5, W.S(l10));
                    }
                    object2 = me.serbob.donuttp.d.NMSITEM_LOAD.R(l4, null, d, object);
                }
                return object2;
            }
            Object object4 = r.M(l11);
            if (l2 >= 0L) {
                if (object4.o() >= r.MC1_11_R1.o()) {
                    return v.NMS_COMPOUNDFROMITEM.h(l7, object);
                }
                object4 = me.serbob.donuttp.d.NMSITEM_CREATESTACK.R(l4, null, object);
            }
            return object4;
        }
        catch (Exception exception) {
            throw new s(f.a(2013628410 - 19704, 2013628410 - 5191, (int)l2), exception, l13);
        }
    }

    public static C r(Object object, long l2, byte by) {
        long l3;
        long l4 = l3 = l2 << 8 | (long)by << 56 >>> 56;
        long l5 = l4 ^ 0x70A2EAFEA609L;
        long l6 = l4 ^ 0x10600D57312BL;
        long l7 = l4 ^ 0x2F3D5A631255L;
        long l8 = l4 ^ 0x637EC6B7C4B5L;
        long l9 = l4 ^ 0x32C9B18FA3E7L;
        try {
            if (r.m(r.MC1_20_R4, l6)) {
                return new C(me.serbob.donuttp.d.NMSITEM_SAVE_MODERN.R(l5, object, d), l8);
            }
            Object[] objectArray = new Object[1];
            objectArray[0] = v.NMS_NBTTAGCOMPOUND.h(l7, new Object[0]);
            Object object2 = me.serbob.donuttp.d.NMSITEM_SAVE.R(l5, object, objectArray);
            return new C(object2, l8);
        }
        catch (Exception exception) {
            throw new s(f.a(1605345360 - (char)-6697, 1605345360 - (char)-16629, (int)l3), exception, l9);
        }
    }

    @Deprecated
    public static Map n(ItemMeta itemMeta, long l2) {
        long l3 = l2 ^ 0x5A4630AD2D85L;
        try {
            return (Map)I.get(itemMeta);
        }
        catch (Exception exception) {
            throw new s(f.a(-561241740 - -4789, -561241740 + -7093, (int)l2), exception, l3);
        }
    }

    public static Object V(Object object, long l2) {
        long l3 = l2;
        long l4 = l3 ^ 0x14EFD63C2D18L;
        long l5 = l3 ^ 0x56848D4D28F6L;
        try {
            Object obj = me.serbob.donuttp.c.NMS_NBTTAGCOMPOUND.E().newInstance();
            Object object2 = me.serbob.donuttp.d.NMS_ENTITY_GET_NBT.R(l4, object, obj);
            if (object2 == null) {
                object2 = obj;
            }
            return object2;
        }
        catch (Exception exception) {
            throw new s(f.a(1667996820 + (char)-27445, 1667996820 + (char)-23649, (int)l2), exception, l5);
        }
    }

    public static Object x(Object object, Object object2, long l2) {
        long l3 = l2;
        long l4 = l3 ^ 0x40CEF339C698L;
        long l5 = l3 ^ 0x2A5A848C376L;
        try {
            me.serbob.donuttp.d.NMS_ENTITY_SET_NBT.R(l4, object2, object);
            return object2;
        }
        catch (Exception exception) {
            throw new s(f.a(1181333910 + 8528, -1181333910 - -5210, (int)l2), exception, l5);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static Object x(BlockState var0, long var1_1) {
        v0 = var1_1;
        var3_2 = v0 ^ 31080188204648L;
        var5_3 = v0 ^ 74611552051764L;
        var7_4 = v0 ^ 136917320089930L;
        var9_5 = v0 ^ 10487518952098L;
        var11_6 = v0 ^ 1943857845492L;
        var13_7 = v0 ^ 103556776645510L;
        try {
            block12: {
                block15: {
                    block13: {
                        block14: {
                            var15_8 = me.serbob.donuttp.c.CRAFT_WORLD.E().cast(var0.getWorld());
                            var16_10 = me.serbob.donuttp.d.CRAFT_WORLD_GET_HANDLE.R(var3_2, var15_8, new Object[0]);
                            var17_11 = null;
                            if (r.M(var9_5) == r.MC1_7_R4) {
                                var17_11 = me.serbob.donuttp.d.NMS_WORLD_GET_TILEENTITY_1_7_10.R(var3_2, var16_10, new Object[]{var0.getX(), var0.getY(), var0.getZ()});
                            } else {
                                var18_12 /* !! */  = v.NMS_BLOCKPOSITION.h(var5_3, new Object[]{var0.getX(), var0.getY(), var0.getZ()});
                                var17_11 = me.serbob.donuttp.d.NMS_WORLD_GET_TILEENTITY.R(var3_2, var16_10, new Object[]{var18_12 /* !! */ });
                            }
                            if (var17_11 == null) {
                                throw new s(var11_6, f.a(-557571780 + -22328, 557571780 + 20250, (int)var1_1) + var0.getType() + f.a(-557571780 + -22305, -557571780 + -26408, (int)var1_1));
                            }
                            var18_12 /* !! */  = null;
                            v2 = r.m(r.MC1_20_R4, var7_4);
                            if (var1_1 < 0L) break block13;
                            if (!v2) break block14;
                            var18_12 /* !! */  = me.serbob.donuttp.d.TILEENTITY_GET_NBT_1205.R(var3_2, var17_11, new Object[]{f.d});
                            break block15;
                        }
                        v3 /* !! */  = r.MC1_18_R1;
                        if (var1_1 < 0L) ** GOTO lbl40
                        v2 = r.m(v3 /* !! */ , var7_4);
                    }
                    if (v2) {
                        var18_12 /* !! */  = me.serbob.donuttp.d.TILEENTITY_GET_NBT_1181.R(var3_2, var17_11, new Object[0]);
                    } else {
                        v3 /* !! */  = me.serbob.donuttp.c.NMS_NBTTAGCOMPOUND.E().newInstance();
lbl40:
                        // 2 sources

                        var18_12 /* !! */  = v3 /* !! */ ;
                        me.serbob.donuttp.d.TILEENTITY_GET_NBT.R(var3_2, var17_11, new Object[]{var18_12 /* !! */ });
                    }
                }
                v4 /* !! */  = var18_12 /* !! */ ;
                if (var1_1 <= 0L) break block12;
                if (v4 /* !! */  == null) {
                    throw new s(var11_6, f.a(-557571780 + -22332, 557571780 + (char)-26680, (int)var1_1) + var0 + " " + var17_11);
                }
                v4 /* !! */  = var18_12 /* !! */ ;
            }
            return v4 /* !! */ ;
        }
        catch (Exception var15_9) {
            throw new s(f.a(-557571780 + -22304, -557571780 + -8728, (int)var1_1), var15_9, var13_7);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void z(BlockState blockState, int n2, long l2, Object object) {
        long l3;
        long l4 = l3 = (long)n2 << 32 | l2 << 32 >>> 32;
        long l5 = l4 ^ 0x5673C79739ECL;
        long l6 = l4 ^ 0x9EC770A8DB0L;
        long l7 = l4 ^ 0x36B1203EAECEL;
        long l8 = l4 ^ 0x43BE7CD39526L;
        long l9 = l4 ^ 0x14189CE63C02L;
        try {
            Object object2;
            Object object3;
            Object obj = me.serbob.donuttp.c.CRAFT_WORLD.E().cast(blockState.getWorld());
            Object object4 = me.serbob.donuttp.d.CRAFT_WORLD_GET_HANDLE.R(l5, obj, new Object[0]);
            Object object5 = null;
            if (r.M(l8) == r.MC1_7_R4) {
                object5 = me.serbob.donuttp.d.NMS_WORLD_GET_TILEENTITY_1_7_10.R(l5, object4, blockState.getX(), blockState.getY(), blockState.getZ());
            } else {
                object3 = v.NMS_BLOCKPOSITION.h(l6, blockState.getX(), blockState.getY(), blockState.getZ());
                object5 = me.serbob.donuttp.d.NMS_WORLD_GET_TILEENTITY.R(l5, object4, object3);
            }
            boolean bl = r.m(r.MC1_20_R4, l7);
            if (l2 > 0L) {
                if (bl) {
                    me.serbob.donuttp.d.TILEENTITY_SET_NBT_1205.R(l5, object5, object, d);
                    return;
                }
                bl = r.m(r.MC1_17_R1, l7);
            }
            if (l2 > 0L) {
                if (bl) {
                    me.serbob.donuttp.d.TILEENTITY_SET_NBT.R(l5, object5, object);
                    return;
                }
                object2 = r.MC1_16_R1;
                if (n2 <= 0) return;
                bl = r.m(object2, l7);
            }
            if (bl) {
                object3 = me.serbob.donuttp.d.TILEENTITY_GET_BLOCKDATA.R(l5, object5, new Object[0]);
                me.serbob.donuttp.d.TILEENTITY_SET_NBT_LEGACY1161.R(l5, object5, object3, object);
                if (l2 >= 0L) return;
            }
            object2 = me.serbob.donuttp.d.TILEENTITY_SET_NBT_LEGACY1151.R(l5, object5, object);
            return;
        }
        catch (Exception exception) {
            throw new s(f.a(1925680440 - 26522, 1925680440 - 14795, (int)l3), exception, l9);
        }
    }

    public static Object G(long l2, Object object, String string) {
        long l3 = l2;
        long l4 = l3 ^ 0x4034382C2AABL;
        long l5 = l3 ^ 0x5DB4C54B2837L;
        long l6 = l3 ^ 0x25F635D2F45L;
        try {
            if (((Boolean)me.serbob.donuttp.d.COMPOUND_HAS_KEY.R(l4, object, string)).booleanValue()) {
                return me.serbob.donuttp.d.COMPOUND_GET_COMPOUND.R(l4, object, string);
            }
            throw new s(l5, f.a(-1921224060 + -15274, -1921224060 + -5903, (int)l2) + string + f.a(-1921224060 + -15280, 1921224060 + 18185, (int)l2) + object + f.a(-1921224060 + -15283, -1921224060 + -27560, (int)l2));
        }
        catch (Exception exception) {
            throw new s(f.a(-1921224060 + -15257, 1921224060 + 13838, (int)l2), exception, l6);
        }
    }

    public static void o(D d2, long l2, String string) {
        short s2;
        Object object;
        long l3;
        long l4;
        int n2;
        int n3;
        long l5;
        block9: {
            long l6 = l2;
            l5 = l6 ^ 0x1F72B832CD19L;
            long l7 = l6 ^ 0x3E2CF59B908CL;
            int n4 = (int)(l7 >>> 32);
            int n5 = (int)(l7 << 32 >>> 48);
            int n6 = (int)(l7 << 48 >>> 48);
            long l8 = l6 ^ 0x40ED08AF7945L;
            long l9 = l6 ^ 0xEC890E1677DL;
            long l10 = l6 ^ 0x77A64E24DCD4L;
            int n7 = (int)(l10 >>> 48);
            int n8 = (int)(l10 << 16 >>> 48);
            int n9 = (int)(l10 << 32 >>> 32);
            long l11 = l6 ^ 0x57F637F4E157L;
            int n10 = (int)(l11 >>> 48);
            n3 = (int)(l11 << 16 >>> 32);
            n2 = (int)(l11 << 48 >>> 48);
            l4 = l6 ^ 0x5D19E343C8F7L;
            l3 = l6 ^ 0x583FAE5DD137L;
            if (string == null) {
                f.m(n4, d2, string, n5, (short)n6);
                return;
            }
            object = d2.h(l9);
            if (l2 > 0L && object == null) {
                object = v.NMS_NBTTAGCOMPOUND.h(l8, new Object[0]);
            }
            s2 = f.V((char)n7, (char)n8, d2, n9);
            if (l2 < 0L) break block9;
            if (s2 == 0) {
                return;
            }
            s2 = (short)n10;
        }
        Object object2 = f.Z(s2, n3, (short)n2, object, d2);
        try {
            me.serbob.donuttp.d.COMPOUND_SET.R(l5, object2, string, me.serbob.donuttp.c.NMS_NBTTAGCOMPOUND.E().newInstance());
            d2.x(l3, object);
        }
        catch (Exception exception) {
            throw new s(f.a(224522910 + (char)-8509, -224522910 + -((char)-20509), (int)l2), exception, l4);
        }
    }

    public static boolean V(char c2, char c3, D d2, int n2) {
        long l2;
        long l3 = l2 = (long)c2 << 48 | (long)c3 << 48 >>> 16 | (long)n2 << 32 >>> 32;
        long l4 = l3 ^ 0x49FA9AD3F22FL;
        int n3 = (int)(l4 >>> 48);
        int n4 = (int)(l4 << 16 >>> 32);
        int n5 = (int)(l4 << 48 >>> 48);
        long l5 = l3 ^ 0x374B468BA591L;
        long l6 = l3 ^ 0x796EDEC5BBA9L;
        long l7 = l3 ^ 0x205079D03D83L;
        int n6 = (int)(l7 >>> 48);
        int n7 = (int)(l7 << 16 >>> 32);
        int n8 = (int)(l7 << 48 >>> 48);
        Object object = d2.h(l6);
        if (object == null) {
            object = v.NMS_NBTTAGCOMPOUND.h(l5, new Object[0]);
        }
        Object object2 = f.Z((short)n6, n7, (short)n8, object, d2);
        d2.Z(object2, (char)n3, n4, (char)n5);
        boolean bl = object2 != null;
        return bl;
    }

    public static Object Z(short s2, int n2, short s3, Object object, D d2) {
        Object object2;
        block7: {
            block6: {
                long l2;
                long l3 = l2 = (long)s2 << 48 | (long)n2 << 32 >>> 16 | (long)s3 << 48 >>> 48;
                long l4 = l3 ^ 0x8B0B7EA06E5L;
                long l5 = l3 ^ 0x550472A12ED2L;
                ArrayDeque<String> arrayDeque = new ArrayDeque<String>();
                while (d2.k() != null) {
                    arrayDeque.add(d2.P());
                    d2 = d2.k();
                    if (n2 >= 0) {
                        if (s2 >= 0) continue;
                    }
                    break block6;
                }
                while (!arrayDeque.isEmpty()) {
                    String string = (String)arrayDeque.pollLast();
                    object = f.G(l4, object, string);
                    object2 = object;
                    if (s2 < 0) break block7;
                    if (object2 == null) {
                        throw new s(l5, f.a(982893930 + 27333, 982893930 + (char)-25718, (int)l2) + string + f.a(982893930 + 27328, -982893930 + -((char)-18460), (int)l2) + object);
                    }
                    if (s3 <= 0) continue;
                }
            }
            object2 = object;
        }
        return object2;
    }

    public static void k(D d2, D d3, long l2) {
        short s2;
        Object object;
        Object object2;
        long l3;
        long l4;
        int n2;
        int n3;
        long l5;
        block9: {
            long l6 = l2;
            l5 = l6 ^ 0x1679756C1C80L;
            long l7 = l6 ^ 0x26FDE28127ECL;
            long l8 = l6 ^ 0x49E6C5F1A8DCL;
            long l9 = l6 ^ 0x7C35DBFB6E4L;
            long l10 = l6 ^ 0x7EAD837A0D4DL;
            int n4 = (int)(l10 >>> 48);
            int n5 = (int)(l10 << 16 >>> 48);
            int n6 = (int)(l10 << 32 >>> 32);
            long l11 = l6 ^ 0xBF9880B1E1CL;
            long l12 = l6 ^ 0x5EFDFAAA30CEL;
            int n7 = (int)(l12 >>> 48);
            n3 = (int)(l12 << 16 >>> 32);
            n2 = (int)(l12 << 48 >>> 48);
            l4 = l6 ^ 0x54122E1D196EL;
            l3 = l6 ^ 0x5134630300AEL;
            object2 = d3.g(l7);
            if (object2 == null) {
                return;
            }
            object = d2.h(l9);
            if (l2 > 0L && object == null) {
                object = v.NMS_NBTTAGCOMPOUND.h(l8, new Object[0]);
            }
            s2 = f.V((char)n4, (char)n5, d2, n6);
            if (l2 < 0L) break block9;
            if (s2 == 0) {
                throw new s(l11, f.a(-1069793340 + -16071, -1069793340 + -4180, (int)l2));
            }
            s2 = (short)n7;
        }
        Object object3 = f.Z(s2, n3, (short)n2, object, d2);
        try {
            me.serbob.donuttp.d.COMPOUND_MERGE.R(l5, object3, object2);
            d2.x(l3, object);
        }
        catch (Exception exception) {
            throw new s(f.a(-1069793340 + -16098, 1069793340 + 6092, (int)l2), exception, l4);
        }
    }

    public static void F(D d2, long l2, String string, Object object) {
        short s2;
        Object object2;
        long l3;
        long l4;
        int n2;
        int n3;
        long l5;
        block9: {
            long l6 = l2;
            l5 = l6 ^ 0x222B84E8CE2DL;
            long l7 = l6 ^ 0x375C94193B8L;
            int n4 = (int)(l7 >>> 32);
            int n5 = (int)(l7 << 32 >>> 48);
            int n6 = (int)(l7 << 48 >>> 48);
            long l8 = l6 ^ 0x7DB434757A71L;
            long l9 = l6 ^ 0x3391AC3B6449L;
            long l10 = l6 ^ 0x4AFF72FEDFE0L;
            int n7 = (int)(l10 >>> 48);
            int n8 = (int)(l10 << 16 >>> 48);
            int n9 = (int)(l10 << 32 >>> 32);
            long l11 = l6 ^ 0x3FAB798FCCB1L;
            long l12 = l6 ^ 0x6AAF0B2EE263L;
            int n10 = (int)(l12 >>> 48);
            n3 = (int)(l12 << 16 >>> 32);
            n2 = (int)(l12 << 48 >>> 48);
            l4 = l6 ^ 0x6040DF99CBC3L;
            l3 = l6 ^ 0x65669287D203L;
            if (object == null) {
                f.m(n4, d2, string, n5, (short)n6);
                return;
            }
            object2 = d2.h(l9);
            if (l2 > 0L && object2 == null) {
                object2 = v.NMS_NBTTAGCOMPOUND.h(l8, new Object[0]);
            }
            s2 = f.V((char)n7, (char)n8, d2, n9);
            if (l2 <= 0L) break block9;
            if (s2 == 0) {
                throw new s(l11, f.a(834260550 - (char)-1021, 834129480 + (char)-4536, (int)l2));
            }
            s2 = (short)n10;
        }
        Object object3 = f.Z(s2, n3, (short)n2, object2, d2);
        try {
            me.serbob.donuttp.d.COMPOUND_SET.R(l5, object3, string, object);
            d2.x(l3, object2);
        }
        catch (Exception exception) {
            throw new s(f.a(834260550 - (char)-1025, 834129480 + (char)-5834, (int)l2) + string + f.a(834260550 - (char)-1028, 834260550 - (char)-6317, (int)l2) + object + f.a(834260550 - (char)-1059, -834129480 + -((char)-14862), (int)l2), exception, l4);
        }
    }

    public static n t(D d2, String string, p p2, Class clazz, long l2) {
        long l3 = l2;
        long l4 = l3 ^ 0x451A71ECB7F8L;
        long l5 = l3 ^ 0x759EE6018C94L;
        long l6 = l3 ^ 0x7E2B05255306L;
        int n2 = (int)(l6 >>> 56);
        long l7 = l6 << 8 >>> 8;
        long l8 = l3 ^ 0x54A0593F1D9CL;
        long l9 = l3 ^ 0x1A01983ED68CL;
        long l10 = l3 ^ 0x7712A9DB216L;
        Object object = d2.g(l5);
        if (object == null) {
            object = N.h(l8);
        }
        try {
            Object object2 = me.serbob.donuttp.d.COMPOUND_GET_LIST.R(l4, object, string, p2.X());
            Class clazz2 = clazz;
            Class clazz3 = String.class;
            if (l2 >= 0L) {
                if (clazz2 == clazz3) {
                    return new Vh(d2, string, p2, object2);
                }
                clazz2 = clazz;
                clazz3 = U.class;
            }
            if (l2 > 0L) {
                if (clazz2 == clazz3) {
                    return new A(d2, string, p2, object2);
                }
                clazz2 = clazz;
                clazz3 = Integer.class;
            }
            if (l2 > 0L) {
                if (clazz2 == clazz3) {
                    return new Vi(d2, string, p2, object2);
                }
                clazz2 = clazz;
                clazz3 = Float.class;
            }
            if (l2 > 0L) {
                if (clazz2 == clazz3) {
                    return new VJ(d2, string, p2, object2);
                }
                clazz2 = clazz;
                clazz3 = Double.class;
            }
            if (l2 >= 0L) {
                if (clazz2 == clazz3) {
                    return new T(d2, string, p2, object2);
                }
                clazz2 = clazz;
                clazz3 = Long.class;
            }
            if (l2 > 0L) {
                if (clazz2 == clazz3) {
                    return new VD(d2, string, p2, object2);
                }
                clazz2 = clazz;
                clazz3 = int[].class;
            }
            if (l2 >= 0L) {
                if (clazz2 == clazz3) {
                    return new VR(d2, string, p2, (byte)n2, l7, object2);
                }
                clazz2 = clazz;
                clazz3 = UUID.class;
            }
            if (clazz2 == clazz3) {
                return new V_(d2, string, p2, object2, l9);
            }
            return null;
        }
        catch (Exception exception) {
            throw new s(f.a(-994297020 - -28791, -994297020 - -((char)-23197), (int)l2) + (Object)((Object)p2) + f.a(-994297020 - -28734, -994297020 - -24651, (int)l2), exception, l10);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static p M(D var0, String var1_1, long var2_2) {
        v0 = var2_2;
        var4_3 = v0 ^ 80794101098014L;
        var6_4 = v0 ^ 134139351080306L;
        var8_5 = v0 ^ 97588089031802L;
        var10_6 = v0 ^ 45877500293436L;
        v1 = v0 ^ 36096669813505L;
        var12_7 = (int)(v1 >>> 32);
        var13_8 = v1 << 32 >>> 32;
        var15_9 = v0 ^ 12163561497584L;
        var17_10 = var0.g(var6_4);
        if (var17_10 == null) {
            var17_10 = f.N.h(var8_5);
        }
        try {
            var18_11 = me.serbob.donuttp.d.COMPOUND_GET.R(var4_3, var17_10, new Object[]{var1_1});
            var19_13 = f.a(-488497890 - -7492, 488497890 - 7319, (int)var2_2);
            v2 /* !! */  = r.MC1_17_R1;
            if (var2_2 < 0L) ** GOTO lbl24
            if (r.m(v2 /* !! */ , var10_6)) {
                var19_13 = "w";
            }
            try {
                v2 /* !! */  = var18_11;
lbl24:
                // 2 sources

                v3 = v2 /* !! */ .getClass();
                var20_14 = v3.getDeclaredField(i8.c(v3, var19_13));
            }
            catch (NoSuchFieldException var21_15) {
                v4 = var18_11.getClass();
                var20_14 = v4.getDeclaredField(i8.c(v4, f.a(-488497890 - -7499, 488497890 - 2915, (int)var2_2)));
            }
            var20_14.setAccessible(true);
            return p.y(var20_14.getByte(var18_11), var12_7, var13_8);
        }
        catch (Exception var18_12) {
            throw new s(f.a(-488497890 - -7507, 488497890 - 20191, (int)var2_2), var18_12, var15_9);
        }
    }

    public static Object m(D d2, String string, long l2) {
        long l3 = l2;
        long l4 = l3 ^ 0x5BE42A58B925L;
        long l5 = l3 ^ 0x6B60BDB58249L;
        long l6 = l3 ^ 0x198F7129BCCBL;
        Object object = d2.g(l5);
        try {
            return me.serbob.donuttp.d.COMPOUND_GET.R(l4, object, string);
        }
        catch (Exception exception) {
            throw new s(f.a(-1626840840 - -17510, 1626840840 - 25771, (int)l2), exception, l6);
        }
    }

    public static void y(long l2, D d2, String string, Object object) {
        long l3 = l2;
        long l4 = l3 ^ 0x7DF91DE836FFL;
        int n2 = (int)(l4 >>> 48);
        long l5 = l4 << 16 >>> 16;
        long l6 = l3 ^ 0x58CFBD51B5A6L;
        long l7 = l3 ^ 0x677B11F7C61BL;
        if (!r.A((char)n2, l5)) {
            return;
        }
        try {
            String string2 = H.n(object);
            f.R(d2, l6, me.serbob.donuttp.d.COMPOUND_SET_STRING, string, string2);
        }
        catch (Exception exception) {
            throw new s(f.a(-2752470 - -((char)-8341), -2752470 - -((char)-21313), (int)l2) + object + f.a(-2752470 - -((char)-8347), -2752470 - -((char)-4264), (int)l2), exception, l7);
        }
    }

    public static Object Y(D d2, long l2, String string, Class clazz) {
        Object object;
        block6: {
            long l3 = l2;
            long l4 = l3 ^ 0x4DCDAD334AD8L;
            long l5 = l3 ^ 0x2509477264F9L;
            int n2 = (int)(l5 >>> 48);
            long l6 = l5 << 16 >>> 16;
            long l7 = l3 ^ 0x25CA9D593D13L;
            if (!r.A((char)n2, l6)) {
                return null;
            }
            String string2 = (String)f.Y(d2, l7, me.serbob.donuttp.d.COMPOUND_GET_STRING, string);
            object = string2;
            if (l2 <= 0L) break block6;
            if (object == null) {
                return null;
            }
            object = H.j(string2, l4, clazz);
        }
        return object;
    }

    public static void m(int n2, D d2, String string, int n3, short s2) {
        short s3;
        Object object;
        long l2;
        int n4;
        int n5;
        long l3;
        block6: {
            long l4;
            long l5 = l4 = (long)n2 << 32 | (long)n3 << 48 >>> 32 | (long)s2 << 48 >>> 48;
            l3 = l5 ^ 0x215E4DA95D95L;
            long l6 = l5 ^ 0x30E4657AF7F1L;
            long l7 = l5 ^ 0x498ABBBF4C58L;
            int n6 = (int)(l7 >>> 48);
            int n7 = (int)(l7 << 16 >>> 48);
            int n8 = (int)(l7 << 32 >>> 32);
            long l8 = l5 ^ 0x69DAC26F71DBL;
            int n9 = (int)(l8 >>> 48);
            n5 = (int)(l8 << 16 >>> 32);
            n4 = (int)(l8 << 48 >>> 48);
            l2 = l5 ^ 0x66135BC641BBL;
            object = d2.h(l6);
            if (object == null) {
                return;
            }
            s3 = f.V((char)n6, (char)n7, d2, n8);
            if (n2 < 0) break block6;
            if (s3 == 0) {
                return;
            }
            s3 = (short)n9;
        }
        Object object2 = f.Z(s3, n5, (short)n4, object, d2);
        me.serbob.donuttp.d.COMPOUND_REMOVE_KEY.R(l3, object2, string);
        d2.x(l2, object);
    }

    public static Set u(long l2, D d2) {
        long l3 = l2;
        long l4 = l3 ^ 0x6D56F54DC7C7L;
        long l5 = l3 ^ 0x5DD262A0FCABL;
        Object object = d2.g(l5);
        if (object == null) {
            return Collections.emptySet();
        }
        return (Set)me.serbob.donuttp.d.COMPOUND_GET_KEYS.R(l4, object, new Object[0]);
    }

    public static void R(D d2, long l2, d d3, String string, Object object) {
        short s2;
        Object object2;
        long l3;
        int n2;
        int n3;
        long l4;
        block7: {
            long l5 = l2;
            l4 = l5 ^ 0x7DDFF7D77653L;
            long l6 = l5 ^ 0x5C81BA7E2BC6L;
            int n4 = (int)(l6 >>> 32);
            int n5 = (int)(l6 << 32 >>> 48);
            int n6 = (int)(l6 << 48 >>> 48);
            long l7 = l5 ^ 0x2240474AC20FL;
            long l8 = l5 ^ 0x6C65DF04DC37L;
            long l9 = l5 ^ 0x150B01C1679EL;
            int n7 = (int)(l9 >>> 48);
            int n8 = (int)(l9 << 16 >>> 48);
            int n9 = (int)(l9 << 32 >>> 32);
            long l10 = l5 ^ 0x605F0AB074CFL;
            long l11 = l5 ^ 0x355B78115A1DL;
            int n10 = (int)(l11 >>> 48);
            n3 = (int)(l11 << 16 >>> 32);
            n2 = (int)(l11 << 48 >>> 48);
            l3 = l5 ^ 0x3A92E1B86A7DL;
            if (object == null) {
                f.m(n4, d2, string, n5, (short)n6);
                return;
            }
            object2 = d2.h(l8);
            if (l2 > 0L && object2 == null) {
                object2 = v.NMS_NBTTAGCOMPOUND.h(l7, new Object[0]);
            }
            s2 = f.V((char)n7, (char)n8, d2, n9);
            if (l2 <= 0L) break block7;
            if (s2 == 0) {
                throw new s(l10, f.a(1116192120 - 21322, 1116192120 - 30677, (int)l2));
            }
            s2 = (short)n10;
        }
        Object object3 = f.Z(s2, n3, (short)n2, object2, d2);
        d3.R(l4, object3, string, object);
        d2.x(l3, object2);
    }

    public static Object Y(D d2, long l2, d d3, String string) {
        long l3 = l2;
        long l4 = l3 ^ 0x582A8D45ACE0L;
        long l5 = l3 ^ 0x68AE1AA8978CL;
        long l6 = l3 ^ 0x4990A5960684L;
        Object object = d2.g(l5);
        if (object == null) {
            object = N.h(l6);
        }
        return d3.R(l4, object, string);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block30: {
            block29: {
                v0 = var7 = 99261418721177L;
                var9_1 = v0 ^ 29718274746174L;
                var11_2 = v0 ^ 136089068908572L;
                v1 = v0 ^ 7473865861169L;
                var13_3 = (int)(v1 >>> 48);
                var14_4 = (int)(v1 << 16 >>> 32);
                var15_5 = (int)(v1 << 48 >>> 48);
                v2 = v0 ^ 78792462679817L;
                var16_6 = (int)(v2 >>> 32);
                var17_7 = (int)(v2 << 32 >>> 48);
                var18_8 = (int)(v2 << 48 >>> 48);
                var5_9 = new String[40];
                var3_10 = 0;
                var2_11 = "\u00c3\u000e\u00a9\u00be\u000b\u0095\u0015\u007f3R\u0090\u00b9\u00ebi\b\u00f8z`\u00f4f\u00c0B\u00bb\u00e1\u00ffr\u00f2)?\u00caky\u00e8V\u00e5`\u001f\u00a5k\u00fa`80\u008f^{\u001a\u0004\u00ef\u00ffUY\u00c7\u001a\u0010\u0006B\u00ac\u00f9FL\u00ad\u0005\u00df\u00c3W\u00aa'#\u0095\u00c9:\u00b3\u0091\u000b\u00ff\u0018\u0084\u00a7\u00dc\u0011\u00ab\u00f1\u00b8\u00ae\u00aa\f\u00a1\u00ec\u00ca\u00f7+{\u0017\u00c2!\u00e4\u001b\u00e7\u00fd)\u00f4\u00c4\u0084)\u0085\u00818\u00ba\u00d1*\u00f7<\u0085#\u00fc\u0081\u00af\u00e38\u00ec\u00a5D\u00af\u00e6z\u00d5=?\u00c0\u001dM\u00c0\u0089/\u00e44\u0084\u0000\u00b8CM\u0082\u008e)\u00d8\u0005RY\u0012_D$!~\u00acEC\u00d5\u00a5\u00c3\u00cf\u00dc\u00b5~\u0086\u001c\u001d\u0013\u001f\u00bb#\n-9\u00d7\u00a2\u009d\u00b1\u00ec\u00a9\u00f7\"4\u0097k\u008f\u0098\u00c0\u0014S\u00c7\u00f2\u00a1\u00d6\u00bf\u00c1\u00a6\"\b8\u00e5\u0003F\u000f\u0005\u00a2\u00a5\u0090\u00d87q\u00fb\u0093\u00a2Q\u00df\u00b6\u00e5(\u00b1q mA\u0004\u0093\u00a5\u00d0\u00ca9\u0018\u008ds\u00fc7\u008bmq\u00a1><\u00fac\u0010\u0099(\u0000\u00ea\u0012\u00b1\u00cf\u00ca:z\n\r\u001e-\u0086\f:\u00cc\u008c\u00c6\u00f2&~\u0095G8>z\n6:b\u000b\u00a9Q\u00e6\u00e7LTP\u00dcw\u00d2\u0096(Wb\u000f\u0013~+\u00d3\u00f1\u00d2\u00aa\u0014\u00d2\u00e48\u00c5\u0016\u00ba\u00be\u00ea\nM\u00c4~J\u00e66\u00ad\u00c5=\u0007\u00c9Xc\u00e1\u009drAp\u001a\u00e5)%\u00eeC\u00bf\u00e9Z\u0093\u00f0y#\u00cc=\u0096\u00b3\u00df\u00c7\u009d\u00b5\u00a8\u00f5\u0012}\u008b\u00a4\u001d\u0018\u00b6\u008b\\\u00a7\u00f69\u00a7\\P\u00c7\u00ef\u00c8.\u00d4U&s\u0004\u0013\u00c9\u001aK\u00c6\u00110\u009d5.\u001c%\u0095,8Sz\u00a76\u008fb\u00bd\u00a9\u0087\u00e6=L\u001fG\u00ba`\u00a0tf\u000b\u0091\u00ae!$+\u00b1\u00a3\u00ae-].\u00b0\u0094\fN\u00fc!\u00a0\u0017L\u00d5\\k\u0093\u00ebZ>\u0011-\u0005\u008f\u00ee}\u00f4\u00af:\u00f9\u00a3M\u008f\u00e1\u0007\u00a3\u00b2S\u00abk\u00ef\r\u00d8~\u00ae\u0095w[\u00fb\n\u00ab\u00dadKr\u0006N`\u00c4\u00bd\u00fe\u00fa\u0004\u008f\u0003}\u00cb4\u001eoKg\u00bf\u0091:K<\u00cd\u00cb\\IX\u00e4\u009b4\u00aa\u00d0(S}\u0018*^\u008a\u00d8\u00c2FO<\u00de%\u00f7\u00c1\u0091\u00e7b\u00a1\u00b4V\u00d8k\u00f8J#G=\u00f8\u00c5se3| \u0007\u008e6\u00ac\u000b\u00ec\u001a9\u000f\u00c2\u00d1\u008b\u00f7\u00e1V\u00e5\u009c\u00c1\u00da@)\u008dWRGzT\u001b\u001bA~\u0094\u008cX\u00e8xf\u00f5j\u00b7\u00e8\u0016]\u00a8\u00ad\u00de\u0083\u0088\u00a31\u007f\u00c8g\u0093:\u000f\u008a\u0098*\u00b7\t\u0013\u0011\u00b1\u00ef\u00a6A\r\u00e8\u00dcT\u00e3\u00f8\u00f9B\u00f0[\u008a8\u00b8-U'!\u00e6j\u00d0O\u009b\r\u0001Zh\u00bd\u0092\u00e5uA\u00af\\\u009cz\u00fd\u009c\u009b\u00a2\u000e\u0082G\u00b5\u00faT\u0088\u00bc\u00cdE1{ULtj\u0097.\u00e8\u0085\u0097\u0002\u0087\u00dbx\u00derm0\u000b\u009d\u00bd\u00ea\n\u00d5\u00fe\u00d4g\u00d6\u001c\u00ea\u0089\t\u00f0\u00ef/\u008c=\u001c\u00f7N\u0089E\u00e5Oj\u008e\u0093)\u00d7\u00e3yDy?\u00c1\u001d\u0015W\u00af\u001e\u00df\u00b2Qp)\u0014\u0098+QK*G\u00e3\u00e1\u00b48sD\u00e6\u0002\n=\u008c\u00de\u00ea\u007f\u0011\n\u0012\u0092\u008f\u00c2]\u008bcEp\u008e\u00e2\u0082P\u00daID\u00ac\rWI\u0013\u00ec/\u00eb\u0000#\u0001\u00eb\u00cf\u00d5^1\u0001\u00d8Z\u0092 \u00f8\u00a7\u00b6g\u0093\u0093* \u00b4D'Im\u0000\u00f8\u00ad\u00b1\u000e=\u00fcD\u00c6\u0086\u00c3\u00e4\"\u00e1\u00a0c\u009c\u00b6\u00de,\u0080\u00ea\u00c1]\u00d6.\u008d4M=!-\u00f2\u00d8\u0093b\t\u00e8m\u00f8\u009d\u00cc~\ts\u00f8\u00aeb\u009c4\u00e1\u0003[\u00854/\u00ed\u00d2h\u008b\u0015\u00f7\u008a\u00bd\u000b]F\u0081\u008f\u00a8\u00bf\u008f\u00bb\u00048\nDgW\u00d7\b\u00e0D\u00bfF\u009bY\u000b \u0004\u00d0\u0085\u0096\u001b7\u0015\u009b\u001f\u00ae\u00c0^\u0084\u00d5n\u00b7\u00b9\u00e0tY'\u0090\u00c1\u00b0F5\u0089\fA\u00ccq\u008d\u00a5\u00b1\u00b8&\u001f\u00f9\u0007p\u0015$\u0091k \u0081\u0089\u00cc\u00f2\u00ba\u0013\u0015=.\u00e2l\u00b6\u00c0\u001dG\u00c0\u0002\u00d8\u00f4!\u00be9_\u00ad=\u00c8j`6\u00a8\u008a\u00f0a\u00cd\u00e1)\u0094\u00fc\u00c4\u00e2\u00d1$H\u0001{\u00c3\u00c2D\u00fe@\b\u0013\u00b5\"N\u00feAU\u00fe\u00d7\u0012\u00839\u00d4k\u007f]<f\u0017b:\u00cc\u0006\u00c5\u000fj\r\u00d1\u0006\u00b1\\(u\b\u00da\u0017\u0019\u0003\u00d8.\u0080<\u00f0p\u0096\u0084\u0004\u00edM\u00c4\u00d2<\u0016b\u00f2\u009f\u0093c\u00da\u00b5\r\u00cb\u00e8\u0001o\u00a5\u008aQ\u000e\u00b5\u00aa\u008e\u0087\u008d%;\u00e7A#\u0013&\u00fbR`\u00f7\u00ffYc\u008d\u00fd\n\u00e3\u007f\b\u0013\u0017\u00e8\u00a1;\u00eb\\>4\u00f6\u00f4V\u0014\u001c\u00ffN\u0086\u00b2t\u001aks\u00be\u00a3G\u00dc1\u00cd[\u00f0\u0013l\u00e7\u00d03\t\u00f5|\u00a9{\u0002\u00cdl\u00dc\u00e2D\f\u00d5y\u00d8{\u009e\u00ea\u0011\u00b9\u00c1n(\u00afi(\u0002uB8\u00b1!\u00be\u00ae\u0001\u00a8\u00edl\u00c6)\u0094\u00c0\u00a2\u00cb\u0099\u00e9\u009f\u00ee;\u00e9{\u001b\u00830|\u008c\u00cc\u008e\u0013S-CJZ<\u00ac:,\\\u00b0\u0000\u0016 \u00fa\u00d6\u0003\u0003\u00f0\u00bfe<\u001eG\u00f3\u000e\u008a5\u00a9p\u00bd\u0084a\u00ed\u00e1\u00c4G<\u00a4b\u00a4\u009fYc\u0083\u00b5&\u00cb\u008d\u0001\u00c3\u00a5\u001eW\u00b0\u00f2\u00f1&\u00f7\u00d1\u00d2\u0013\u001c\u00cbOA\u00da\u00fa\u00cd@\u0004\u00fb\u000f\u00b7M\u00a1\u00f7}?\u0001\u00a4.\u009b\u00d9\u00fb\u00b1\u00a9K\u00f8\u0010d\u00a6\u00c01(\u00f5\u00c8.\u00b1\u001c`\u00feE\u00a7\u00daq)\u0083\u00c4\u00e7\u00e6\u009d\u00e7\u00a6\u0018\u00f9\u00f5\t\u00fek\u00d8\u0081f\u00b7\u00aa\u0094\r\u00e4";
                var4_12 = "\u00c3\u000e\u00a9\u00be\u000b\u0095\u0015\u007f3R\u0090\u00b9\u00ebi\b\u00f8z`\u00f4f\u00c0B\u00bb\u00e1\u00ffr\u00f2)?\u00caky\u00e8V\u00e5`\u001f\u00a5k\u00fa`80\u008f^{\u001a\u0004\u00ef\u00ffUY\u00c7\u001a\u0010\u0006B\u00ac\u00f9FL\u00ad\u0005\u00df\u00c3W\u00aa'#\u0095\u00c9:\u00b3\u0091\u000b\u00ff\u0018\u0084\u00a7\u00dc\u0011\u00ab\u00f1\u00b8\u00ae\u00aa\f\u00a1\u00ec\u00ca\u00f7+{\u0017\u00c2!\u00e4\u001b\u00e7\u00fd)\u00f4\u00c4\u0084)\u0085\u00818\u00ba\u00d1*\u00f7<\u0085#\u00fc\u0081\u00af\u00e38\u00ec\u00a5D\u00af\u00e6z\u00d5=?\u00c0\u001dM\u00c0\u0089/\u00e44\u0084\u0000\u00b8CM\u0082\u008e)\u00d8\u0005RY\u0012_D$!~\u00acEC\u00d5\u00a5\u00c3\u00cf\u00dc\u00b5~\u0086\u001c\u001d\u0013\u001f\u00bb#\n-9\u00d7\u00a2\u009d\u00b1\u00ec\u00a9\u00f7\"4\u0097k\u008f\u0098\u00c0\u0014S\u00c7\u00f2\u00a1\u00d6\u00bf\u00c1\u00a6\"\b8\u00e5\u0003F\u000f\u0005\u00a2\u00a5\u0090\u00d87q\u00fb\u0093\u00a2Q\u00df\u00b6\u00e5(\u00b1q mA\u0004\u0093\u00a5\u00d0\u00ca9\u0018\u008ds\u00fc7\u008bmq\u00a1><\u00fac\u0010\u0099(\u0000\u00ea\u0012\u00b1\u00cf\u00ca:z\n\r\u001e-\u0086\f:\u00cc\u008c\u00c6\u00f2&~\u0095G8>z\n6:b\u000b\u00a9Q\u00e6\u00e7LTP\u00dcw\u00d2\u0096(Wb\u000f\u0013~+\u00d3\u00f1\u00d2\u00aa\u0014\u00d2\u00e48\u00c5\u0016\u00ba\u00be\u00ea\nM\u00c4~J\u00e66\u00ad\u00c5=\u0007\u00c9Xc\u00e1\u009drAp\u001a\u00e5)%\u00eeC\u00bf\u00e9Z\u0093\u00f0y#\u00cc=\u0096\u00b3\u00df\u00c7\u009d\u00b5\u00a8\u00f5\u0012}\u008b\u00a4\u001d\u0018\u00b6\u008b\\\u00a7\u00f69\u00a7\\P\u00c7\u00ef\u00c8.\u00d4U&s\u0004\u0013\u00c9\u001aK\u00c6\u00110\u009d5.\u001c%\u0095,8Sz\u00a76\u008fb\u00bd\u00a9\u0087\u00e6=L\u001fG\u00ba`\u00a0tf\u000b\u0091\u00ae!$+\u00b1\u00a3\u00ae-].\u00b0\u0094\fN\u00fc!\u00a0\u0017L\u00d5\\k\u0093\u00ebZ>\u0011-\u0005\u008f\u00ee}\u00f4\u00af:\u00f9\u00a3M\u008f\u00e1\u0007\u00a3\u00b2S\u00abk\u00ef\r\u00d8~\u00ae\u0095w[\u00fb\n\u00ab\u00dadKr\u0006N`\u00c4\u00bd\u00fe\u00fa\u0004\u008f\u0003}\u00cb4\u001eoKg\u00bf\u0091:K<\u00cd\u00cb\\IX\u00e4\u009b4\u00aa\u00d0(S}\u0018*^\u008a\u00d8\u00c2FO<\u00de%\u00f7\u00c1\u0091\u00e7b\u00a1\u00b4V\u00d8k\u00f8J#G=\u00f8\u00c5se3| \u0007\u008e6\u00ac\u000b\u00ec\u001a9\u000f\u00c2\u00d1\u008b\u00f7\u00e1V\u00e5\u009c\u00c1\u00da@)\u008dWRGzT\u001b\u001bA~\u0094\u008cX\u00e8xf\u00f5j\u00b7\u00e8\u0016]\u00a8\u00ad\u00de\u0083\u0088\u00a31\u007f\u00c8g\u0093:\u000f\u008a\u0098*\u00b7\t\u0013\u0011\u00b1\u00ef\u00a6A\r\u00e8\u00dcT\u00e3\u00f8\u00f9B\u00f0[\u008a8\u00b8-U'!\u00e6j\u00d0O\u009b\r\u0001Zh\u00bd\u0092\u00e5uA\u00af\\\u009cz\u00fd\u009c\u009b\u00a2\u000e\u0082G\u00b5\u00faT\u0088\u00bc\u00cdE1{ULtj\u0097.\u00e8\u0085\u0097\u0002\u0087\u00dbx\u00derm0\u000b\u009d\u00bd\u00ea\n\u00d5\u00fe\u00d4g\u00d6\u001c\u00ea\u0089\t\u00f0\u00ef/\u008c=\u001c\u00f7N\u0089E\u00e5Oj\u008e\u0093)\u00d7\u00e3yDy?\u00c1\u001d\u0015W\u00af\u001e\u00df\u00b2Qp)\u0014\u0098+QK*G\u00e3\u00e1\u00b48sD\u00e6\u0002\n=\u008c\u00de\u00ea\u007f\u0011\n\u0012\u0092\u008f\u00c2]\u008bcEp\u008e\u00e2\u0082P\u00daID\u00ac\rWI\u0013\u00ec/\u00eb\u0000#\u0001\u00eb\u00cf\u00d5^1\u0001\u00d8Z\u0092 \u00f8\u00a7\u00b6g\u0093\u0093* \u00b4D'Im\u0000\u00f8\u00ad\u00b1\u000e=\u00fcD\u00c6\u0086\u00c3\u00e4\"\u00e1\u00a0c\u009c\u00b6\u00de,\u0080\u00ea\u00c1]\u00d6.\u008d4M=!-\u00f2\u00d8\u0093b\t\u00e8m\u00f8\u009d\u00cc~\ts\u00f8\u00aeb\u009c4\u00e1\u0003[\u00854/\u00ed\u00d2h\u008b\u0015\u00f7\u008a\u00bd\u000b]F\u0081\u008f\u00a8\u00bf\u008f\u00bb\u00048\nDgW\u00d7\b\u00e0D\u00bfF\u009bY\u000b \u0004\u00d0\u0085\u0096\u001b7\u0015\u009b\u001f\u00ae\u00c0^\u0084\u00d5n\u00b7\u00b9\u00e0tY'\u0090\u00c1\u00b0F5\u0089\fA\u00ccq\u008d\u00a5\u00b1\u00b8&\u001f\u00f9\u0007p\u0015$\u0091k \u0081\u0089\u00cc\u00f2\u00ba\u0013\u0015=.\u00e2l\u00b6\u00c0\u001dG\u00c0\u0002\u00d8\u00f4!\u00be9_\u00ad=\u00c8j`6\u00a8\u008a\u00f0a\u00cd\u00e1)\u0094\u00fc\u00c4\u00e2\u00d1$H\u0001{\u00c3\u00c2D\u00fe@\b\u0013\u00b5\"N\u00feAU\u00fe\u00d7\u0012\u00839\u00d4k\u007f]<f\u0017b:\u00cc\u0006\u00c5\u000fj\r\u00d1\u0006\u00b1\\(u\b\u00da\u0017\u0019\u0003\u00d8.\u0080<\u00f0p\u0096\u0084\u0004\u00edM\u00c4\u00d2<\u0016b\u00f2\u009f\u0093c\u00da\u00b5\r\u00cb\u00e8\u0001o\u00a5\u008aQ\u000e\u00b5\u00aa\u008e\u0087\u008d%;\u00e7A#\u0013&\u00fbR`\u00f7\u00ffYc\u008d\u00fd\n\u00e3\u007f\b\u0013\u0017\u00e8\u00a1;\u00eb\\>4\u00f6\u00f4V\u0014\u001c\u00ffN\u0086\u00b2t\u001aks\u00be\u00a3G\u00dc1\u00cd[\u00f0\u0013l\u00e7\u00d03\t\u00f5|\u00a9{\u0002\u00cdl\u00dc\u00e2D\f\u00d5y\u00d8{\u009e\u00ea\u0011\u00b9\u00c1n(\u00afi(\u0002uB8\u00b1!\u00be\u00ae\u0001\u00a8\u00edl\u00c6)\u0094\u00c0\u00a2\u00cb\u0099\u00e9\u009f\u00ee;\u00e9{\u001b\u00830|\u008c\u00cc\u008e\u0013S-CJZ<\u00ac:,\\\u00b0\u0000\u0016 \u00fa\u00d6\u0003\u0003\u00f0\u00bfe<\u001eG\u00f3\u000e\u008a5\u00a9p\u00bd\u0084a\u00ed\u00e1\u00c4G<\u00a4b\u00a4\u009fYc\u0083\u00b5&\u00cb\u008d\u0001\u00c3\u00a5\u001eW\u00b0\u00f2\u00f1&\u00f7\u00d1\u00d2\u0013\u001c\u00cbOA\u00da\u00fa\u00cd@\u0004\u00fb\u000f\u00b7M\u00a1\u00f7}?\u0001\u00a4.\u009b\u00d9\u00fb\u00b1\u00a9K\u00f8\u0010d\u00a6\u00c01(\u00f5\u00c8.\u00b1\u001c`\u00feE\u00a7\u00daq)\u0083\u00c4\u00e7\u00e6\u009d\u00e7\u00a6\u0018\u00f9\u00f5\t\u00fek\u00d8\u0081f\u00b7\u00aa\u0094\r\u00e4".length();
                var1_13 = 55;
                var0_14 = -1;
lbl21:
                // 2 sources

                while (true) {
                    v3 = ++var0_14;
                    v4 = var2_11.substring(v3, v3 + var1_13);
                    v5 = -1;
                    break block29;
                    break;
                }
lbl26:
                // 1 sources

                while (true) {
                    var5_9[var3_10++] = v6.intern();
                    if ((var0_14 += var1_13) < var4_12) {
                        var1_13 = var2_11.charAt(var0_14);
                        ** continue;
                    }
                    var2_11 = "\u00a6\"\\\u00ce]\u00a4f\u00ed\u00b7\u0019\u00ba\u00c6g\u000b!\u00f1\u008c\u00e7\u00c7\u0081\u00b1HD\u008c\u00d5^\u00a9;tg\u00f7\u00cc\u0016;\u00ea$\u0007n\u00c7\u00b4\u00f1\u001c\u0018\u00e6\u008bV\u00a7\u00b79\u008f\\U\u00c7O\u00c8:\u00d4\u00d7\"4\u001d\u000eT\u00b9\u00f8\u00b2B\u0099[\u00c2";
                    var4_12 = "\u00a6\"\\\u00ce]\u00a4f\u00ed\u00b7\u0019\u00ba\u00c6g\u000b!\u00f1\u008c\u00e7\u00c7\u0081\u00b1HD\u008c\u00d5^\u00a9;tg\u00f7\u00cc\u0016;\u00ea$\u0007n\u00c7\u00b4\u00f1\u001c\u0018\u00e6\u008bV\u00a7\u00b79\u008f\\U\u00c7O\u00c8:\u00d4\u00d7\"4\u001d\u000eT\u00b9\u00f8\u00b2B\u0099[\u00c2".length();
                    var1_13 = 41;
                    var0_14 = -1;
lbl35:
                    // 2 sources

                    while (true) {
                        v7 = ++var0_14;
                        v4 = var2_11.substring(v7, v7 + var1_13);
                        v5 = 0;
                        break block29;
                        break;
                    }
                    break;
                }
lbl40:
                // 1 sources

                while (true) {
                    var5_9[var3_10++] = v6.intern();
                    if ((var0_14 += var1_13) < var4_12) {
                        var1_13 = var2_11.charAt(var0_14);
                        ** continue;
                    }
                    break block30;
                    break;
                }
            }
            v8 = v4.toCharArray();
            var6_15 = 0;
            v9 = v8.length;
            v10 = v8;
            v11 = v9;
            if (v9 > 1) ** GOTO lbl90
            do {
                v12 = v10;
                v13 = v10;
                v14 = var6_15;
                while (true) {
                    v15 = v12[v14];
                    switch (var6_15 % 7) {
                        case 0: {
                            v16 = 9;
                            break;
                        }
                        case 1: {
                            v16 = 63;
                            break;
                        }
                        case 2: {
                            v16 = 39;
                            break;
                        }
                        case 3: {
                            v16 = 127;
                            break;
                        }
                        case 4: {
                            v16 = 77;
                            break;
                        }
                        case 5: {
                            v16 = 47;
                            break;
                        }
                        default: {
                            v16 = 115;
                        }
                    }
                    v12[v14] = (char)(v15 ^ v16);
                    ++var6_15;
                    v10 = v13;
                    v11 = v11;
                    if (v11 != 0) break;
                    v13 = v10;
                    v17 = v11;
                    v14 = v11;
                    v12 = v10;
                }
lbl90:
                // 2 sources

                v18 = v10;
                v17 = v11;
            } while (v11 > var6_15);
            v6 = new String(v18);
            switch (v5) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl99:
                // 1 sources

                ** continue;
            }
lbl100:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        f.a = var5_9;
        f.b = new String[40];
        ** while (true)
        f.c = -2202885130801233427L ^ var7;
        f.I = null;
        f.X = null;
        f.Z = null;
        f.d = null;
        try {
            v19 = me.serbob.donuttp.c.CRAFT_METAITEM.E();
            f.I = v19.getDeclaredField(i8.c(v19, f.a(-429516390 + -24131, 429516390 + 24705, (int)var7)));
            f.I.setAccessible(true);
        }
        catch (NoSuchFieldException var19_16) {
            // empty catch block
        }
        try {
            v20 = me.serbob.donuttp.c.CRAFT_ITEMSTACK.E();
            f.X = v20.getDeclaredField(i8.c(v20, f.a(-429516390 + -24146, -429516390 + -26403, (int)var7)));
            f.X.setAccessible(true);
        }
        catch (NoSuchFieldException var19_17) {
            // empty catch block
        }
        if (r.m(r.MC1_20_R4, var11_2)) {
            try {
                v21 = me.serbob.donuttp.c.NMS_DATACOMPONENTS.E();
                var19_18 = v21.getDeclaredField(i8.c(v21, (String)o.u((short)var13_3, var14_4, var15_5).get(f.a(-429516390 + -24130, -429516390 + -23744, (int)var7))));
                f.Z = var19_18.get(null);
            }
            catch (IllegalAccessException | IllegalArgumentException | NoSuchFieldException var19_19) {
                // empty catch block
            }
            try {
                var19_18 = me.serbob.donuttp.d.NMSSERVER_GETSERVER.R(var9_1, Bukkit.getServer(), new Object[0]);
                f.d = me.serbob.donuttp.d.NMSSERVER_GETREGISTRYACCESS.R(var9_1, var19_18, new Object[0]);
            }
            catch (Exception var19_20) {
                var19_20.printStackTrace();
            }
        }
        f.N = new C(var16_6, var17_7, (short)var18_8);
    }

    private static String a(int n2, int n3, int n4) {
        int n5 = (n2 ^ n4 ^ 0xFFFFF4C1) & 0xFFFF;
        if (b[n5] == null) {
            int n6;
            int n7;
            char[] cArray = a[n5].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n7 = 209;
                    break;
                }
                case 1: {
                    n7 = 66;
                    break;
                }
                case 2: {
                    n7 = 10;
                    break;
                }
                case 3: {
                    n7 = 19;
                    break;
                }
                case 4: {
                    n7 = 27;
                    break;
                }
                case 5: {
                    n7 = 223;
                    break;
                }
                case 6: {
                    n7 = 9;
                    break;
                }
                case 7: {
                    n7 = 132;
                    break;
                }
                case 8: {
                    n7 = 4;
                    break;
                }
                case 9: {
                    n7 = 73;
                    break;
                }
                case 10: {
                    n7 = 129;
                    break;
                }
                case 11: {
                    n7 = 180;
                    break;
                }
                case 12: {
                    n7 = 169;
                    break;
                }
                case 13: {
                    n7 = 139;
                    break;
                }
                case 14: {
                    n7 = 2;
                    break;
                }
                case 15: {
                    n7 = 253;
                    break;
                }
                case 16: {
                    n7 = 234;
                    break;
                }
                case 17: {
                    n7 = 160;
                    break;
                }
                case 18: {
                    n7 = 82;
                    break;
                }
                case 19: {
                    n7 = 60;
                    break;
                }
                case 20: {
                    n7 = 181;
                    break;
                }
                case 21: {
                    n7 = 195;
                    break;
                }
                case 22: {
                    n7 = 25;
                    break;
                }
                case 23: {
                    n7 = 153;
                    break;
                }
                case 24: {
                    n7 = 214;
                    break;
                }
                case 25: {
                    n7 = 117;
                    break;
                }
                case 26: {
                    n7 = 3;
                    break;
                }
                case 27: {
                    n7 = 87;
                    break;
                }
                case 28: {
                    n7 = 15;
                    break;
                }
                case 29: {
                    n7 = 226;
                    break;
                }
                case 30: {
                    n7 = 235;
                    break;
                }
                case 31: {
                    n7 = 52;
                    break;
                }
                case 32: {
                    n7 = 158;
                    break;
                }
                case 33: {
                    n7 = 215;
                    break;
                }
                case 34: {
                    n7 = 41;
                    break;
                }
                case 35: {
                    n7 = 92;
                    break;
                }
                case 36: {
                    n7 = 72;
                    break;
                }
                case 37: {
                    n7 = 40;
                    break;
                }
                case 38: {
                    n7 = 127;
                    break;
                }
                case 39: {
                    n7 = 203;
                    break;
                }
                case 40: {
                    n7 = 78;
                    break;
                }
                case 41: {
                    n7 = 151;
                    break;
                }
                case 42: {
                    n7 = 217;
                    break;
                }
                case 43: {
                    n7 = 213;
                    break;
                }
                case 44: {
                    n7 = 154;
                    break;
                }
                case 45: {
                    n7 = 173;
                    break;
                }
                case 46: {
                    n7 = 107;
                    break;
                }
                case 47: {
                    n7 = 155;
                    break;
                }
                case 48: {
                    n7 = 141;
                    break;
                }
                case 49: {
                    n7 = 24;
                    break;
                }
                case 50: {
                    n7 = 167;
                    break;
                }
                case 51: {
                    n7 = 100;
                    break;
                }
                case 52: {
                    n7 = 5;
                    break;
                }
                case 53: {
                    n7 = 118;
                    break;
                }
                case 54: {
                    n7 = 183;
                    break;
                }
                case 55: {
                    n7 = 67;
                    break;
                }
                case 56: {
                    n7 = 74;
                    break;
                }
                case 57: {
                    n7 = 124;
                    break;
                }
                case 58: {
                    n7 = 32;
                    break;
                }
                case 59: {
                    n7 = 20;
                    break;
                }
                case 60: {
                    n7 = 138;
                    break;
                }
                case 61: {
                    n7 = 140;
                    break;
                }
                case 62: {
                    n7 = 59;
                    break;
                }
                case 63: {
                    n7 = 221;
                    break;
                }
                case 64: {
                    n7 = 111;
                    break;
                }
                case 65: {
                    n7 = 30;
                    break;
                }
                case 66: {
                    n7 = 29;
                    break;
                }
                case 67: {
                    n7 = 252;
                    break;
                }
                case 68: {
                    n7 = 250;
                    break;
                }
                case 69: {
                    n7 = 95;
                    break;
                }
                case 70: {
                    n7 = 244;
                    break;
                }
                case 71: {
                    n7 = 191;
                    break;
                }
                case 72: {
                    n7 = 179;
                    break;
                }
                case 73: {
                    n7 = 83;
                    break;
                }
                case 74: {
                    n7 = 188;
                    break;
                }
                case 75: {
                    n7 = 13;
                    break;
                }
                case 76: {
                    n7 = 35;
                    break;
                }
                case 77: {
                    n7 = 228;
                    break;
                }
                case 78: {
                    n7 = 108;
                    break;
                }
                case 79: {
                    n7 = 65;
                    break;
                }
                case 80: {
                    n7 = 166;
                    break;
                }
                case 81: {
                    n7 = 174;
                    break;
                }
                case 82: {
                    n7 = 28;
                    break;
                }
                case 83: {
                    n7 = 53;
                    break;
                }
                case 84: {
                    n7 = 62;
                    break;
                }
                case 85: {
                    n7 = 84;
                    break;
                }
                case 86: {
                    n7 = 147;
                    break;
                }
                case 87: {
                    n7 = 230;
                    break;
                }
                case 88: {
                    n7 = 236;
                    break;
                }
                case 89: {
                    n7 = 222;
                    break;
                }
                case 90: {
                    n7 = 14;
                    break;
                }
                case 91: {
                    n7 = 57;
                    break;
                }
                case 92: {
                    n7 = 81;
                    break;
                }
                case 93: {
                    n7 = 36;
                    break;
                }
                case 94: {
                    n7 = 189;
                    break;
                }
                case 95: {
                    n7 = 23;
                    break;
                }
                case 96: {
                    n7 = 254;
                    break;
                }
                case 97: {
                    n7 = 161;
                    break;
                }
                case 98: {
                    n7 = 219;
                    break;
                }
                case 99: {
                    n7 = 170;
                    break;
                }
                case 100: {
                    n7 = 128;
                    break;
                }
                case 101: {
                    n7 = 46;
                    break;
                }
                case 102: {
                    n7 = 22;
                    break;
                }
                case 103: {
                    n7 = 201;
                    break;
                }
                case 104: {
                    n7 = 162;
                    break;
                }
                case 105: {
                    n7 = 0;
                    break;
                }
                case 106: {
                    n7 = 120;
                    break;
                }
                case 107: {
                    n7 = 77;
                    break;
                }
                case 108: {
                    n7 = 196;
                    break;
                }
                case 109: {
                    n7 = 39;
                    break;
                }
                case 110: {
                    n7 = 96;
                    break;
                }
                case 111: {
                    n7 = 135;
                    break;
                }
                case 112: {
                    n7 = 255;
                    break;
                }
                case 113: {
                    n7 = 18;
                    break;
                }
                case 114: {
                    n7 = 104;
                    break;
                }
                case 115: {
                    n7 = 143;
                    break;
                }
                case 116: {
                    n7 = 204;
                    break;
                }
                case 117: {
                    n7 = 110;
                    break;
                }
                case 118: {
                    n7 = 243;
                    break;
                }
                case 119: {
                    n7 = 136;
                    break;
                }
                case 120: {
                    n7 = 238;
                    break;
                }
                case 121: {
                    n7 = 227;
                    break;
                }
                case 122: {
                    n7 = 172;
                    break;
                }
                case 123: {
                    n7 = 70;
                    break;
                }
                case 124: {
                    n7 = 241;
                    break;
                }
                case 125: {
                    n7 = 229;
                    break;
                }
                case 126: {
                    n7 = 224;
                    break;
                }
                case 127: {
                    n7 = 233;
                    break;
                }
                case 128: {
                    n7 = 93;
                    break;
                }
                case 129: {
                    n7 = 17;
                    break;
                }
                case 130: {
                    n7 = 197;
                    break;
                }
                case 131: {
                    n7 = 148;
                    break;
                }
                case 132: {
                    n7 = 157;
                    break;
                }
                case 133: {
                    n7 = 48;
                    break;
                }
                case 134: {
                    n7 = 212;
                    break;
                }
                case 135: {
                    n7 = 185;
                    break;
                }
                case 136: {
                    n7 = 21;
                    break;
                }
                case 137: {
                    n7 = 71;
                    break;
                }
                case 138: {
                    n7 = 38;
                    break;
                }
                case 139: {
                    n7 = 56;
                    break;
                }
                case 140: {
                    n7 = 102;
                    break;
                }
                case 141: {
                    n7 = 171;
                    break;
                }
                case 142: {
                    n7 = 211;
                    break;
                }
                case 143: {
                    n7 = 206;
                    break;
                }
                case 144: {
                    n7 = 89;
                    break;
                }
                case 145: {
                    n7 = 44;
                    break;
                }
                case 146: {
                    n7 = 33;
                    break;
                }
                case 147: {
                    n7 = 231;
                    break;
                }
                case 148: {
                    n7 = 85;
                    break;
                }
                case 149: {
                    n7 = 31;
                    break;
                }
                case 150: {
                    n7 = 133;
                    break;
                }
                case 151: {
                    n7 = 47;
                    break;
                }
                case 152: {
                    n7 = 91;
                    break;
                }
                case 153: {
                    n7 = 245;
                    break;
                }
                case 154: {
                    n7 = 63;
                    break;
                }
                case 155: {
                    n7 = 207;
                    break;
                }
                case 156: {
                    n7 = 186;
                    break;
                }
                case 157: {
                    n7 = 55;
                    break;
                }
                case 158: {
                    n7 = 90;
                    break;
                }
                case 159: {
                    n7 = 16;
                    break;
                }
                case 160: {
                    n7 = 142;
                    break;
                }
                case 161: {
                    n7 = 198;
                    break;
                }
                case 162: {
                    n7 = 113;
                    break;
                }
                case 163: {
                    n7 = 97;
                    break;
                }
                case 164: {
                    n7 = 239;
                    break;
                }
                case 165: {
                    n7 = 75;
                    break;
                }
                case 166: {
                    n7 = 208;
                    break;
                }
                case 167: {
                    n7 = 126;
                    break;
                }
                case 168: {
                    n7 = 58;
                    break;
                }
                case 169: {
                    n7 = 194;
                    break;
                }
                case 170: {
                    n7 = 68;
                    break;
                }
                case 171: {
                    n7 = 49;
                    break;
                }
                case 172: {
                    n7 = 220;
                    break;
                }
                case 173: {
                    n7 = 114;
                    break;
                }
                case 174: {
                    n7 = 122;
                    break;
                }
                case 175: {
                    n7 = 156;
                    break;
                }
                case 176: {
                    n7 = 11;
                    break;
                }
                case 177: {
                    n7 = 7;
                    break;
                }
                case 178: {
                    n7 = 190;
                    break;
                }
                case 179: {
                    n7 = 42;
                    break;
                }
                case 180: {
                    n7 = 145;
                    break;
                }
                case 181: {
                    n7 = 98;
                    break;
                }
                case 182: {
                    n7 = 12;
                    break;
                }
                case 183: {
                    n7 = 237;
                    break;
                }
                case 184: {
                    n7 = 86;
                    break;
                }
                case 185: {
                    n7 = 43;
                    break;
                }
                case 186: {
                    n7 = 1;
                    break;
                }
                case 187: {
                    n7 = 247;
                    break;
                }
                case 188: {
                    n7 = 184;
                    break;
                }
                case 189: {
                    n7 = 144;
                    break;
                }
                case 190: {
                    n7 = 192;
                    break;
                }
                case 191: {
                    n7 = 202;
                    break;
                }
                case 192: {
                    n7 = 94;
                    break;
                }
                case 193: {
                    n7 = 134;
                    break;
                }
                case 194: {
                    n7 = 109;
                    break;
                }
                case 195: {
                    n7 = 193;
                    break;
                }
                case 196: {
                    n7 = 79;
                    break;
                }
                case 197: {
                    n7 = 123;
                    break;
                }
                case 198: {
                    n7 = 182;
                    break;
                }
                case 199: {
                    n7 = 130;
                    break;
                }
                case 200: {
                    n7 = 205;
                    break;
                }
                case 201: {
                    n7 = 125;
                    break;
                }
                case 202: {
                    n7 = 159;
                    break;
                }
                case 203: {
                    n7 = 251;
                    break;
                }
                case 204: {
                    n7 = 61;
                    break;
                }
                case 205: {
                    n7 = 131;
                    break;
                }
                case 206: {
                    n7 = 51;
                    break;
                }
                case 207: {
                    n7 = 137;
                    break;
                }
                case 208: {
                    n7 = 177;
                    break;
                }
                case 209: {
                    n7 = 218;
                    break;
                }
                case 210: {
                    n7 = 149;
                    break;
                }
                case 211: {
                    n7 = 121;
                    break;
                }
                case 212: {
                    n7 = 178;
                    break;
                }
                case 213: {
                    n7 = 240;
                    break;
                }
                case 214: {
                    n7 = 106;
                    break;
                }
                case 215: {
                    n7 = 101;
                    break;
                }
                case 216: {
                    n7 = 246;
                    break;
                }
                case 217: {
                    n7 = 69;
                    break;
                }
                case 218: {
                    n7 = 103;
                    break;
                }
                case 219: {
                    n7 = 76;
                    break;
                }
                case 220: {
                    n7 = 8;
                    break;
                }
                case 221: {
                    n7 = 176;
                    break;
                }
                case 222: {
                    n7 = 64;
                    break;
                }
                case 223: {
                    n7 = 165;
                    break;
                }
                case 224: {
                    n7 = 37;
                    break;
                }
                case 225: {
                    n7 = 248;
                    break;
                }
                case 226: {
                    n7 = 216;
                    break;
                }
                case 227: {
                    n7 = 99;
                    break;
                }
                case 228: {
                    n7 = 199;
                    break;
                }
                case 229: {
                    n7 = 54;
                    break;
                }
                case 230: {
                    n7 = 112;
                    break;
                }
                case 231: {
                    n7 = 146;
                    break;
                }
                case 232: {
                    n7 = 115;
                    break;
                }
                case 233: {
                    n7 = 187;
                    break;
                }
                case 234: {
                    n7 = 34;
                    break;
                }
                case 235: {
                    n7 = 80;
                    break;
                }
                case 236: {
                    n7 = 200;
                    break;
                }
                case 237: {
                    n7 = 50;
                    break;
                }
                case 238: {
                    n7 = 175;
                    break;
                }
                case 239: {
                    n7 = 225;
                    break;
                }
                case 240: {
                    n7 = 6;
                    break;
                }
                case 241: {
                    n7 = 26;
                    break;
                }
                case 242: {
                    n7 = 242;
                    break;
                }
                case 243: {
                    n7 = 232;
                    break;
                }
                case 244: {
                    n7 = 164;
                    break;
                }
                case 245: {
                    n7 = 150;
                    break;
                }
                case 246: {
                    n7 = 119;
                    break;
                }
                case 247: {
                    n7 = 88;
                    break;
                }
                case 248: {
                    n7 = 249;
                    break;
                }
                case 249: {
                    n7 = 105;
                    break;
                }
                case 250: {
                    n7 = 163;
                    break;
                }
                case 251: {
                    n7 = 152;
                    break;
                }
                case 252: {
                    n7 = 45;
                    break;
                }
                case 253: {
                    n7 = 116;
                    break;
                }
                case 254: {
                    n7 = 168;
                    break;
                }
                default: {
                    n7 = 210;
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
            f.b[n5] = new String(cArray).intern();
        }
        return b[n5];
    }
}

