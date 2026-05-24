/*
 * Decompiled with CFR 0.152.
 */
package me.serbob.donuttp;

import java.lang.reflect.Constructor;
import java.util.logging.Level;
import me.serbob.donuttp.c;
import me.serbob.donuttp.r;
import me.serbob.donuttp.s;

public final class v
extends Enum<v> {
    public static final /* enum */ v NMS_NBTTAGCOMPOUND;
    public static final /* enum */ v NMS_CUSTOMDATA;
    public static final /* enum */ v NMS_BLOCKPOSITION;
    public static final /* enum */ v NMS_COMPOUNDFROMITEM;
    private Constructor<?> t;
    private Class<?> v;
    private static final /* synthetic */ v[] A;
    private static final String[] a;
    private static final String[] b;

    public static v[] values() {
        return (v[])A.clone();
    }

    public static v valueOf(String string) {
        return Enum.valueOf(v.class, string);
    }

    /*
     * Unable to fully structure code
     */
    private v(int var4_3, r var5_4, r var6_5, Class var7_6, Class ... var8_7) {
        block12: {
            block13: {
                block15: {
                    block11: {
                        block14: {
                            var9_8 = var1_1 ^ 48873147231125L;
                            super(var3_2, var4_3);
                            if (var7_6 == null) {
                                return;
                            }
                            v0 = var5_4;
                            if (var1_1 <= 0L) ** GOTO lbl25
                            if (v0 == null) break block11;
                            v0 = r.M(var9_8);
                            if (var1_1 < 0L) ** GOTO lbl25
                            if (v0.o() >= var5_4.o()) break block11;
                            break block14;
                            catch (Exception v1) {
                                throw v1;
                            }
                        }
                        return;
                    }
                    if (var1_1 < 0L) break block12;
                    v0 = var6_5;
lbl25:
                    // 3 sources

                    if (v0 == null) break block13;
                    if (r.M(var9_8).o() <= var6_5.o()) break block13;
                    break block15;
                    catch (Exception v3) {
                        throw v3;
                    }
                }
                return;
            }
            try {
                this.v = var7_6;
                this.t = var7_6.getDeclaredConstructor(var8_7);
                this.t.setAccessible(true);
            }
            catch (Exception var11_9) {
                r.e().log(Level.SEVERE, me.serbob.donuttp.v.a(612359040 + (char)-14634, 612490110 - (char)-2199, (int)var1_1) + var7_6.getName() + "'", var11_9);
            }
        }
    }

    public Object h(long l2, Object ... objectArray) {
        long l3 = l2 ^ 0x1DF4EBECB1B2L;
        try {
            return this.t.newInstance(objectArray);
        }
        catch (Exception exception) {
            throw new s(me.serbob.donuttp.v.a(97385010 - 10462, -97385010 - -23448, (int)l2) + this.v + "'", exception, l3);
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block20: {
            block19: {
                var7 = 85641420969297L;
                var9_1 = var7 ^ 58399358630569L;
                var5_2 = new String[6];
                var3_3 = 0;
                var2_4 = "\u009f\u0081\u009eA\u009b$q\u00a5\u00d5v\u001d\u00f4\u00b8\u00b4\u0099\u0011\u00a4\u000e`\u009ca\u00e2eI\u0093%\u0012\u008ejG!\u0087\u0014\u00a3\u00ad\u0019\u00c4j\u0097l\u00a30\u00c2$\u00d0\u00b1\u00c3P;\\\u001d\u009d\u00c4\u0012\u00d9\u0082V!\u008e&E=!\u0087\u00c4#\n\u00d5M\u00a3\u00f8\u0005";
                var4_5 = "\u009f\u0081\u009eA\u009b$q\u00a5\u00d5v\u001d\u00f4\u00b8\u00b4\u0099\u0011\u00a4\u000e`\u009ca\u00e2eI\u0093%\u0012\u008ejG!\u0087\u0014\u00a3\u00ad\u0019\u00c4j\u0097l\u00a30\u00c2$\u00d0\u00b1\u00c3P;\\\u001d\u009d\u00c4\u0012\u00d9\u0082V!\u008e&E=!\u0087\u00c4#\n\u00d5M\u00a3\u00f8\u0005".length();
                var1_6 = 17;
                var0_7 = -1;
lbl10:
                // 2 sources

                while (true) {
                    v0 = ++var0_7;
                    v1 = var2_4.substring(v0, v0 + var1_6);
                    v2 = -1;
                    break block19;
                    break;
                }
lbl15:
                // 1 sources

                while (true) {
                    var5_2[var3_3++] = v3.intern();
                    if ((var0_7 += var1_6) < var4_5) {
                        var1_6 = var2_4.charAt(var0_7);
                        ** continue;
                    }
                    var2_4 = "U\u00fb\u009d\u00a7\u00ff\u00bd\u00af\u0085\u00c9\u00ab'\n\u00e0\u000f\u009a6@ZQ\u00e2\u00d0\u00df\u0098aZ\u00f5\u00bb\u00da\u0091\u0099b\t5\u00e26\u0087Dg\u0084\u00f0\u00c2\u001b]\u00f8.Z\u00b0l\u001d\u009f\u001cu\u0099\u00f3PPt:\u00e9c\u00b7\u0099\u00a3E*\u00a4\u0083s\u001e\u00cb\u007f\u00d2\u0007\u009d~\u00a8_m\u00c7H\u0017S\u00c4\u00e5\u0001\u0000\t5\t\"\u00d1";
                    var4_5 = "U\u00fb\u009d\u00a7\u00ff\u00bd\u00af\u0085\u00c9\u00ab'\n\u00e0\u000f\u009a6@ZQ\u00e2\u00d0\u00df\u0098aZ\u00f5\u00bb\u00da\u0091\u0099b\t5\u00e26\u0087Dg\u0084\u00f0\u00c2\u001b]\u00f8.Z\u00b0l\u001d\u009f\u001cu\u0099\u00f3PPt:\u00e9c\u00b7\u0099\u00a3E*\u00a4\u0083s\u001e\u00cb\u007f\u00d2\u0007\u009d~\u00a8_m\u00c7H\u0017S\u00c4\u00e5\u0001\u0000\t5\t\"\u00d1".length();
                    var1_6 = 44;
                    var0_7 = -1;
lbl24:
                    // 2 sources

                    while (true) {
                        v4 = ++var0_7;
                        v1 = var2_4.substring(v4, v4 + var1_6);
                        v2 = 0;
                        break block19;
                        break;
                    }
                    break;
                }
lbl29:
                // 1 sources

                while (true) {
                    var5_2[var3_3++] = v3.intern();
                    if ((var0_7 += var1_6) < var4_5) {
                        var1_6 = var2_4.charAt(var0_7);
                        ** continue;
                    }
                    break block20;
                    break;
                }
            }
            v5 = v1.toCharArray();
            var6_8 = 0;
            v6 = v5.length;
            v7 = v5;
            v8 = v6;
            if (v6 > 1) ** GOTO lbl79
            do {
                v9 = v7;
                v10 = v7;
                v11 = var6_8;
                while (true) {
                    v12 = v9[v11];
                    switch (var6_8 % 7) {
                        case 0: {
                            v13 = 13;
                            break;
                        }
                        case 1: {
                            v13 = 62;
                            break;
                        }
                        case 2: {
                            v13 = 24;
                            break;
                        }
                        case 3: {
                            v13 = 13;
                            break;
                        }
                        case 4: {
                            v13 = 48;
                            break;
                        }
                        case 5: {
                            v13 = 85;
                            break;
                        }
                        default: {
                            v13 = 65;
                        }
                    }
                    v9[v11] = (char)(v12 ^ v13);
                    ++var6_8;
                    v7 = v10;
                    v8 = v8;
                    if (v8 != 0) break;
                    v10 = v7;
                    v14 = v8;
                    v11 = v8;
                    v9 = v7;
                }
lbl79:
                // 2 sources

                v15 = v7;
                v14 = v8;
            } while (v8 > var6_8);
            v3 = new String(v15);
            switch (v2) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl88:
                // 1 sources

                ** continue;
            }
        }
        me.serbob.donuttp.v.a = var5_2;
        me.serbob.donuttp.v.b = new String[6];
        me.serbob.donuttp.v.NMS_NBTTAGCOMPOUND = new v(0, null, null, c.NMS_NBTTAGCOMPOUND.E(), new Class[0]);
        me.serbob.donuttp.v.NMS_CUSTOMDATA = new v(1, r.MC1_20_R4, null, c.NMS_CUSTOMDATA.E(), new Class[]{c.NMS_NBTTAGCOMPOUND.E()});
        me.serbob.donuttp.v.NMS_BLOCKPOSITION = new v(2, null, null, c.NMS_BLOCKPOSITION.E(), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE});
        me.serbob.donuttp.v.NMS_COMPOUNDFROMITEM = new v(3, r.MC1_11_R1, r.MC1_20_R3, c.NMS_ITEMSTACK.E(), new Class[]{c.NMS_NBTTAGCOMPOUND.E()});
        me.serbob.donuttp.v.A = new v[]{me.serbob.donuttp.v.NMS_NBTTAGCOMPOUND, me.serbob.donuttp.v.NMS_CUSTOMDATA, me.serbob.donuttp.v.NMS_BLOCKPOSITION, me.serbob.donuttp.v.NMS_COMPOUNDFROMITEM};
    }

    private static String a(int n2, int n3, int n4) {
        int n5 = (n2 ^ n4 ^ 0xFFFF8DAB) & 0xFFFF;
        if (b[n5] == null) {
            int n6;
            int n7;
            char[] cArray = a[n5].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n7 = 146;
                    break;
                }
                case 1: {
                    n7 = 200;
                    break;
                }
                case 2: {
                    n7 = 64;
                    break;
                }
                case 3: {
                    n7 = 0;
                    break;
                }
                case 4: {
                    n7 = 39;
                    break;
                }
                case 5: {
                    n7 = 173;
                    break;
                }
                case 6: {
                    n7 = 132;
                    break;
                }
                case 7: {
                    n7 = 54;
                    break;
                }
                case 8: {
                    n7 = 127;
                    break;
                }
                case 9: {
                    n7 = 26;
                    break;
                }
                case 10: {
                    n7 = 83;
                    break;
                }
                case 11: {
                    n7 = 212;
                    break;
                }
                case 12: {
                    n7 = 123;
                    break;
                }
                case 13: {
                    n7 = 175;
                    break;
                }
                case 14: {
                    n7 = 46;
                    break;
                }
                case 15: {
                    n7 = 51;
                    break;
                }
                case 16: {
                    n7 = 159;
                    break;
                }
                case 17: {
                    n7 = 79;
                    break;
                }
                case 18: {
                    n7 = 49;
                    break;
                }
                case 19: {
                    n7 = 112;
                    break;
                }
                case 20: {
                    n7 = 133;
                    break;
                }
                case 21: {
                    n7 = 47;
                    break;
                }
                case 22: {
                    n7 = 89;
                    break;
                }
                case 23: {
                    n7 = 117;
                    break;
                }
                case 24: {
                    n7 = 189;
                    break;
                }
                case 25: {
                    n7 = 93;
                    break;
                }
                case 26: {
                    n7 = 165;
                    break;
                }
                case 27: {
                    n7 = 161;
                    break;
                }
                case 28: {
                    n7 = 227;
                    break;
                }
                case 29: {
                    n7 = 237;
                    break;
                }
                case 30: {
                    n7 = 102;
                    break;
                }
                case 31: {
                    n7 = 246;
                    break;
                }
                case 32: {
                    n7 = 1;
                    break;
                }
                case 33: {
                    n7 = 59;
                    break;
                }
                case 34: {
                    n7 = 141;
                    break;
                }
                case 35: {
                    n7 = 14;
                    break;
                }
                case 36: {
                    n7 = 71;
                    break;
                }
                case 37: {
                    n7 = 90;
                    break;
                }
                case 38: {
                    n7 = 76;
                    break;
                }
                case 39: {
                    n7 = 140;
                    break;
                }
                case 40: {
                    n7 = 36;
                    break;
                }
                case 41: {
                    n7 = 55;
                    break;
                }
                case 42: {
                    n7 = 162;
                    break;
                }
                case 43: {
                    n7 = 104;
                    break;
                }
                case 44: {
                    n7 = 156;
                    break;
                }
                case 45: {
                    n7 = 139;
                    break;
                }
                case 46: {
                    n7 = 164;
                    break;
                }
                case 47: {
                    n7 = 144;
                    break;
                }
                case 48: {
                    n7 = 50;
                    break;
                }
                case 49: {
                    n7 = 134;
                    break;
                }
                case 50: {
                    n7 = 7;
                    break;
                }
                case 51: {
                    n7 = 5;
                    break;
                }
                case 52: {
                    n7 = 48;
                    break;
                }
                case 53: {
                    n7 = 20;
                    break;
                }
                case 54: {
                    n7 = 193;
                    break;
                }
                case 55: {
                    n7 = 198;
                    break;
                }
                case 56: {
                    n7 = 205;
                    break;
                }
                case 57: {
                    n7 = 23;
                    break;
                }
                case 58: {
                    n7 = 218;
                    break;
                }
                case 59: {
                    n7 = 81;
                    break;
                }
                case 60: {
                    n7 = 211;
                    break;
                }
                case 61: {
                    n7 = 12;
                    break;
                }
                case 62: {
                    n7 = 228;
                    break;
                }
                case 63: {
                    n7 = 177;
                    break;
                }
                case 64: {
                    n7 = 186;
                    break;
                }
                case 65: {
                    n7 = 192;
                    break;
                }
                case 66: {
                    n7 = 247;
                    break;
                }
                case 67: {
                    n7 = 110;
                    break;
                }
                case 68: {
                    n7 = 163;
                    break;
                }
                case 69: {
                    n7 = 66;
                    break;
                }
                case 70: {
                    n7 = 250;
                    break;
                }
                case 71: {
                    n7 = 125;
                    break;
                }
                case 72: {
                    n7 = 153;
                    break;
                }
                case 73: {
                    n7 = 103;
                    break;
                }
                case 74: {
                    n7 = 85;
                    break;
                }
                case 75: {
                    n7 = 119;
                    break;
                }
                case 76: {
                    n7 = 179;
                    break;
                }
                case 77: {
                    n7 = 52;
                    break;
                }
                case 78: {
                    n7 = 138;
                    break;
                }
                case 79: {
                    n7 = 115;
                    break;
                }
                case 80: {
                    n7 = 109;
                    break;
                }
                case 81: {
                    n7 = 25;
                    break;
                }
                case 82: {
                    n7 = 188;
                    break;
                }
                case 83: {
                    n7 = 24;
                    break;
                }
                case 84: {
                    n7 = 19;
                    break;
                }
                case 85: {
                    n7 = 122;
                    break;
                }
                case 86: {
                    n7 = 136;
                    break;
                }
                case 87: {
                    n7 = 235;
                    break;
                }
                case 88: {
                    n7 = 128;
                    break;
                }
                case 89: {
                    n7 = 245;
                    break;
                }
                case 90: {
                    n7 = 215;
                    break;
                }
                case 91: {
                    n7 = 248;
                    break;
                }
                case 92: {
                    n7 = 28;
                    break;
                }
                case 93: {
                    n7 = 94;
                    break;
                }
                case 94: {
                    n7 = 255;
                    break;
                }
                case 95: {
                    n7 = 118;
                    break;
                }
                case 96: {
                    n7 = 230;
                    break;
                }
                case 97: {
                    n7 = 199;
                    break;
                }
                case 98: {
                    n7 = 69;
                    break;
                }
                case 99: {
                    n7 = 77;
                    break;
                }
                case 100: {
                    n7 = 181;
                    break;
                }
                case 101: {
                    n7 = 157;
                    break;
                }
                case 102: {
                    n7 = 10;
                    break;
                }
                case 103: {
                    n7 = 209;
                    break;
                }
                case 104: {
                    n7 = 171;
                    break;
                }
                case 105: {
                    n7 = 80;
                    break;
                }
                case 106: {
                    n7 = 8;
                    break;
                }
                case 107: {
                    n7 = 21;
                    break;
                }
                case 108: {
                    n7 = 30;
                    break;
                }
                case 109: {
                    n7 = 203;
                    break;
                }
                case 110: {
                    n7 = 108;
                    break;
                }
                case 111: {
                    n7 = 31;
                    break;
                }
                case 112: {
                    n7 = 145;
                    break;
                }
                case 113: {
                    n7 = 15;
                    break;
                }
                case 114: {
                    n7 = 180;
                    break;
                }
                case 115: {
                    n7 = 105;
                    break;
                }
                case 116: {
                    n7 = 2;
                    break;
                }
                case 117: {
                    n7 = 75;
                    break;
                }
                case 118: {
                    n7 = 155;
                    break;
                }
                case 119: {
                    n7 = 53;
                    break;
                }
                case 120: {
                    n7 = 202;
                    break;
                }
                case 121: {
                    n7 = 239;
                    break;
                }
                case 122: {
                    n7 = 57;
                    break;
                }
                case 123: {
                    n7 = 142;
                    break;
                }
                case 124: {
                    n7 = 174;
                    break;
                }
                case 125: {
                    n7 = 41;
                    break;
                }
                case 126: {
                    n7 = 97;
                    break;
                }
                case 127: {
                    n7 = 44;
                    break;
                }
                case 128: {
                    n7 = 130;
                    break;
                }
                case 129: {
                    n7 = 204;
                    break;
                }
                case 130: {
                    n7 = 184;
                    break;
                }
                case 131: {
                    n7 = 124;
                    break;
                }
                case 132: {
                    n7 = 148;
                    break;
                }
                case 133: {
                    n7 = 201;
                    break;
                }
                case 134: {
                    n7 = 29;
                    break;
                }
                case 135: {
                    n7 = 143;
                    break;
                }
                case 136: {
                    n7 = 137;
                    break;
                }
                case 137: {
                    n7 = 249;
                    break;
                }
                case 138: {
                    n7 = 224;
                    break;
                }
                case 139: {
                    n7 = 206;
                    break;
                }
                case 140: {
                    n7 = 92;
                    break;
                }
                case 141: {
                    n7 = 208;
                    break;
                }
                case 142: {
                    n7 = 91;
                    break;
                }
                case 143: {
                    n7 = 72;
                    break;
                }
                case 144: {
                    n7 = 32;
                    break;
                }
                case 145: {
                    n7 = 195;
                    break;
                }
                case 146: {
                    n7 = 240;
                    break;
                }
                case 147: {
                    n7 = 160;
                    break;
                }
                case 148: {
                    n7 = 42;
                    break;
                }
                case 149: {
                    n7 = 88;
                    break;
                }
                case 150: {
                    n7 = 232;
                    break;
                }
                case 151: {
                    n7 = 82;
                    break;
                }
                case 152: {
                    n7 = 11;
                    break;
                }
                case 153: {
                    n7 = 216;
                    break;
                }
                case 154: {
                    n7 = 35;
                    break;
                }
                case 155: {
                    n7 = 172;
                    break;
                }
                case 156: {
                    n7 = 170;
                    break;
                }
                case 157: {
                    n7 = 34;
                    break;
                }
                case 158: {
                    n7 = 111;
                    break;
                }
                case 159: {
                    n7 = 242;
                    break;
                }
                case 160: {
                    n7 = 150;
                    break;
                }
                case 161: {
                    n7 = 56;
                    break;
                }
                case 162: {
                    n7 = 196;
                    break;
                }
                case 163: {
                    n7 = 229;
                    break;
                }
                case 164: {
                    n7 = 63;
                    break;
                }
                case 165: {
                    n7 = 197;
                    break;
                }
                case 166: {
                    n7 = 190;
                    break;
                }
                case 167: {
                    n7 = 251;
                    break;
                }
                case 168: {
                    n7 = 243;
                    break;
                }
                case 169: {
                    n7 = 16;
                    break;
                }
                case 170: {
                    n7 = 213;
                    break;
                }
                case 171: {
                    n7 = 166;
                    break;
                }
                case 172: {
                    n7 = 151;
                    break;
                }
                case 173: {
                    n7 = 210;
                    break;
                }
                case 174: {
                    n7 = 60;
                    break;
                }
                case 175: {
                    n7 = 40;
                    break;
                }
                case 176: {
                    n7 = 222;
                    break;
                }
                case 177: {
                    n7 = 169;
                    break;
                }
                case 178: {
                    n7 = 73;
                    break;
                }
                case 179: {
                    n7 = 33;
                    break;
                }
                case 180: {
                    n7 = 233;
                    break;
                }
                case 181: {
                    n7 = 3;
                    break;
                }
                case 182: {
                    n7 = 234;
                    break;
                }
                case 183: {
                    n7 = 68;
                    break;
                }
                case 184: {
                    n7 = 106;
                    break;
                }
                case 185: {
                    n7 = 43;
                    break;
                }
                case 186: {
                    n7 = 74;
                    break;
                }
                case 187: {
                    n7 = 6;
                    break;
                }
                case 188: {
                    n7 = 37;
                    break;
                }
                case 189: {
                    n7 = 135;
                    break;
                }
                case 190: {
                    n7 = 78;
                    break;
                }
                case 191: {
                    n7 = 121;
                    break;
                }
                case 192: {
                    n7 = 84;
                    break;
                }
                case 193: {
                    n7 = 65;
                    break;
                }
                case 194: {
                    n7 = 70;
                    break;
                }
                case 195: {
                    n7 = 244;
                    break;
                }
                case 196: {
                    n7 = 126;
                    break;
                }
                case 197: {
                    n7 = 17;
                    break;
                }
                case 198: {
                    n7 = 167;
                    break;
                }
                case 199: {
                    n7 = 194;
                    break;
                }
                case 200: {
                    n7 = 18;
                    break;
                }
                case 201: {
                    n7 = 214;
                    break;
                }
                case 202: {
                    n7 = 226;
                    break;
                }
                case 203: {
                    n7 = 154;
                    break;
                }
                case 204: {
                    n7 = 231;
                    break;
                }
                case 205: {
                    n7 = 107;
                    break;
                }
                case 206: {
                    n7 = 178;
                    break;
                }
                case 207: {
                    n7 = 61;
                    break;
                }
                case 208: {
                    n7 = 96;
                    break;
                }
                case 209: {
                    n7 = 149;
                    break;
                }
                case 210: {
                    n7 = 219;
                    break;
                }
                case 211: {
                    n7 = 38;
                    break;
                }
                case 212: {
                    n7 = 101;
                    break;
                }
                case 213: {
                    n7 = 58;
                    break;
                }
                case 214: {
                    n7 = 207;
                    break;
                }
                case 215: {
                    n7 = 220;
                    break;
                }
                case 216: {
                    n7 = 185;
                    break;
                }
                case 217: {
                    n7 = 183;
                    break;
                }
                case 218: {
                    n7 = 131;
                    break;
                }
                case 219: {
                    n7 = 120;
                    break;
                }
                case 220: {
                    n7 = 253;
                    break;
                }
                case 221: {
                    n7 = 13;
                    break;
                }
                case 222: {
                    n7 = 95;
                    break;
                }
                case 223: {
                    n7 = 4;
                    break;
                }
                case 224: {
                    n7 = 225;
                    break;
                }
                case 225: {
                    n7 = 9;
                    break;
                }
                case 226: {
                    n7 = 182;
                    break;
                }
                case 227: {
                    n7 = 22;
                    break;
                }
                case 228: {
                    n7 = 254;
                    break;
                }
                case 229: {
                    n7 = 236;
                    break;
                }
                case 230: {
                    n7 = 86;
                    break;
                }
                case 231: {
                    n7 = 191;
                    break;
                }
                case 232: {
                    n7 = 45;
                    break;
                }
                case 233: {
                    n7 = 99;
                    break;
                }
                case 234: {
                    n7 = 129;
                    break;
                }
                case 235: {
                    n7 = 238;
                    break;
                }
                case 236: {
                    n7 = 87;
                    break;
                }
                case 237: {
                    n7 = 158;
                    break;
                }
                case 238: {
                    n7 = 113;
                    break;
                }
                case 239: {
                    n7 = 98;
                    break;
                }
                case 240: {
                    n7 = 176;
                    break;
                }
                case 241: {
                    n7 = 152;
                    break;
                }
                case 242: {
                    n7 = 27;
                    break;
                }
                case 243: {
                    n7 = 252;
                    break;
                }
                case 244: {
                    n7 = 62;
                    break;
                }
                case 245: {
                    n7 = 223;
                    break;
                }
                case 246: {
                    n7 = 241;
                    break;
                }
                case 247: {
                    n7 = 221;
                    break;
                }
                case 248: {
                    n7 = 114;
                    break;
                }
                case 249: {
                    n7 = 168;
                    break;
                }
                case 250: {
                    n7 = 187;
                    break;
                }
                case 251: {
                    n7 = 67;
                    break;
                }
                case 252: {
                    n7 = 147;
                    break;
                }
                case 253: {
                    n7 = 116;
                    break;
                }
                case 254: {
                    n7 = 217;
                    break;
                }
                default: {
                    n7 = 100;
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
            me.serbob.donuttp.v.b[n5] = new String(cArray).intern();
        }
        return b[n5];
    }
}

