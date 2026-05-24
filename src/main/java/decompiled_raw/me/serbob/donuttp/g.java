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

public class g
implements CommandExecutor {
    private static final String[] a;
    private static final String[] b;

    public boolean onCommand(CommandSender commandSender, Command command, String string, String[] stringArray) {
        long l2;
        long l3 = l2 = 93658726384434L;
        long l4 = l3 ^ 0x7AE06B790536L;
        long l5 = l3 ^ 0x15B1610054A1L;
        long l6 = l3 ^ 0xB43F81B2C1FL;
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
            this.K(l4, player, g.a(1625399070 + (char)-29400, -1625399070 + -((char)-24465), (int)l2));
            return false;
        }
        if (player2.getUniqueId().equals(player.getUniqueId())) {
            player.playSound((Entity)player, Sound.ENTITY_VILLAGER_NO, 1.0f, 1.0f);
            return false;
        }
        if (V6.X(player.getUniqueId())) {
            V6.q(player, l5);
        }
        Inventory inventory = L.G(player, l6, player2, g.a(1625399070 + (char)-29399, -1625399070 + -((char)-19751), (int)l2));
        player.openInventory(inventory);
        return true;
    }

    private void K(long l2, Player player, String string) {
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
            var2_2 = "\u00der\u0018\u001d\u000e\u0013aX\u00eb\u0016\u0013\u00ac05\u00e0\u0010>0a\u00118;\u00f8\u00fbI\u0007\u00f1\u00dd\u00d1@g\u00d1\u00cc";
            var4_3 = "\u00der\u0018\u001d\u000e\u0013aX\u00eb\u0016\u0013\u00ac05\u00e0\u0010>0a\u00118;\u00f8\u00fbI\u0007\u00f1\u00dd\u00d1@g\u00d1\u00cc".length();
            var1_4 = 25;
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
                            v10 = 10;
                            break;
                        }
                        case 1: {
                            v10 = 108;
                            break;
                        }
                        case 2: {
                            v10 = 49;
                            break;
                        }
                        case 3: {
                            v10 = 100;
                            break;
                        }
                        case 4: {
                            v10 = 87;
                            break;
                        }
                        case 5: {
                            v10 = 70;
                            break;
                        }
                        default: {
                            v10 = 98;
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
        g.a = var5;
        g.b = new String[2];
    }

    private static String a(int n2, int n3, int n4) {
        int n5 = (n2 ^ n4 ^ 0xFFFFEF74) & 0xFFFF;
        if (b[n5] == null) {
            int n6;
            char[] cArray = a[n5].toCharArray();
            int n7 = switch (cArray[0] & 0xFF) {
                case 0 -> 162;
                case 1 -> 208;
                case 2 -> 198;
                case 3 -> 214;
                case 4 -> 30;
                case 5 -> 251;
                case 6 -> 69;
                case 7 -> 234;
                case 8 -> 149;
                case 9 -> 93;
                case 10 -> 232;
                case 11 -> 217;
                case 12 -> 100;
                case 13 -> 98;
                case 14 -> 151;
                case 15 -> 247;
                case 16 -> 197;
                case 17 -> 64;
                case 18 -> 190;
                case 19 -> 86;
                case 20 -> 129;
                case 21 -> 141;
                case 22 -> 220;
                case 23 -> 216;
                case 24 -> 176;
                case 25 -> 166;
                case 26 -> 28;
                case 27 -> 196;
                case 28 -> 51;
                case 29 -> 195;
                case 30 -> 153;
                case 31 -> 178;
                case 32 -> 165;
                case 33 -> 109;
                case 34 -> 65;
                case 35 -> 164;
                case 36 -> 84;
                case 37 -> 225;
                case 38 -> 4;
                case 39 -> 40;
                case 40 -> 204;
                case 41 -> 145;
                case 42 -> 52;
                case 43 -> 221;
                case 44 -> 94;
                case 45 -> 172;
                case 46 -> 125;
                case 47 -> 249;
                case 48 -> 117;
                case 49 -> 250;
                case 50 -> 255;
                case 51 -> 160;
                case 52 -> 114;
                case 53 -> 43;
                case 54 -> 228;
                case 55 -> 133;
                case 56 -> 34;
                case 57 -> 229;
                case 58 -> 95;
                case 59 -> 226;
                case 60 -> 54;
                case 61 -> 127;
                case 62 -> 53;
                case 63 -> 175;
                case 64 -> 128;
                case 65 -> 103;
                case 66 -> 36;
                case 67 -> 179;
                case 68 -> 199;
                case 69 -> 231;
                case 70 -> 47;
                case 71 -> 72;
                case 72 -> 115;
                case 73 -> 45;
                case 74 -> 248;
                case 75 -> 73;
                case 76 -> 13;
                case 77 -> 63;
                case 78 -> 181;
                case 79 -> 137;
                case 80 -> 180;
                case 81 -> 90;
                case 82 -> 27;
                case 83 -> 88;
                case 84 -> 91;
                case 85 -> 12;
                case 86 -> 85;
                case 87 -> 134;
                case 88 -> 32;
                case 89 -> 139;
                case 90 -> 156;
                case 91 -> 161;
                case 92 -> 207;
                case 93 -> 102;
                case 94 -> 182;
                case 95 -> 168;
                case 96 -> 14;
                case 97 -> 75;
                case 98 -> 171;
                case 99 -> 26;
                case 100 -> 132;
                case 101 -> 227;
                case 102 -> 144;
                case 103 -> 235;
                case 104 -> 219;
                case 105 -> 92;
                case 106 -> 97;
                case 107 -> 150;
                case 108 -> 67;
                case 109 -> 81;
                case 110 -> 16;
                case 111 -> 209;
                case 112 -> 120;
                case 113 -> 193;
                case 114 -> 107;
                case 115 -> 203;
                case 116 -> 154;
                case 117 -> 7;
                case 118 -> 96;
                case 119 -> 11;
                case 120 -> 184;
                case 121 -> 142;
                case 122 -> 48;
                case 123 -> 101;
                case 124 -> 124;
                case 125 -> 1;
                case 126 -> 71;
                case 127 -> 119;
                case 128 -> 17;
                case 129 -> 83;
                case 130 -> 167;
                case 131 -> 173;
                case 132 -> 253;
                case 133 -> 236;
                case 134 -> 70;
                case 135 -> 24;
                case 136 -> 9;
                case 137 -> 174;
                case 138 -> 122;
                case 139 -> 44;
                case 140 -> 110;
                case 141 -> 218;
                case 142 -> 233;
                case 143 -> 33;
                case 144 -> 163;
                case 145 -> 238;
                case 146 -> 29;
                case 147 -> 118;
                case 148 -> 152;
                case 149 -> 37;
                case 150 -> 230;
                case 151 -> 41;
                case 152 -> 111;
                case 153 -> 146;
                case 154 -> 222;
                case 155 -> 116;
                case 156 -> 38;
                case 157 -> 104;
                case 158 -> 169;
                case 159 -> 159;
                case 160 -> 74;
                case 161 -> 23;
                case 162 -> 82;
                case 163 -> 58;
                case 164 -> 192;
                case 165 -> 105;
                case 166 -> 240;
                case 167 -> 177;
                case 168 -> 252;
                case 169 -> 25;
                case 170 -> 187;
                case 171 -> 77;
                case 172 -> 170;
                case 173 -> 206;
                case 174 -> 126;
                case 175 -> 35;
                case 176 -> 22;
                case 177 -> 157;
                case 178 -> 6;
                case 179 -> 189;
                case 180 -> 194;
                case 181 -> 201;
                case 182 -> 66;
                case 183 -> 15;
                case 184 -> 245;
                case 185 -> 3;
                case 186 -> 123;
                case 187 -> 121;
                case 188 -> 76;
                case 189 -> 21;
                case 190 -> 80;
                case 191 -> 113;
                case 192 -> 224;
                case 193 -> 246;
                case 194 -> 215;
                case 195 -> 60;
                case 196 -> 0;
                case 197 -> 243;
                case 198 -> 239;
                case 199 -> 50;
                case 200 -> 87;
                case 201 -> 186;
                case 202 -> 241;
                case 203 -> 89;
                case 204 -> 108;
                case 205 -> 210;
                case 206 -> 79;
                case 207 -> 5;
                case 208 -> 188;
                case 209 -> 55;
                case 210 -> 59;
                case 211 -> 135;
                case 212 -> 136;
                case 213 -> 49;
                case 214 -> 211;
                case 215 -> 185;
                case 216 -> 223;
                case 217 -> 138;
                case 218 -> 62;
                case 219 -> 2;
                case 220 -> 68;
                case 221 -> 202;
                case 222 -> 46;
                case 223 -> 237;
                case 224 -> 78;
                case 225 -> 131;
                case 226 -> 42;
                case 227 -> 158;
                case 228 -> 61;
                case 229 -> 205;
                case 230 -> 99;
                case 231 -> 57;
                case 232 -> 112;
                case 233 -> 148;
                case 234 -> 8;
                case 235 -> 106;
                case 236 -> 191;
                case 237 -> 147;
                case 238 -> 31;
                case 239 -> 143;
                case 240 -> 254;
                case 241 -> 20;
                case 242 -> 244;
                case 243 -> 56;
                case 244 -> 155;
                case 245 -> 242;
                case 246 -> 10;
                case 247 -> 212;
                case 248 -> 183;
                case 249 -> 39;
                case 250 -> 130;
                case 251 -> 140;
                case 252 -> 213;
                case 253 -> 18;
                case 254 -> 19;
                default -> 200;
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
            g.b[n5] = new String(cArray).intern();
        }
        return b[n5];
    }
}

