/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.inventory.ItemStack
 */
package me.serbob.donuttp;

import me.serbob.donuttp.i;
import me.serbob.donuttp.j;
import me.serbob.donuttp.u;
import me.serbob.donuttp.x;
import org.bukkit.inventory.ItemStack;

public class w {
    public static final u<ItemStack> w = new u<ItemStack>(){

        @Override
        public boolean r(Object object) {
            return object instanceof ItemStack;
        }

        public void v(j j2, String string, ItemStack itemStack, long l2) {
            long l3 = l2;
            long l4 = l3 ^ 0x14B920AFC8EEL;
            long l5 = l3 ^ 0x45FE9077360CL;
            long l6 = l3 ^ 0x7716288D6DC8L;
            long l7 = l3 ^ 0x4F2F015A8A5AL;
            j2.m(string, l7);
            j j3 = j2.m(string, l5);
            j3.X(i.o(itemStack, l4), l6);
        }

        public ItemStack e(x x2, long l2, String string) {
            long l3 = l2;
            long l4 = l3 ^ 0x181AD8447475L;
            long l5 = l3 ^ 0x4FE038041A5L;
            x x3 = x2.t(string, l4);
            if (x3 != null) {
                return i.E(x3, l5);
            }
            return null;
        }
    };
    public static final u<x> S = new u<x>(){

        @Override
        public boolean r(Object object) {
            return object instanceof x;
        }

        public void u(j j2, long l2, String string, x x2) {
            long l3 = l2;
            long l4 = l3 ^ 0x2C86081974D7L;
            long l5 = l3 ^ 0x1E6EB0E32F13L;
            long l6 = l3 ^ 0x26579934C881L;
            j2.m(string, l6);
            j2.m(string, l4).X(x2, l5);
        }

        public x f(long l2, x x2, String string) {
            long l3 = l2;
            long l4 = l3 ^ 0xC36020C7FC0L;
            long l5 = l3 ^ 0x2CE7BB70DA11L;
            long l6 = l3 ^ 0x7E8EFD59A812L;
            x x3 = x2.t(string, l5);
            if (x3 != null) {
                j j2 = i.I(l6);
                j2.X(x3, l4);
                return j2;
            }
            return null;
        }
    };
    public static final u<j> H = new u<j>(){

        @Override
        public boolean r(Object object) {
            return object instanceof j;
        }

        public void A(j j2, String string, j j3, long l2) {
            long l3 = l2;
            long l4 = l3 ^ 0x3651DA198C2EL;
            long l5 = l3 ^ 0x4B962E3D7EAL;
            long l6 = l3 ^ 0x3C804B343078L;
            j2.m(string, l6);
            j2.m(string, l4).X(j3, l5);
        }

        public j I(x x2, long l2, String string) {
            long l3 = l2;
            long l4 = l3 ^ 0x1A597633D2B7L;
            long l5 = l3 ^ 0x3A88CF4F7766L;
            long l6 = l3 ^ 0x68E189660565L;
            x x3 = x2.t(string, l5);
            if (x3 != null) {
                j j2 = i.I(l6);
                j2.X(x3, l4);
                return j2;
            }
            return null;
        }
    };
}

