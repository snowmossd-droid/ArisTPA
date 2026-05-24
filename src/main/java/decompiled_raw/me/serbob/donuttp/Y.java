/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.Sound
 *  org.bukkit.command.Command
 *  org.bukkit.command.CommandExecutor
 *  org.bukkit.command.CommandSender
 *  org.bukkit.entity.Entity
 *  org.bukkit.entity.Player
 */
package me.serbob.donuttp;

import me.serbob.donuttp.V6;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

public class Y
implements CommandExecutor {
    public boolean onCommand(CommandSender commandSender, Command command, String string, String[] stringArray) {
        long l2 = 127660309947132L;
        long l3 = l2 ^ 0x3484C570B56FL;
        if (!(commandSender instanceof Player)) {
            return true;
        }
        Player player = (Player)commandSender;
        if (!V6.X(player.getUniqueId())) {
            player.playSound((Entity)player, Sound.ENTITY_VILLAGER_NO, 1.0f, 1.0f);
            return true;
        }
        V6.q(player, l3);
        return true;
    }
}

