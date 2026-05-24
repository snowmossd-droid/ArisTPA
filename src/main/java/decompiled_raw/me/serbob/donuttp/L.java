/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.Bukkit
 *  org.bukkit.Material
 *  org.bukkit.OfflinePlayer
 *  org.bukkit.configuration.file.FileConfiguration
 *  org.bukkit.entity.Player
 *  org.bukkit.inventory.Inventory
 *  org.bukkit.inventory.ItemStack
 *  org.bukkit.inventory.meta.ItemMeta
 *  org.bukkit.inventory.meta.SkullMeta
 */
package me.serbob.donuttp;

import java.util.ArrayList;
import me.serbob.donuttp.M;
import me.serbob.donuttp.S;
import me.serbob.donuttp.Z;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.OfflinePlayer;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

public class L {
    public static final String J;
    private static final int O;
    public static final String y;
    public static final String k;
    public static final String q;
    private static final String[] a;
    private static final String[] b;
    private static final long[] c;
    private static final Integer[] d;

    public static Inventory G(Player player, long l2, Player player2, String string) {
        long l3 = l2;
        long l4 = l3 ^ 0x3470C4CABE73L;
        long l5 = l3 ^ 0x584B8FF3FDEL;
        long l6 = l3 ^ 0xC7F488D5592L;
        FileConfiguration fileConfiguration = Z.D().getConfig();
        Inventory inventory = Bukkit.createInventory(null, (int)O, (String)J);
        inventory.setItem(L.a(915, 0x359D01C923A05EADL ^ l2), L.J(fileConfiguration, L.a(1728551160 - (char)-3636, -1728420090 + -((char)-5418), (int)l2), L.a(1728551160 - (char)-3652, 1728551160 - (char)-16519, (int)l2), l6, player2, string));
        inventory.setItem(L.a(29268, 0x38E692CCD5AF2F6CL ^ l2), L.V(l4, fileConfiguration, player2));
        inventory.setItem(L.a(25920, 0x4574D6E20CFC387BL ^ l2), L.J(fileConfiguration, L.a(1728551160 - (char)-3646, -1728551160 - -((char)-23332), (int)l2) + string.toLowerCase(), L.a(1728551160 - (char)-3647, -1728551160 - -((char)-21342), (int)l2), l6, player2, string));
        inventory.setItem(L.a(12271, 0x45A7845F49C972D2L ^ l2), L.Z(fileConfiguration, L.a(1728551160 - (char)-3633, -1728420090 + -((char)-4821), (int)l2), player2.getWorld().getName(), l5));
        inventory.setItem(L.a(6501, 0xBC7876E9D314455L ^ l2), L.Z(fileConfiguration, L.a(1728551160 - (char)-3624, -1728551160 - -((char)-11484), (int)l2), String.valueOf(player2.getPing()), l5));
        return inventory;
    }

    public static Inventory t(Player player, short s2, Player player2, char c2, int n2, String string) {
        long l2;
        long l3 = l2 = (long)s2 << 48 | (long)c2 << 48 >>> 16 | (long)n2 << 32 >>> 32;
        long l4 = l3 ^ 0x2EA3CC0E1C60L;
        long l5 = l3 ^ 0x1F57B03B9DCDL;
        long l6 = l3 ^ 0x16AC4049F781L;
        FileConfiguration fileConfiguration = Z.D().getConfig();
        Inventory inventory = Bukkit.createInventory(null, (int)O, (String)J);
        inventory.setItem(L.a(4049, 0x613B8C3CF1DF70FDL ^ l2), L.J(fileConfiguration, L.a(1874956350 + 29934, 1874956350 + 31004, (int)l2), L.a(1874956350 + 29924, -1874956350 + -((char)-22429), (int)l2), l6, player2, string));
        inventory.setItem(L.a(1477, 0x72D9D6E908687AECL ^ l2), L.V(l4, fileConfiguration, player2));
        inventory.setItem(L.a(199, 0x36C32A77F4F87FE8L ^ l2), L.J(fileConfiguration, L.a(1874956350 + 29925, -1874956350 + -31111, (int)l2) + string.toLowerCase(), L.a(1874956350 + 29952, 1874956350 + (char)-6059, (int)l2), l6, player2, string));
        inventory.setItem(L.a(29707, 0x6CE425A8ED120B21L ^ l2), L.Z(fileConfiguration, L.a(1874956350 + 29945, 1874956350 + (char)-7319, (int)l2), player2.getWorld().getName(), l5));
        inventory.setItem(L.a(2194, 0x5F6074AA711EF7B0L ^ l2), L.Z(fileConfiguration, L.a(1874956350 + 29922, 1874956350 + (char)-24595, (int)l2), String.valueOf(player2.getPing()), l5));
        return inventory;
    }

