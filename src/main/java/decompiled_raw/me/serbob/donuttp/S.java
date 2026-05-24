/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.Material
 *  org.bukkit.inventory.ItemStack
 */
package me.serbob.donuttp;

import me.serbob.donuttp.F;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class S {
    public static boolean B(ItemStack itemStack, long l2, String string) {
        long l3 = l2;
        long l4 = l3 ^ 0x4F3652260901L;
        long l5 = l3 ^ 0x7F018252F83CL;
        int n2 = (int)(l5 >>> 32);
        int n3 = (int)(l5 << 32 >>> 40);
        int n4 = (int)(l5 << 56 >>> 56);
        if (itemStack.getType() == Material.AIR) {
            return false;
        }
        F f2 = new F(l4, itemStack);
        return f2.K(n2, n3, string, (byte)n4);
    }

    public static String f(long l2, ItemStack itemStack, String string) {
        long l3 = l2;
        long l4 = l3 ^ 0x224FEF4EB600L;
        long l5 = l3 ^ 0x158F82C95A5CL;
        long l6 = l3 ^ 0x6D79BD68BF01L;
        if (!S.B(itemStack, l6, string)) {
            return null;
        }
        F f2 = new F(l4, itemStack);
        return f2.G(l5, string);
    }

    public static ItemStack t(ItemStack itemStack, long l2, String string, String string2) {
        long l3 = l2;
        long l4 = l3 ^ 0x73BA7D091FFFL;
        long l5 = l3 ^ 0x5315F0D4956CL;
        ItemStack itemStack2 = itemStack.clone();
        F f2 = new F(l4, itemStack2);
        f2.I(string, string2, l5);
        return new ItemStack(f2.M());
    }

    public static ItemStack j(long l2, ItemStack itemStack, String string, Integer n2) {
        long l3 = l2;
        long l4 = l3 ^ 0x325229948F56L;
        long l5 = l3 ^ 0x2AE8491258E6L;
        ItemStack itemStack2 = itemStack.clone();
        F f2 = new F(l4, itemStack2);
        f2.V(l5, string, n2);
        return new ItemStack(f2.M());
    }
}

