/*
 * Decompiled with CFR 0.152.
 */
package me.serbob.donuttp;

import java.lang.invoke.LambdaMetafactory;
import java.util.function.UnaryOperator;

public final class O
extends Enum<O> {
    public static final /* enum */ O camelCase;
    public static final /* enum */ O snake_case;
    public static final /* enum */ O PascalCase;
    public static final /* enum */ O lowercase;
    public static final /* enum */ O UPPERCASE;
    private UnaryOperator<String> r;
    private static final /* synthetic */ O[] d;
    private static final long a;

    public static O[] values() {
        return (O[])d.clone();
    }

    public static O valueOf(String string) {
        return Enum.valueOf(O.class, string);
    }

    private O(UnaryOperator<String> unaryOperator) {
        this.r = unaryOperator;
    }

    public String N(String string) {
        return (String)this.r.apply(string);
    }

    private static /* synthetic */ String lambda$static$2(String string) {
        long l2 = 135641157508269L;
        if (string.length() < 2) {
            return string.toUpperCase();
        }
        return Character.toUpperCase(string.charAt(0)) + string.substring(1);
    }

    private static /* synthetic */ String lambda$static$1(String string) {
        long l2 = 85065423937576L;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(Character.toLowerCase(string.charAt(0)));
        for (int i2 = 1; i2 < string.length(); ++i2) {
            char c2 = string.charAt(i2);
            if (Character.isUpperCase(c2)) {
                stringBuilder.append((char)a).append(Character.toLowerCase(c2));
                continue;
            }
            stringBuilder.append(c2);
        }
        return stringBuilder.toString();
    }

    private static /* synthetic */ String lambda$static$0(String string) {
        long l2 = 90928122011540L;
        if (string.length() < 2) {
            return string.toLowerCase();
        }
        return Character.toLowerCase(string.charAt(0)) + string.substring(1);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                var7 = 24004399850566L;
                var0_1 = new String[5];
                var4_2 = 0;
                var3_3 = "\u0011.oUsOr <y\t- kS`@P2*\t\u0014\u001fLs@`p\u0012\n";
                var5_4 = "\u0011.oUsOr <y\t- kS`@P2*\t\u0014\u001fLs@`p\u0012\n".length();
                var2_5 = 10;
                var1_6 = -1;
lbl8:
                // 2 sources

                while (true) {
                    v0 = ++var1_6;
                    v1 = var3_3.substring(v0, v0 + var2_5);
                    v2 = -1;
                    break block20;
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
                    var3_3 = "2!}]w|R <y\t\".qS~`P2*";
                    var5_4 = "2!}]w|R <y\t\".qS~`P2*".length();
                    var2_5 = 10;
                    var1_6 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v4 = ++var1_6;
                        v1 = var3_3.substring(v4, v4 + var2_5);
                        v2 = 0;
                        break block20;
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
                    break block21;
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
                            v13 = 65;
                            break;
                        }
                        case 1: {
                            v13 = 79;
                            break;
                        }
                        case 2: {
                            v13 = 28;
                            break;
                        }
                        case 3: {
                            v13 = 54;
                            break;
                        }
                        case 4: {
                            v13 = 18;
                            break;
                        }
                        case 5: {
                            v13 = 35;
                            break;
                        }
                        default: {
                            v13 = 49;
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
lbl87:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        ** while (true)
        O.a = 8463933668840825881L ^ var7;
        O.camelCase = new O((UnaryOperator)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$static$0(java.lang.String ), (Ljava/lang/String;)Ljava/lang/String;)());
        O.snake_case = new O((UnaryOperator)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$static$1(java.lang.String ), (Ljava/lang/String;)Ljava/lang/String;)());
        O.PascalCase = new O((UnaryOperator)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$static$2(java.lang.String ), (Ljava/lang/String;)Ljava/lang/String;)());
        O.lowercase = new O((UnaryOperator)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, toLowerCase(), (Ljava/lang/String;)Ljava/lang/String;)());
        O.UPPERCASE = new O((UnaryOperator)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, toUpperCase(), (Ljava/lang/String;)Ljava/lang/String;)());
        O.d = new O[]{O.camelCase, O.snake_case, O.PascalCase, O.lowercase, O.UPPERCASE};
    }
}

