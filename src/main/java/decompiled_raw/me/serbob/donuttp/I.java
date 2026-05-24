/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.Bukkit
 *  org.bukkit.block.BlockState
 */
package me.serbob.donuttp;

import me.serbob.donuttp.C;
import me.serbob.donuttp.D;
import me.serbob.donuttp.J;
import me.serbob.donuttp.f;
import me.serbob.donuttp.r;
import me.serbob.donuttp.s;
import org.bukkit.Bukkit;
import org.bukkit.block.BlockState;

public class I
extends D {
    private final BlockState t;
    private final boolean w;
    private final Object u;
    private boolean T;
    private static final String[] c;
    private static final String[] e;

    /*
     * Unable to fully structure code
     */
    protected I(BlockState var1_1, boolean var2_2, long var3_3) {
        block11: {
            block9: {
                block10: {
                    block8: {
                        v0 = var3_3;
                        var5_4 = v0 ^ 45603492530738L;
                        var7_5 = v0 ^ 96762065008500L;
                        super(null, null);
                        this.T = false;
                        if (var1_1 == null) ** GOTO lbl21
                        v1 = r.m(r.MC1_8_R3, var5_4);
                        if (var3_3 > 0L) {
                            if (!v1) break block8;
                            v1 = var1_1.isPlaced();
                            if (var3_3 >= 0L) {
                                if (v1) break block8;
                            }
                        }
                        ** GOTO lbl31
lbl21:
                        // 2 sources

                        throw new NullPointerException(I.b(1325379840 - (char)-21052, 1325379840 - 20543, (int)var3_3));
                    }
                    this.t = var1_1;
                    v4 = this;
                    if (var3_3 <= 0L) break block9;
                    v4.w = var2_2;
                    v1 = var2_2;
lbl31:
                    // 2 sources

                    if (!v1) break block10;
                    this.u = this.h(var7_5);
                    break block11;
                }
                v4 = this;
            }
            v4.u = null;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Deprecated
    public I(BlockState blockState, long l2) {
        block5: {
            long l3 = l2 ^ 0x6BDBDAE4F29DL;
            super(null, null);
            this.T = false;
            if (blockState == null) throw new NullPointerException(I.b(2011400220 - (char)-29560, -2011400220 - -((char)-8383), (int)l2));
            boolean bl = r.m(r.MC1_8_R3, l3);
            if (l2 >= 0L) {
                if (!bl) break block5;
                bl = blockState.isPlaced();
            }
            if (bl) break block5;
            throw new NullPointerException(I.b(2011400220 - (char)-29560, -2011400220 - -((char)-8383), (int)l2));
        }
        this.w = false;
        this.u = null;
        this.t = blockState;
    }

    @Override
    protected void z(long l2) {
        this.T = true;
    }

    @Override
    protected boolean q(long l2) {
        return this.T;
    }

    @Override
    protected boolean L() {
        return this.w;
    }

    @Override
    public Object h(long l2) {
        long l3;
        long l4;
        block7: {
            long l5 = l2;
            l4 = l5 ^ 0xDFE43407C0CL;
            l3 = l5 ^ 0xC3AD5B4A8F8L;
            if (!this.w || this.u == null) break block7;
            return this.u;
        }
        if (!Bukkit.isPrimaryThread()) {
            throw new s(l3, I.b(1652268420 + (char)-26935, 1652268420 + 32755, (int)l2));
        }
        return f.x(this.t, l4);
    }

    @Override
    protected void x(long l2, Object object) {
        block6: {
            long l3 = l2;
            long l4 = l3 ^ 0x113ED1F825C2L;
            int n2 = (int)(l4 >>> 32);
            long l5 = l4 << 32 >>> 32;
            long l6 = l3 ^ 0x5ACDEB081EB2L;
            if (this.w) {
                throw new s(l6, I.b(1556063040 + (char)-8512, 1556063040 + (char)-2384, (int)l2));
            }
            if (l2 < 0L) break block6;
            if (!Bukkit.isPrimaryThread()) {
                throw new s(l6, I.b(1556063040 + (char)-8506, -1556194110 - -((char)-10771), (int)l2));
            }
            f.z(this.t, n2, l5, object);
        }
    }

    public D P(long l2) {
        long l3 = l2;
        long l4 = l3 ^ 0x7A21A3B4665DL;
        long l5 = l3 ^ 0x4A253DE05D39L;
        int n2 = (int)(l5 >>> 48);
        int n3 = (int)(l5 << 16 >>> 32);
        int n4 = (int)(l5 << 48 >>> 48);
        long l6 = l3 ^ 0x77D305996241L;
        long l7 = l3 ^ 0x51BA5DC537A6L;
        long l8 = l3 ^ 0x18727BA61D70L;
        long l9 = l3 ^ 0x5046198D8339L;
        long l10 = l3 ^ 0x6FC0264FC0D1L;
        int n5 = (int)(l10 >>> 32);
        int n6 = (int)(l10 << 32 >>> 48);
        int n7 = (int)(l10 << 48 >>> 48);
        J.G(r.MC1_14_R1, l4);
        if (this.k(l8, I.b(1936297110 + (char)-17866, -1936297110 + -((char)-19641), (int)l2))) {
            return this.z(l6, I.b(1936297110 + (char)-17874, 1936297110 + (char)-9655, (int)l2));
        }
        C c2 = new C(n5, n6, (short)n7);
        c2.B((short)n2, I.b(1936297110 + (char)-17874, 1936297110 + (char)-9655, (int)l2), n3, (char)n4).I(I.b(1936297110 + (char)-17869, 1936297110 + (char)-26750, (int)l2), I.b(1936297110 + (char)-17867, 1936297110 + (char)-11335, (int)l2), l7);
        this.S(l9, c2);
        return this.z(l6, I.b(1936297110 + (char)-17874, 1936297110 + (char)-9655, (int)l2));
    }

    /*
     * Unable to fully structure code
     */
    static {
        block20: {
            block19: {
                var5 = new String[9];
                var3_1 = 0;
                var2_2 = "P\u00e3\n7\u00a4RYXm\u0083>\u00a0\u00e3D\u00e4\u0097 \u00a6\u001e\u00eejW\u0090\u0089\u008e\u00bf\u00d8\u00ba\u00f4H\u00a4~Q\u0000\\\u00f7\u00c0\u0092\u00a1<\u008b\u0002\u00c3\u00f4\u00c5*[F\u00a4*'\u00ad\u00b9\u00cb|\u0005,Qh\u009c\u00cc\u00eb\u00b7\u00d0M\u0017!_@py\u00aea\u00a6\n\u00966\u0017\u0006\u0082\u00d6\u00c6\u0004T3\u009b\u00a8\u00d0\u00b4\u00cb\u00950*\u00f7\u0088\u00a3o?\u0091D\u00c3e\u00cem\u00a1\u0083\u0099\u00cb>\u00f1zZ\u00d4::\t4\u0007\u00c4\u0097]2\u00cbP\u00ef\u00d4q)?\u00ebD\u00dcY\u0098b%ZD\u00c4-\u001az\u0013f,I\u00ea\u001fH\u00ab\u008e\u0017u2\u00d6T[\u0086\u009d\u00a9\u0012:\u0019\u000b\u0001\u00a8\u00c2(\u00c1xW\u0080\u0004\b_\u0014\t\u00a8Tl\u00cb\u00c1\u001e\"\u00bc\u00ceJ\u00ba\u00d5\u00d9\u00b3v\u0099\u00d1\tM\u00e4f\u00ea;\u0016\u000b{\u000f\u00d0d\u00a88\u00a8\u00b3\u00f6u\u0011";
                var4_3 = "P\u00e3\n7\u00a4RYXm\u0083>\u00a0\u00e3D\u00e4\u0097 \u00a6\u001e\u00eejW\u0090\u0089\u008e\u00bf\u00d8\u00ba\u00f4H\u00a4~Q\u0000\\\u00f7\u00c0\u0092\u00a1<\u008b\u0002\u00c3\u00f4\u00c5*[F\u00a4*'\u00ad\u00b9\u00cb|\u0005,Qh\u009c\u00cc\u00eb\u00b7\u00d0M\u0017!_@py\u00aea\u00a6\n\u00966\u0017\u0006\u0082\u00d6\u00c6\u0004T3\u009b\u00a8\u00d0\u00b4\u00cb\u00950*\u00f7\u0088\u00a3o?\u0091D\u00c3e\u00cem\u00a1\u0083\u0099\u00cb>\u00f1zZ\u00d4::\t4\u0007\u00c4\u0097]2\u00cbP\u00ef\u00d4q)?\u00ebD\u00dcY\u0098b%ZD\u00c4-\u001az\u0013f,I\u00ea\u001fH\u00ab\u008e\u0017u2\u00d6T[\u0086\u009d\u00a9\u0012:\u0019\u000b\u0001\u00a8\u00c2(\u00c1xW\u0080\u0004\b_\u0014\t\u00a8Tl\u00cb\u00c1\u001e\"\u00bc\u00ceJ\u00ba\u00d5\u00d9\u00b3v\u0099\u00d1\tM\u00e4f\u00ea;\u0016\u000b{\u000f\u00d0d\u00a88\u00a8\u00b3\u00f6u\u0011".length();
                var1_4 = 18;
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
                    var2_2 = "\u00ed\u0003\u0013\u00ba\u0099\u0015\u0011\u0082N\u00b2\u00da\u00b1\u00c6\u00d5\u0096 \u00a6g3C\u00ec(\u0000h\u0092\u009f\u001c\u00acVUi\u00ee\u00a3R\u009dgb\u0016#Csr\u00ef=\u0080H\u009a\u00a72\u00d7\u00004:\u00b0\u00cc\u0012\u0018\u00c1\u0003s\u0085\u00da}I\u00e9\u00a1\u00ae\u00e4\u00f1\u00cc\u00a6\u0086h\u0084";
                    var4_3 = "\u00ed\u0003\u0013\u00ba\u0099\u0015\u0011\u0082N\u00b2\u00da\u00b1\u00c6\u00d5\u0096 \u00a6g3C\u00ec(\u0000h\u0092\u009f\u001c\u00acVUi\u00ee\u00a3R\u009dgb\u0016#Csr\u00ef=\u0080H\u009a\u00a72\u00d7\u00004:\u00b0\u00cc\u0012\u0018\u00c1\u0003s\u0085\u00da}I\u00e9\u00a1\u00ae\u00e4\u00f1\u00cc\u00a6\u0086h\u0084".length();
                    var1_4 = 55;
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
                            v13 = 106;
                            break;
                        }
                        case 1: {
                            v13 = 110;
                            break;
                        }
                        case 2: {
                            v13 = 117;
                            break;
                        }
                        case 3: {
                            v13 = 49;
                            break;
                        }
                        case 4: {
                            v13 = 12;
                            break;
                        }
                        case 5: {
                            v13 = 16;
                            break;
                        }
                        default: {
                            v13 = 74;
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
        I.c = var5;
        I.e = new String[9];
    }

    private static String b(int n2, int n3, int n4) {
        int n5 = (n2 ^ n4 ^ 0x768D) & 0xFFFF;
        if (e[n5] == null) {
            int n6;
            int n7;
            char[] cArray = c[n5].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n7 = 224;
                    break;
                }
                case 1: {
                    n7 = 197;
                    break;
                }
                case 2: {
                    n7 = 81;
                    break;
                }
                case 3: {
                    n7 = 154;
                    break;
                }
                case 4: {
                    n7 = 149;
                    break;
                }
                case 5: {
                    n7 = 10;
                    break;
                }
                case 6: {
                    n7 = 237;
                    break;
                }
                case 7: {
                    n7 = 19;
                    break;
                }
                case 8: {
                    n7 = 74;
                    break;
                }
                case 9: {
                    n7 = 215;
                    break;
                }
                case 10: {
                    n7 = 137;
                    break;
                }
                case 11: {
                    n7 = 226;
                    break;
                }
                case 12: {
                    n7 = 78;
                    break;
                }
                case 13: {
                    n7 = 194;
                    break;
                }
                case 14: {
                    n7 = 98;
                    break;
                }
                case 15: {
                    n7 = 214;
                    break;
                }
                case 16: {
                    n7 = 182;
                    break;
                }
                case 17: {
                    n7 = 66;
                    break;
                }
                case 18: {
                    n7 = 102;
                    break;
                }
                case 19: {
                    n7 = 176;
                    break;
                }
                case 20: {
                    n7 = 56;
                    break;
                }
                case 21: {
                    n7 = 209;
                    break;
                }
                case 22: {
                    n7 = 17;
                    break;
                }
                case 23: {
                    n7 = 172;
                    break;
                }
                case 24: {
                    n7 = 96;
                    break;
                }
                case 25: {
                    n7 = 93;
                    break;
                }
                case 26: {
                    n7 = 8;
                    break;
                }
                case 27: {
                    n7 = 132;
                    break;
                }
                case 28: {
                    n7 = 212;
                    break;
                }
                case 29: {
                    n7 = 133;
                    break;
                }
                case 30: {
                    n7 = 190;
                    break;
                }
                case 31: {
                    n7 = 192;
                    break;
                }
                case 32: {
                    n7 = 2;
                    break;
                }
                case 33: {
                    n7 = 148;
                    break;
                }
                case 34: {
                    n7 = 139;
                    break;
                }
                case 35: {
                    n7 = 116;
                    break;
                }
                case 36: {
                    n7 = 97;
                    break;
                }
                case 37: {
                    n7 = 49;
                    break;
                }
                case 38: {
                    n7 = 118;
                    break;
                }
                case 39: {
                    n7 = 218;
                    break;
                }
                case 40: {
                    n7 = 162;
                    break;
                }
                case 41: {
                    n7 = 164;
                    break;
                }
                case 42: {
                    n7 = 126;
                    break;
                }
                case 43: {
                    n7 = 95;
                    break;
                }
                case 44: {
                    n7 = 91;
                    break;
                }
                case 45: {
                    n7 = 87;
                    break;
                }
                case 46: {
                    n7 = 107;
                    break;
                }
                case 47: {
                    n7 = 121;
                    break;
                }
                case 48: {
                    n7 = 21;
                    break;
                }
                case 49: {
                    n7 = 5;
                    break;
                }
                case 50: {
                    n7 = 47;
                    break;
                }
                case 51: {
                    n7 = 235;
                    break;
                }
                case 52: {
                    n7 = 62;
                    break;
                }
                case 53: {
                    n7 = 239;
                    break;
                }
                case 54: {
                    n7 = 155;
                    break;
                }
                case 55: {
                    n7 = 242;
                    break;
                }
                case 56: {
                    n7 = 70;
                    break;
                }
                case 57: {
                    n7 = 14;
                    break;
                }
                case 58: {
                    n7 = 248;
                    break;
                }
                case 59: {
                    n7 = 160;
                    break;
                }
                case 60: {
                    n7 = 72;
                    break;
                }
                case 61: {
                    n7 = 175;
                    break;
                }
                case 62: {
                    n7 = 77;
                    break;
                }
                case 63: {
                    n7 = 92;
                    break;
                }
                case 64: {
                    n7 = 138;
                    break;
                }
                case 65: {
                    n7 = 253;
                    break;
                }
                case 66: {
                    n7 = 45;
                    break;
                }
                case 67: {
                    n7 = 46;
                    break;
                }
                case 68: {
                    n7 = 130;
                    break;
                }
                case 69: {
                    n7 = 6;
                    break;
                }
                case 70: {
                    n7 = 202;
                    break;
                }
                case 71: {
                    n7 = 44;
                    break;
                }
                case 72: {
                    n7 = 90;
                    break;
                }
                case 73: {
                    n7 = 11;
                    break;
                }
                case 74: {
                    n7 = 1;
                    break;
                }
                case 75: {
                    n7 = 94;
                    break;
                }
                case 76: {
                    n7 = 186;
                    break;
                }
                case 77: {
                    n7 = 23;
                    break;
                }
                case 78: {
                    n7 = 231;
                    break;
                }
                case 79: {
                    n7 = 12;
                    break;
                }
                case 80: {
                    n7 = 153;
                    break;
                }
                case 81: {
                    n7 = 217;
                    break;
                }
                case 82: {
                    n7 = 198;
                    break;
                }
                case 83: {
                    n7 = 111;
                    break;
                }
                case 84: {
                    n7 = 250;
                    break;
                }
                case 85: {
                    n7 = 200;
                    break;
                }
                case 86: {
                    n7 = 184;
                    break;
                }
                case 87: {
                    n7 = 53;
                    break;
                }
                case 88: {
                    n7 = 41;
                    break;
                }
                case 89: {
                    n7 = 67;
                    break;
                }
                case 90: {
                    n7 = 100;
                    break;
                }
                case 91: {
                    n7 = 249;
                    break;
                }
                case 92: {
                    n7 = 222;
                    break;
                }
                case 93: {
                    n7 = 233;
                    break;
                }
                case 94: {
                    n7 = 238;
                    break;
                }
                case 95: {
                    n7 = 115;
                    break;
                }
                case 96: {
                    n7 = 152;
                    break;
                }
                case 97: {
                    n7 = 58;
                    break;
                }
                case 98: {
                    n7 = 158;
                    break;
                }
                case 99: {
                    n7 = 125;
                    break;
                }
                case 100: {
                    n7 = 88;
                    break;
                }
                case 101: {
                    n7 = 181;
                    break;
                }
                case 102: {
                    n7 = 206;
                    break;
                }
                case 103: {
                    n7 = 195;
                    break;
                }
                case 104: {
                    n7 = 129;
                    break;
                }
                case 105: {
                    n7 = 208;
                    break;
                }
                case 106: {
                    n7 = 0;
                    break;
                }
                case 107: {
                    n7 = 161;
                    break;
                }
                case 108: {
                    n7 = 142;
                    break;
                }
                case 109: {
                    n7 = 76;
                    break;
                }
                case 110: {
                    n7 = 69;
                    break;
                }
                case 111: {
                    n7 = 146;
                    break;
                }
                case 112: {
                    n7 = 42;
                    break;
                }
                case 113: {
                    n7 = 131;
                    break;
                }
                case 114: {
                    n7 = 124;
                    break;
                }
                case 115: {
                    n7 = 247;
                    break;
                }
                case 116: {
                    n7 = 108;
                    break;
                }
                case 117: {
                    n7 = 147;
                    break;
                }
                case 118: {
                    n7 = 196;
                    break;
                }
                case 119: {
                    n7 = 216;
                    break;
                }
                case 120: {
                    n7 = 40;
                    break;
                }
                case 121: {
                    n7 = 27;
                    break;
                }
                case 122: {
                    n7 = 140;
                    break;
                }
                case 123: {
                    n7 = 177;
                    break;
                }
                case 124: {
                    n7 = 24;
                    break;
                }
                case 125: {
                    n7 = 28;
                    break;
                }
                case 126: {
                    n7 = 157;
                    break;
                }
                case 127: {
                    n7 = 110;
                    break;
                }
                case 128: {
                    n7 = 31;
                    break;
                }
                case 129: {
                    n7 = 63;
                    break;
                }
                case 130: {
                    n7 = 64;
                    break;
                }
                case 131: {
                    n7 = 20;
                    break;
                }
                case 132: {
                    n7 = 109;
                    break;
                }
                case 133: {
                    n7 = 30;
                    break;
                }
                case 134: {
                    n7 = 178;
                    break;
                }
                case 135: {
                    n7 = 68;
                    break;
                }
                case 136: {
                    n7 = 156;
                    break;
                }
                case 137: {
                    n7 = 188;
                    break;
                }
                case 138: {
                    n7 = 168;
                    break;
                }
                case 139: {
                    n7 = 128;
                    break;
                }
                case 140: {
                    n7 = 203;
                    break;
                }
                case 141: {
                    n7 = 86;
                    break;
                }
                case 142: {
                    n7 = 106;
                    break;
                }
                case 143: {
                    n7 = 151;
                    break;
                }
                case 144: {
                    n7 = 37;
                    break;
                }
                case 145: {
                    n7 = 180;
                    break;
                }
                case 146: {
                    n7 = 127;
                    break;
                }
                case 147: {
                    n7 = 243;
                    break;
                }
                case 148: {
                    n7 = 210;
                    break;
                }
                case 149: {
                    n7 = 179;
                    break;
                }
                case 150: {
                    n7 = 22;
                    break;
                }
                case 151: {
                    n7 = 246;
                    break;
                }
                case 152: {
                    n7 = 225;
                    break;
                }
                case 153: {
                    n7 = 174;
                    break;
                }
                case 154: {
                    n7 = 43;
                    break;
                }
                case 155: {
                    n7 = 144;
                    break;
                }
                case 156: {
                    n7 = 145;
                    break;
                }
                case 157: {
                    n7 = 213;
                    break;
                }
                case 158: {
                    n7 = 254;
                    break;
                }
                case 159: {
                    n7 = 26;
                    break;
                }
                case 160: {
                    n7 = 135;
                    break;
                }
                case 161: {
                    n7 = 252;
                    break;
                }
                case 162: {
                    n7 = 99;
                    break;
                }
                case 163: {
                    n7 = 36;
                    break;
                }
                case 164: {
                    n7 = 32;
                    break;
                }
                case 165: {
                    n7 = 48;
                    break;
                }
                case 166: {
                    n7 = 150;
                    break;
                }
                case 167: {
                    n7 = 61;
                    break;
                }
                case 168: {
                    n7 = 230;
                    break;
                }
                case 169: {
                    n7 = 136;
                    break;
                }
                case 170: {
                    n7 = 228;
                    break;
                }
                case 171: {
                    n7 = 244;
                    break;
                }
                case 172: {
                    n7 = 134;
                    break;
                }
                case 173: {
                    n7 = 80;
                    break;
                }
                case 174: {
                    n7 = 117;
                    break;
                }
                case 175: {
                    n7 = 227;
                    break;
                }
                case 176: {
                    n7 = 240;
                    break;
                }
                case 177: {
                    n7 = 122;
                    break;
                }
                case 178: {
                    n7 = 205;
                    break;
                }
                case 179: {
                    n7 = 119;
                    break;
                }
                case 180: {
                    n7 = 38;
                    break;
                }
                case 181: {
                    n7 = 112;
                    break;
                }
                case 182: {
                    n7 = 232;
                    break;
                }
                case 183: {
                    n7 = 163;
                    break;
                }
                case 184: {
                    n7 = 221;
                    break;
                }
                case 185: {
                    n7 = 191;
                    break;
                }
                case 186: {
                    n7 = 103;
                    break;
                }
                case 187: {
                    n7 = 82;
                    break;
                }
                case 188: {
                    n7 = 236;
                    break;
                }
                case 189: {
                    n7 = 89;
                    break;
                }
                case 190: {
                    n7 = 183;
                    break;
                }
                case 191: {
                    n7 = 185;
                    break;
                }
                case 192: {
                    n7 = 143;
                    break;
                }
                case 193: {
                    n7 = 211;
                    break;
                }
                case 194: {
                    n7 = 34;
                    break;
                }
                case 195: {
                    n7 = 219;
                    break;
                }
                case 196: {
                    n7 = 15;
                    break;
                }
                case 197: {
                    n7 = 187;
                    break;
                }
                case 198: {
                    n7 = 201;
                    break;
                }
                case 199: {
                    n7 = 114;
                    break;
                }
                case 200: {
                    n7 = 193;
                    break;
                }
                case 201: {
                    n7 = 79;
                    break;
                }
                case 202: {
                    n7 = 123;
                    break;
                }
                case 203: {
                    n7 = 141;
                    break;
                }
                case 204: {
                    n7 = 73;
                    break;
                }
                case 205: {
                    n7 = 4;
                    break;
                }
                case 206: {
                    n7 = 25;
                    break;
                }
                case 207: {
                    n7 = 167;
                    break;
                }
                case 208: {
                    n7 = 159;
                    break;
                }
                case 209: {
                    n7 = 83;
                    break;
                }
                case 210: {
                    n7 = 57;
                    break;
                }
                case 211: {
                    n7 = 220;
                    break;
                }
                case 212: {
                    n7 = 51;
                    break;
                }
                case 213: {
                    n7 = 85;
                    break;
                }
                case 214: {
                    n7 = 35;
                    break;
                }
                case 215: {
                    n7 = 101;
                    break;
                }
                case 216: {
                    n7 = 59;
                    break;
                }
                case 217: {
                    n7 = 113;
                    break;
                }
                case 218: {
                    n7 = 251;
                    break;
                }
                case 219: {
                    n7 = 55;
                    break;
                }
                case 220: {
                    n7 = 170;
                    break;
                }
                case 221: {
                    n7 = 189;
                    break;
                }
                case 222: {
                    n7 = 75;
                    break;
                }
                case 223: {
                    n7 = 171;
                    break;
                }
                case 224: {
                    n7 = 71;
                    break;
                }
                case 225: {
                    n7 = 16;
                    break;
                }
                case 226: {
                    n7 = 199;
                    break;
                }
                case 227: {
                    n7 = 65;
                    break;
                }
                case 228: {
                    n7 = 229;
                    break;
                }
                case 229: {
                    n7 = 223;
                    break;
                }
                case 230: {
                    n7 = 39;
                    break;
                }
                case 231: {
                    n7 = 7;
                    break;
                }
                case 232: {
                    n7 = 234;
                    break;
                }
                case 233: {
                    n7 = 13;
                    break;
                }
                case 234: {
                    n7 = 204;
                    break;
                }
                case 235: {
                    n7 = 207;
                    break;
                }
                case 236: {
                    n7 = 50;
                    break;
                }
                case 237: {
                    n7 = 54;
                    break;
                }
                case 238: {
                    n7 = 105;
                    break;
                }
                case 239: {
                    n7 = 173;
                    break;
                }
                case 240: {
                    n7 = 120;
                    break;
                }
                case 241: {
                    n7 = 29;
                    break;
                }
                case 242: {
                    n7 = 60;
                    break;
                }
                case 243: {
                    n7 = 3;
                    break;
                }
                case 244: {
                    n7 = 52;
                    break;
                }
                case 245: {
                    n7 = 18;
                    break;
                }
                case 246: {
                    n7 = 255;
                    break;
                }
                case 247: {
                    n7 = 245;
                    break;
                }
                case 248: {
                    n7 = 241;
                    break;
                }
                case 249: {
                    n7 = 166;
                    break;
                }
                case 250: {
                    n7 = 84;
                    break;
                }
                case 251: {
                    n7 = 9;
                    break;
                }
                case 252: {
                    n7 = 33;
                    break;
                }
                case 253: {
                    n7 = 165;
                    break;
                }
                case 254: {
                    n7 = 169;
                    break;
                }
                default: {
                    n7 = 104;
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
            I.e[n5] = new String(cArray).intern();
        }
        return e[n5];
    }
}

