/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.md_5.bungee.api.ChatMessageType
 *  net.md_5.bungee.api.chat.TextComponent
 *  org.bukkit.Bukkit
 *  org.bukkit.command.CommandExecutor
 *  org.bukkit.entity.Player
 *  org.bukkit.event.Listener
 *  org.bukkit.plugin.Plugin
 *  org.bukkit.plugin.java.JavaPlugin
 */
package me.serbob.donuttp;

import java.util.UUID;
import me.serbob.donuttp.M;
import me.serbob.donuttp.V6;
import me.serbob.donuttp.VQ;
import me.serbob.donuttp.Vd;
import me.serbob.donuttp.Y;
import me.serbob.donuttp.g;
import me.serbob.donuttp.lib.folialib.FoliaLib;
import me.serbob.donuttp.t;
import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandExecutor;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public final class Z
extends JavaPlugin {
    private static Z q;
    public static FoliaLib u;
    private static final String[] a;
    private static final String[] b;
    private static final long[] c;
    private static final Long[] d;

    public void onEnable() {
        long l2 = 33965639915742L;
        q = this;
        u = new FoliaLib((Plugin)this);
        if (Bukkit.getPluginManager().getPlugin(Z.a(1038467610 + (char)-575, 1038467610 + (char)-3024, (int)l2)) == null) {
            this.getLogger().severe(Z.a(1038467610 + (char)-571, -1038598680 - -((char)-15053), (int)l2));
            Bukkit.getPluginManager().disablePlugin((Plugin)this);
            return;
        }
        this.saveDefaultConfig();
        this.getServer().getPluginManager().registerEvents((Listener)new V6(), (Plugin)this);
        this.getCommand(Z.a(1038467610 + (char)-573, -1038598680 - -((char)-738), (int)l2)).setExecutor((CommandExecutor)new t());
        this.getCommand(Z.a(1038467610 + (char)-574, 1038467610 + (char)-10942, (int)l2)).setExecutor((CommandExecutor)new Y());
        this.getCommand(Z.a(1038467610 + (char)-572, -1038467610 + -((char)-718), (int)l2)).setExecutor((CommandExecutor)new VQ());
        this.getCommand(Z.a(1038467610 + (char)-576, 1038598680 - (char)-10811, (int)l2)).setExecutor((CommandExecutor)new g());
        this.getCommand(Z.a(1038467610 + (char)-577, 1038467610 + (char)-11842, (int)l2)).setExecutor((CommandExecutor)new Vd());
        u.getScheduler().runTimerAsync(() -> Vd.b.forEach(uUID -> {
            long l2 = 136142231947894L;
            Player player = Bukkit.getPlayer((UUID)uUID);
            if (player == null) {
                Vd.b.remove(uUID);
                return;
            }
            this.s(player, Z.a(358607520 - 15664, -358607520 - -9348, (int)l2));
        }), Z.a(28545, 0x2D1C64C037451E7FL ^ l2), Z.a(1421, 0x5C22036425A7472L ^ l2));
    }

    public void onDisable() {
    }

    public static Z D() {
        return q;
    }

    public void m(Player player, String string) {
        player.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText((String)M.G(string)));
        player.sendMessage(M.G(string));
    }

    public void s(Player player, String string) {
        player.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText((String)M.G(string)));
    }

    /*
     * Unable to fully structure code
     */
    static {
        block24: {
            block23: {
                block22: {
                    block21: {
                        var13 = new String[8];
                        var11_1 = 0;
                        var10_2 = "\u0003qa\u00f0\u00fdt\u00151\u00e4\u0007k\u000f\u0011\u00ef\u00bd\u00a6\u0005\u0099\u00f5\u00b9\u0098\u00e6b\u00f2C[\u00fcz\r\u00fe\u0080\u00e72\u00c3\u0007^\u0082\u00afR\f\u00ffw\u0007`>\r\u0004aI=\u0003\u00c1\u00fd9\t\u00b0H\u0017\u00c1&\u0087W\u00ec\u00c1";
                        var12_3 = "\u0003qa\u00f0\u00fdt\u00151\u00e4\u0007k\u000f\u0011\u00ef\u00bd\u00a6\u0005\u0099\u00f5\u00b9\u0098\u00e6b\u00f2C[\u00fcz\r\u00fe\u0080\u00e72\u00c3\u0007^\u0082\u00afR\f\u00ffw\u0007`>\r\u0004aI=\u0003\u00c1\u00fd9\t\u00b0H\u0017\u00c1&\u0087W\u00ec\u00c1".length();
                        var9_4 = 6;
                        var8_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = ++var8_5;
                            v1 = var10_2.substring(v0, v0 + var9_4);
                            v2 = -1;
                            break block21;
                            break;
                        }
lbl12:
                        // 1 sources

                        while (true) {
                            var13[var11_1++] = v3.intern();
                            if ((var8_5 += var9_4) < var12_3) {
                                var9_4 = var10_2.charAt(var8_5);
                                ** continue;
                            }
                            var10_2 = "\u008e\u00fc\u00e9\u00bd\u0002\u00f6f\u00bc\u00a8\u0095\u00ec\u0007k`\u0010\u000fO\u0096\u009dG\u00d1\u00de\u00cd\u00c3\u00a4\u00d1\u00078\u001f0X\u0094lo\u00b3\u00ccv\b\u009d[\u0088\u00bcF\u001a\b\u0080\u0099\u0011\u00fb\u00e4\u00cb^\u001e";
                            var12_3 = "\u008e\u00fc\u00e9\u00bd\u0002\u00f6f\u00bc\u00a8\u0095\u00ec\u0007k`\u0010\u000fO\u0096\u009dG\u00d1\u00de\u00cd\u00c3\u00a4\u00d1\u00078\u001f0X\u0094lo\u00b3\u00ccv\b\u009d[\u0088\u00bcF\u001a\b\u0080\u0099\u0011\u00fb\u00e4\u00cb^\u001e".length();
                            var9_4 = 44;
                            var8_5 = -1;
lbl21:
                            // 2 sources

                            while (true) {
                                v4 = ++var8_5;
                                v1 = var10_2.substring(v4, v4 + var9_4);
                                v2 = 0;
                                break block21;
                                break;
                            }
                            break;
                        }
lbl26:
                        // 1 sources

                        while (true) {
                            var13[var11_1++] = v3.intern();
                            if ((var8_5 += var9_4) < var12_3) {
                                var9_4 = var10_2.charAt(var8_5);
                                ** continue;
                            }
                            break block22;
                            break;
                        }
                    }
                    v5 = v1.toCharArray();
                    var14_6 = 0;
                    v6 = v5.length;
                    v7 = v5;
                    v8 = v6;
                    if (v6 > 1) ** GOTO lbl76
                    do {
                        v9 = v7;
                        v10 = v7;
                        v11 = var14_6;
                        while (true) {
                            v12 = v9[v11];
                            switch (var14_6 % 7) {
                                case 0: {
                                    v13 = 117;
                                    break;
                                }
                                case 1: {
                                    v13 = 70;
                                    break;
                                }
                                case 2: {
                                    v13 = 52;
                                    break;
                                }
                                case 3: {
                                    v13 = 29;
                                    break;
                                }
                                case 4: {
                                    v13 = 110;
                                    break;
                                }
                                case 5: {
                                    v13 = 125;
                                    break;
                                }
                                default: {
                                    v13 = 112;
                                }
                            }
                            v9[v11] = (char)(v12 ^ v13);
                            ++var14_6;
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
                    } while (v8 > var14_6);
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
                Z.a = var13;
                Z.b = new String[8];
                var0_7 = 53006908126903L;
                var6_8 = new long[2];
                var3_9 = 0;
                var4_10 = "\u0005\u00c2\u000e\u00e7\u00deQZ\u000f-\u001cJ\u0011\u00abN0\u0002";
                var5_11 = "\u0005\u00c2\u000e\u00e7\u00deQZ\u000f-\u001cJ\u0011\u00abN0\u0002".length();
                var2_12 = 0;
                while (true) {
                    break block23;
                    break;
                }
lbl97:
                // 1 sources

                while (true) {
                    var6_8[v16] = (((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L) ^ var0_7;
                    if (var2_12 < var5_11) ** continue;
                    break block24;
                    break;
                }
            }
            var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
            v16 = var3_9++;
            ** while (true)
        }
        Z.c = var6_8;
        Z.d = new Long[2];
    }

    private static String a(int n2, int n3, int n4) {
        int n5 = (n2 ^ n4 ^ 0x6707) & 0xFFFF;
        if (b[n5] == null) {
            int n6;
            char[] cArray = a[n5].toCharArray();
            int n7 = switch (cArray[0] & 0xFF) {
                case 0 -> 86;
                case 1 -> 171;
                case 2 -> 111;
                case 3 -> 161;
                case 4 -> 247;
                case 5 -> 53;
                case 6 -> 37;
                case 7 -> 204;
                case 8 -> 89;
                case 9 -> 188;
                case 10 -> 104;
                case 11 -> 208;
                case 12 -> 65;
                case 13 -> 185;
                case 14 -> 157;
                case 15 -> 134;
                case 16 -> 43;
                case 17 -> 229;
                case 18 -> 135;
                case 19 -> 228;
                case 20 -> 60;
                case 21 -> 44;
                case 22 -> 160;
                case 23 -> 199;
                case 24 -> 64;
                case 25 -> 166;
                case 26 -> 75;
                case 27 -> 148;
                case 28 -> 151;
                case 29 -> 153;
                case 30 -> 15;
                case 31 -> 213;
                case 32 -> 52;
                case 33 -> 127;
                case 34 -> 162;
                case 35 -> 103;
                case 36 -> 95;
                case 37 -> 177;
                case 38 -> 39;
                case 39 -> 20;
                case 40 -> 144;
                case 41 -> 175;
                case 42 -> 59;
                case 43 -> 126;
                case 44 -> 55;
                case 45 -> 192;
                case 46 -> 205;
                case 47 -> 28;
                case 48 -> 93;
                case 49 -> 198;
                case 50 -> 36;
                case 51 -> 143;
                case 52 -> 132;
                case 53 -> 106;
                case 54 -> 92;
                case 55 -> 131;
                case 56 -> 200;
                case 57 -> 114;
                case 58 -> 3;
                case 59 -> 42;
                case 60 -> 180;
                case 61 -> 123;
                case 62 -> 35;
                case 63 -> 130;
                case 64 -> 221;
                case 65 -> 46;
                case 66 -> 14;
                case 67 -> 155;
                case 68 -> 48;
                case 69 -> 73;
                case 70 -> 45;
                case 71 -> 193;
                case 72 -> 112;
                case 73 -> 172;
                case 74 -> 69;
                case 75 -> 23;
                case 76 -> 9;
                case 77 -> 164;
                case 78 -> 232;
                case 79 -> 203;
                case 80 -> 21;
                case 81 -> 181;
                case 82 -> 137;
                case 83 -> 119;
                case 84 -> 91;
                case 85 -> 196;
                case 86 -> 239;
                case 87 -> 223;
                case 88 -> 113;
                case 89 -> 244;
                case 90 -> 85;
                case 91 -> 145;
                case 92 -> 231;
                case 93 -> 88;
                case 94 -> 120;
                case 95 -> 110;
                case 96 -> 63;
                case 97 -> 101;
                case 98 -> 33;
                case 99 -> 74;
                case 100 -> 255;
                case 101 -> 107;
                case 102 -> 67;
                case 103 -> 19;
                case 104 -> 176;
                case 105 -> 174;
                case 106 -> 210;
                case 107 -> 165;
                case 108 -> 152;
                case 109 -> 179;
                case 110 -> 82;
                case 111 -> 118;
                case 112 -> 178;
                case 113 -> 18;
                case 114 -> 146;
                case 115 -> 234;
                case 116 -> 83;
                case 117 -> 12;
                case 118 -> 4;
                case 119 -> 149;
                case 120 -> 248;
                case 121 -> 62;
                case 122 -> 97;
                case 123 -> 68;
                case 124 -> 54;
                case 125 -> 195;
                case 126 -> 158;
                case 127 -> 215;
                case 128 -> 61;
                case 129 -> 194;
                case 130 -> 32;
                case 131 -> 222;
                case 132 -> 49;
                case 133 -> 254;
                case 134 -> 40;
                case 135 -> 249;
                case 136 -> 125;
                case 137 -> 30;
                case 138 -> 240;
                case 139 -> 197;
                case 140 -> 122;
                case 141 -> 216;
                case 142 -> 217;
                case 143 -> 186;
                case 144 -> 129;
                case 145 -> 80;
                case 146 -> 183;
                case 147 -> 57;
                case 148 -> 212;
                case 149 -> 13;
                case 150 -> 79;
                case 151 -> 150;
                case 152 -> 243;
                case 153 -> 230;
                case 154 -> 102;
                case 155 -> 5;
                case 156 -> 235;
                case 157 -> 76;
                case 158 -> 202;
                case 159 -> 219;
                case 160 -> 211;
                case 161 -> 167;
                case 162 -> 163;
                case 163 -> 218;
                case 164 -> 16;
                case 165 -> 108;
                case 166 -> 170;
                case 167 -> 94;
                case 168 -> 147;
                case 169 -> 31;
                case 170 -> 90;
                case 171 -> 124;
                case 172 -> 224;
                case 173 -> 2;
                case 174 -> 100;
                case 175 -> 51;
                case 176 -> 81;
                case 177 -> 159;
                case 178 -> 38;
                case 179 -> 11;
                case 180 -> 24;
                case 181 -> 242;
                case 182 -> 139;
                case 183 -> 184;
                case 184 -> 8;
                case 185 -> 121;
                case 186 -> 34;
                case 187 -> 236;
                case 188 -> 241;
                case 189 -> 117;
                case 190 -> 71;
                case 191 -> 220;
                case 192 -> 156;
                case 193 -> 133;
                case 194 -> 25;
                case 195 -> 7;
                case 196 -> 246;
                case 197 -> 209;
                case 198 -> 115;
                case 199 -> 190;
                case 200 -> 251;
                case 201 -> 109;
                case 202 -> 238;
                case 203 -> 66;
                case 204 -> 182;
                case 205 -> 26;
                case 206 -> 227;
                case 207 -> 98;
                case 208 -> 140;
                case 209 -> 72;
                case 210 -> 206;
                case 211 -> 252;
                case 212 -> 58;
                case 213 -> 237;
                case 214 -> 50;
                case 215 -> 253;
                case 216 -> 27;
                case 217 -> 245;
                case 218 -> 116;
                case 219 -> 173;
                case 220 -> 41;
                case 221 -> 201;
                case 222 -> 136;
                case 223 -> 84;
                case 224 -> 207;
                case 225 -> 128;
                case 226 -> 0;
                case 227 -> 96;
                case 228 -> 10;
                case 229 -> 56;
                case 230 -> 77;
                case 231 -> 78;
                case 232 -> 214;
                case 233 -> 105;
                case 234 -> 191;
                case 235 -> 47;
                case 236 -> 1;
                case 237 -> 187;
                case 238 -> 70;
                case 239 -> 29;
                case 240 -> 142;
                case 241 -> 17;
                case 242 -> 225;
                case 243 -> 226;
                case 244 -> 154;
                case 245 -> 233;
                case 246 -> 168;
                case 247 -> 99;
                case 248 -> 169;
                case 249 -> 22;
                case 250 -> 250;
                case 251 -> 6;
                case 252 -> 189;
                case 253 -> 138;
                case 254 -> 141;
                default -> 87;
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
            Z.b[n5] = new String(cArray).intern();
        }
        return b[n5];
    }

    private static long a(int n2, long l2) {
        int n3 = (n2 ^ (int)l2 ^ 0x2921) & Short.MAX_VALUE;
        if (d[n3] == null) {
            Z.d[n3] = c[n3] ^ l2;
        }
        return d[n3];
    }
}

