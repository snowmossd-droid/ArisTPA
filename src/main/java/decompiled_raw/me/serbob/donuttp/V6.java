/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.serbob.donutwarp.utils.TeleportUtils
 *  net.md_5.bungee.api.chat.BaseComponent
 *  net.md_5.bungee.api.chat.ClickEvent
 *  net.md_5.bungee.api.chat.ClickEvent$Action
 *  net.md_5.bungee.api.chat.TextComponent
 *  org.bukkit.Bukkit
 *  org.bukkit.Location
 *  org.bukkit.configuration.file.FileConfiguration
 *  org.bukkit.entity.Player
 *  org.bukkit.event.EventHandler
 *  org.bukkit.event.Listener
 *  org.bukkit.event.inventory.InventoryClickEvent
 *  org.bukkit.event.player.PlayerQuitEvent
 *  org.bukkit.inventory.ItemStack
 *  org.bukkit.plugin.Plugin
 *  org.bukkit.scheduler.BukkitRunnable
 */
package me.serbob.donuttp;

import java.lang.invoke.LambdaMetafactory;
import java.time.Instant;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.function.Function;
import me.serbob.donuttp.L;
import me.serbob.donuttp.M;
import me.serbob.donuttp.S;
import me.serbob.donuttp.Vd;
import me.serbob.donuttp.Z;
import me.serbob.donutwarp.utils.TeleportUtils;
import net.md_5.bungee.api.chat.BaseComponent;
import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitRunnable;

