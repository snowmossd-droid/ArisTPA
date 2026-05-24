/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.md_5.bungee.api.ChatColor
 */
package me.serbob.donuttp;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.md_5.bungee.api.ChatColor;

public class M {
    public static final Pattern v;
    private static final long a;

    public static String G(String string) {
        long l2 = 83209009727637L;
        Matcher matcher = v.matcher(string);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            matcher.appendReplacement(stringBuffer, ChatColor.of((String)("#" + matcher.group(1))).toString());
        }
        return ChatColor.translateAlternateColorCodes((char)a, (String)matcher.appendTail(stringBuffer).toString());
    }

    public static List<String> X(List<String> list) {
        return list.stream().map(M::G).toList();
    }

    public static String[] t(String[] stringArray) {
        return (String[])Arrays.stream(stringArray).map(M::G).toList().toArray(String[]::new);
    }

    public static String X(long l2, String string) {
        Object object;
        block6: {
            block7: {
                String string2;
                block4: {
                    block5: {
                        string2 = string;
                        if (l2 <= 0L) break block4;
                        if (string2 == null) break block5;
                        object = string;
                        if (l2 < 0L) break block6;
                        if (!((String)object).isEmpty()) break block7;
                    }
                    string2 = string;
                }
                return string2;
            }
            object = string.substring(0, 1).toUpperCase() + string.substring(1).toLowerCase();
        }
        return object;
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    static {
        char[] cArray;
        long l2;
        block12: {
            int n2;
            int n3;
            char[] cArray2;
            int n4;
            block11: {
                l2 = 40812825190779L;
                char[] cArray3 = ">\u0018\u0014S/TbF\u0000e\u001d5Ly\\\u001d\u000ey}".toCharArray();
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
                    char c2 = cArray4[n6];
                    cArray4[n6] = (char)(c2 ^ (switch (n4 % 7) {
                        case 0 -> 29;
                        case 1 -> 48;
                        case 2 -> 72;
                        case 3 -> 36;
                        case 4 -> 84;
                        case 5 -> 97;
                        default -> 31;
                    }));
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
        String string = new String(cArray).intern();
        a = 0x8CF9227A79F2A15DL ^ l2;
        v = Pattern.compile(string);
    }
}