    private static ItemStack J(FileConfiguration fileConfiguration, String string, String string2, long l2, Player player, String string3) {
        String string42;
        long l3 = l2 ^ 0x2293F1F02834L;
        Material material = Material.valueOf((String)fileConfiguration.getString(string + L.a(797692020 + 8758, 797692020 + 1377, (int)l2)));
        String string5 = M.G(fileConfiguration.getString(string + L.a(797692020 + 8776, 797692020 - 7218, (int)l2)).replace(L.a(797692020 + 8755, 797692020 - 1163, (int)l2), player.getName()));
        ArrayList<String> arrayList = new ArrayList<String>();
        for (String string42 : fileConfiguration.getStringList(string + L.a(797692020 + 8756, -797692020 - -3974, (int)l2))) {
            arrayList.add(M.G(string42.replace(L.a(797692020 + 8764, -797692020 - -4386, (int)l2), player.getName())));
            if (l2 > 0L) continue;
        }
        ItemStack itemStack = new ItemStack(material);
        string42 = itemStack.getItemMeta();
        string42.setDisplayName(string5);
        string42.setLore(arrayList);
        itemStack.setItemMeta((ItemMeta)string42);
        itemStack = S.t(itemStack, l3, L.a(797692020 + 8754, -797692020 - -278, (int)l2), string2);
        itemStack = S.t(itemStack, l3, L.a(797692020 + 8718, 797692020 - 16247, (int)l2), player.getName());
        itemStack = S.t(itemStack, l3, L.a(797692020 + 8759, 797692020 - 16572, (int)l2), string3);
        return itemStack;
    }

    private static ItemStack V(long l2, FileConfiguration fileConfiguration, Player player) {
        ItemStack itemStack;
        block2: {
            itemStack = new ItemStack(Material.PLAYER_HEAD);
            SkullMeta skullMeta = (SkullMeta)itemStack.getItemMeta();
            skullMeta.setOwningPlayer((OfflinePlayer)player);
            skullMeta.setDisplayName(M.G(fileConfiguration.getString(L.a(-1546888140 + -17119, 1546888140 - 3659, (int)l2))));
            ArrayList<String> arrayList = new ArrayList<String>();
            for (String string : fileConfiguration.getStringList(L.a(-1546888140 + -17139, -1546888140 - -706, (int)l2))) {
                arrayList.add(M.G(string.replace(L.a(-1546888140 + -17112, 1546888140 - 8549, (int)l2), player.getName())));
                if (l2 >= 0L) {
                    if (l2 >= 0L) continue;
                }
                break block2;
            }
            skullMeta.setLore(arrayList);
            itemStack.setItemMeta((ItemMeta)skullMeta);
        }
        return itemStack;
    }

