/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.Bukkit
 *  org.bukkit.Sound
 *  org.bukkit.command.Command
 *  org.bukkit.command.CommandExecutor
 *  org.bukkit.command.CommandSender
 *  org.bukkit.configuration.file.FileConfiguration
 *  org.bukkit.entity.Entity
 *  org.bukkit.entity.Player
 *  org.bukkit.inventory.Inventory
 */
package me.serbob.donuttp;

import java.util.List;
import me.serbob.donuttp.L;
import me.serbob.donuttp.M;
import me.serbob.donuttp.V6;
import me.serbob.donuttp.Z;
import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class t
implements CommandExecutor {
    private static final String[] a;
    private static final String[] b;

    public boolean onCommand(CommandSender commandSender, Command command, String string, String[] stringArray) {
        long l2;
        long l3 = l2 = 76511363752173L;
        long l4 = l3 ^ 0x423DA91D99B0L;
        long l5 = l3 ^ 0x509CEB5F77EL;
        long l6 = l3 ^ 0x1BFB57AE8FC0L;
        if (!(commandSender instanceof Player)) {
            return false;
        }
        Player player = (Player)commandSender;
        if (stringArray.length == 0) {
            player.playSound((Entity)player, Sound.ENTITY_VILLAGER_NO, 1.0f, 1.0f);
            return false;
        }
        String string2 = stringArray[0];
        Player player2 = Bukkit.getPlayer((String)string2);
        if (player2 == null) {
            this.Z(l4, player, t.a(816303960 + 26483, 816303960 + 25154, (int)l2));
            return false;
        }
        if (player2.getUniqueId().equals(player.getUniqueId())) {
            player.playSound((Entity)player, Sound.ENTITY_VILLAGER_NO, 1.0f, 1.0f);
            return false;
        }
        if (V6.X(player.getUniqueId())) {
            V6.q(player, l5);
        }
        Inventory inventory = L.G(player, l6, player2, t.a(816303960 + 26482, 816303960 + 25551, (int)l2));
        player.openInventory(inventory);
        return true;
    }

    private void Z(long l2, Player player, String string) {
        FileConfiguration fileConfiguration = Z.D().getConfig();
        List list = fileConfiguration.getStringList(string);
        for (String string2 : list) {
            player.sendMessage(M.G(string2));
            if (l2 >= 0L) continue;
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var5 = new String[2];
            var3_1 = 0;
            var2_2 = "7\u00e8I\u0019D\u00d2\u000boA\u0004$\u001aB\u001e@\u0080\u0003\u001c&4\u00a6\u00d2_\u0014S;\u0094\u00bb\u00a2";
            var4_3 = "7\u00e8I\u0019D\u00d2\u000boA\u0004$\u001aB\u001e@\u0080\u0003\u001c&4\u00a6\u00d2_\u0014S;\u0094\u00bb\u00a2".length();
            var1_4 = 3;
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
                            v10 = 8;
                            break;
                        }
                        case 1: {
                            v10 = 76;
                            break;
                        }
                        case 2: {
                            v10 = 49;
                            break;
                        }
                        case 3: {
                            v10 = 6;
                            break;
                        }
                        case 4: {
                            v10 = 122;
                            break;
                        }
                        case 5: {
                            v10 = 83;
                            break;
                        }
                        default: {
                            v10 = 107;
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
        t.a = var5;
        t.b = new String[2];
    }

    private static String a(int n2, int n3, int n4) {
        int n5 = (n2 ^ n4 ^ 0x5627) & 0xFFFF;
        if (b[n5] == null) {
            int n6;
            char[] cArray = a[n5].toCharArray();
            int n7 = switch (cArray[0] & 0xFF) {
                case 0 -> 92;
                case 1 -> 48;
                case 2 -> 60;
                case 3 -> 106;
                case 4 -> 140;
                case 5 -> 32;
                case 6 -> 107;
                case 7 -> 31;
                case 8 -> 168;
                case 9 -> 63;
                case 10 -> 102;
                case 11 -> 184;
                case 12 -> 26;
                case 13 -> 0;
                case 14 -> 112;
                case 15 -> 213;
                case 16 -> 114;
                case 17 -> 188;
                case 18 -> 99;
                case 19 -> 147;
                case 20 -> 113;
                case 21 -> 245;
                case 22 -> 153;
                case 23 -> 142;
                case 24 -> 183;
                case 25 -> 255;
                case 26 -> 120;
                case 27 -> 21;
                case 28 -> 156;
                case 29 -> 4;
                case 30 -> 172;
                case 31 -> 163;
                case 32 -> 231;
                case 33 -> 226;
                case 34 -> 165;
                case 35 -> 248;
                case 36 -> 100;
                case 37 -> 110;
                case 38 -> 39;
                case 39 -> 162;
                case 40 -> 101;
                case 41 -> 34;
                case 42 -> 7;
                case 43 -> 201;
                case 44 -> 131;
                case 45 -> 219;
                case 46 -> 198;
                case 47 -> 96;
                case 48 -> 212;
                case 49 -> 252;
                case 50 -> 94;
                case 51 -> 25;
                case 52 -> 22;
                case 53 -> 170;
                case 54 -> 27;
                case 55 -> 133;
                case 56 -> 178;
                case 57 -> 224;
                case 58 -> 214;
                case 59 -> 23;
                case 60 -> 254;
                case 61 -> 228;
                case 62 -> 202;
                case 63 -> 95;
                case 64 -> 236;
                case 65 -> 117;
                case 66 -> 218;
                case 67 -> 209;
                case 68 -> 69;
                case 69 -> 115;
                case 70 -> 121;
                case 71 -> 65;
                case 72 -> 56;
                case 73 -> 159;
                case 74 -> 57;
                case 75 -> 138;
                case 76 -> 86;
                case 77 -> 179;
                case 78 -> 144;
                case 79 -> 220;
                case 80 -> 223;
                case 81 -> 167;
                case 82 -> 78;
                case 83 -> 222;
                case 84 -> 66;
                case 85 -> 196;
                case 86 -> 128;
                case 87 -> 6;
                case 88 -> 18;
                case 89 -> 91;
                case 90 -> 67;
                case 91 -> 210;
                case 92 -> 169;
                case 93 -> 181;
                case 94 -> 243;
                case 95 -> 43;
                case 96 -> 141;
                case 97 -> 74;
                case 98 -> 146;
                case 99 -> 221;
                case 100 -> 87;
                case 101 -> 17;
                case 102 -> 51;
                case 103 -> 190;
                case 104 -> 205;
                case 105 -> 191;
                case 106 -> 143;
                case 107 -> 62;
                case 108 -> 204;
                case 109 -> 97;
                case 110 -> 35;
                case 111 -> 155;
                case 112 -> 84;
                case 113 -> 53;
                case 114 -> 151;
                case 115 -> 118;
                case 116 -> 80;
                case 117 -> 177;
                case 118 -> 68;
                case 119 -> 250;
                case 120 -> 233;
                case 121 -> 75;
                case 122 -> 241;
                case 123 -> 244;
                case 124 -> 185;
                case 125 -> 122;
                case 126 -> 76;
                case 127 -> 33;
                case 128 -> 2;
                case 129 -> 81;
                case 130 -> 139;
                case 131 -> 105;
                case 132 -> 211;
                case 133 -> 230;
                case 134 -> 239;
                case 135 -> 85;
                case 136 -> 229;
                case 137 -> 235;
                case 138 -> 64;
                case 139 -> 61;
                case 140 -> 247;
                case 141 -> 103;
                case 142 -> 145;
                case 143 -> 38;
                case 144 -> 88;
                case 145 -> 197;
                case 146 -> 50;
                case 147 -> 73;
                case 148 -> 182;
                case 149 -> 166;
                case 150 -> 123;
                case 151 -> 154;
                case 152 -> 160;
                case 153 -> 129;
                case 154 -> 134;
                case 155 -> 24;
                case 156 -> 42;
                case 157 -> 28;
                case 158 -> 59;
                case 159 -> 194;
                case 160 -> 98;
                case 161 -> 174;
                case 162 -> 124;
                case 163 -> 186;
                case 164 -> 150;
                case 165 -> 251;
                case 166 -> 207;
                case 167 -> 83;
                case 168 -> 1;
                case 169 -> 13;
                case 170 -> 164;
                case 171 -> 249;
                case 172 -> 176;
                case 173 -> 10;
                case 174 -> 20;
                case 175 -> 16;
                case 176 -> 36;
                case 177 -> 15;
                case 178 -> 77;
                case 179 -> 192;
                case 180 -> 242;
                case 181 -> 46;
                case 182 -> 29;
                case 183 -> 119;
                case 184 -> 137;
                case 185 -> 55;
                case 186 -> 11;
                case 187 -> 58;
                case 188 -> 126;
                case 189 -> 104;
                case 190 -> 216;
                case 191 -> 203;
                case 192 -> 227;
                case 193 -> 161;
                case 194 -> 125;
                case 195 -> 72;
                case 196 -> 148;
                case 197 -> 240;
                case 198 -> 175;
                case 199 -> 136;
                case 200 -> 30;
                case 201 -> 149;
                case 202 -> 45;
                case 203 -> 41;
                case 204 -> 8;
                case 205 -> 70;
                case 206 -> 130;
                case 207 -> 90;
                case 208 -> 200;
                case 209 -> 109;
                case 210 -> 52;
                case 211 -> 171;
                case 212 -> 199;
                case 213 -> 54;
                case 214 -> 225;
                case 215 -> 234;
                case 216 -> 37;
                case 217 -> 82;
                case 218 -> 238;
                case 219 -> 173;
                case 220 -> 180;
                case 221 -> 47;
                case 222 -> 93;
                case 223 -> 152;
                case 224 -> 246;
                case 225 -> 232;
                case 226 -> 208;
                case 227 -> 217;
                case 228 -> 215;
                case 229 -> 127;
                case 230 -> 108;
                case 231 -> 206;
                case 232 -> 44;
                case 233 -> 40;
                case 234 -> 187;
                case 235 -> 71;
                case 236 -> 5;
                case 237 -> 158;
                case 238 -> 135;
                case 239 -> 189;
                case 240 -> 9;
                case 241 -> 49;
                case 242 -> 193;
                case 243 -> 111;
                case 244 -> 14;
                case 245 -> 157;
                case 246 -> 79;
                case 247 -> 237;
                case 248 -> 195;
                case 249 -> 19;
                case 250 -> 89;
                case 251 -> 116;
                case 252 -> 12;
                case 253 -> 253;
                case 254 -> 132;
                default -> 3;
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
            t.b[n5] = new String(cArray).intern();
        }
        return b[n5];
    }
}

