/*
 * Decompiled with CFR 0.152.
 */
package me.serbob.donuttp;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(value=RetentionPolicy.RUNTIME)
@Target(value={ElementType.METHOD})
public @interface z {
    public String value();

    public D j() default D.AUTOMATIC;

    public static final class D
    extends Enum<D> {
        public static final /* enum */ D AUTOMATIC;
        public static final /* enum */ D GET;
        public static final /* enum */ D SET;
        public static final /* enum */ D HAS;
        private static final /* synthetic */ D[] w;

        public static D[] values() {
            return (D[])w.clone();
        }

        public static D valueOf(String string) {
            return Enum.valueOf(D.class, string);
        }

        /*
         * Unable to fully structure code
         */
        static {
            block20: {
                block19: {
                    var7 = 58341208512003L;
                    var0_1 = new String[4];
                    var4_2 = 0;
                    var3_3 = "r]P\u0003iYW";
                    var5_4 = "r]P\u0003iYW".length();
                    var2_5 = 3;
                    var1_6 = -1;
lbl8:
                    // 2 sources

                    while (true) {
                        v0 = ++var1_6;
                        v1 = var3_3.substring(v0, v0 + var2_5);
                        v2 = -1;
                        break block19;
                        break;
                    }
lbl13:
                    // 1 sources

                    while (true) {
                        var0_1[var4_2++] = v3.intern();
                        if ((var1_6 += var2_5) < var5_4) {
                            var2_5 = var3_3.charAt(var1_6);
                            ** continue;
                        }
                        var3_3 = "`MPrQ\u0000kh[\u0003f]P";
                        var5_4 = "`MPrQ\u0000kh[\u0003f]P".length();
                        var2_5 = 9;
                        var1_6 = -1;
lbl22:
                        // 2 sources

                        while (true) {
                            v4 = ++var1_6;
                            v1 = var3_3.substring(v4, v4 + var2_5);
                            v2 = 0;
                            break block19;
                            break;
                        }
                        break;
                    }
lbl27:
                    // 1 sources

                    while (true) {
                        var0_1[var4_2++] = v3.intern();
                        if ((var1_6 += var2_5) < var5_4) {
                            var2_5 = var3_3.charAt(var1_6);
                            ** continue;
                        }
                        break block20;
                        break;
                    }
                }
                v5 = v1.toCharArray();
                var6_7 = 0;
                v6 = v5.length;
                v7 = v5;
                v8 = v6;
                if (v6 > 1) ** GOTO lbl77
                do {
                    v9 = v7;
                    v10 = v7;
                    v11 = var6_7;
                    while (true) {
                        v12 = v9[v11];
                        switch (var6_7 % 7) {
                            case 0: {
                                v13 = 33;
                                break;
                            }
                            case 1: {
                                v13 = 24;
                                break;
                            }
                            case 2: {
                                v13 = 4;
                                break;
                            }
                            case 3: {
                                v13 = 61;
                                break;
                            }
                            case 4: {
                                v13 = 28;
                                break;
                            }
                            case 5: {
                                v13 = 65;
                                break;
                            }
                            default: {
                                v13 = 63;
                            }
                        }
                        v9[v11] = (char)(v12 ^ v13);
                        ++var6_7;
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
                } while (v8 > var6_7);
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
            D.AUTOMATIC = new D();
            D.GET = new D();
            D.SET = new D();
            D.HAS = new D();
            D.w = new D[]{D.AUTOMATIC, D.GET, D.SET, D.HAS};
        }
    }
}