    /*
     * Unable to fully structure code
     */
    private static ItemStack Z(FileConfiguration var0, String var1_1, String var2_2, long var3_3) {
        var5_4 = Material.valueOf((String)var0.getString(var1_1 + L.a(-537255930 + -((char)-30959), 537255930 + (char)-27114, (int)var3_3)));
        var6_5 = M.G(var0.getString(var1_1 + L.a(-537255930 + -((char)-30969), 537255930 + (char)-28335, (int)var3_3)));
        var7_6 = new ArrayList<String>();
        for (String var9_8 : var0.getStringList(var1_1 + L.a(-537255930 + -((char)-30919), 537255930 + (char)-26102, (int)var3_3))) {
            block9: {
                block8: {
                    v0 = var1_1.endsWith(L.a(-537255930 + -((char)-30965), -537255930 + -11741, (int)var3_3));
                    if (var3_3 >= 0L) {
                        if (!v0) break block8;
                        var7_6.add(M.G(var9_8.replace(L.a(-537255930 + -((char)-30963), -537255930 + -16078, (int)var3_3), var2_2)));
                        break block9;
                    }
                    ** GOTO lbl18
                }
                v0 = var1_1.endsWith(L.a(-537255930 + -((char)-30921), -537255930 + -((char)-29282), (int)var3_3));
lbl18:
                // 2 sources

                if (var3_3 > 0L) {
                    if (v0) {
                        v0 = var7_6.add(M.G(var9_8.replace(L.a(-537255930 + -((char)-30938), 537255930 + 25485, (int)var3_3), var2_2)));
                    }
                }
            }
            if (var3_3 >= 0L) continue;
        }
        var8_7 = new ItemStack(var5_4);
        var9_8 = var8_7.getItemMeta();
        var9_8.setDisplayName(var6_5);
        var9_8.setLore(var7_6);
        var8_7.setItemMeta((ItemMeta)var9_8);
        return var8_7;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block29: {
            block28: {
                block27: {
                    block26: {
                        var13 = 102837492569604L;
                        var11_1 = new String[35];
                        var9_2 = 0;
                        var8_3 = "\u00d9\u00f3\u0006-\u0015\u00c2D\u0001\u009e\u0000n\u00af)N\u00f4U3\u00dc\u00cb\u00e6\u008d\u0083\u0098\u00b8\u001c@\u0010\u0012\u00fa\u001bI^\u0090\u00de|\u00f4\u00da\u0012\u00c5?,\u00fa:\u0019\u0083J)_\u0018R\u0016$\u00ed\u00d13\u00ad_\u0019:\u0092]\u00e8\u00bf\u0096\u00a0\u00af\u0005\u00dd\u00a4\b3_\u00a5\u0017<\u00ec\u0097\u00d0\t\u00ad\u001e\u00ab?\u00b2\u00f8\u0004s?\u0007\u00e0#\u00c6c\u0002\u0092]\u0012e\u0010\u00f5\u0014\u0083;e\t\u0083t\u00ed\u001a\u00fa\u0093l?\u001fg\u0007,\\\u009bb\u00ae\u00e0\u00d2\t\u00d0\u00da+\f]/?AZ\b\u00a6\u00f7\u008d\u00e8\u0096\u00b9\u0081\u00ef\u0005!\u00d9\u001bK\u0094\u0007\u0015k\u00bc\u0084J<N\u0006\u00d7\u00b3 \u00bb\u00d22\u0010\u00d9\u00a9b#q\u00dd;\u00d5H\u00ef\u0094g\u00d5\u00f6\u0085(\f@j\u00cb\u00b1\u00f18.g\u0005c`\u00a2\u0005\u00ed\u00f6\u008c\u00f3\u00a9\u0010f\u00da\u0095M\u008f\u0010\u00e4l\u00b3\u00d8\u00fa\u0085\"$Y;\t\u00d2\u009cDzM\u00e1\u00b7\u009c\u009c\b\u009c\u00ccPe\u0082\u00a2@\u0019\b\u00ef\u00d6\u00c4\u00da\u00f3Y\u00df\u00f8\u0012=\u00c6\u00fe\u00ce\u00e2`Ib\u0006\u0019R\u00b7\u00ee!_\u0095\u00c5{\u0007N\u00a6\t\u00dc\u00df\u00e5S\u0019\u00d3\u00a4#\u0082Y\u00e9>S\u00e8?\u0093pK\u00a2\u00b8\u00e5\r\u0006\u00b5K\u00e1\u0016#\u00b7\u00af\u0012!\u00d1},\u0092<G\u00e9\u00c7hj\u0099\u00e9\u00e4\u00bf-\u00d9l\tm\u0094\u00b3n\u00b1\u00d2d63\t\u001c\u00c0\u00b2OnGYL\u0096\t\u00dd\u000b\u00e2w|J5\u0098\u00ac\u0006\u00b7ocd\u0003\u0017\u0010\u00a0zMY\u0094\u0092\u0087<\u00df\u00d2f\u00c0\u008b\u0002N\u00b6\f<\u00dbD\u0087\u0000\u00fe\u0010\u00a1\u00cae\u0092\u0001\u0005M\u00be\u0098\u00fa+\u0006\u00c9w\u00d9\u00ad\u00cf\u00b9";
                        var10_4 = "\u00d9\u00f3\u0006-\u0015\u00c2D\u0001\u009e\u0000n\u00af)N\u00f4U3\u00dc\u00cb\u00e6\u008d\u0083\u0098\u00b8\u001c@\u0010\u0012\u00fa\u001bI^\u0090\u00de|\u00f4\u00da\u0012\u00c5?,\u00fa:\u0019\u0083J)_\u0018R\u0016$\u00ed\u00d13\u00ad_\u0019:\u0092]\u00e8\u00bf\u0096\u00a0\u00af\u0005\u00dd\u00a4\b3_\u00a5\u0017<\u00ec\u0097\u00d0\t\u00ad\u001e\u00ab?\u00b2\u00f8\u0004s?\u0007\u00e0#\u00c6c\u0002\u0092]\u0012e\u0010\u00f5\u0014\u0083;e\t\u0083t\u00ed\u001a\u00fa\u0093l?\u001fg\u0007,\\\u009bb\u00ae\u00e0\u00d2\t\u00d0\u00da+\f]/?AZ\b\u00a6\u00f7\u008d\u00e8\u0096\u00b9\u0081\u00ef\u0005!\u00d9\u001bK\u0094\u0007\u0015k\u00bc\u0084J<N\u0006\u00d7\u00b3 \u00bb\u00d22\u0010\u00d9\u00a9b#q\u00dd;\u00d5H\u00ef\u0094g\u00d5\u00f6\u0085(\f@j\u00cb\u00b1\u00f18.g\u0005c`\u00a2\u0005\u00ed\u00f6\u008c\u00f3\u00a9\u0010f\u00da\u0095M\u008f\u0010\u00e4l\u00b3\u00d8\u00fa\u0085\"$Y;\t\u00d2\u009cDzM\u00e1\u00b7\u009c\u009c\b\u009c\u00ccPe\u0082\u00a2@\u0019\b\u00ef\u00d6\u00c4\u00da\u00f3Y\u00df\u00f8\u0012=\u00c6\u00fe\u00ce\u00e2`Ib\u0006\u0019R\u00b7\u00ee!_\u0095\u00c5{\u0007N\u00a6\t\u00dc\u00df\u00e5S\u0019\u00d3\u00a4#\u0082Y\u00e9>S\u00e8?\u0093pK\u00a2\u00b8\u00e5\r\u0006\u00b5K\u00e1\u0016#\u00b7\u00af\u0012!\u00d1},\u0092<G\u00e9\u00c7hj\u0099\u00e9\u00e4\u00bf-\u00d9l\tm\u0094\u00b3n\u00b1\u00d2d63\t\u001c\u00c0\u00b2OnGYL\u0096\t\u00dd\u000b\u00e2w|J5\u0098\u00ac\u0006\u00b7ocd\u0003\u0017\u0010\u00a0zMY\u0094\u0092\u0087<\u00df\u00d2f\u00c0\u008b\u0002N\u00b6\f<\u00dbD\u0087\u0000\u00fe\u0010\u00a1\u00cae\u0092\u0001\u0005M\u00be\u0098\u00fa+\u0006\u00c9w\u00d9\u00ad\u00cf\u00b9".length();
                        var7_5 = 4;
                        var6_6 = -1;
lbl8:
                        // 2 sources

                        while (true) {
                            v0 = ++var6_6;
                            v1 = var8_3.substring(v0, v0 + var7_5);
                            v2 = -1;
                            break block26;
                            break;
                        }
lbl13:
                        // 1 sources

                        while (true) {
                            var11_1[var9_2++] = v3.intern();
                            if ((var6_6 += var7_5) < var10_4) {
                                var7_5 = var8_3.charAt(var6_6);
                                ** continue;
                            }
                            var8_3 = "l\u00c2\u0093\u00b1\u00b7\u0098\u00e8\u00b3w\u0005\u000f\u00dc\u00de\u00eb,";
                            var10_4 = "l\u00c2\u0093\u00b1\u00b7\u0098\u00e8\u00b3w\u0005\u000f\u00dc\u00de\u00eb,".length();
                            var7_5 = 9;
                            var6_6 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v4 = ++var6_6;
                                v1 = var8_3.substring(v4, v4 + var7_5);
                                v2 = 0;
                                break block26;
                                break;
                            }
                            break;
                        }
lbl27:
                        // 1 sources

                        while (true) {
                            var11_1[var9_2++] = v3.intern();
                            if ((var6_6 += var7_5) < var10_4) {
                                var7_5 = var8_3.charAt(var6_6);
                                ** continue;
                            }
                            break block27;
                            break;
                        }
                    }
                    v5 = v1.toCharArray();
                    var12_7 = 0;
                    v6 = v5.length;
                    v7 = v5;
                    v8 = v6;
                    if (v6 > 1) ** GOTO lbl77
                    do {
                        v9 = v7;
                        v10 = v7;
                        v11 = var12_7;
                        while (true) {
                            v12 = v9[v11];
                            switch (var12_7 % 7) {
                                case 0: {
                                    v13 = 29;
                                    break;
                                }
                                case 1: {
                                    v13 = 95;
                                    break;
                                }
                                case 2: {
                                    v13 = 24;
                                    break;
                                }
                                case 3: {
                                    v13 = 8;
                                    break;
                                }
                                case 4: {
                                    v13 = 19;
                                    break;
                                }
                                case 5: {
                                    v13 = 39;
                                    break;
                                }
                                default: {
                                    v13 = 86;
                                }
                            }
                            v9[v11] = (char)(v12 ^ v13);
                            ++var12_7;
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
                    } while (v8 > var12_7);
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
                L.a = var11_1;
                L.b = new String[35];
                L.k = L.a(-1204380150, -1204360640, (int)var13);
                L.y = L.a(-1204380159, -1204366518, (int)var13);
                L.q = L.a(-1204380140, -1204381309, (int)var13);
                var4_8 = new long[10];
                var1_9 = 0;
                var2_10 = "\u0003\u0081\u008a\u0096:\u00e6\u0090\u0017\u0001\u008bH\u009e\n\u009f\u0016H\u0011z\u00ec\u00bd\u00d3\u00cc\u0001B\u00fc\u00e7L*\u00df\u009c\u00e1\u00db\u0002\u00a3\u008c&\u0096\u00f9K\u00f7s<\u00e6U#\f\u00e4\u00c2\u00ff\u00d5\u00ac\u0000&+\u00eb\u00cd\u00fa\u001a\u008b\u0014\u00fc\u0090g\u008e";
                var3_11 = "\u0003\u0081\u008a\u0096:\u00e6\u0090\u0017\u0001\u008bH\u009e\n\u009f\u0016H\u0011z\u00ec\u00bd\u00d3\u00cc\u0001B\u00fc\u00e7L*\u00df\u009c\u00e1\u00db\u0002\u00a3\u008c&\u0096\u00f9K\u00f7s<\u00e6U#\f\u00e4\u00c2\u00ff\u00d5\u00ac\u0000&+\u00eb\u00cd\u00fa\u001a\u008b\u0014\u00fc\u0090g\u008e".length();
                var0_12 = 0;
                while (true) {
                    var5_13 = var2_10.substring(var0_12, var0_12 += 8).getBytes("ISO-8859-1");
                    v16 = var4_8;
                    v17 = var1_9++;
                    v18 = ((long)var5_13[0] & 255L) << 56 | ((long)var5_13[1] & 255L) << 48 | ((long)var5_13[2] & 255L) << 40 | ((long)var5_13[3] & 255L) << 32 | ((long)var5_13[4] & 255L) << 24 | ((long)var5_13[5] & 255L) << 16 | ((long)var5_13[6] & 255L) << 8 | (long)var5_13[7] & 255L;
                    v19 = -1;
                    break block28;
                    break;
                }
lbl105:
                // 1 sources

                while (true) {
                    v16[v17] = v20;
                    if (var0_12 < var3_11) ** continue;
                    var2_10 = "\u00a4\u0089\u00c8y\u00a6\u00eal\u0084\u0091,;\u00ceB\u0001}r";
                    var3_11 = "\u00a4\u0089\u00c8y\u00a6\u00eal\u0084\u0091,;\u00ceB\u0001}r".length();
                    var0_12 = 0;
                    while (true) {
                        var5_13 = var2_10.substring(var0_12, var0_12 += 8).getBytes("ISO-8859-1");
                        v16 = var4_8;
                        v17 = var1_9++;
                        v18 = ((long)var5_13[0] & 255L) << 56 | ((long)var5_13[1] & 255L) << 48 | ((long)var5_13[2] & 255L) << 40 | ((long)var5_13[3] & 255L) << 32 | ((long)var5_13[4] & 255L) << 24 | ((long)var5_13[5] & 255L) << 16 | ((long)var5_13[6] & 255L) << 8 | (long)var5_13[7] & 255L;
                        v19 = 0;
                        break block28;
                        break;
                    }
                    break;
                }
lbl118:
                // 1 sources

                while (true) {
                    v16[v17] = v20;
                    if (var0_12 < var3_11) ** continue;
                    break block29;
                    break;
                }
            }
            v20 = v18 ^ var13;
            switch (v19) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl129:
                // 1 sources

                ** continue;
            }
        }
        L.c = var4_8;
        L.d = new Integer[10];
        var15_14 = Z.D().getConfig();
        L.J = M.G(var15_14.getString(L.a(-1204402230 - -22073, 1204402230 - 24883, (int)var13)));
        L.O = var15_14.getInt(L.a(-1204402230 - -22088, -1204402230 - -32586, (int)var13));
    }