public class V6
implements Listener {
    private static final Map<UUID, Map<UUID, X>> v;
    private static final long J;
    private static final String[] a;
    private static final String[] b;
    private static final long[] c;
    private static final Long[] d;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @EventHandler
    public void onInventoryClick(InventoryClickEvent inventoryClickEvent) {
        block14: {
            Player player;
            block17: {
                long l2;
                long l3;
                block15: {
                    Player player2;
                    String string;
                    int n2;
                    int n3;
                    int n4;
                    block18: {
                        int n5;
                        int n6;
                        int n7;
                        block16: {
                            long l4 = l3 = 76494543252874L;
                            l2 = l4 ^ 0x1D546F6BBA99L;
                            long l5 = l4 ^ 0x634A2D68BC37L;
                            long l6 = l4 ^ 0x64E60A2FD6FEL;
                            long l7 = l4 ^ 0x99FB74769FFL;
                            long l8 = l4 ^ 0x64F088E6BC18L;
                            n4 = (int)(l8 >>> 48);
                            n3 = (int)(l8 << 16 >>> 32);
                            n2 = (int)(l8 << 48 >>> 48);
                            long l9 = l4 ^ 0x60F1B21381A8L;
                            n7 = (int)(l9 >>> 32);
                            n6 = (int)(l9 << 32 >>> 48);
                            n5 = (int)(l9 << 48 >>> 48);
                            if (!(inventoryClickEvent.getWhoClicked() instanceof Player)) {
                                return;
                            }
                            if (!inventoryClickEvent.getView().getTitle().equals(L.J)) {
                                return;
                            }
                            inventoryClickEvent.setCancelled(true);
                            player = (Player)inventoryClickEvent.getWhoClicked();
                            ItemStack itemStack = inventoryClickEvent.getCurrentItem();
                            if (itemStack == null) {
                                return;
                            }
                            if (!S.B(itemStack, l7, V6.a(-1175697900 - -3113, 1175697900 - 10805, (int)l3))) break block14;
                            string = S.f(l6, itemStack, V6.a(-1175697900 - -3110, 1175697900 - 14696, (int)l3));
                            String string2 = S.f(l6, itemStack, V6.a(-1175697900 - -3096, -1175697900 + -1429, (int)l3));
                            String string3 = S.f(l6, itemStack, V6.a(-1175697900 - -3099, 1175697900 + 5360, (int)l3));
                            player2 = Bukkit.getPlayer((String)string2);
                            if (player2 == null) break block15;
                            if (!string.equals(V6.a(-1175697900 - -3086, 1175697900 + 16796, (int)l3))) break block16;
                            this.h(player, player2, string3, l5);
                            break block17;
                        }
                        if (!string.equals(V6.a(-1175697900 - -3108, -1175697900 - -3896, (int)l3))) break block18;
                        this.C(player, n7, (short)n6, (short)n5);
                        break block17;
                    }
                    if (string.equals(V6.a(-1175697900 - -3052, -1175697900 + -15444, (int)l3))) {
                        V6.k((char)n4, player, player2.getUniqueId(), n3, true, n2);
                        break block17;
                    } else if (string.equals(V6.a(-1175697900 - -3101, 1175697900 - 5759, (int)l3))) {
                        V6.k((char)n4, player, player2.getUniqueId(), n3, false, n2);
                    }
                    break block17;
                }
                V6.M(player, l2, V6.a(-1175697900 - -3111, 1175697900 + 14682, (int)l3));
            }
            player.closeInventory();
        }
    }

    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent playerQuitEvent) {
        long l2 = 109490388416331L;
        Player player = playerQuitEvent.getPlayer();
        UUID uUID = player.getUniqueId();
        v.remove(uUID);
        for (Map<UUID, X> map : v.values()) {
            map.remove(uUID);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void h(Player var1_1, Player var2_2, String var3_3, long var4_4) {
        block18: {
            block17: {
                v0 = var4_4;
                var6_5 = v0 ^ 11823977190066L;
                var8_6 = v0 ^ 44815926844577L;
                var10_7 = v0 ^ 22729507742899L;
                V6.K();
                var12_8 = var3_3.toLowerCase();
                var13_9 = -1;
                switch (var12_8.hashCode()) {
                    case 115045: {
                        v1 = (int)var12_8.equals(V6.a(-1803261060 - -((char)-32101), -1803261060 - -((char)-32356), (int)var4_4));
                        if (var4_4 >= 0L) {
                            if (v1 == 0) break;
                            var13_9 = 0;
                            if (var4_4 >= 0L) break;
                        }
                        break block17;
                    }
                    case -1124509995: {
                        v1 = (int)var12_8.equals(V6.a(-1803261060 - -((char)-32061), 1803261060 - 27990, (int)var4_4));
                        if (var4_4 <= 0L) break block17;
                        if (v1 == 0) break;
                        var13_9 = 1;
                    }
                }
                v1 = var13_9;
            }
            if (var4_4 <= 0L) ** GOTO lbl35
            switch (v1) {
                case 0: {
                    V6.X(var1_1, V6.a(-1803261060 - -((char)-32108), 1803261060 - 30336, (int)var4_4), Map.of(V6.a(-1803261060 - -((char)-32102), -1803261060 - -((char)-28873), (int)var4_4), var2_2.getName()), var6_5);
                    Z.D().s(var1_1, Z.D().getConfig().getString(V6.a(-1803261060 - -((char)-32076), -1803261060 - -11437, (int)var4_4)).replace(V6.a(-1803261060 - -((char)-32072), 1803261060 - 32766, (int)var4_4), var2_2.getName()));
                    V6.j(var2_2, var1_1, V6.a(-1803261060 - -((char)-32104), 1803261060 - 23115, (int)var4_4), var10_7, V6.a(-1803261060 - -((char)-32105), -1803261060 - -13201, (int)var4_4) + var1_1.getName());
                    V6.X(var2_2, V6.a(-1803261060 - -((char)-32096), 1803261060 - 25976, (int)var4_4), Map.of(V6.a(-1803261060 - -((char)-32072), 1803261060 - 32766, (int)var4_4), var1_1.getName()), var6_5);
                    v2 = Vd.b;
                    if (var4_4 <= 0L) break block18;
                    v1 = (int)v2.contains(var2_2.getUniqueId());
lbl35:
                    // 2 sources

                    if (v1 == 0) break;
                    V6.X(var1_1, V6.a(-1803261060 - -((char)-32070), 1803261060 - 15576, (int)var4_4), Map.of(V6.a(-1803261060 - -((char)-32072), 1803261060 - 32766, (int)var4_4), var2_2.getName()), var6_5);
                    TeleportUtils.teleportWithCountdown((Player)var1_1, (Location)var2_2.getLocation(), (String)V6.a(-1803261060 - -((char)-32120), -1803261060 - -14983, (int)var4_4));
                    return;
                }
                case 1: {
                    V6.X(var1_1, V6.a(-1803261060 - -((char)-32074), 1803261060 - 19929, (int)var4_4), Map.of(V6.a(-1803261060 - -((char)-32072), 1803261060 - 32766, (int)var4_4), var2_2.getName()), var6_5);
                    Z.D().s(var1_1, Z.D().getConfig().getString(V6.a(-1803261060 - -((char)-32121), 1803261060 - 30614, (int)var4_4)).replace(V6.a(-1803261060 - -((char)-32072), 1803261060 - 32766, (int)var4_4), var2_2.getName()));
                    V6.j(var2_2, var1_1, V6.a(-1803261060 - -((char)-32098), 1803261060 - 26742, (int)var4_4), var10_7, V6.a(-1803261060 - -((char)-32093), 1803261060 - 13384, (int)var4_4) + var1_1.getName());
                    V6.X(var2_2, V6.a(-1803261060 - -((char)-32106), -1803261060 - -8865, (int)var4_4), Map.of(V6.a(-1803261060 - -((char)-32072), 1803261060 - 32766, (int)var4_4), var1_1.getName()), var6_5);
                    v2 = Vd.b;
                    if (var4_4 > 0L) {
                        if (!v2.contains(var2_2.getUniqueId())) break;
                        V6.X(var1_1, V6.a(-1803261060 - -((char)-32115), 1803261060 - 26888, (int)var4_4), Map.of(V6.a(-1803261060 - -((char)-32072), 1803261060 - 32766, (int)var4_4), var2_2.getName()), var6_5);
                        TeleportUtils.teleportWithCountdown((Player)var2_2, (Location)var1_1.getLocation(), (String)V6.a(-1803261060 - -((char)-32107), -1803261060 - -27926, (int)var4_4));
                        return;
                    }
                    break block18;
                }
            }
            v2 = V6.v.computeIfAbsent(var2_2.getUniqueId(), (Function<UUID, Map>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$handleConfirm$0(java.util.UUID ), (Ljava/util/UUID;)Ljava/util/Map;)());
        }
        var12_8 = v2;
        var12_8.put(var1_1.getUniqueId(), new X(var1_1.getUniqueId(), var3_3, Instant.now()));
        this.X(var2_2.getUniqueId(), var1_1.getUniqueId(), var8_6);
    }

    private void X(final UUID uUID, final UUID uUID2, long l2) {
        new BukkitRunnable(){
            private static final long a;

            public void run() {
                block7: {
                    long l2 = 79254064738320L;
                    Map<UUID, X> map = v.get(uUID);
                    if (map != null) {
                        X x2 = map.get(uUID2);
                        if (x2 == null || !x2.n(a)) break block7;
                        map.remove(uUID2);
                        if (!map.isEmpty()) break block7;
                        v.remove(uUID);
                    }
                }
            }

            /*
             * Enabled aggressive block sorting
             */
            static {
                long l2 = 47880069569281L;
                a = 0x2B8BF289DB79L ^ l2;
            }
        }.runTaskLater((Plugin)Z.D(), V6.a(18983, 0x7A283861953D3E97L ^ l2));
    }

    private void C(Player player, int n2, short s2, short s3) {
        long l2 = (long)n2 << 32 | (long)s2 << 48 >>> 32 | (long)s3 << 48 >>> 48;
        long l3 = l2 ^ 0x7DA5DD783B31L;
        V6.M(player, l3, V6.a(201323520 - 8314, -201323520 - -7463, (int)l2));
    }

    public static boolean n(long l2, UUID uUID) {
        boolean bl;
        block6: {
            block5: {
                V6.K();
                Map<UUID, X> map = v.get(uUID);
                Map<UUID, X> map2 = map;
                if (l2 > 0L) {
                    if (map2 == null) break block5;
                    map2 = map;
                }
                if (map2.isEmpty()) break block5;
                bl = true;
                break block6;
            }
            bl = false;
        }
        return bl;
    }

    public static boolean X(UUID uUID) {
        V6.K();
        return v.values().stream().flatMap(map -> map.values().stream()).anyMatch(x2 -> x2.v.equals(uUID));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void q(Player player, long l2) {
        boolean bl;
        long l3;
        block14: {
            long l4 = l2;
            long l5 = l4 ^ 0x6C876E93149CL;
            l3 = l4 ^ 0x1859D765C080L;
            V6.K();
            boolean bl2 = false;
            for (Map.Entry<UUID, Map<UUID, X>> entry : v.entrySet()) {
                block16: {
                    Player player2;
                    Player player3;
                    block18: {
                        UUID uUID;
                        block17: {
                            boolean bl3;
                            Map<UUID, X> map;
                            block15: {
                                uUID = entry.getKey();
                                Map<UUID, X> map2 = entry.getValue();
                                bl = map2.containsKey(player.getUniqueId());
                                if (l2 < 0L) break block14;
                                if (l2 < 0L) break block15;
                                if (!bl) break block16;
                                map2.remove(player.getUniqueId());
                                bl2 = true;
                                map = map2;
                                if (l2 < 0L) break block17;
                                bl3 = map.isEmpty();
                            }
                            if (bl3) {
                                map = v.remove(uUID);
                            }
                        }
                        player2 = player3 = Bukkit.getPlayer((UUID)uUID);
                        if (l2 <= 0L) break block18;
                        if (player2 == null) break block16;
                        player2 = player3;
                    }
                    if (player2.isOnline()) {
                        V6.X(player3, V6.a(0x1E1FE1E + 10749, -31587870 + -1628, (int)l2), Map.of(V6.a(0x1E1FE1E + 10748, -31587870 + -12090, (int)l2), player.getName()), l5);
                    }
                }
                if (l2 >= 0L) continue;
            }
            if (l2 <= 0L) return;
            bl = bl2;
        }
        if (bl) {
            V6.M(player, l3, V6.a(0x1E1FE1E + 10770, 0x1E1FE1E + 22392, (int)l2));
            return;
        }
        V6.M(player, l3, V6.a(0x1E1FE1E + 10753, -31587870 + -28624, (int)l2));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void k(char c2, Player player, UUID uUID, int n2, boolean bl, int n3) {
        long l2;
        long l3;
        block31: {
            boolean bl2;
            Player player2;
            X x2;
            long l4;
            block29: {
                block30: {
                    Player player3;
                    block27: {
                        block28: {
                            Object object;
                            Map<UUID, X> map;
                            block25: {
                                block26: {
                                    block24: {
                                        long l5 = l3 = (long)c2 << 48 | (long)n2 << 32 >>> 16 | (long)n3 << 48 >>> 48;
                                        l4 = l5 ^ 0xD7A5E7BD29DL;
                                        l2 = l5 ^ 0x79A4E78D0681L;
                                        V6.K();
                                        map = v.get(player.getUniqueId());
                                        if (map == null) break block24;
                                        object = map;
                                        if (c2 < '\u0000') break block25;
                                        if (!object.isEmpty()) break block26;
                                    }
                                    V6.M(player, l2, V6.a(822857460 - (char)-7994, -822857460 - -((char)-5944), (int)l3));
                                    return;
                                }
                                object = map.get(uUID);
                            }
                            X x3 = x2 = (X)object;
                            if (n2 >= 0) {
                                if (x3 == null) {
                                    V6.M(player, l2, V6.a(822857460 - (char)-7981, -822857460 - -((char)-8141), (int)l3));
                                    return;
                                }
                                x3 = map.remove(uUID);
                            }
                            Map<UUID, X> map2 = map;
                            if (n2 > 0 && map2.isEmpty()) {
                                map2 = v.remove(player.getUniqueId());
                            }
                            player3 = player2 = Bukkit.getPlayer((UUID)uUID);
                            if (n3 < 0) break block27;
                            if (player3 == null) break block28;
                            bl2 = player2.isOnline();
                            if (n3 <= 0) break block29;
                            if (bl2) break block30;
                        }
                        player3 = player;
                    }
                    V6.M(player3, l2, V6.a(822857460 - (char)-7998, -822857460 - -((char)-4967), (int)l3));
                    return;
                }
                if (n3 <= 0) break block31;
                bl2 = bl;
            }
            if (bl2) {
                boolean bl3 = x2.S.equalsIgnoreCase(V6.a(822857460 - (char)-7995, -822857460 - -((char)-4970), (int)l3));
                if (c2 >= '\u0000') {
                    if (bl3) {
                        V6.X(player2, V6.a(822857460 - (char)-7984, 822726390 + (char)-419, (int)l3), Map.of(V6.a(822857460 - (char)-7975, -822857460 - -((char)-7267), (int)l3), player.getName()), l4);
                        TeleportUtils.teleportWithCountdown((Player)player2, (Location)player.getLocation(), (String)V6.a(822857460 - (char)-8010, 822857460 - (char)-2505, (int)l3));
                        return;
                    }
                    if (n2 < 0) return;
                    bl3 = x2.S.equalsIgnoreCase(V6.a(822857460 - (char)-7988, -822857460 - -((char)-9560), (int)l3));
                }
                if (!bl3) return;
                V6.X(player2, V6.a(822857460 - (char)-7990, -822726390 + -((char)-1191), (int)l3), Map.of(V6.a(822857460 - (char)-7975, -822857460 - -((char)-7267), (int)l3), player.getName()), l4);
                TeleportUtils.teleportWithCountdown((Player)player, (Location)player2.getLocation(), (String)V6.a(822857460 - (char)-8010, 822857460 - (char)-2505, (int)l3));
                return;
            }
            V6.X(player2, V6.a(822857460 - (char)-7993, 822726390 + (char)-5712, (int)l3), Map.of(V6.a(822857460 - (char)-7975, -822857460 - -((char)-7267), (int)l3), player.getName()), l4);
        }
        V6.M(player, l2, V6.a(822857460 - (char)-7976, -822857460 - -((char)-62), (int)l3));
    }

    public static void m(Player player, boolean bl, long l2) {
        Object object;
        int n2;
        int n3;
        int n4;
        block5: {
            Map<UUID, X> map;
            block6: {
                long l3;
                block4: {
                    long l4 = l2;
                    l3 = l4 ^ 0x37F7880BDF86L;
                    long l5 = l4 ^ 0x4E536F86D907L;
                    n4 = (int)(l5 >>> 48);
                    n3 = (int)(l5 << 16 >>> 32);
                    n2 = (int)(l5 << 48 >>> 48);
                    V6.K();
                    map = v.get(player.getUniqueId());
                    if (map == null) break block4;
                    object = map;
                    if (l2 <= 0L) break block5;
                    if (!object.isEmpty()) break block6;
                }
                V6.M(player, l3, V6.a(1586209140 + (char)-27214, -1586209140 + -((char)-27052), (int)l2));
                return;
            }
            object = map.keySet().iterator().next();
        }
        UUID uUID = (UUID)object;
        V6.k((char)n4, player, uUID, n3, bl, n2);
    }

    private static void j(Player player, Player player2, String string, long l2, String string2) {
        FileConfiguration fileConfiguration = Z.D().getConfig();
        List list = fileConfiguration.getStringList(string + V6.a(-1262990520 - -32627, -1262990520 - -31844, (int)l2));
        for (String string3 : list) {
            string3 = string3.replace(V6.a(-1262990520 - -32575, 1262990520 - (char)-31613, (int)l2), player2.getName());
            TextComponent textComponent = new TextComponent(M.G(string3));
            textComponent.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, string2));
            player.spigot().sendMessage((BaseComponent)textComponent);
            if (l2 >= 0L) continue;
        }
    }

    private static void M(Player player, long l2, String string) {
        long l3 = l2 ^ 0x74DEB9F6D41CL;
        V6.X(player, string, Map.of(), l3);
    }

    private static void X(Player player, String string, Map map, long l2) {
        FileConfiguration fileConfiguration = Z.D().getConfig();
        List list = fileConfiguration.getStringList(string);
        for (String string2 : list) {
            block3: {
                for (Map.Entry entry : map.entrySet()) {
                    string2 = string2.replace((CharSequence)entry.getKey(), (CharSequence)entry.getValue());
                    if (l2 > 0L) {
                        if (l2 >= 0L) continue;
                    }
                    break block3;
                }
                player.sendMessage(M.G(string2));
            }
            if (l2 >= 0L) continue;
        }
    }

    public static X b(long l2, UUID uUID, UUID uUID2) {
        Object object;
        block3: {
            V6.K();
            Map<UUID, X> map = v.get(uUID);
            object = map;
            if (l2 < 0L) break block3;
            if (object == null) {
                return null;
            }
            object = map.get(uUID2);
        }
        return (X)object;
    }

    public static X B(UUID uUID, long l2) {
        Object object;
        block6: {
            Map<UUID, X> map;
            block7: {
                block5: {
                    V6.K();
                    map = v.get(uUID);
                    object = map;
                    if (l2 > 0L) {
                        if (object == null) break block5;
                        object = map;
                    }
                    if (l2 <= 0L) break block6;
                    if (!object.isEmpty()) break block7;
                }
                return null;
            }
            object = map.values().iterator().next();
        }
        return (X)object;
    }

    public static Map<UUID, X> N(UUID uUID) {
        V6.K();
        return v.getOrDefault(uUID, new HashMap());
    }

    private static void K() {
        v.entrySet().removeIf(entry2 -> {
            ((Map)entry2.getValue()).entrySet().removeIf(entry -> {
                long l2 = 51213775398376L;
                return ((X)entry.getValue()).n(V6.a(11478, 0x554E117F155C3090L ^ l2));
            });
            return ((Map)entry2.getValue()).isEmpty();
        });
    }

    private static /* synthetic */ Map lambda$handleConfirm$0(UUID uUID) {
        return new HashMap();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block24: {
            block23: {
                block22: {
                    block21: {
                        var13 = new String[41];
                        var11_1 = 0;
                        var10_2 = "\u00da\u0088x\b9\u00ae\u00e7\u00b9\u0082U\u00d0\u00ea\u0007\u00b5\u00d2o\u00cd\u00c1+\u00b5\u001d\u00f1\u00a8\u00e0\u00e4\u00d5\u00b8z\u00c2\n^\u0096\u00fc+\u0081\u00edD-\u0003\u00a4V\u00b8\u0010s\u00c5\u00a0\u007f\u00d0\u008fu\n\u008d\u008b\u00b3\u0099\u008dW\u007fa\\\u00ca!\u0095\u00a3\u00b9\u00bd\u00ad\u00879\u00fc\u00ceH$\u00a2r\u00ca\u0012\u00ea\u00b8\u00a6 \u00c1\f\u00aa0\u00cc\u00a9\u00e9\u00e3]\u0013\u00b3\u00f2\u0012\u0014\u0010:\u00feD\u0012i\u00aa&\u00e0\\\biAkz\u00c0\u00df\u0019\u00f0\u0011\u0015\u00eb8M\u008b\u00a5\u0098c\u00ee\u00c7+f9\u007f\u00dd\u0015\u008c\u009b\u0088{\u0091\u0013\u00da\n1e$D\u007f\u00ec!\u0016\u0097$#\u00fc\u00ce\u0094\u0010\b2\u008dJX\u0083\u00e6`*=SE\u00f1'!\u007f\u00cd\u00a7\u008d\u00e4\u007f8<v\u0012\u00ee<\u00cd\u00c4w\u00b9\u001a\u00ac\u00a6\u009e\u001dI\u0093\u00a5~]\u0018V\u00a8<\u008b\u00db\u00c2\u00bb\u00a3\u0007m\u0096\u00bd\u001a\u00cc\u00bf^\u001d\u00cf\u00cb\u00f2\u00b0\u00c4&\u0014\u00c8k\u00ce\u0090r\u00e4\u00d0\u00c0\u00a9\u00e2\u00cek\u00cce\u000b\u001d\u00f8\foW\u008d\u0085\t\u000b\u00b8|n\u00bc\u000f\u0019L\u00d2!\u00cf\u00c5'I-\ret\u00e9\u0088\u00ea&\u00a4\u00da\u001c/\u0013nc\u00fb@\u00a5lsC\u00a9\u00acU\u00fa\u00b2\u00cf2\u00b3\u001ay\u00ce$\u0010\u001e2OJ\u0000\u009e\u00fdxI\u0091u\u0081T\u00da\u00b9p\u00bd<\u00da\u009a\u00ac0\u0007\u00ed\u00c3\u00a0\u0001?\u00e0p\u0007e\u00e2\u008f9?z\u00ef\u0004\u00eb\u000eC\u0002-?\u0007\u00ec)\u0007\u0015l\u00aed\u0002q\u00eb\u00d8\u00e3G\u00cf\u0012\u0011sF\u00a0C\u00a7\u00cb\u0019\t\u00f5A\u00d10\u00aab\u001fe\u00fc\u0089\u00ce%\u00cc\u00fd\u00f2\u00d1<i\u00e9\u0010Nk\u00ca\u00a0\u00b8\u00fc\u001c*\u001bQ\u0081jv\u001fcs 0M\r`;<\u00eb\u008b\u0094\u00a6o\u007f\u001bq?\u009d\u001dI\u0094\u0010\u008b\n\u00f1=\u00d6W\u00b8YOF\u00f9m\u001e\u00e5\u00dd\u00b7rl~\u0001\u00c3\u00c9\u00af\u00c4^nU\u0091\u0019\u00c8\u00ce.\u0015\u00c1\u0090\u0016<*\u00b0|\u001f\u00bdw\u001c\u000ew\u00ca'\u00c3\u00d4\u00f4\u0096w\u0019\u00199\u009bR\u0097\u00e9\u0080\u00c8\u00d5\u00af\u00e7\u00d0\u00bf\u001e\u00be\u008d {\u0003\u00ac\u00b3\u00b6\u0006\u00a1\u00c2\u00ed\u0005\u009d\u0089\u001c\u00ab)~\u00ecU\u00ad&\u00b9-\u00fcR\u0085\u00f2\u00c5\u00ba\u001b%\u0096adq\u00a9m1\u00e4hk\u00c7\t\u00c6\\\u00c5\u00e7\u0089\u008f\u00f3\u0090Z\u0017l\u00a9\u0086\u00fcJ\u00af\u00c5\u00f9Q\u00ee\u00d3\u00b3\u001a\u008bH\u00e9$\u009c\u0086\u001f\u00b7\u0098\u00d9)`<\u0007Nz\u00f9\u00c33\u0091\u00b1\u00cf\u009d\u000f-\u00bd\u0016M*\u0098!\u00dd\u00af\bV\u00ec\u00baK7\u0006\u00c9G\u009bQ\u0095\u00e8\u00f92M\u00a3\u0012\u00e8\tp\u00ec\u0013\u00f1SM\u00a8\u00c81-`^\u0007\u0002zp\u00c3\u0002\u0091\u0097\u00cfY\u000f\u00b5\u00bd\u0005MH\u0098m\u00dd&\bg\u00ec\u009cK\u00f3\u0006fP\u00a8@<\u0017\u00a2\u00b3@cQ\u0007D\u0082\u00db>\u0005\u00ce\u00db\u00ef\u008a\u00a6\u0006\u000e\u00ddW\u00a2s\u00a3)\u0011\u0091)\u00fb\u00bfO{\u00e5\u0086k-\u00c6SF6{<\u0087\u00b6\u0094\u0018\u0019\u00b0\u0080\u00fb`\u00a9lZ\u00a2\u00cc\u00f6 8\u00c6L\u00f7\u00fb\u001b\u00c4\u00ff#\u008b\u0085zy\u00d5\u001f6\u00ef/1\u0013\u00e7\u00e4:\u0083\u00e7\u00ebsb\u00f5\u00a5\u00f6\u0080\u00ce\u00de}\b\u00de\u0094\u00fb\u00eco\u00de#\u00fa\b>@\u0007d\u009e\u00eeS\u009d .T\u00ceCCX\u00e4\u0007u7SM\u009c7\u00cfU\u0003GW$\u00ee\u00b6\u00f3\u00f8\u0097(\u00e7\rn\u0010T\u00bb\u001d\u00ef\u0097\u00f6;DW\u0004\u00e6i\u000b\u00d0\u00ca\u00ec\u00c7\u00c1K\u00c2\u0093oK\u00f4a\u001eP+\u00fa\u0007\u00ec\u00b8\u001dU\u00be\u00a1\u001e\u00ae\u00f3Yr\u00c2\u0085\u00af\u00aaR0H\u00b4$\u0007\u008e\u0089\u0089<\u00eer\u0012\u0092\u00a0K\u008e";
                        var12_3 = "\u00da\u0088x\b9\u00ae\u00e7\u00b9\u0082U\u00d0\u00ea\u0007\u00b5\u00d2o\u00cd\u00c1+\u00b5\u001d\u00f1\u00a8\u00e0\u00e4\u00d5\u00b8z\u00c2\n^\u0096\u00fc+\u0081\u00edD-\u0003\u00a4V\u00b8\u0010s\u00c5\u00a0\u007f\u00d0\u008fu\n\u008d\u008b\u00b3\u0099\u008dW\u007fa\\\u00ca!\u0095\u00a3\u00b9\u00bd\u00ad\u00879\u00fc\u00ceH$\u00a2r\u00ca\u0012\u00ea\u00b8\u00a6 \u00c1\f\u00aa0\u00cc\u00a9\u00e9\u00e3]\u0013\u00b3\u00f2\u0012\u0014\u0010:\u00feD\u0012i\u00aa&\u00e0\\\biAkz\u00c0\u00df\u0019\u00f0\u0011\u0015\u00eb8M\u008b\u00a5\u0098c\u00ee\u00c7+f9\u007f\u00dd\u0015\u008c\u009b\u0088{\u0091\u0013\u00da\n1e$D\u007f\u00ec!\u0016\u0097$#\u00fc\u00ce\u0094\u0010\b2\u008dJX\u0083\u00e6`*=SE\u00f1'!\u007f\u00cd\u00a7\u008d\u00e4\u007f8<v\u0012\u00ee<\u00cd\u00c4w\u00b9\u001a\u00ac\u00a6\u009e\u001dI\u0093\u00a5~]\u0018V\u00a8<\u008b\u00db\u00c2\u00bb\u00a3\u0007m\u0096\u00bd\u001a\u00cc\u00bf^\u001d\u00cf\u00cb\u00f2\u00b0\u00c4&\u0014\u00c8k\u00ce\u0090r\u00e4\u00d0\u00c0\u00a9\u00e2\u00cek\u00cce\u000b\u001d\u00f8\foW\u008d\u0085\t\u000b\u00b8|n\u00bc\u000f\u0019L\u00d2!\u00cf\u00c5'I-\ret\u00e9\u0088\u00ea&\u00a4\u00da\u001c/\u0013nc\u00fb@\u00a5lsC\u00a9\u00acU\u00fa\u00b2\u00cf2\u00b3\u001ay\u00ce$\u0010\u001e2OJ\u0000\u009e\u00fdxI\u0091u\u0081T\u00da\u00b9p\u00bd<\u00da\u009a\u00ac0\u0007\u00ed\u00c3\u00a0\u0001?\u00e0p\u0007e\u00e2\u008f9?z\u00ef\u0004\u00eb\u000eC\u0002-?\u0007\u00ec)\u0007\u0015l\u00aed\u0002q\u00eb\u00d8\u00e3G\u00cf\u0012\u0011sF\u00a0C\u00a7\u00cb\u0019\t\u00f5A\u00d10\u00aab\u001fe\u00fc\u0089\u00ce%\u00cc\u00fd\u00f2\u00d1<i\u00e9\u0010Nk\u00ca\u00a0\u00b8\u00fc\u001c*\u001bQ\u0081jv\u001fcs 0M\r`;<\u00eb\u008b\u0094\u00a6o\u007f\u001bq?\u009d\u001dI\u0094\u0010\u008b\n\u00f1=\u00d6W\u00b8YOF\u00f9m\u001e\u00e5\u00dd\u00b7rl~\u0001\u00c3\u00c9\u00af\u00c4^nU\u0091\u0019\u00c8\u00ce.\u0015\u00c1\u0090\u0016<*\u00b0|\u001f\u00bdw\u001c\u000ew\u00ca'\u00c3\u00d4\u00f4\u0096w\u0019\u00199\u009bR\u0097\u00e9\u0080\u00c8\u00d5\u00af\u00e7\u00d0\u00bf\u001e\u00be\u008d {\u0003\u00ac\u00b3\u00b6\u0006\u00a1\u00c2\u00ed\u0005\u009d\u0089\u001c\u00ab)~\u00ecU\u00ad&\u00b9-\u00fcR\u0085\u00f2\u00c5\u00ba\u001b%\u0096adq\u00a9m1\u00e4hk\u00c7\t\u00c6\\\u00c5\u00e7\u0089\u008f\u00f3\u0090Z\u0017l\u00a9\u0086\u00fcJ\u00af\u00c5\u00f9Q\u00ee\u00d3\u00b3\u001a\u008bH\u00e9$\u009c\u0086\u001f\u00b7\u0098\u00d9)`<\u0007Nz\u00f9\u00c33\u0091\u00b1\u00cf\u009d\u000f-\u00bd\u0016M*\u0098!\u00dd\u00af\bV\u00ec\u00baK7\u0006\u00c9G\u009bQ\u0095\u00e8\u00f92M\u00a3\u0012\u00e8\tp\u00ec\u0013\u00f1SM\u00a8\u00c81-`^\u0007\u0002zp\u00c3\u0002\u0091\u0097\u00cfY\u000f\u00b5\u00bd\u0005MH\u0098m\u00dd&\bg\u00ec\u009cK\u00f3\u0006fP\u00a8@<\u0017\u00a2\u00b3@cQ\u0007D\u0082\u00db>\u0005\u00ce\u00db\u00ef\u008a\u00a6\u0006\u000e\u00ddW\u00a2s\u00a3)\u0011\u0091)\u00fb\u00bfO{\u00e5\u0086k-\u00c6SF6{<\u0087\u00b6\u0094\u0018\u0019\u00b0\u0080\u00fb`\u00a9lZ\u00a2\u00cc\u00f6 8\u00c6L\u00f7\u00fb\u001b\u00c4\u00ff#\u008b\u0085zy\u00d5\u001f6\u00ef/1\u0013\u00e7\u00e4:\u0083\u00e7\u00ebsb\u00f5\u00a5\u00f6\u0080\u00ce\u00de}\b\u00de\u0094\u00fb\u00eco\u00de#\u00fa\b>@\u0007d\u009e\u00eeS\u009d .T\u00ceCCX\u00e4\u0007u7SM\u009c7\u00cfU\u0003GW$\u00ee\u00b6\u00f3\u00f8\u0097(\u00e7\rn\u0010T\u00bb\u001d\u00ef\u0097\u00f6;DW\u0004\u00e6i\u000b\u00d0\u00ca\u00ec\u00c7\u00c1K\u00c2\u0093oK\u00f4a\u001eP+\u00fa\u0007\u00ec\u00b8\u001dU\u00be\u00a1\u001e\u00ae\u00f3Yr\u00c2\u0085\u00af\u00aaR0H\u00b4$\u0007\u008e\u0089\u0089<\u00eer\u0012\u0092\u00a0K\u008e".length();
                        var9_4 = 3;
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
                            var10_2 = "\u009c\u00d6\u0098\u0013\u0089R\u00bdF^\u001f6H0\u0097ZA\u00b1\u00d2\u0001c9d\u00a7\u00f0\u001c\u00d9\u00e5I\u0007+wF\u008b\u0006,\u00c8";
                            var12_3 = "\u009c\u00d6\u0098\u0013\u0089R\u00bdF^\u001f6H0\u0097ZA\u00b1\u00d2\u0001c9d\u00a7\u00f0\u001c\u00d9\u00e5I\u0007+wF\u008b\u0006,\u00c8".length();
                            var9_4 = 28;
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
                                    v13 = 10;
                                    break;
                                }
                                case 2: {
                                    v13 = 22;
                                    break;
                                }
                                case 3: {
                                    v13 = 50;
                                    break;
                                }
                                case 4: {
                                    v13 = 36;
                                    break;
                                }
                                case 5: {
                                    v13 = 12;
                                    break;
                                }
                                default: {
                                    v13 = 32;
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
                V6.a = var13;
                V6.b = new String[41];
                var0_7 = 45024989849432L;
                var6_8 = new long[3];
                var3_9 = 0;
                var4_10 = "z(\u001e\u0088I\u00a6\u009d\u00b3.D\u00ef\u00f7\u0083\u001eC\u00a5UN\u0017\u0018\u00059rX";
                var5_11 = "z(\u001e\u0088I\u00a6\u009d\u00b3.D\u00ef\u00f7\u0083\u001eC\u00a5UN\u0017\u0018\u00059rX".length();
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
        V6.c = var6_8;
        V6.d = new Long[3];
        V6.J = V6.a(7464, var0_7 ^ 3334053470496768989L);
        V6.v = new HashMap<UUID, Map<UUID, X>>();
    }

    private static String a(int n2, int n3, int n4) {
        int n5 = (n2 ^ n4 ^ 0xFFFFBFAA) & 0xFFFF;
        if (b[n5] == null) {
            int n6;
            char[] cArray = a[n5].toCharArray();
            int n7 = switch (cArray[0] & 0xFF) {
                case 0 -> 97;
                case 1 -> 249;
                case 2 -> 153;
                case 3 -> 74;
                case 4 -> 120;
                case 5 -> 204;
                case 6 -> 200;
                case 7 -> 211;
                case 8 -> 116;
                case 9 -> 92;
                case 10 -> 100;
                case 11 -> 154;
                case 12 -> 164;
                case 13 -> 51;
                case 14 -> 64;
                case 15 -> 213;
                case 16 -> 194;
                case 17 -> 186;
                case 18 -> 145;
                case 19 -> 167;
                case 20 -> 149;
                case 21 -> 73;
                case 22 -> 75;
                case 23 -> 223;
                case 24 -> 172;
                case 25 -> 88;
                case 26 -> 147;
                case 27 -> 171;
                case 28 -> 4;
                case 29 -> 183;
                case 30 -> 134;
                case 31 -> 60;
                case 32 -> 52;
                case 33 -> 123;
                case 34 -> 247;
                case 35 -> 185;
                case 36 -> 226;
                case 37 -> 80;
                case 38 -> 53;
                case 39 -> 118;
                case 40 -> 14;
                case 41 -> 155;
                case 42 -> 58;
                case 43 -> 230;
                case 44 -> 231;
                case 45 -> 160;
                case 46 -> 9;
                case 47 -> 232;
                case 48 -> 146;
                case 49 -> 187;
                case 50 -> 192;
                case 51 -> 20;
                case 52 -> 182;
                case 53 -> 181;
                case 54 -> 32;
                case 55 -> 99;
                case 56 -> 196;
                case 57 -> 175;
                case 58 -> 191;
                case 59 -> 161;
                case 60 -> 238;
                case 61 -> 139;
                case 62 -> 18;
                case 63 -> 87;
                case 64 -> 70;
                case 65 -> 94;
                case 66 -> 113;
                case 67 -> 24;
                case 68 -> 22;
                case 69 -> 43;
                case 70 -> 81;
                case 71 -> 165;
                case 72 -> 142;
                case 73 -> 137;
                case 74 -> 252;
                case 75 -> 11;
                case 76 -> 215;
                case 77 -> 126;
                case 78 -> 122;
                case 79 -> 198;
                case 80 -> 184;
                case 81 -> 133;
                case 82 -> 85;
                case 83 -> 178;
                case 84 -> 210;
                case 85 -> 112;
                case 86 -> 170;
                case 87 -> 255;
                case 88 -> 141;
                case 89 -> 96;
                case 90 -> 23;
                case 91 -> 38;
                case 92 -> 227;
                case 93 -> 144;
                case 94 -> 105;
                case 95 -> 152;
                case 96 -> 42;
                case 97 -> 49;
                case 98 -> 110;
                case 99 -> 69;
                case 100 -> 8;
                case 101 -> 39;
                case 102 -> 83;
                case 103 -> 54;
                case 104 -> 26;
                case 105 -> 12;
                case 106 -> 89;
                case 107 -> 214;
                case 108 -> 206;
                case 109 -> 221;
                case 110 -> 115;
                case 111 -> 127;
                case 112 -> 244;
                case 113 -> 246;
                case 114 -> 119;
                case 115 -> 243;
                case 116 -> 162;
                case 117 -> 1;
                case 118 -> 91;
                case 119 -> 65;
                case 120 -> 78;
                case 121 -> 67;
                case 122 -> 222;
                case 123 -> 48;
                case 124 -> 156;
                case 125 -> 21;
                case 126 -> 235;
                case 127 -> 229;
                case 128 -> 193;
                case 129 -> 136;
                case 130 -> 102;
                case 131 -> 195;
                case 132 -> 157;
                case 133 -> 209;
                case 134 -> 177;
                case 135 -> 138;
                case 136 -> 46;
                case 137 -> 33;
                case 138 -> 135;
                case 139 -> 101;
                case 140 -> 5;
                case 141 -> 104;
                case 142 -> 234;
                case 143 -> 188;
                case 144 -> 55;
                case 145 -> 241;
                case 146 -> 37;
                case 147 -> 68;
                case 148 -> 6;
                case 149 -> 174;
                case 150 -> 158;
                case 151 -> 2;
                case 152 -> 106;
                case 153 -> 173;
                case 154 -> 31;
                case 155 -> 207;
                case 156 -> 190;
                case 157 -> 239;
                case 158 -> 237;
                case 159 -> 121;
                case 160 -> 41;
                case 161 -> 179;
                case 162 -> 109;
                case 163 -> 27;
                case 164 -> 56;
                case 165 -> 76;
                case 166 -> 44;
                case 167 -> 201;
                case 168 -> 128;
                case 169 -> 251;
                case 170 -> 114;
                case 171 -> 150;
                case 172 -> 29;
                case 173 -> 224;
                case 174 -> 199;
                case 175 -> 202;
                case 176 -> 108;
                case 177 -> 98;
                case 178 -> 240;
                case 179 -> 71;
                case 180 -> 93;
                case 181 -> 90;
                case 182 -> 63;
                case 183 -> 77;
                case 184 -> 168;
                case 185 -> 236;
                case 186 -> 218;
                case 187 -> 13;
                case 188 -> 169;
                case 189 -> 50;
                case 190 -> 253;
                case 191 -> 0;
                case 192 -> 95;
                case 193 -> 86;
                case 194 -> 143;
                case 195 -> 66;
                case 196 -> 220;
                case 197 -> 35;
                case 198 -> 34;
                case 199 -> 248;
                case 200 -> 203;
                case 201 -> 233;
                case 202 -> 163;
                case 203 -> 36;
                case 204 -> 225;
                case 205 -> 3;
                case 206 -> 40;
                case 207 -> 205;
                case 208 -> 129;
                case 209 -> 219;
                case 210 -> 30;
                case 211 -> 62;
                case 212 -> 15;
                case 213 -> 72;
                case 214 -> 176;
                case 215 -> 45;
                case 216 -> 254;
                case 217 -> 131;
                case 218 -> 189;
                case 219 -> 82;
                case 220 -> 107;
                case 221 -> 148;
                case 222 -> 250;
                case 223 -> 197;
                case 224 -> 19;
                case 225 -> 111;
                case 226 -> 28;
                case 227 -> 57;
                case 228 -> 245;
                case 229 -> 151;
                case 230 -> 212;
                case 231 -> 47;
                case 232 -> 103;
                case 233 -> 16;
                case 234 -> 208;
                case 235 -> 59;
                case 236 -> 180;
                case 237 -> 10;
                case 238 -> 132;
                case 239 -> 79;
                case 240 -> 228;
                case 241 -> 242;
                case 242 -> 166;
                case 243 -> 140;
                case 244 -> 216;
                case 245 -> 125;
                case 246 -> 25;
                case 247 -> 84;
                case 248 -> 217;
                case 249 -> 7;
                case 250 -> 159;
                case 251 -> 61;
                case 252 -> 124;
                case 253 -> 17;
                case 254 -> 130;
                default -> 117;
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
            V6.b[n5] = new String(cArray).intern();
        }
        return b[n5];
    }

    private static long a(int n2, long l2) {
        int n3 = (n2 ^ (int)l2 ^ 0x79AC) & Short.MAX_VALUE;
        if (d[n3] == null) {
            V6.d[n3] = c[n3] ^ l2;
        }
        return d[n3];
    }

    public static class X {
        public final UUID v;
        public final String S;
        private final Instant O;

        public X(UUID uUID, String string, Instant instant) {
            this.v = uUID;
            this.S = string;
            this.O = instant;
        }

        public boolean n(long l2) {
            return Instant.now().isAfter(this.O.plusSeconds(l2));
        }
    }
}

