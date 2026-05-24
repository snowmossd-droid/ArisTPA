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
import java.util.UUID;
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

public class VQ
implements CommandExecutor {
    private static final String[] a;
    private static final String[] b;

    public boolean onCommand(CommandSender commandSender, Command command, String string, String[] stringArray) {
        block14: {
            Player player;
            long l2;
            long l3;
            block13: {
                long l4 = l3 = 16711009034128L;
                long l5 = l4 ^ 0x4B8CBA0392AEL;
                int n2 = (int)(l5 >>> 48);
                int n3 = (int)(l5 << 16 >>> 48);
                int n4 = (int)(l5 << 32 >>> 32);
                long l6 = l4 ^ 0x6DE0EB9D50BL;
                long l7 = l4 ^ 0x6C67C0A08E02L;
                l2 = l4 ^ 0x2D485B9592CDL;
                if (!(commandSender instanceof Player)) {
                    return true;
                }
                player = (Player)commandSender;
                if (stringArray.length > 0) {
                    String string2 = stringArray[0];
                    Player player2 = Bukkit.getPlayer((String)string2);
                    if (player2 == null) {
                        this.m(player, VQ.a(708695490 + (char)-22211, -708695490 + -19832, (int)l3), l2);
                        player.playSound((Entity)player, Sound.ENTITY_ENDERMAN_TELEPORT, 1.0f, 1.0f);
                        return true;
                    }
                    UUID uUID = player2.getUniqueId();
                    V6.X x2 = V6.b(l6, player.getUniqueId(), uUID);
                    if (x2 == null) {
                        this.m(player, VQ.a(708695490 + (char)-22214, 708695490 + 13137, (int)l3), l2);
                        player.playSound((Entity)player, Sound.ENTITY_ENDERMAN_TELEPORT, 1.0f, 1.0f);
                        return true;
                    }
                    Inventory inventory = L.t(player, (short)n2, player2, (char)n3, n4, x2.S);
                    player.openInventory(inventory);
                    return true;
                }
                V6.X x3 = V6.B(player.getUniqueId(), l7);
                if (x3 == null) {
                    this.m(player, VQ.a(708695490 + (char)-22213, -708695490 + -((char)-23559), (int)l3), l2);
                    player.playSound((Entity)player, Sound.ENTITY_ENDERMAN_TELEPORT, 1.0f, 1.0f);
                    return true;
                }
                Player player3 = player.getServer().getPlayer(x3.v);
                if (player3 == null || !player3.isOnline()) break block13;
                Inventory inventory = L.t(player, (short)n2, player3, (char)n3, n4, x3.S);
                player.openInventory(inventory);
                break block14;
            }
            this.m(player, VQ.a(708695490 + (char)-22212, -708695490 + -19635, (int)l3), l2);
        }
        return true;
    }

    private void m(Player player, String string, long l2) {
        FileConfiguration fileConfiguration = Z.D().getConfig();
        List list = fileConfiguration.getStringList(string);
        for (String string2 : list) {
            player.sendMessage(M.G(string2));
            if (l2 > 0L) continue;
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block20: {
            block19: {
                var5 = new String[4];
                var3_1 = 0;
                var2_2 = "\u00e1\u001f\u0094[\u00cc~#\u00ff\f\u0089\u0004\fw;\u0002~\t\u0016\u00d4p\u0094\u001d\u00c2T\u00e5\u001a\u00a2\u0080\u00fc\u00a8\u00c1\u0000\u008208r\u008b!\u00a2\u008c4\u00a3\u00e5\u00fe\b\u00e3APa\u00d2\u00a1Y";
                var4_3 = "\u00e1\u001f\u0094[\u00cc~#\u00ff\f\u0089\u0004\fw;\u0002~\t\u0016\u00d4p\u0094\u001d\u00c2T\u00e5\u001a\u00a2\u0080\u00fc\u00a8\u00c1\u0000\u008208r\u008b!\u00a2\u008c4\u00a3\u00e5\u00fe\b\u00e3APa\u00d2\u00a1Y".length();
                var1_4 = 25;
                var0_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = ++var0_5;
                    v1 = var2_2.substring(v0, v0 + var1_4);
                    v2 = -1;
                    break block19;
                    break;
                }
lbl12:
                // 1 sources

                while (true) {
                    var5[var3_1++] = v3.intern();
                    if ((var0_5 += var1_4) < var4_3) {
                        var1_4 = var2_2.charAt(var0_5);
                        ** continue;
                    }
                    var2_2 = "\u00d6\u001br\u00db\u0010n\u00b8\u00fd\u007f\u00d7i$\u00b0\u00c7\u00ce\u00da\b\u00df\u0000hk\u0014\u00af%\u00cd.k9\u001cAU\u0080\u0012NWs\u00da\u00063F\u00b8UTr\u00a8\u009f\u0091\u00f2\u00a15-d\u0002\u00b4\u00caD\u00a5";
                    var4_3 = "\u00d6\u001br\u00db\u0010n\u00b8\u00fd\u007f\u00d7i$\u00b0\u00c7\u00ce\u00da\b\u00df\u0000hk\u0014\u00af%\u00cd.k9\u001cAU\u0080\u0012NWs\u00da\u00063F\u00b8UTr\u00a8\u009f\u0091\u00f2\u00a15-d\u0002\u00b4\u00caD\u00a5".length();
                    var1_4 = 28;
                    var0_5 = -1;
lbl21:
                    // 2 sources

                    while (true) {
                        v4 = ++var0_5;
                        v1 = var2_2.substring(v4, v4 + var1_4);
                        v2 = 0;
                        break block19;
                        break;
                    }
                    break;
                }
lbl26:
                // 1 sources

                while (true) {
                    var5[var3_1++] = v3.intern();
                    if ((var0_5 += var1_4) < var4_3) {
                        var1_4 = var2_2.charAt(var0_5);
                        ** continue;
                    }
                    break block20;
                    break;
                }
            }
            v5 = v1.toCharArray();
            var6_6 = 0;
            v6 = v5.length;
            v7 = v5;
            v8 = v6;
            if (v6 > 1) ** GOTO lbl76
            do {
                v9 = v7;
                v10 = v7;
                v11 = var6_6;
                while (true) {
                    v12 = v9[v11];
                    switch (var6_6 % 7) {
                        case 0: {
                            v13 = 9;
                            break;
                        }
                        case 1: {
                            v13 = 72;
                            break;
                        }
                        case 2: {
                            v13 = 58;
                            break;
                        }
                        case 3: {
                            v13 = 11;
                            break;
                        }
                        case 4: {
                            v13 = 101;
                            break;
                        }
                        case 5: {
                            v13 = 14;
                            break;
                        }
                        default: {
                            v13 = 62;
                        }
                    }
                    v9[v11] = (char)(v12 ^ v13);
                    ++var6_6;
                    v7 = v10;
                    v8 = v8;
                    if (v8 != 0) break;
                    v10 = v7;
                    v14 = v8;
                    v11 = v8;
                    v9 = v7;
                }
lbl76:
                // 2 sources

                v15 = v7;
                v14 = v8;
            } while (v8 > var6_6);
            v3 = new String(v15);
            switch (v2) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl85:
                // 1 sources

                ** continue;
            }
        }
        VQ.a = var5;
        VQ.b = new String[4];
    }

    private static String a(int n2, int n3, int n4) {
        int n5 = (n2 ^ n4 ^ 0xFFFFA16F) & 0xFFFF;
        if (b[n5] == null) {
            int n6;
            char[] cArray = a[n5].toCharArray();
            int n7 = switch (cArray[0] & 0xFF) {
                case 0 -> 201;
                case 1 -> 21;
                case 2 -> 243;
                case 3 -> 238;
                case 4 -> 171;
                case 5 -> 206;
                case 6 -> 240;
                case 7 -> 229;
                case 8 -> 225;
                case 9 -> 97;
                case 10 -> 184;
                case 11 -> 113;
                case 12 -> 77;
                case 13 -> 1;
                case 14 -> 124;
                case 15 -> 78;
                case 16 -> 203;
                case 17 -> 123;
                case 18 -> 5;
                case 19 -> 137;
                case 20 -> 217;
                case 21 -> 108;
                case 22 -> 96;
                case 23 -> 197;
                case 24 -> 87;
                case 25 -> 98;
                case 26 -> 111;
                case 27 -> 23;
                case 28 -> 110;
                case 29 -> 118;
                case 30 -> 204;
                case 31 -> 58;
                case 32 -> 146;
                case 33 -> 17;
                case 34 -> 119;
                case 35 -> 234;
                case 36 -> 42;
                case 37 -> 226;
                case 38 -> 112;
                case 39 -> 143;
                case 40 -> 135;
                case 41 -> 129;
                case 42 -> 210;
                case 43 -> 252;
                case 44 -> 28;
                case 45 -> 202;
                case 46 -> 91;
                case 47 -> 156;
                case 48 -> 93;
                case 49 -> 193;
                case 50 -> 56;
                case 51 -> 126;
                case 52 -> 145;
                case 53 -> 255;
                case 54 -> 60;
                case 55 -> 122;
                case 56 -> 164;
                case 57 -> 223;
                case 58 -> 52;
                case 59 -> 250;
                case 60 -> 150;
                case 61 -> 157;
                case 62 -> 128;
                case 63 -> 148;
                case 64 -> 109;
                case 65 -> 172;
                case 66 -> 55;
                case 67 -> 19;
                case 68 -> 188;
                case 69 -> 185;
                case 70 -> 248;
                case 71 -> 48;
                case 72 -> 94;
                case 73 -> 199;
                case 74 -> 82;
                case 75 -> 70;
                case 76 -> 162;
                case 77 -> 205;
                case 78 -> 57;
                case 79 -> 158;
                case 80 -> 71;
                case 81 -> 228;
                case 82 -> 196;
                case 83 -> 63;
                case 84 -> 29;
                case 85 -> 10;
                case 86 -> 152;
                case 87 -> 114;
                case 88 -> 9;
                case 89 -> 22;
                case 90 -> 237;
                case 91 -> 149;
                case 92 -> 38;
                case 93 -> 80;
                case 94 -> 105;
                case 95 -> 95;
                case 96 -> 230;
                case 97 -> 192;
                case 98 -> 181;
                case 99 -> 139;
                case 100 -> 34;
                case 101 -> 221;
                case 102 -> 212;
                case 103 -> 144;
                case 104 -> 100;
                case 105 -> 6;
                case 106 -> 81;
                case 107 -> 195;
                case 108 -> 99;
                case 109 -> 173;
                case 110 -> 242;
                case 111 -> 182;
                case 112 -> 222;
                case 113 -> 215;
                case 114 -> 12;
                case 115 -> 54;
                case 116 -> 249;
                case 117 -> 179;
                case 118 -> 69;
                case 119 -> 166;
                case 120 -> 236;
                case 121 -> 134;
                case 122 -> 174;
                case 123 -> 11;
                case 124 -> 67;
                case 125 -> 165;
                case 126 -> 0;
                case 127 -> 235;
                case 128 -> 74;
                case 129 -> 246;
                case 130 -> 216;
                case 131 -> 167;
                case 132 -> 39;
                case 133 -> 138;
                case 134 -> 83;
                case 135 -> 140;
                case 136 -> 147;
                case 137 -> 160;
                case 138 -> 13;
                case 139 -> 169;
                case 140 -> 241;
                case 141 -> 155;
                case 142 -> 254;
                case 143 -> 168;
                case 144 -> 253;
                case 145 -> 40;
                case 146 -> 239;
                case 147 -> 244;
                case 148 -> 103;
                case 149 -> 176;
                case 150 -> 200;
                case 151 -> 211;
                case 152 -> 187;
                case 153 -> 207;
                case 154 -> 213;
                case 155 -> 30;
                case 156 -> 3;
                case 157 -> 191;
                case 158 -> 79;
                case 159 -> 247;
                case 160 -> 133;
                case 161 -> 136;
                case 162 -> 24;
                case 163 -> 8;
                case 164 -> 75;
                case 165 -> 180;
                case 166 -> 101;
                case 167 -> 214;
                case 168 -> 233;
                case 169 -> 84;
                case 170 -> 219;
                case 171 -> 85;
                case 172 -> 90;
                case 173 -> 92;
                case 174 -> 190;
                case 175 -> 170;
                case 176 -> 66;
                case 177 -> 189;
                case 178 -> 153;
                case 179 -> 116;
                case 180 -> 44;
                case 181 -> 7;
                case 182 -> 76;
                case 183 -> 73;
                case 184 -> 68;
                case 185 -> 194;
                case 186 -> 121;
                case 187 -> 59;
                case 188 -> 130;
                case 189 -> 132;
                case 190 -> 115;
                case 191 -> 88;
                case 192 -> 65;
                case 193 -> 231;
                case 194 -> 45;
                case 195 -> 151;
                case 196 -> 18;
                case 197 -> 224;
                case 198 -> 89;
                case 199 -> 16;
                case 200 -> 43;
                case 201 -> 61;
                case 202 -> 183;
                case 203 -> 175;
                case 204 -> 50;
                case 205 -> 220;
                case 206 -> 141;
                case 207 -> 32;
                case 208 -> 198;
                case 209 -> 104;
                case 210 -> 41;
                case 211 -> 102;
                case 212 -> 154;
                case 213 -> 142;
                case 214 -> 26;
                case 215 -> 46;
                case 216 -> 117;
                case 217 -> 127;
                case 218 -> 161;
                case 219 -> 245;
                case 220 -> 251;
                case 221 -> 15;
                case 222 -> 125;
                case 223 -> 35;
                case 224 -> 51;
                case 225 -> 31;
                case 226 -> 36;
                case 227 -> 72;
                case 228 -> 37;
                case 229 -> 14;
                case 230 -> 25;
                case 231 -> 177;
                case 232 -> 209;
                case 233 -> 178;
                case 234 -> 64;
                case 235 -> 53;
                case 236 -> 33;
                case 237 -> 232;
                case 238 -> 120;
                case 239 -> 47;
                case 240 -> 27;
                case 241 -> 86;
                case 242 -> 2;
                case 243 -> 186;
                case 244 -> 218;
                case 245 -> 227;
                case 246 -> 159;
                case 247 -> 20;
                case 248 -> 49;
                case 249 -> 62;
                case 250 -> 208;
                case 251 -> 131;
                case 252 -> 107;
                case 253 -> 4;
                case 254 -> 163;
                default -> 106;
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
            VQ.b[n5] = new String(cArray).intern();
        }
        return b[n5];
    }
}