    private static String a(int n2, int n3, int n4) {
        int n5 = (n2 ^ n4 ^ 0x481C) & 0xFFFF;
        if (b[n5] == null) {
            int n6;
            char[] cArray = a[n5].toCharArray();
            int n7 = switch (cArray[0] & 0xFF) {
                case 0 -> 9;
                case 1 -> 180;
                case 2 -> 240;
                case 3 -> 2;
                case 4 -> 69;
                case 5 -> 134;
                case 6 -> 243;
                case 7 -> 15;
                case 8 -> 11;
                case 9 -> 57;
                case 10 -> 161;
                case 11 -> 189;
                case 12 -> 149;
                case 13 -> 83;
                case 14 -> 103;
                case 15 -> 173;
                case 16 -> 246;
                case 17 -> 129;
                case 18 -> 187;
                case 19 -> 166;
                case 20 -> 244;
                case 21 -> 192;
                case 22 -> 205;
                case 23 -> 132;
                case 24 -> 131;
                case 25 -> 38;
                case 26 -> 70;
                case 27 -> 165;
                case 28 -> 171;
                case 29 -> 133;
                case 30 -> 84;
                case 31 -> 0;
                case 32 -> 82;
                case 33 -> 223;
                case 34 -> 112;
                case 35 -> 247;
                case 36 -> 203;
                case 37 -> 188;
                case 38 -> 105;
                case 39 -> 81;
                case 40 -> 124;
                case 41 -> 40;
                case 42 -> 29;
                case 43 -> 217;
                case 44 -> 42;
                case 45 -> 95;
                case 46 -> 1;
                case 47 -> 185;
                case 48 -> 92;
                case 49 -> 194;
                case 50 -> 33;
                case 51 -> 115;
                case 52 -> 228;
                case 53 -> 66;
                case 54 -> 37;
                case 55 -> 126;
                case 56 -> 123;
                case 57 -> 238;
                case 58 -> 90;
                case 59 -> 130;
                case 60 -> 155;
                case 61 -> 236;
                case 62 -> 142;
                case 63 -> 204;
                case 64 -> 10;
                case 65 -> 145;
                case 66 -> 72;
                case 67 -> 19;
                case 68 -> 87;
                case 69 -> 168;
                case 70 -> 102;
                case 71 -> 177;
                case 72 -> 12;
                case 73 -> 146;
                case 74 -> 39;
                case 75 -> 119;
                case 76 -> 68;
                case 77 -> 62;
                case 78 -> 22;
                case 79 -> 191;
                case 80 -> 127;
                case 81 -> 47;
                case 82 -> 13;
                case 83 -> 163;
                case 84 -> 232;
                case 85 -> 104;
                case 86 -> 93;
                case 87 -> 184;
                case 88 -> 16;
                case 89 -> 214;
                case 90 -> 99;
                case 91 -> 255;
                case 92 -> 49;
                case 93 -> 78;
                case 94 -> 53;
                case 95 -> 73;
                case 96 -> 158;
                case 97 -> 199;
                case 98 -> 80;
                case 99 -> 18;
                case 100 -> 220;
                case 101 -> 44;
                case 102 -> 76;
                case 103 -> 162;
                case 104 -> 64;
                case 105 -> 65;
                case 106 -> 248;
                case 107 -> 88;
                case 108 -> 3;
                case 109 -> 79;
                case 110 -> 97;
                case 111 -> 75;
                case 112 -> 74;
                case 113 -> 61;
                case 114 -> 148;
                case 115 -> 117;
                case 116 -> 213;
                case 117 -> 116;
                case 118 -> 141;
                case 119 -> 150;
                case 120 -> 170;
                case 121 -> 195;
                case 122 -> 21;
                case 123 -> 229;
                case 124 -> 196;
                case 125 -> 152;
                case 126 -> 235;
                case 127 -> 45;
                case 128 -> 242;
                case 129 -> 23;
                case 130 -> 59;
                case 131 -> 251;
                case 132 -> 241;
                case 133 -> 121;
                case 134 -> 24;
                case 135 -> 128;
                case 136 -> 28;
                case 137 -> 216;
                case 138 -> 179;
                case 139 -> 91;
                case 140 -> 98;
                case 141 -> 4;
                case 142 -> 164;
                case 143 -> 231;
                case 144 -> 157;
                case 145 -> 20;
                case 146 -> 147;
                case 147 -> 221;
                case 148 -> 56;
                case 149 -> 224;
                case 150 -> 111;
                case 151 -> 176;
                case 152 -> 172;
                case 153 -> 153;
                case 154 -> 182;
                case 155 -> 7;
                case 156 -> 136;
                case 157 -> 174;
                case 158 -> 175;
                case 159 -> 17;
                case 160 -> 14;
                case 161 -> 41;
                case 162 -> 125;
                case 163 -> 227;
                case 164 -> 63;
                case 165 -> 156;
                case 166 -> 197;
                case 167 -> 138;
                case 168 -> 50;
                case 169 -> 209;
                case 170 -> 226;
                case 171 -> 120;
                case 172 -> 30;
                case 173 -> 94;
                case 174 -> 113;
                case 175 -> 154;
                case 176 -> 89;
                case 177 -> 159;
                case 178 -> 234;
                case 179 -> 222;
                case 180 -> 118;
                case 181 -> 101;
                case 182 -> 26;
                case 183 -> 252;
                case 184 -> 254;
                case 185 -> 143;
                case 186 -> 230;
                case 187 -> 52;
                case 188 -> 8;
                case 189 -> 67;
                case 190 -> 207;
                case 191 -> 211;
                case 192 -> 96;
                case 193 -> 27;
                case 194 -> 167;
                case 195 -> 100;
                case 196 -> 193;
                case 197 -> 36;
                case 198 -> 206;
                case 199 -> 212;
                case 200 -> 215;
                case 201 -> 58;
                case 202 -> 169;
                case 203 -> 122;
                case 204 -> 201;
                case 205 -> 135;
                case 206 -> 54;
                case 207 -> 137;
                case 208 -> 85;
                case 209 -> 51;
                case 210 -> 55;
                case 211 -> 6;
                case 212 -> 245;
                case 213 -> 43;
                case 214 -> 34;
                case 215 -> 108;
                case 216 -> 208;
                case 217 -> 35;
                case 218 -> 31;
                case 219 -> 86;
                case 220 -> 198;
                case 221 -> 140;
                case 222 -> 46;
                case 223 -> 77;
                case 224 -> 253;
                case 225 -> 5;
                case 226 -> 25;
                case 227 -> 249;
                case 228 -> 160;
                case 229 -> 32;
                case 230 -> 250;
                case 231 -> 144;
                case 232 -> 107;
                case 233 -> 202;
                case 234 -> 114;
                case 235 -> 183;
                case 236 -> 200;
                case 237 -> 181;
                case 238 -> 239;
                case 239 -> 106;
                case 240 -> 218;
                case 241 -> 237;
                case 242 -> 60;
                case 243 -> 219;
                case 244 -> 225;
                case 245 -> 109;
                case 246 -> 151;
                case 247 -> 48;
                case 248 -> 178;
                case 249 -> 71;
                case 250 -> 186;
                case 251 -> 110;
                case 252 -> 210;
                case 253 -> 233;
                case 254 -> 190;
                default -> 139;
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
            L.b[n5] = new String(cArray).intern();
        }
        return b[n5];
    }

    private static int a(int n2, long l2) {
        int n3 = n2 ^ (int)(l2 & 0x7FFFL) ^ 0x3214;
        if (d[n3] == null) {
            L.d[n3] = (int)(c[n3] ^ l2);
        }
        return d[n3];
    }
}

