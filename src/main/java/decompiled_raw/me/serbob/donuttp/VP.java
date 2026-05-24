/*
 * Decompiled with CFR 0.152.
 */
package me.serbob.donuttp;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import me.serbob.donuttp.s;

public final class VP {
    private static Field G;
    private static final long a;

    public static Field n(Field field, int n2, int n3) throws IllegalArgumentException, IllegalAccessException {
        long l2 = (long)n2 << 32 | (long)n3 << 32 >>> 32;
        int n4 = field.getModifiers();
        if (Modifier.isFinal(n4)) {
            G.set(field, n4 & (int)a);
        }
        return field;
    }

    public static void i(long l2, Object object, Field field, Object object2) throws IllegalArgumentException, IllegalAccessException {
        long l3 = l2 ^ 0x17CFB39BB394L;
        int n2 = (int)(l3 >>> 32);
        int n3 = (int)(l3 << 32 >>> 32);
        field.setAccessible(true);
        field = VP.n(field, n2, n3);
        field.set(object, object2);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block31: {
            block30: {
                v0 = var7 = 14403682208027L;
                var9_1 = v0 ^ 96803970241463L;
                var11_2 = v0 ^ 89993147343648L;
                var0_3 = new String[4];
                var4_4 = 0;
                var3_5 = "TEjD&99KY\tTEjD&99KY";
                var5_6 = "TEjD&99KY\tTEjD&99KY".length();
                var2_7 = 9;
                var1_8 = -1;
lbl11:
                // 2 sources

                while (true) {
                    v1 = ++var1_8;
                    v2 = var3_5.substring(v1, v1 + var2_7);
                    v3 = -1;
                    break block30;
                    break;
                }
lbl16:
                // 1 sources

                while (true) {
                    var0_3[var4_4++] = v4.intern();
                    if ((var1_8 += var2_7) < var5_6) {
                        var2_7 = var3_5.charAt(var1_8);
                        ** continue;
                    }
                    var3_5 = "^Ozi%30XXkI\u000699UN}\u001d#lDoO,5|ME.D.9(\u0019^fH`=3]ChD%\"/\u0019lgH,4r";
                    var5_6 = "^Ozi%30XXkI\u000699UN}\u001d#lDoO,5|ME.D.9(\u0019^fH`=3]ChD%\"/\u0019lgH,4r".length();
                    var2_7 = 18;
                    var1_8 = -1;
lbl25:
                    // 2 sources

                    while (true) {
                        v5 = ++var1_8;
                        v2 = var3_5.substring(v5, v5 + var2_7);
                        v3 = 0;
                        break block30;
                        break;
                    }
                    break;
                }
lbl30:
                // 1 sources

                while (true) {
                    var0_3[var4_4++] = v4.intern();
                    if ((var1_8 += var2_7) < var5_6) {
                        var2_7 = var3_5.charAt(var1_8);
                        ** continue;
                    }
                    break block31;
                    break;
                }
            }
            v6 = v2.toCharArray();
            var6_9 = 0;
            v7 = v6.length;
            v8 = v6;
            v9 = v7;
            if (v7 > 1) ** GOTO lbl80
            do {
                v10 = v8;
                v11 = v8;
                v12 = var6_9;
                while (true) {
                    v13 = v10[v12];
                    switch (var6_9 % 7) {
                        case 0: {
                            v14 = 57;
                            break;
                        }
                        case 1: {
                            v14 = 42;
                            break;
                        }
                        case 2: {
                            v14 = 14;
                            break;
                        }
                        case 3: {
                            v14 = 45;
                            break;
                        }
                        case 4: {
                            v14 = 64;
                            break;
                        }
                        case 5: {
                            v14 = 80;
                            break;
                        }
                        default: {
                            v14 = 92;
                        }
                    }
                    v10[v12] = (char)(v13 ^ v14);
                    ++var6_9;
                    v8 = v11;
                    v9 = v9;
                    if (v9 != 0) break;
                    v11 = v8;
                    v15 = v9;
                    v12 = v9;
                    v10 = v8;
                }
lbl80:
                // 2 sources

                v16 = v8;
                v15 = v9;
            } while (v9 > var6_9);
            v4 = new String(v16);
            switch (v3) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl89:
                // 1 sources

                ** continue;
            }
lbl90:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        ** while (true)
        VP.a = -8456492061009152268L ^ var7;
        try {
            VP.G = Field.class.getDeclaredField(var0_3[0]);
            VP.G.setAccessible(true);
        }
        catch (NoSuchFieldException var13_10) {
            try {
                var14_11 = Class.class.getDeclaredMethod(var0_3[2], new Class[]{Boolean.TYPE});
                var14_11.setAccessible(true);
                for (Field var19_17 : var15_13 = (Field[])var14_11.invoke(Field.class, new Object[]{false})) {
                    if (!var19_17.getName().equals(var0_3[1])) continue;
                    VP.G = var19_17;
                    VP.G.setAccessible(true);
                }
            }
            catch (Exception var14_12) {
                throw new s(var9_1, (Throwable)var14_12);
            }
        }
        if (VP.G == null) {
            throw new s(var11_2, var0_3[3]);
        }
    }
}

