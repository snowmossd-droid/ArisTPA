/*
 * Decompiled with CFR 0.152.
 */
package me.serbob.donuttp;

public final class p
extends Enum<p> {
    public static final /* enum */ p NBTTagEnd;
    public static final /* enum */ p NBTTagByte;
    public static final /* enum */ p NBTTagShort;
    public static final /* enum */ p NBTTagInt;
    public static final /* enum */ p NBTTagLong;
    public static final /* enum */ p NBTTagFloat;
    public static final /* enum */ p NBTTagDouble;
    public static final /* enum */ p NBTTagByteArray;
    public static final /* enum */ p NBTTagString;
    public static final /* enum */ p NBTTagList;
    public static final /* enum */ p NBTTagCompound;
    public static final /* enum */ p NBTTagIntArray;
    public static final /* enum */ p NBTTagLongArray;
    private final int I;
    private static final /* synthetic */ p[] Y;

    public static p[] values() {
        return (p[])Y.clone();
    }

    public static p valueOf(String string) {
        return Enum.valueOf(p.class, string);
    }

    private p(int n3) {
        this.I = n3;
    }

    public int X() {
        return this.I;
    }

    public static p y(int n2, int n3, long l2) {
        p p2;
        block5: {
            long l3 = (long)n3 << 32 | l2 << 32 >>> 32;
            p[] pArray = p.values();
            int n4 = pArray.length;
            int n5 = 0;
            while (n5 < n4) {
                block4: {
                    p p3 = pArray[n5];
                    if (n3 <= 0) break block4;
                    p2 = p3;
                    if (n3 < 0) break block5;
                    if (p2.X() == n2) {
                        return p3;
                    }
                    ++n5;
                }
                if (n3 >= 0) continue;
            }
            p2 = NBTTagEnd;
        }
        return p2;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block29: {
            block28: {
                block27: {
                    block26: {
                        var13 = 65228072185311L;
                        var6_1 = new String[13];
                        var10_2 = 0;
                        var9_3 = "(?\u0018o\r2L\t\u0010<T\u0019;k\t(?\u0018o\r2J\b\u0019\n(?\u0018o\r2M\u001f\t)\u000f(?\u0018o\r2C\t\u0013+z\u001e'n\u001f\f(?\u0018o\r2\\\u0012\u000f%U\u000b\u000b(?\u0018o\r2\\\u000e\u0012>O\u000e(?\u0018o\r2F\b\t\rI\u001e4v\u000b(?\u0018o\r2I\n\u0012-O\t(?\u0018o\r2F\b\t\f(?\u0018o\r2K\t\b.W\t\u000f(?\u0018o\r2M\u001f\t)z\u001e'n\u001f";
                        var11_4 = "(?\u0018o\r2L\t\u0010<T\u0019;k\t(?\u0018o\r2J\b\u0019\n(?\u0018o\r2M\u001f\t)\u000f(?\u0018o\r2C\t\u0013+z\u001e'n\u001f\f(?\u0018o\r2\\\u0012\u000f%U\u000b\u000b(?\u0018o\r2\\\u000e\u0012>O\u000e(?\u0018o\r2F\b\t\rI\u001e4v\u000b(?\u0018o\r2I\n\u0012-O\t(?\u0018o\r2F\b\t\f(?\u0018o\r2K\t\b.W\t\u000f(?\u0018o\r2M\u001f\t)z\u001e'n\u001f".length();
                        var8_5 = 14;
                        var7_6 = -1;
lbl8:
                        // 2 sources

                        while (true) {
                            v0 = ++var7_6;
                            v1 = var9_3.substring(v0, v0 + var8_5);
                            v2 = -1;
                            break block26;
                            break;
                        }
lbl13:
                        // 1 sources

                        while (true) {
                            var6_1[var10_2++] = v3.intern();
                            if ((var7_6 += var8_5) < var11_4) {
                                var8_5 = var9_3.charAt(var7_6);
                                ** continue;
                            }
                            var9_3 = "(?\u0018o\r2C\t\u0013+\n(?\u0018o\r2C\u000f\u000e8";
                            var11_4 = "(?\u0018o\r2C\t\u0013+\n(?\u0018o\r2C\u000f\u000e8".length();
                            var8_5 = 10;
                            var7_6 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v4 = ++var7_6;
                                v1 = var9_3.substring(v4, v4 + var8_5);
                                v2 = 0;
                                break block26;
                                break;
                            }
                            break;
                        }
lbl27:
                        // 1 sources

                        while (true) {
                            var6_1[var10_2++] = v3.intern();
                            if ((var7_6 += var8_5) < var11_4) {
                                var8_5 = var9_3.charAt(var7_6);
                                ** continue;
                            }
                            break block27;
                            break;
                        }
                    }
                    v5 = v1.toCharArray();
                    var12_7 = 0;
                    v6 = v5.length;
                    v7 = v5;
                    v8 = v6;
                    if (v6 > 1) ** GOTO lbl77
                    do {
                        v9 = v7;
                        v10 = v7;
                        v11 = var12_7;
                        while (true) {
                            v12 = v9[v11];
                            switch (var12_7 % 7) {
                                case 0: {
                                    v13 = 102;
                                    break;
                                }
                                case 1: {
                                    v13 = 125;
                                    break;
                                }
                                case 2: {
                                    v13 = 76;
                                    break;
                                }
                                case 3: {
                                    v13 = 59;
                                    break;
                                }
                                case 4: {
                                    v13 = 108;
                                    break;
                                }
                                case 5: {
                                    v13 = 85;
                                    break;
                                }
                                default: {
                                    v13 = 15;
                                }
                            }
                            v9[v11] = (char)(v12 ^ v13);
                            ++var12_7;
                            v7 = v10;
                            v8 = v8;
                            if (v8 != 0) break;
                            v10 = v7;
                            v14 = v8;
                            v11 = v8;
                            v9 = v7;
                        }
lbl77:
                        // 2 sources

                        v15 = v7;
                        v14 = v8;
                    } while (v8 > var12_7);
                    v3 = new String(v15);
                    switch (v2) {
                        default: {
                            ** continue;
                        }
                        ** case 0:
lbl86:
                        // 1 sources

                        ** continue;
                    }
                }
                var0_8 = new long[15];
                var2_9 = 0;
                var3_10 = "\u00d4\u00fcJ1\u0018\u0012m\u00d3\u00f2;\u00e4\u0095\u0018\u0012m\u00d7EtrR\u0018\u0012m\u00d4E.6\u0097\u0018\u0012m\u00d7\u00d4+>c\u0018\u0012m\u00d6|:\u00af\u00f7\u0018\u0012m\u00d6z\u00fd\u0016\u00e2\u0018\u0012m\u00d2\u009b\u00e0\b\u00c0\u0018\u0012m\u00d9\u00f0\u00f6q\u0002\u0018\u0012m\u00d5<\u0097\u0081w\u0018\u0012m\u00d9D\u00bb\u00a8\u00d1\u0018\u0012m\u00d8\u00c4)\u00f1T\u0018\u0012m\u00d8\n\u00fa\u0086d\u0018\u0012m\u00d5";
                var4_11 = "\u00d4\u00fcJ1\u0018\u0012m\u00d3\u00f2;\u00e4\u0095\u0018\u0012m\u00d7EtrR\u0018\u0012m\u00d4E.6\u0097\u0018\u0012m\u00d7\u00d4+>c\u0018\u0012m\u00d6|:\u00af\u00f7\u0018\u0012m\u00d6z\u00fd\u0016\u00e2\u0018\u0012m\u00d2\u009b\u00e0\b\u00c0\u0018\u0012m\u00d9\u00f0\u00f6q\u0002\u0018\u0012m\u00d5<\u0097\u0081w\u0018\u0012m\u00d9D\u00bb\u00a8\u00d1\u0018\u0012m\u00d8\u00c4)\u00f1T\u0018\u0012m\u00d8\n\u00fa\u0086d\u0018\u0012m\u00d5".length();
                var1_12 = 0;
                while (true) {
                    var5_13 = var3_10.substring(var1_12, var1_12 += 8).getBytes("ISO-8859-1");
                    v16 = var0_8;
                    v17 = var2_9++;
                    v18 = ((long)var5_13[0] & 255L) << 56 | ((long)var5_13[1] & 255L) << 48 | ((long)var5_13[2] & 255L) << 40 | ((long)var5_13[3] & 255L) << 32 | ((long)var5_13[4] & 255L) << 24 | ((long)var5_13[5] & 255L) << 16 | ((long)var5_13[6] & 255L) << 8 | (long)var5_13[7] & 255L;
                    v19 = -1;
                    break block28;
                    break;
                }
lbl100:
                // 1 sources

                while (true) {
                    v16[v17] = v20;
                    if (var1_12 < var4_11) ** continue;
                    var3_10 = "\u0003_\u00c5\t\u0018\u0012m\u00d4{~\u0096\u00f3\u0018\u0012m\u00d3";
                    var4_11 = "\u0003_\u00c5\t\u0018\u0012m\u00d4{~\u0096\u00f3\u0018\u0012m\u00d3".length();
                    var1_12 = 0;
                    while (true) {
                        var5_13 = var3_10.substring(var1_12, var1_12 += 8).getBytes("ISO-8859-1");
                        v16 = var0_8;
                        v17 = var2_9++;
                        v18 = ((long)var5_13[0] & 255L) << 56 | ((long)var5_13[1] & 255L) << 48 | ((long)var5_13[2] & 255L) << 40 | ((long)var5_13[3] & 255L) << 32 | ((long)var5_13[4] & 255L) << 24 | ((long)var5_13[5] & 255L) << 16 | ((long)var5_13[6] & 255L) << 8 | (long)var5_13[7] & 255L;
                        v19 = 0;
                        break block28;
                        break;
                    }
                    break;
                }
lbl113:
                // 1 sources

                while (true) {
                    v16[v17] = v20;
                    if (var1_12 < var4_11) ** continue;
                    break block29;
                    break;
                }
            }
            v20 = v18 ^ var13;
            switch (v19) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl124:
                // 1 sources

                ** continue;
            }
        }
        p.NBTTagEnd = new p(0);
        p.NBTTagByte = new p(1);
        p.NBTTagShort = new p(2);
        p.NBTTagInt = new p(3);
        p.NBTTagLong = new p(4);
        p.NBTTagFloat = new p(5);
        p.NBTTagDouble = new p((int)var0_8[7]);
        p.NBTTagByteArray = new p((int)var0_8[11]);
        p.NBTTagString = new p((int)var0_8[1]);
        p.NBTTagList = new p((int)var0_8[5]);
        p.NBTTagCompound = new p((int)var0_8[12]);
        p.NBTTagIntArray = new p((int)var0_8[13]);
        p.NBTTagLongArray = new p((int)var0_8[0]);
        v21 = new p[(int)var0_8[6]];
        v21[0] = p.NBTTagEnd;
        v21[1] = p.NBTTagByte;
        v21[2] = p.NBTTagShort;
        v21[3] = p.NBTTagInt;
        v21[4] = p.NBTTagLong;
        v21[5] = p.NBTTagFloat;
        v21[(int)var0_8[7]] = p.NBTTagDouble;
        v21[(int)var0_8[11]] = p.NBTTagByteArray;
        v21[(int)var0_8[1]] = p.NBTTagString;
        v21[(int)var0_8[5]] = p.NBTTagList;
        v21[(int)var0_8[12]] = p.NBTTagCompound;
        v21[(int)var0_8[13]] = p.NBTTagIntArray;
        v21[(int)var0_8[0]] = p.NBTTagLongArray;
        p.Y = v21;
    }
}

