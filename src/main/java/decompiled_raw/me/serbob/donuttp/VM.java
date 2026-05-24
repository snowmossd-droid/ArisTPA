/*
 * Decompiled with CFR 0.152.
 */
package me.serbob.donuttp;

public final class VM
extends Enum<VM> {
    public static final /* enum */ VM NMS;
    public static final /* enum */ VM CRAFTBUKKIT;
    public static final /* enum */ VM NONE;
    private final String Y;
    private static final /* synthetic */ VM[] d;

    public static VM[] values() {
        return (VM[])d.clone();
    }

    public static VM valueOf(String string) {
        return Enum.valueOf(VM.class, string);
    }

    private VM(String string2) {
        this.Y = string2;
    }

    public String v() {
        return this.Y;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block22: {
            block21: {
                block20: {
                    var13 = 18443515706269L;
                    var6_1 = new String[3];
                    var10_2 = 0;
                    var9_3 = "e'\\\u000e4G\u000fm>T\u001c\u0003h8N\u0004h:S\r";
                    var11_4 = "e'\\\u000e4G\u000fm>T\u001c\u0003h8N\u0004h:S\r".length();
                    var8_5 = 11;
                    var7_6 = -1;
lbl8:
                    // 2 sources

                    while (true) {
                        continue;
                        break;
                    }
lbl10:
                    // 1 sources

                    while (true) {
                        var6_1[var10_2++] = new String(v0).intern();
                        if ((var7_6 += var8_5) < var11_4) {
                            var8_5 = var9_3.charAt(var7_6);
                            ** continue;
                        }
                        break block20;
                        break;
                    }
                    v1 = ++var7_6;
                    v2 = var9_3.substring(v1, v1 + var8_5).toCharArray();
                    var12_7 = 0;
                    v3 = v2.length;
                    v4 = v2;
                    v5 = v3;
                    if (v3 > 1) ** GOTO lbl60
                    do {
                        v6 = v4;
                        v7 = v4;
                        v8 = var12_7;
                        while (true) {
                            v9 = v6[v8];
                            switch (var12_7 % 7) {
                                case 0: {
                                    v10 = 38;
                                    break;
                                }
                                case 1: {
                                    v10 = 117;
                                    break;
                                }
                                case 2: {
                                    v10 = 29;
                                    break;
                                }
                                case 3: {
                                    v10 = 72;
                                    break;
                                }
                                case 4: {
                                    v10 = 96;
                                    break;
                                }
                                case 5: {
                                    v10 = 5;
                                    break;
                                }
                                default: {
                                    v10 = 90;
                                }
                            }
                            v6[v8] = (char)(v9 ^ v10);
                            ++var12_7;
                            v4 = v7;
                            v5 = v5;
                            if (v5 != 0) break;
                            v7 = v4;
                            v11 = v5;
                            v8 = v5;
                            v6 = v4;
                        }
lbl60:
                        // 2 sources

                        v0 = v4;
                        v11 = v5;
                    } while (v5 > var12_7);
                    ** while (true)
                }
                var0_8 = new long[61];
                var2_9 = 0;
                var3_10 = "[\u00b8\u00d2u73\u00bb\u00ef\u00bc]n\u00a773\u00bb\u0095\u00bdy\u00ac\u00c273\u00bb\u00ef\u0014~\u00a1\u00e873\u00bb\u00fe\u00f4\u00ab\u0085%73\u00bb\u00fc\u00fa\u0099\u008e\u009e73\u00bb\u00f6\u009fh\u00ddJ73\u00bb\u00e8\u00d6D\u0012R73\u00bb\u00fa:w\u0087\u00d673\u00bb\u0094\u00a3V\u00bb\u008073\u00bb\u00b3\u00b2\u0093\bu73\u00bb\u008b\u0004\u00af\u00b1f73\u00bb\u008d\u00dd&%\u001f73\u00bb\u009a;\u00b8/873\u00bb\u008f\u00deg\u00c8\u00be73\u00bb\u0089\u00c4\u00aea\f73\u00bb\u00e9\u00f80\u00e7z73\u00bb\u00f4\u00cf.\u001bq73\u00bb\u00f4:H\u00c6\u00e673\u00bb\u0089\u0080\u0014\u00da\u00e073\u00bb\u00f8\u0007f\u00bee73\u00bb\u0093>\u000f\u001e\u001973\u00bb\u009b\u001a\u0094\u00a2073\u00bb\u009a\u00fe[\u009fq73\u00bb\u0096\u00c6f'\u00ea73\u00bb\u008c\u0085\u00845]73\u00bb\u0091F\u00f1\u008c\u00bf73\u00bb\u00ff\u00b2W\u0098\u000773\u00bb\u00f65C\u0012\u00e173\u00bb\u00feCD \u00be73\u00bb\u00f3\\I\u00b2V73\u00bb\u00f2\u00fc\u00ee\u00b4\u001473\u00bb\u00fb\u00fb\u00d6i\u00a873\u00bb\u00974b\u00bfm73\u00bb\u00ff\u00d7~s\u009373\u00bb\u0090\u00bak\u00ed@73\u00bb\u0090\u00fc\u00ed)\u00fa73\u00bb\u008eKM\u00e7\u001d73\u00bb\u0092]e\u00de\u000073\u00bb\u0096\u00df\u00bc\u00d3\u008a73\u00bb\u0088\u00d7 ]\u00ef73\u00bb\u0093l\u00b2\u0093\u000573\u00bb\u0095\u009f\u00b8 \u00ea73\u00bb\u008f\u008b\u0089\u0086\u009873\u00bb\u00f00x\u00c0\u00d173\u00bb\u008c\u0016\u00b9\u008b}73\u00bb\u008d\u00f5\u00b7S\"73\u00bb\u0092\f'\u00dc\u00ed73\u00bb\u00eb\u0016\u00cf\u0003_73\u00bb\u00fb\u00b4\u0084\u00a6g73\u00bb\u00f8\u00c6/6\r73\u00bb\u0094\n\u0018\u0010^73\u00bb\u00e8t\u00ae\u00df\u009273\u00bb\u00f3\u00e6\u00cf\u0088\u00b473\u00bb\u00fc:>\u0019M73\u00bb\u00e9\u0019\u00a7\u001a\u00d073\u00bb\u0097\u0085m\u0010\u00e973\u00bb\u009b\u00d8l&~73\u00bb\u00ee\u00c5j\rf73\u00bb\u0091";
                var4_11 = "[\u00b8\u00d2u73\u00bb\u00ef\u00bc]n\u00a773\u00bb\u0095\u00bdy\u00ac\u00c273\u00bb\u00ef\u0014~\u00a1\u00e873\u00bb\u00fe\u00f4\u00ab\u0085%73\u00bb\u00fc\u00fa\u0099\u008e\u009e73\u00bb\u00f6\u009fh\u00ddJ73\u00bb\u00e8\u00d6D\u0012R73\u00bb\u00fa:w\u0087\u00d673\u00bb\u0094\u00a3V\u00bb\u008073\u00bb\u00b3\u00b2\u0093\bu73\u00bb\u008b\u0004\u00af\u00b1f73\u00bb\u008d\u00dd&%\u001f73\u00bb\u009a;\u00b8/873\u00bb\u008f\u00deg\u00c8\u00be73\u00bb\u0089\u00c4\u00aea\f73\u00bb\u00e9\u00f80\u00e7z73\u00bb\u00f4\u00cf.\u001bq73\u00bb\u00f4:H\u00c6\u00e673\u00bb\u0089\u0080\u0014\u00da\u00e073\u00bb\u00f8\u0007f\u00bee73\u00bb\u0093>\u000f\u001e\u001973\u00bb\u009b\u001a\u0094\u00a2073\u00bb\u009a\u00fe[\u009fq73\u00bb\u0096\u00c6f'\u00ea73\u00bb\u008c\u0085\u00845]73\u00bb\u0091F\u00f1\u008c\u00bf73\u00bb\u00ff\u00b2W\u0098\u000773\u00bb\u00f65C\u0012\u00e173\u00bb\u00feCD \u00be73\u00bb\u00f3\\I\u00b2V73\u00bb\u00f2\u00fc\u00ee\u00b4\u001473\u00bb\u00fb\u00fb\u00d6i\u00a873\u00bb\u00974b\u00bfm73\u00bb\u00ff\u00d7~s\u009373\u00bb\u0090\u00bak\u00ed@73\u00bb\u0090\u00fc\u00ed)\u00fa73\u00bb\u008eKM\u00e7\u001d73\u00bb\u0092]e\u00de\u000073\u00bb\u0096\u00df\u00bc\u00d3\u008a73\u00bb\u0088\u00d7 ]\u00ef73\u00bb\u0093l\u00b2\u0093\u000573\u00bb\u0095\u009f\u00b8 \u00ea73\u00bb\u008f\u008b\u0089\u0086\u009873\u00bb\u00f00x\u00c0\u00d173\u00bb\u008c\u0016\u00b9\u008b}73\u00bb\u008d\u00f5\u00b7S\"73\u00bb\u0092\f'\u00dc\u00ed73\u00bb\u00eb\u0016\u00cf\u0003_73\u00bb\u00fb\u00b4\u0084\u00a6g73\u00bb\u00f8\u00c6/6\r73\u00bb\u0094\n\u0018\u0010^73\u00bb\u00e8t\u00ae\u00df\u009273\u00bb\u00f3\u00e6\u00cf\u0088\u00b473\u00bb\u00fc:>\u0019M73\u00bb\u00e9\u0019\u00a7\u001a\u00d073\u00bb\u0097\u0085m\u0010\u00e973\u00bb\u009b\u00d8l&~73\u00bb\u00ee\u00c5j\rf73\u00bb\u0091".length();
                var1_12 = 0;
                while (true) {
                    var5_13 = var3_10.substring(var1_12, var1_12 += 8).getBytes("ISO-8859-1");
                    v12 = var0_8;
                    v13 = var2_9++;
                    v14 = ((long)var5_13[0] & 255L) << 56 | ((long)var5_13[1] & 255L) << 48 | ((long)var5_13[2] & 255L) << 40 | ((long)var5_13[3] & 255L) << 32 | ((long)var5_13[4] & 255L) << 24 | ((long)var5_13[5] & 255L) << 16 | ((long)var5_13[6] & 255L) << 8 | (long)var5_13[7] & 255L;
                    v15 = -1;
                    break block21;
                    break;
                }
lbl79:
                // 1 sources

                while (true) {
                    v12[v13] = v16;
                    if (var1_12 < var4_11) ** continue;
                    var3_10 = "\u00fb\u0085\u0093\u00b073\u00bb\u008eD\u00a3\u00f4\u009873\u00bb\u00b3";
                    var4_11 = "\u00fb\u0085\u0093\u00b073\u00bb\u008eD\u00a3\u00f4\u009873\u00bb\u00b3".length();
                    var1_12 = 0;
                    while (true) {
                        var5_13 = var3_10.substring(var1_12, var1_12 += 8).getBytes("ISO-8859-1");
                        v12 = var0_8;
                        v13 = var2_9++;
                        v14 = ((long)var5_13[0] & 255L) << 56 | ((long)var5_13[1] & 255L) << 48 | ((long)var5_13[2] & 255L) << 40 | ((long)var5_13[3] & 255L) << 32 | ((long)var5_13[4] & 255L) << 24 | ((long)var5_13[5] & 255L) << 16 | ((long)var5_13[6] & 255L) << 8 | (long)var5_13[7] & 255L;
                        v15 = 0;
                        break block21;
                        break;
                    }
                    break;
                }
lbl92:
                // 1 sources

                while (true) {
                    v12[v13] = v16;
                    if (var1_12 < var4_11) ** continue;
                    break block22;
                    break;
                }
            }
            v16 = v14 ^ var13;
            switch (v15) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl103:
                // 1 sources

                ** continue;
            }
        }
        v17 = new byte[(int)var0_8[18]];
        v17[0] = (int)var0_8[29];
        v17[1] = (int)var0_8[19];
        v17[2] = (int)var0_8[15];
        v17[3] = (int)var0_8[60];
        v17[4] = (int)var0_8[43];
        v17[5] = (int)var0_8[16];
        v17[(int)var0_8[56]] = (int)var0_8[52];
        v17[(int)var0_8[12]] = (int)var0_8[49];
        v17[(int)var0_8[1]] = (int)var0_8[28];
        v17[(int)var0_8[50]] = (int)var0_8[2];
        v17[(int)var0_8[32]] = (int)var0_8[4];
        v17[(int)var0_8[23]] = (int)var0_8[31];
        v17[(int)var0_8[25]] = (int)var0_8[54];
        v17[(int)var0_8[35]] = (int)var0_8[9];
        v17[(int)var0_8[40]] = (int)var0_8[57];
        v17[(int)var0_8[46]] = (int)var0_8[49];
        v17[(int)var0_8[45]] = (int)var0_8[0];
        v17[(int)var0_8[44]] = (int)var0_8[47];
        v17[(int)var0_8[42]] = (int)var0_8[49];
        v17[(int)var0_8[59]] = (int)var0_8[0];
        VM.NMS = new VM(new String(v17));
        v18 = new byte[(int)var0_8[10]];
        v18[0] = (int)var0_8[30];
        v18[1] = (int)var0_8[0];
        v18[2] = (int)var0_8[7];
        v18[3] = (int)var0_8[9];
        v18[4] = (int)var0_8[33];
        v18[5] = (int)var0_8[51];
        v18[(int)var0_8[21]] = (int)var0_8[27];
        v18[(int)var0_8[22]] = (int)var0_8[5];
        v18[(int)var0_8[41]] = (int)var0_8[17];
        v18[(int)var0_8[8]] = (int)var0_8[54];
        v18[(int)var0_8[55]] = (int)var0_8[9];
        v18[(int)var0_8[38]] = (int)var0_8[3];
        v18[(int)var0_8[58]] = (int)var0_8[0];
        v18[(int)var0_8[34]] = (int)var0_8[53];
        v18[(int)var0_8[20]] = (int)var0_8[48];
        v18[(int)var0_8[37]] = (int)var0_8[54];
        v18[(int)var0_8[11]] = (int)var0_8[26];
        v18[(int)var0_8[24]] = (int)var0_8[6];
        v18[(int)var0_8[13]] = (int)var0_8[5];
        v18[(int)var0_8[36]] = (int)var0_8[5];
        v18[(int)var0_8[14]] = (int)var0_8[17];
        v18[(int)var0_8[39]] = (int)var0_8[54];
        VM.CRAFTBUKKIT = new VM(new String(v18));
        VM.NONE = new VM("");
        VM.d = new VM[]{VM.NMS, VM.CRAFTBUKKIT, VM.NONE};
    }
}

