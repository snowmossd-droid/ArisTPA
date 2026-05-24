/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL$TypeReference
 *  com.mojang.datafixers.DataFixer
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicOps
 */
package me.serbob.donuttp;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFixer;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import me.serbob.donuttp.C;
import me.serbob.donuttp.D;
import me.serbob.donuttp.c;
import me.serbob.donuttp.d;
import me.serbob.donuttp.f;
import me.serbob.donuttp.i8;
import me.serbob.donuttp.j;
import me.serbob.donuttp.o;
import me.serbob.donuttp.r;
import me.serbob.donuttp.s;

public class W {
    public static final int S;
    public static final int j;
    public static final int d;
    public static final int n;
    public static final int O;
    public static final int T;
    public static final int f;
    public static final int E;
    public static final int F;
    public static final int z;
    public static final int x;
    public static final int y;
    public static final int w;
    private static final String[] a;
    private static final String[] b;
    private static final long[] c;
    private static final Integer[] e;

    public static Object L(Object object, int n2, long l2, int n3) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
        long l3 = l2;
        long l4 = l3 ^ 0x1301EEDF3678L;
        long l5 = l3 ^ 0xECA98F43977L;
        int n4 = (int)(l5 >>> 48);
        int n5 = (int)(l5 << 16 >>> 32);
        int n6 = (int)(l5 << 48 >>> 48);
        DataFixer dataFixer = (DataFixer)me.serbob.donuttp.d.GET_DATAFIXER.R(l4, null, new Object[0]);
        Class<?> clazz = me.serbob.donuttp.c.NMS_REFERENCES.E();
        DSL.TypeReference typeReference = (DSL.TypeReference)clazz.getField(i8.c(clazz, (String)o.u((short)n4, n5, n6).get(W.a(1536140400 - 12216, -1536140400 - -23860, (int)l2)))).get(null);
        Class<?> clazz2 = me.serbob.donuttp.c.NMS_NBTOPS.E();
        DynamicOps dynamicOps = (DynamicOps)clazz2.getField(i8.c(clazz2, (String)o.u((short)n4, n5, n6).get(W.a(1536140400 - 12214, -1536140400 - -12327, (int)l2)))).get(null);
        Dynamic dynamic = dataFixer.update(typeReference, new Dynamic(dynamicOps, object), n2, n3);
        return dynamic.getValue();
    }

    public static j j(j j2, int n2, short s2, short s3, int n3, int n4) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
        long l2;
        long l3 = l2 = (long)n2 << 32 | (long)s2 << 48 >>> 32 | (long)s3 << 48 >>> 48;
        long l4 = l3 ^ 0x4FDA1DBFDB9CL;
        long l5 = l3 ^ 0x4F07DF298F58L;
        long l6 = l3 ^ 0x4D61DBB34780L;
        long l7 = l3 ^ 0x145F7CA6C1AAL;
        int n5 = (int)(l7 >>> 48);
        int n6 = (int)(l7 << 16 >>> 32);
        int n7 = (int)(l7 << 48 >>> 48);
        return new C(W.L(me.serbob.donuttp.f.Z((short)n5, n6, (short)n7, ((D)j2).h(l6), (D)j2), n3, l4, n4), l5);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static int S(long l2) {
        long l3 = l2;
        long l4 = l3 ^ 0x7F1DB8181D52L;
        long l5 = l3 ^ 0x25FA2D688ECL;
        if (r.m(r.MC1_21_R3, l4)) {
            return W.a(25305, 0x6A9AA885AB0C59F9L ^ l2);
        }
        int n2 = r.m(r.MC1_21_R2, l4);
        if (l2 > 0L) {
            if (n2 != 0) {
                return W.a(8823, 0xE5D61211706194BL ^ l2);
            }
            n2 = r.m(r.MC1_21_R1, l4);
        }
        if (l2 >= 0L) {
            if (n2 != 0) {
                return W.a(29200, 0x3B230AFEA4FE4932L ^ l2);
            }
            n2 = r.m(r.MC1_20_R4, l4);
        }
        if (l2 >= 0L) {
            if (n2 != 0) {
                return W.a(7707, 0x37D44D24ACE7A53EL ^ l2);
            }
            n2 = r.m(r.MC1_20_R3, l4);
        }
        if (l2 > 0L) {
            if (n2 != 0) {
                return W.a(28058, 0x7AE4502A5096D6BCL ^ l2);
            }
            n2 = r.m(r.MC1_20_R1, l4);
        }
        if (l2 >= 0L) {
            if (n2 != 0) {
                return W.a(1603, 0x38D134DDB03D3D78L ^ l2);
            }
            n2 = r.m(r.MC1_19_R3, l4);
        }
        if (l2 >= 0L) {
            if (n2 != 0) {
                return W.a(10816, 0x47209C03B18D9179L ^ l2);
            }
            n2 = r.m(r.MC1_19_R1, l4);
        }
        if (l2 >= 0L) {
            if (n2 != 0) {
                return W.a(22878, 0x5F9498F7F5DEE27DL ^ l2);
            }
            n2 = r.m(r.MC1_18_R1, l4);
        }
        if (l2 > 0L) {
            if (n2 != 0) {
                return W.a(24821, 0x9997980B14FDBC5L ^ l2);
            }
            n2 = r.m(r.MC1_17_R1, l4);
        }
        if (l2 > 0L) {
            if (n2 != 0) {
                return W.a(31014, 0x7BD1288553B7420CL ^ l2);
            }
            n2 = r.m(r.MC1_16_R1, l4);
        }
        if (l2 >= 0L) {
            if (n2 != 0) {
                return W.a(8884, 0x30B4B0393AB71989L ^ l2);
            }
            n2 = r.m(r.MC1_12_R1, l4);
        }
        if (l2 >= 0L) {
            if (n2 == 0) {
                throw new s(l5, W.a(-354282210 + -19563, 354282210 + 11076, (int)l2));
            }
            n2 = W.a(21819, 0x79205A08EBA5EE0CL ^ l2);
        }
        return n2;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block22: {
            block21: {
                block20: {
                    var13 = new String[3];
                    var11_1 = 0;
                    var10_2 = "\u00b0)\u0016\u0089\u0094N\u009e,m\u00e9\u0088\u00a6\u00d5\u00f2\u00ea\u00a9]~\u00de\u00bb\u008a\u00d2\u00a5X\u00a2\u009e\u00a0B\u0003N'\u00a8\u00e7q\u0015\u00d1\u00d2$\u00a3ZUp\u009f\u0003O\u00f5\u00ab\u0003-6\u00a8 \u0091e\u00bc\u00b2\u008e\u00d1\u009a+\f\u00c9A|\u00be\u000e\u00aciE\u00c3tn\u0084D\u00cb\u00f2Z<d\u00c6k\u00fc\u00f6\u001dt N\u008e`\u0094|M\u00cb\u00e9\u009bC3\u00fb|\u00c5\u0092h\u00f1L\u00b6\u00d6VP:\u00bc\u0007\u00bf\u00bd\u00a3\u0000\u00e3\u000b\u008c@`t\u008d\u0004-\u00d4\u00a3}\u009a\u00cb\u001c\u00c8\u00be\u0098\u0010\u008cB\u00d6\u0007\u009d@\u000f\u008e\u0093\u00a3\u001a\u00c1+6\u0092\u00a9R\u0099\u001cL\u008flO\u00e1\u00cc\u00a7]\u00d2\u00e0\u00bby\u00aa\u0084-\u00b8\u00fdE\u00f4\u00c7\u008do\u0002\u00ab\u00ec\u0083\u00d2V\u00e8\u00e6\u00a7\u000e\u00fb&\u00ec\u0093\u00f9\u00ca\u00ab\u00da-\u00bf\u00cb\u00e7\nb\u00ee\u009a>";
                    var12_3 = "\u00b0)\u0016\u0089\u0094N\u009e,m\u00e9\u0088\u00a6\u00d5\u00f2\u00ea\u00a9]~\u00de\u00bb\u008a\u00d2\u00a5X\u00a2\u009e\u00a0B\u0003N'\u00a8\u00e7q\u0015\u00d1\u00d2$\u00a3ZUp\u009f\u0003O\u00f5\u00ab\u0003-6\u00a8 \u0091e\u00bc\u00b2\u008e\u00d1\u009a+\f\u00c9A|\u00be\u000e\u00aciE\u00c3tn\u0084D\u00cb\u00f2Z<d\u00c6k\u00fc\u00f6\u001dt N\u008e`\u0094|M\u00cb\u00e9\u009bC3\u00fb|\u00c5\u0092h\u00f1L\u00b6\u00d6VP:\u00bc\u0007\u00bf\u00bd\u00a3\u0000\u00e3\u000b\u008c@`t\u008d\u0004-\u00d4\u00a3}\u009a\u00cb\u001c\u00c8\u00be\u0098\u0010\u008cB\u00d6\u0007\u009d@\u000f\u008e\u0093\u00a3\u001a\u00c1+6\u0092\u00a9R\u0099\u001cL\u008flO\u00e1\u00cc\u00a7]\u00d2\u00e0\u00bby\u00aa\u0084-\u00b8\u00fdE\u00f4\u00c7\u008do\u0002\u00ab\u00ec\u0083\u00d2V\u00e8\u00e6\u00a7\u000e\u00fb&\u00ec\u0093\u00f9\u00ca\u00ab\u00da-\u00bf\u00cb\u00e7\nb\u00ee\u009a>".length();
                    var9_4 = 33;
                    var8_5 = -1;
lbl7:
                    // 2 sources

                    while (true) {
                        continue;
                        break;
                    }
lbl9:
                    // 1 sources

                    while (true) {
                        var13[var11_1++] = new String(v0).intern();
                        if ((var8_5 += var9_4) < var12_3) {
                            var9_4 = var10_2.charAt(var8_5);
                            ** continue;
                        }
                        break block20;
                        break;
                    }
                    v1 = ++var8_5;
                    v2 = var10_2.substring(v1, v1 + var9_4).toCharArray();
                    var14_6 = 0;
                    v3 = v2.length;
                    v4 = v2;
                    v5 = v3;
                    if (v3 > 1) ** GOTO lbl59
                    do {
                        v6 = v4;
                        v7 = v4;
                        v8 = var14_6;
                        while (true) {
                            v9 = v6[v8];
                            switch (var14_6 % 7) {
                                case 0: {
                                    v10 = 79;
                                    break;
                                }
                                case 1: {
                                    v10 = 50;
                                    break;
                                }
                                case 2: {
                                    v10 = 62;
                                    break;
                                }
                                case 3: {
                                    v10 = 13;
                                    break;
                                }
                                case 4: {
                                    v10 = 6;
                                    break;
                                }
                                case 5: {
                                    v10 = 92;
                                    break;
                                }
                                default: {
                                    v10 = 98;
                                }
                            }
                            v6[v8] = (char)(v9 ^ v10);
                            ++var14_6;
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
                    } while (v5 > var14_6);
                    ** while (true)
                }
                W.a = var13;
                W.b = new String[3];
                var0_7 = 36546380814618L;
                var6_8 = new long[25];
                var3_9 = 0;
                var4_10 = "\u00b7JN\u001c\u0013l]\u00d3\u00dd\u00b4]\u0087\u008e\u0010?\u00d2\u00ce\u008eV\u00e1\u00baZk\u0097\u001a\u001881\u008a\u00ba[\u0010\u009a/\u00f4\u00d24\u0018\u00ed\u007f\u00f7\u009c\u000f\u00ff\u00e0\u00b0P\u00fe\u0094\u0000\u00ff^\\X\u0096X\u00f1J\u0014T\u00c7\u0003\u00d0\u00fa\u0012\"^\u008d\u00f6\u00f5E\u0099\u0088Z\u00db.\u00bb(\u008b<y\u00d1\u00b9\u00f4\u00b7K\u00cdE\u00d4p\u0016j\u00ba\u0098'\u00bd\u0084w\u00e1\u00f6\u00b3\u001a]6}\u00ef\u00e7\u00b5M\u0016\u00b1\u001cG\u0011++\u001c\u0013\u00adv\f\u00eaYV1\u00a2\u00a8^h\u00e5\u009d\u0004\u00af\u00eb\u00fd\u008e\u0082\u00ed\u008b1\u00fe\u00cbU\u0080\u00af\u00e7\u00b3;\u00a0\u0019\u00f2i\u0005\u00adl\u00f2\u00a7\u00d0\u00ab1\u00db\u00b9K\u008d[\u0083c\u0005\u0007GU\u008d0\u00db\u00033\u009f\u00d1\bS\u00a9\u00ff$\u0004";
                var5_11 = "\u00b7JN\u001c\u0013l]\u00d3\u00dd\u00b4]\u0087\u008e\u0010?\u00d2\u00ce\u008eV\u00e1\u00baZk\u0097\u001a\u001881\u008a\u00ba[\u0010\u009a/\u00f4\u00d24\u0018\u00ed\u007f\u00f7\u009c\u000f\u00ff\u00e0\u00b0P\u00fe\u0094\u0000\u00ff^\\X\u0096X\u00f1J\u0014T\u00c7\u0003\u00d0\u00fa\u0012\"^\u008d\u00f6\u00f5E\u0099\u0088Z\u00db.\u00bb(\u008b<y\u00d1\u00b9\u00f4\u00b7K\u00cdE\u00d4p\u0016j\u00ba\u0098'\u00bd\u0084w\u00e1\u00f6\u00b3\u001a]6}\u00ef\u00e7\u00b5M\u0016\u00b1\u001cG\u0011++\u001c\u0013\u00adv\f\u00eaYV1\u00a2\u00a8^h\u00e5\u009d\u0004\u00af\u00eb\u00fd\u008e\u0082\u00ed\u008b1\u00fe\u00cbU\u0080\u00af\u00e7\u00b3;\u00a0\u0019\u00f2i\u0005\u00adl\u00f2\u00a7\u00d0\u00ab1\u00db\u00b9K\u008d[\u0083c\u0005\u0007GU\u008d0\u00db\u00033\u009f\u00d1\bS\u00a9\u00ff$\u0004".length();
                var2_12 = 0;
                while (true) {
                    var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                    v12 = var6_8;
                    v13 = var3_9++;
                    v14 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                    v15 = -1;
                    break block21;
                    break;
                }
lbl81:
                // 1 sources

                while (true) {
                    v12[v13] = v16;
                    if (var2_12 < var5_11) ** continue;
                    var4_10 = "\u000b\u008d0\\\u00a7\u00f2\u0010\u000e\u00b1\n\u0002\u0094X\u00a2\u00f3k";
                    var5_11 = "\u000b\u008d0\\\u00a7\u00f2\u0010\u000e\u00b1\n\u0002\u0094X\u00a2\u00f3k".length();
                    var2_12 = 0;
                    while (true) {
                        var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                        v12 = var6_8;
                        v13 = var3_9++;
                        v14 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                        v15 = 0;
                        break block21;
                        break;
                    }
                    break;
                }
lbl94:
                // 1 sources

                while (true) {
                    v12[v13] = v16;
                    if (var2_12 < var5_11) ** continue;
                    break block22;
                    break;
                }
            }
            v16 = v14 ^ var0_7;
            switch (v15) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl105:
                // 1 sources

                ** continue;
            }
        }
        W.c = var6_8;
        W.e = new Integer[25];
        W.y = W.a(6481, var0_7 ^ 5987521979422906792L);
        W.O = W.a(22492, var0_7 ^ 4145494653945927456L);
        W.z = W.a(19347, var0_7 ^ 753342232843864932L);
        W.T = W.a(20517, var0_7 ^ 8038744620138254554L);
        W.F = W.a(12632, var0_7 ^ 8671875251766833574L);
        W.n = W.a(2118, var0_7 ^ 2470539518182885548L);
        W.w = W.a(32217, var0_7 ^ 5405192364087639330L);
        W.S = W.a(12002, var0_7 ^ 4081590067964980750L);
        W.f = W.a(16441, var0_7 ^ 1414392790175695052L);
        W.j = W.a(15348, var0_7 ^ 3234628056179456774L);
        W.d = W.a(23208, var0_7 ^ 2311161835627469392L);
        W.E = W.a(10519, var0_7 ^ 6064548083125922302L);
        W.x = W.a(21172, var0_7 ^ 5830586096380695111L);
    }

    private static String a(int n2, int n3, int n4) {
        int n5 = (n2 ^ n4 ^ 0xFFFFAA65) & 0xFFFF;
        if (b[n5] == null) {
            int n6;
            int n7;
            char[] cArray = a[n5].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n7 = 113;
                    break;
                }
                case 1: {
                    n7 = 131;
                    break;
                }
                case 2: {
                    n7 = 94;
                    break;
                }
                case 3: {
                    n7 = 144;
                    break;
                }
                case 4: {
                    n7 = 152;
                    break;
                }
                case 5: {
                    n7 = 142;
                    break;
                }
                case 6: {
                    n7 = 99;
                    break;
                }
                case 7: {
                    n7 = 61;
                    break;
                }
                case 8: {
                    n7 = 71;
                    break;
                }
                case 9: {
                    n7 = 147;
                    break;
                }
                case 10: {
                    n7 = 132;
                    break;
                }
                case 11: {
                    n7 = 197;
                    break;
                }
                case 12: {
                    n7 = 66;
                    break;
                }
                case 13: {
                    n7 = 170;
                    break;
                }
                case 14: {
                    n7 = 222;
                    break;
                }
                case 15: {
                    n7 = 38;
                    break;
                }
                case 16: {
                    n7 = 34;
                    break;
                }
                case 17: {
                    n7 = 63;
                    break;
                }
                case 18: {
                    n7 = 137;
                    break;
                }
                case 19: {
                    n7 = 109;
                    break;
                }
                case 20: {
                    n7 = 168;
                    break;
                }
                case 21: {
                    n7 = 203;
                    break;
                }
                case 22: {
                    n7 = 233;
                    break;
                }
                case 23: {
                    n7 = 238;
                    break;
                }
                case 24: {
                    n7 = 157;
                    break;
                }
                case 25: {
                    n7 = 28;
                    break;
                }
                case 26: {
                    n7 = 12;
                    break;
                }
                case 27: {
                    n7 = 226;
                    break;
                }
                case 28: {
                    n7 = 231;
                    break;
                }
                case 29: {
                    n7 = 85;
                    break;
                }
                case 30: {
                    n7 = 59;
                    break;
                }
                case 31: {
                    n7 = 158;
                    break;
                }
                case 32: {
                    n7 = 218;
                    break;
                }
                case 33: {
                    n7 = 26;
                    break;
                }
                case 34: {
                    n7 = 211;
                    break;
                }
                case 35: {
                    n7 = 255;
                    break;
                }
                case 36: {
                    n7 = 229;
                    break;
                }
                case 37: {
                    n7 = 53;
                    break;
                }
                case 38: {
                    n7 = 199;
                    break;
                }
                case 39: {
                    n7 = 73;
                    break;
                }
                case 40: {
                    n7 = 80;
                    break;
                }
                case 41: {
                    n7 = 20;
                    break;
                }
                case 42: {
                    n7 = 51;
                    break;
                }
                case 43: {
                    n7 = 30;
                    break;
                }
                case 44: {
                    n7 = 102;
                    break;
                }
                case 45: {
                    n7 = 246;
                    break;
                }
                case 46: {
                    n7 = 236;
                    break;
                }
                case 47: {
                    n7 = 187;
                    break;
                }
                case 48: {
                    n7 = 105;
                    break;
                }
                case 49: {
                    n7 = 29;
                    break;
                }
                case 50: {
                    n7 = 82;
                    break;
                }
                case 51: {
                    n7 = 50;
                    break;
                }
                case 52: {
                    n7 = 16;
                    break;
                }
                case 53: {
                    n7 = 248;
                    break;
                }
                case 54: {
                    n7 = 195;
                    break;
                }
                case 55: {
                    n7 = 190;
                    break;
                }
                case 56: {
                    n7 = 186;
                    break;
                }
                case 57: {
                    n7 = 252;
                    break;
                }
                case 58: {
                    n7 = 184;
                    break;
                }
                case 59: {
                    n7 = 136;
                    break;
                }
                case 60: {
                    n7 = 166;
                    break;
                }
                case 61: {
                    n7 = 43;
                    break;
                }
                case 62: {
                    n7 = 76;
                    break;
                }
                case 63: {
                    n7 = 31;
                    break;
                }
                case 64: {
                    n7 = 123;
                    break;
                }
                case 65: {
                    n7 = 67;
                    break;
                }
                case 66: {
                    n7 = 35;
                    break;
                }
                case 67: {
                    n7 = 106;
                    break;
                }
                case 68: {
                    n7 = 161;
                    break;
                }
                case 69: {
                    n7 = 213;
                    break;
                }
                case 70: {
                    n7 = 172;
                    break;
                }
                case 71: {
                    n7 = 8;
                    break;
                }
                case 72: {
                    n7 = 162;
                    break;
                }
                case 73: {
                    n7 = 19;
                    break;
                }
                case 74: {
                    n7 = 74;
                    break;
                }
                case 75: {
                    n7 = 143;
                    break;
                }
                case 76: {
                    n7 = 148;
                    break;
                }
                case 77: {
                    n7 = 60;
                    break;
                }
                case 78: {
                    n7 = 128;
                    break;
                }
                case 79: {
                    n7 = 119;
                    break;
                }
                case 80: {
                    n7 = 169;
                    break;
                }
                case 81: {
                    n7 = 254;
                    break;
                }
                case 82: {
                    n7 = 181;
                    break;
                }
                case 83: {
                    n7 = 118;
                    break;
                }
                case 84: {
                    n7 = 81;
                    break;
                }
                case 85: {
                    n7 = 65;
                    break;
                }
                case 86: {
                    n7 = 70;
                    break;
                }
                case 87: {
                    n7 = 183;
                    break;
                }
                case 88: {
                    n7 = 72;
                    break;
                }
                case 89: {
                    n7 = 245;
                    break;
                }
                case 90: {
                    n7 = 227;
                    break;
                }
                case 91: {
                    n7 = 42;
                    break;
                }
                case 92: {
                    n7 = 101;
                    break;
                }
                case 93: {
                    n7 = 156;
                    break;
                }
                case 94: {
                    n7 = 180;
                    break;
                }
                case 95: {
                    n7 = 14;
                    break;
                }
                case 96: {
                    n7 = 95;
                    break;
                }
                case 97: {
                    n7 = 212;
                    break;
                }
                case 98: {
                    n7 = 111;
                    break;
                }
                case 99: {
                    n7 = 182;
                    break;
                }
                case 100: {
                    n7 = 249;
                    break;
                }
                case 101: {
                    n7 = 96;
                    break;
                }
                case 102: {
                    n7 = 46;
                    break;
                }
                case 103: {
                    n7 = 5;
                    break;
                }
                case 104: {
                    n7 = 154;
                    break;
                }
                case 105: {
                    n7 = 2;
                    break;
                }
                case 106: {
                    n7 = 198;
                    break;
                }
                case 107: {
                    n7 = 208;
                    break;
                }
                case 108: {
                    n7 = 56;
                    break;
                }
                case 109: {
                    n7 = 177;
                    break;
                }
                case 110: {
                    n7 = 78;
                    break;
                }
                case 111: {
                    n7 = 116;
                    break;
                }
                case 112: {
                    n7 = 209;
                    break;
                }
                case 113: {
                    n7 = 149;
                    break;
                }
                case 114: {
                    n7 = 217;
                    break;
                }
                case 115: {
                    n7 = 159;
                    break;
                }
                case 116: {
                    n7 = 176;
                    break;
                }
                case 117: {
                    n7 = 124;
                    break;
                }
                case 118: {
                    n7 = 145;
                    break;
                }
                case 119: {
                    n7 = 188;
                    break;
                }
                case 120: {
                    n7 = 62;
                    break;
                }
                case 121: {
                    n7 = 251;
                    break;
                }
                case 122: {
                    n7 = 84;
                    break;
                }
                case 123: {
                    n7 = 244;
                    break;
                }
                case 124: {
                    n7 = 219;
                    break;
                }
                case 125: {
                    n7 = 216;
                    break;
                }
                case 126: {
                    n7 = 103;
                    break;
                }
                case 127: {
                    n7 = 125;
                    break;
                }
                case 128: {
                    n7 = 237;
                    break;
                }
                case 129: {
                    n7 = 10;
                    break;
                }
                case 130: {
                    n7 = 39;
                    break;
                }
                case 131: {
                    n7 = 224;
                    break;
                }
                case 132: {
                    n7 = 133;
                    break;
                }
                case 133: {
                    n7 = 160;
                    break;
                }
                case 134: {
                    n7 = 178;
                    break;
                }
                case 135: {
                    n7 = 191;
                    break;
                }
                case 136: {
                    n7 = 25;
                    break;
                }
                case 137: {
                    n7 = 107;
                    break;
                }
                case 138: {
                    n7 = 121;
                    break;
                }
                case 139: {
                    n7 = 239;
                    break;
                }
                case 140: {
                    n7 = 112;
                    break;
                }
                case 141: {
                    n7 = 201;
                    break;
                }
                case 142: {
                    n7 = 49;
                    break;
                }
                case 143: {
                    n7 = 15;
                    break;
                }
                case 144: {
                    n7 = 139;
                    break;
                }
                case 145: {
                    n7 = 41;
                    break;
                }
                case 146: {
                    n7 = 24;
                    break;
                }
                case 147: {
                    n7 = 146;
                    break;
                }
                case 148: {
                    n7 = 134;
                    break;
                }
                case 149: {
                    n7 = 0;
                    break;
                }
                case 150: {
                    n7 = 230;
                    break;
                }
                case 151: {
                    n7 = 40;
                    break;
                }
                case 152: {
                    n7 = 130;
                    break;
                }
                case 153: {
                    n7 = 98;
                    break;
                }
                case 154: {
                    n7 = 167;
                    break;
                }
                case 155: {
                    n7 = 33;
                    break;
                }
                case 156: {
                    n7 = 242;
                    break;
                }
                case 157: {
                    n7 = 204;
                    break;
                }
                case 158: {
                    n7 = 44;
                    break;
                }
                case 159: {
                    n7 = 232;
                    break;
                }
                case 160: {
                    n7 = 253;
                    break;
                }
                case 161: {
                    n7 = 200;
                    break;
                }
                case 162: {
                    n7 = 45;
                    break;
                }
                case 163: {
                    n7 = 202;
                    break;
                }
                case 164: {
                    n7 = 241;
                    break;
                }
                case 165: {
                    n7 = 135;
                    break;
                }
                case 166: {
                    n7 = 55;
                    break;
                }
                case 167: {
                    n7 = 58;
                    break;
                }
                case 168: {
                    n7 = 21;
                    break;
                }
                case 169: {
                    n7 = 220;
                    break;
                }
                case 170: {
                    n7 = 54;
                    break;
                }
                case 171: {
                    n7 = 141;
                    break;
                }
                case 172: {
                    n7 = 68;
                    break;
                }
                case 173: {
                    n7 = 240;
                    break;
                }
                case 174: {
                    n7 = 247;
                    break;
                }
                case 175: {
                    n7 = 3;
                    break;
                }
                case 176: {
                    n7 = 83;
                    break;
                }
                case 177: {
                    n7 = 17;
                    break;
                }
                case 178: {
                    n7 = 221;
                    break;
                }
                case 179: {
                    n7 = 27;
                    break;
                }
                case 180: {
                    n7 = 6;
                    break;
                }
                case 181: {
                    n7 = 22;
                    break;
                }
                case 182: {
                    n7 = 165;
                    break;
                }
                case 183: {
                    n7 = 155;
                    break;
                }
                case 184: {
                    n7 = 150;
                    break;
                }
                case 185: {
                    n7 = 69;
                    break;
                }
                case 186: {
                    n7 = 100;
                    break;
                }
                case 187: {
                    n7 = 174;
                    break;
                }
                case 188: {
                    n7 = 210;
                    break;
                }
                case 189: {
                    n7 = 89;
                    break;
                }
                case 190: {
                    n7 = 1;
                    break;
                }
                case 191: {
                    n7 = 52;
                    break;
                }
                case 192: {
                    n7 = 79;
                    break;
                }
                case 193: {
                    n7 = 36;
                    break;
                }
                case 194: {
                    n7 = 179;
                    break;
                }
                case 195: {
                    n7 = 18;
                    break;
                }
                case 196: {
                    n7 = 13;
                    break;
                }
                case 197: {
                    n7 = 205;
                    break;
                }
                case 198: {
                    n7 = 93;
                    break;
                }
                case 199: {
                    n7 = 234;
                    break;
                }
                case 200: {
                    n7 = 194;
                    break;
                }
                case 201: {
                    n7 = 90;
                    break;
                }
                case 202: {
                    n7 = 37;
                    break;
                }
                case 203: {
                    n7 = 4;
                    break;
                }
                case 204: {
                    n7 = 171;
                    break;
                }
                case 205: {
                    n7 = 175;
                    break;
                }
                case 206: {
                    n7 = 235;
                    break;
                }
                case 207: {
                    n7 = 92;
                    break;
                }
                case 208: {
                    n7 = 108;
                    break;
                }
                case 209: {
                    n7 = 164;
                    break;
                }
                case 210: {
                    n7 = 88;
                    break;
                }
                case 211: {
                    n7 = 122;
                    break;
                }
                case 212: {
                    n7 = 193;
                    break;
                }
                case 213: {
                    n7 = 153;
                    break;
                }
                case 214: {
                    n7 = 228;
                    break;
                }
                case 215: {
                    n7 = 97;
                    break;
                }
                case 216: {
                    n7 = 11;
                    break;
                }
                case 217: {
                    n7 = 196;
                    break;
                }
                case 218: {
                    n7 = 23;
                    break;
                }
                case 219: {
                    n7 = 75;
                    break;
                }
                case 220: {
                    n7 = 129;
                    break;
                }
                case 221: {
                    n7 = 104;
                    break;
                }
                case 222: {
                    n7 = 207;
                    break;
                }
                case 223: {
                    n7 = 110;
                    break;
                }
                case 224: {
                    n7 = 185;
                    break;
                }
                case 225: {
                    n7 = 77;
                    break;
                }
                case 226: {
                    n7 = 91;
                    break;
                }
                case 227: {
                    n7 = 32;
                    break;
                }
                case 228: {
                    n7 = 206;
                    break;
                }
                case 229: {
                    n7 = 47;
                    break;
                }
                case 230: {
                    n7 = 223;
                    break;
                }
                case 231: {
                    n7 = 87;
                    break;
                }
                case 232: {
                    n7 = 151;
                    break;
                }
                case 233: {
                    n7 = 57;
                    break;
                }
                case 234: {
                    n7 = 64;
                    break;
                }
                case 235: {
                    n7 = 225;
                    break;
                }
                case 236: {
                    n7 = 120;
                    break;
                }
                case 237: {
                    n7 = 9;
                    break;
                }
                case 238: {
                    n7 = 117;
                    break;
                }
                case 239: {
                    n7 = 163;
                    break;
                }
                case 240: {
                    n7 = 86;
                    break;
                }
                case 241: {
                    n7 = 126;
                    break;
                }
                case 242: {
                    n7 = 114;
                    break;
                }
                case 243: {
                    n7 = 7;
                    break;
                }
                case 244: {
                    n7 = 192;
                    break;
                }
                case 245: {
                    n7 = 140;
                    break;
                }
                case 246: {
                    n7 = 250;
                    break;
                }
                case 247: {
                    n7 = 214;
                    break;
                }
                case 248: {
                    n7 = 173;
                    break;
                }
                case 249: {
                    n7 = 138;
                    break;
                }
                case 250: {
                    n7 = 127;
                    break;
                }
                case 251: {
                    n7 = 243;
                    break;
                }
                case 252: {
                    n7 = 115;
                    break;
                }
                case 253: {
                    n7 = 189;
                    break;
                }
                case 254: {
                    n7 = 48;
                    break;
                }
                default: {
                    n7 = 215;
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
            W.b[n5] = new String(cArray).intern();
        }
        return b[n5];
    }

    private static int a(int n2, long l2) {
        int n3 = n2 ^ (int)(l2 & 0x7FFFL) ^ 0x59E5;
        if (e[n3] == null) {
            W.e[n3] = (int)(c[n3] ^ l2);
        }
        return e[n3];
    }
}

