/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 */
package me.serbob.donuttp;

import com.google.gson.Gson;
import me.serbob.donuttp.s;

@Deprecated
public class H {
    private static Gson L;
    private static final String a;

    private H() {
    }

    public static String n(Object object) {
        return L.toJson(object);
    }

    public static void x(Gson gson) {
        L = gson;
    }

    public static Object j(String string, long l2, Class clazz) {
        long l3 = l2 ^ 0x7246E65EDEC5L;
        try {
            if (string == null) {
                return null;
            }
            Object object = L.fromJson(string, clazz);
            return clazz.cast(object);
        }
        catch (Exception exception) {
            throw new s(a + clazz.getName(), exception, l3);
        }
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    static {
        char[] cArray;
        block12: {
            int n2;
            int n3;
            char[] cArray2;
            int n4;
            block11: {
                char[] cArray3 = "\u0016\u0006H\u0006\u0015l};\u001dV\fG/e=\u0002_\u001b\u0013%d4TP\u001a\b\"*'\u001b\u001a".toCharArray();
                n4 = 0;
                int n5 = cArray3.length;
                cArray2 = cArray3;
                n3 = n5;
                if (n5 <= 1) break block11;
                cArray = cArray2;
                n2 = n3;
                if (n3 <= n4) break block12;
            }
            do {
                char[] cArray4 = cArray2;
                char[] cArray5 = cArray2;
                int n6 = n4;
                while (true) {
                    int n7;
                    char c2 = cArray4[n6];
                    switch (n4 % 7) {
                        case 0: {
                            n7 = 83;
                            break;
                        }
                        case 1: {
                            n7 = 116;
                            break;
                        }
                        case 2: {
                            n7 = 58;
                            break;
                        }
                        case 3: {
                            n7 = 105;
                            break;
                        }
                        case 4: {
                            n7 = 103;
                            break;
                        }
                        case 5: {
                            n7 = 76;
                            break;
                        }
                        default: {
                            n7 = 10;
                        }
                    }
                    cArray4[n6] = (char)(c2 ^ n7);
                    ++n4;
                    cArray2 = cArray5;
                    n3 = n3;
                    if (n3 != 0) break;
                    cArray5 = cArray2;
                    n2 = n3;
                    n6 = n3;
                    cArray4 = cArray2;
                }
                cArray = cArray2;
                n2 = n3;
            } while (n3 > n4);
        }
        a = new String(cArray).intern();
        L = new Gson();
    }
}

