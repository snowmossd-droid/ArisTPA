/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  org.bukkit.inventory.ItemStack
 */
package me.serbob.donuttp;

import java.io.OutputStream;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;
import me.serbob.donuttp.e;
import me.serbob.donuttp.p;
import me.serbob.donuttp.u;
import org.bukkit.inventory.ItemStack;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public interface x {
    public String G(long var1, String var3);

    public Integer t(String var1, long var2);

    public Double p(short var1, String var2, int var3, int var4);

    public Byte h(String var1, long var2, short var4);

    public Short c(String var1, long var2, int var4);

    public Long c(String var1, long var2);

    public Float o(char var1, int var2, String var3, int var4);

    @Nullable
    public byte[] q(int var1, int var2, int var3, String var4);

    @Nullable
    public int[] d(int var1, short var2, String var3, char var4);

    @Nullable
    public long[] P(long var1, int var3, String var4);

    public Boolean l(long var1, String var3);

    @Nullable
    public ItemStack G(String var1, long var2);

    @Nullable
    public ItemStack[] T(String var1, long var2);

    @Nullable
    public UUID D(String var1, long var2);

    public boolean k(long var1, String var3);

    default public boolean b(String string, int n2, short s2, p p2, short s3) {
        boolean bl;
        block5: {
            block4: {
                long l2;
                long l3 = l2 = (long)n2 << 32 | (long)s2 << 48 >>> 32 | (long)s3 << 48 >>> 48;
                long l4 = l3 ^ 0x7C0D72A61702L;
                long l5 = l3 ^ 0x6B4D0BE15BD5L;
                if (!this.k(l4, string) || this.n(l5, string) != p2) break block4;
                bl = true;
                break block5;
            }
            bl = false;
        }
        return bl;
    }

    public Set o(long var1);

    @Nullable
    public x t(String var1, long var2);

    public e A(String var1, long var2);

    public e T(long var1, String var3);

    public e I(long var1, String var3);

    public e Q(String var1, long var2);

    public e y(long var1, String var3);

    public e a(long var1, String var3);

    public e M(long var1, String var3);

    @Nullable
    public p l(String var1, long var2);

    public e C(int var1, String var2, short var3, char var4);

    public Object t(short var1, String var2, Object var3, int var4, int var5);

    @Nullable
    public Object D(String var1, long var2, Class var4);

    @Nullable
    public Object c(long var1, String var3, Class var4);

    public Object B(String var1, Object var2, long var3);

    @Nullable
    public x z(String var1, long var2);

    public Object J(long var1, String var3, u var4);

    @Nullable
    public Enum D(String var1, long var2, Class var4);

    public p n(long var1, String var3);

    public void Y(OutputStream var1, long var2);

    public String toString();
}

