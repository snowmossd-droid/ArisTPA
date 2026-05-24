/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.command.Command
 *  org.bukkit.command.CommandExecutor
 *  org.bukkit.command.CommandSender
 *  org.bukkit.entity.Player
 */
package me.serbob.donuttp;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import me.serbob.donuttp.Z;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Vd
implements CommandExecutor {
    public static List<UUID> b;
    private static final String[] a;
    private static final String[] c;

    public boolean onCommand(CommandSender commandSender, Command command, String string, String[] stringArray) {
        block4: {
            UUID uUID;
            Player player;
            long l2;
            block3: {
                l2 = 28578157061423L;
                if (!(commandSender instanceof Player)) {
                    return false;
                }
                player = (Player)commandSender;
                uUID = player.getUniqueId();
                if (b.contains(uUID)) break block3;
                b.add(uUID);
                Z.D().m(player, Vd.a(-555343590 - -5615, -555343590 - -24124, (int)l2));
                break block4;
            }
            b.remove(uUID);
            Z.D().m(player, Vd.a(-555343590 - -5614, 555343590 - 18991, (int)l2));
        }
        return true;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var5 = new String[2];
            var3_1 = 0;
            var2_2 = "\u00b4W\u00d4\u0095\u001f\u0081'h\u00b3A\u00eem\u00a5A\u00f7U\u00d0?\u0003}2\u0012M\u0018\u00da5\u0019\u00d9\u00a6\b\u0010YUg2\u00a9>\u00d9\u008c\u0000\u00e2\u001f\u008a\u00e91\rM\u008c";
            var4_3 = "\u00b4W\u00d4\u0095\u001f\u0081'h\u00b3A\u00eem\u00a5A\u00f7U\u00d0?\u0003}2\u0012M\u0018\u00da5\u0019\u00d9\u00a6\b\u0010YUg2\u00a9>\u00d9\u008c\u0000\u00e2\u001f\u008a\u00e91\rM\u008c".length();
            var1_4 = 23;
            var0_5 = -1;
lbl7:
            // 2 sources

            while (true) {
                continue;
                break;
            }
lbl9:
            // 1 sources

            while (true) {
                var5[var3_1++] = new String(v0).intern();
                if ((var0_5 += var1_4) < var4_3) {
                    var1_4 = var2_2.charAt(var0_5);
                    ** continue;
                }
                break block13;
                break;
            }
            v1 = ++var0_5;
            v2 = var2_2.substring(v1, v1 + var1_4).toCharArray();
            var6_6 = 0;
            v3 = v2.length;
            v4 = v2;
            v5 = v3;
            if (v3 > 1) ** GOTO lbl59
            do {
                v6 = v4;
                v7 = v4;
                v8 = var6_6;
                while (true) {
                    v9 = v6[v8];
                    switch (var6_6 % 7) {
                        case 0: {
                            v10 = 39;
                            break;
                        }
                        case 1: {
                            v10 = 54;
                            break;
                        }
                        case 2: {
                            v10 = 29;
                            break;
                        }
                        case 3: {
                            v10 = 7;
                            break;
                        }
                        case 4: {
                            v10 = 33;
                            break;
                        }
                        case 5: {
                            v10 = 113;
                            break;
                        }
                        default: {
                            v10 = 79;
                        }
                    }
                    v6[v8] = (char)(v9 ^ v10);
                    ++var6_6;
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
            } while (v5 > var6_6);
            ** while (true)
        }
        Vd.a = var5;
        Vd.c = new String[2];
        Vd.b = new ArrayList<UUID>();
    }

    private static String a(int n2, int n3, int n4) {
        int n5 = (n2 ^ n4 ^ 0x5226) & 0xFFFF;
        if (c[n5] == null) {
            int n6;
            char[] cArray = a[n5].toCharArray();
            int n7 = switch (cArray[0] & 0xFF) {
                case 0 -> 226;
                case 1 -> 3;
                case 2 -> 77;
                case 3 -> 36;
                case 4 -> 82;
                case 5 -> 7;
                case 6 -> 67;
                case 7 -> 165;
                case 8 -> 54;
                case 9 -> 19;
                case 10 -> 25;
                case 11 -> 164;
                case 12 -> 32;
                case 13 -> 186;
                case 14 -> 15;
                case 15 -> 170;
                case 16 -> 227;
                case 17 -> 39;
                case 18 -> 140;
                case 19 -> 69;
                case 20 -> 200;
                case 21 -> 106;
                case 22 -> 223;
                case 23 -> 53;
                case 24 -> 122;
                case 25 -> 225;
                case 26 -> 221;
                case 27 -> 28;
                case 28 -> 178;
                case 29 -> 76;
                case 30 -> 212;
                case 31 -> 230;
                case 32 -> 101;
                case 33 -> 113;
                case 34 -> 88;
                case 35 -> 254;
                case 36 -> 219;
                case 37 -> 246;
                case 38 -> 193;
                case 39 -> 185;
                case 40 -> 99;
                case 41 -> 139;
                case 42 -> 13;
                case 43 -> 78;
                case 44 -> 229;
                case 45 -> 31;
                case 46 -> 245;
                case 47 -> 149;
                case 48 -> 144;
                case 49 -> 18;
                case 50 -> 187;
                case 51 -> 73;
                case 52 -> 83;
                case 53 -> 45;
                case 54 -> 216;
                case 55 -> 224;
                case 56 -> 105;
                case 57 -> 116;
                case 58 -> 125;
                case 59 -> 10;
                case 60 -> 167;
                case 61 -> 180;
                case 62 -> 175;
                case 63 -> 247;
                case 64 -> 174;
                case 65 -> 92;
                case 66 -> 206;
                case 67 -> 159;
                case 68 -> 48;
                case 69 -> 133;
                case 70 -> 68;
                case 71 -> 158;
                case 72 -> 188;
                case 73 -> 156;
                case 74 -> 202;
                case 75 -> 46;
                case 76 -> 213;
                case 77 -> 42;
                case 78 -> 232;
                case 79 -> 95;
                case 80 -> 152;
                case 81 -> 236;
                case 82 -> 81;
                case 83 -> 176;
                case 84 -> 17;
                case 85 -> 87;
                case 86 -> 123;
                case 87 -> 29;
                case 88 -> 231;
                case 89 -> 182;
                case 90 -> 40;
                case 91 -> 195;
                case 92 -> 16;
                case 93 -> 109;
                case 94 -> 147;
                case 95 -> 222;
                case 96 -> 90;
                case 97 -> 66;
                case 98 -> 240;
                case 99 -> 33;
                case 100 -> 4;
                case 101 -> 215;
                case 102 -> 134;
                case 103 -> 118;
                case 104 -> 241;
                case 105 -> 128;
                case 106 -> 79;
                case 107 -> 126;
                case 108 -> 60;
                case 109 -> 184;
                case 110 -> 6;
                case 111 -> 84;
                case 112 -> 239;
                case 113 -> 192;
                case 114 -> 203;
                case 115 -> 210;
                case 116 -> 2;
                case 117 -> 5;
                case 118 -> 233;
                case 119 -> 34;
                case 120 -> 102;
                case 121 -> 61;
                case 122 -> 237;
                case 123 -> 97;
                case 124 -> 71;
                case 125 -> 119;
                case 126 -> 56;
                case 127 -> 228;
                case 128 -> 94;
                case 129 -> 111;
                case 130 -> 242;
                case 131 -> 199;
                case 132 -> 49;
                case 133 -> 146;
                case 134 -> 86;
                case 135 -> 100;
                case 136 -> 166;
                case 137 -> 44;
                case 138 -> 117;
                case 139 -> 160;
                case 140 -> 205;
                case 141 -> 249;
                case 142 -> 201;
                case 143 -> 107;
                case 144 -> 148;
                case 145 -> 0;
                case 146 -> 181;
                case 147 -> 196;
                case 148 -> 138;
                case 149 -> 47;
                case 150 -> 169;
                case 151 -> 183;
                case 152 -> 218;
                case 153 -> 141;
                case 154 -> 89;
                case 155 -> 114;
                case 156 -> 72;
                case 157 -> 150;
                case 158 -> 63;
                case 159 -> 143;
                case 160 -> 23;
                case 161 -> 132;
                case 162 -> 168;
                case 163 -> 58;
                case 164 -> 129;
                case 165 -> 93;
                case 166 -> 142;
                case 167 -> 155;
                case 168 -> 177;
                case 169 -> 110;
                case 170 -> 50;
                case 171 -> 24;
                case 172 -> 235;
                case 173 -> 26;
                case 174 -> 30;
                case 175 -> 112;
                case 176 -> 194;
                case 177 -> 255;
                case 178 -> 211;
                case 179 -> 208;
                case 180 -> 145;
                case 181 -> 8;
                case 182 -> 98;
                case 183 -> 207;
                case 184 -> 51;
                case 185 -> 135;
                case 186 -> 9;
                case 187 -> 248;
                case 188 -> 136;
                case 189 -> 55;
                case 190 -> 137;
                case 191 -> 124;
                case 192 -> 43;
                case 193 -> 41;
                case 194 -> 238;
                case 195 -> 74;
                case 196 -> 80;
                case 197 -> 161;
                case 198 -> 157;
                case 199 -> 251;
                case 200 -> 62;
                case 201 -> 250;
                case 202 -> 252;
                case 203 -> 115;
                case 204 -> 173;
                case 205 -> 214;
                case 206 -> 20;
                case 207 -> 244;
                case 208 -> 59;
                case 209 -> 103;
                case 210 -> 204;
                case 211 -> 217;
                case 212 -> 57;
                case 213 -> 64;
                case 214 -> 220;
                case 215 -> 171;
                case 216 -> 85;
                case 217 -> 38;
                case 218 -> 96;
                case 219 -> 37;
                case 220 -> 253;
                case 221 -> 234;
                case 222 -> 121;
                case 223 -> 108;
                case 224 -> 163;
                case 225 -> 209;
                case 226 -> 162;
                case 227 -> 91;
                case 228 -> 35;
                case 229 -> 153;
                case 230 -> 154;
                case 231 -> 120;
                case 232 -> 75;
                case 233 -> 172;
                case 234 -> 198;
                case 235 -> 11;
                case 236 -> 21;
                case 237 -> 190;
                case 238 -> 22;
                case 239 -> 127;
                case 240 -> 65;
                case 241 -> 151;
                case 242 -> 52;
                case 243 -> 179;
                case 244 -> 130;
                case 245 -> 131;
                case 246 -> 12;
                case 247 -> 27;
                case 248 -> 197;
                case 249 -> 243;
                case 250 -> 104;
                case 251 -> 191;
                case 252 -> 70;
                case 253 -> 189;
                case 254 -> 14;
                default -> 1;
            };
            int n8 = ((n3 ^= n4) & 0xFF) - n7;
            if (n8 < 0) {
                n8 += 256;
            }
            if ((n6 = ((n3 & 0xFFFF) >>> 8) - n7) < 0) {
                n6 += 256;
            }
            int n9 = 0;
            while (n9 < cArray.length) {
                int n10 = n9 % 2;
                int n11 = n9;
                char[] cArray2 = cArray;
                char c2 = cArray[n11];
                if (n10 == 0) {
                    cArray2[n11] = (char)(c2 ^ n8);
                    n8 = ((n8 >>> 3 | n8 << 5) ^ cArray[n9]) & 0xFF;
                } else {
                    cArray2[n11] = (char)(c2 ^ n6);
                    n6 = ((n6 >>> 3 | n6 << 5) ^ cArray[n9]) & 0xFF;
                }
                ++n9;
            }
            Vd.c[n5] = new String(cArray).intern();
        }
        return c[n5];
    }
}

