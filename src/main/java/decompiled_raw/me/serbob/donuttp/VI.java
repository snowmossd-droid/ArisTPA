/*
 * Decompiled with CFR 0.152.
 */
package me.serbob.donuttp;

import java.util.UUID;

public class VI {
    private static final long[] a;
    private static final Integer[] b;
    private static final long[] c;
    private static final Long[] d;

    public static UUID F(int[] nArray, long l2) {
        return new UUID((long)nArray[0] << VI.a(27854, 0x64E8D343DD365629L ^ l2) | (long)nArray[1] & VI.b(13189, 0xF728AD882856E44L ^ l2), (long)nArray[2] << VI.a(31027, 0x48EBE740C3B743D5L ^ l2) | (long)nArray[3] & VI.b(3531, 0x6F0E81937800D00BL ^ l2));
    }

    public static int[] b(short s2, UUID uUID, int n2, char c2) {
        long l2 = (long)s2 << 48 | (long)n2 << 32 >>> 16 | (long)c2 << 48 >>> 48;
        long l3 = l2 ^ 0x595CCE9CB612L;
        long l4 = uUID.getMostSignificantBits();
        long l5 = uUID.getLeastSignificantBits();
        return VI.s(l4, l5, l3);
    }

    private static int[] s(long l2, long l3, long l4) {
        return new int[]{(int)(l2 >> VI.a(31027, 0x48EB97682AFF589FL ^ l4)), (int)l2, (int)(l3 >> VI.a(31027, 0x48EB97682AFF589FL ^ l4)), (int)l3};
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 111485762977615L;
        long[] lArray = new long[2];
        int n2 = 0;
        String string = "-\u001b&:\u009f\u00e1\u00f0z\u00a7@z_\u0081`\u00e5\u0086";
        int n3 = "-\u001b&:\u009f\u00e1\u00f0z\u00a7@z_\u0081`\u00e5\u0086".length();
        int n4 = 0;
        do {
            byte[] byArray = string.substring(n4, n4 += 8).getBytes("ISO-8859-1");
            int n5 = n2++;
            lArray[n5] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n4 < n3);
        a = lArray;
        b = new Integer[2];
        long[] lArray2 = new long[2];
        int n6 = 0;
        String string2 = "o\u000e\u00f7\u0099\u00db\u00a9\u009c{\u000fr\u00fc\u00d2!,\"4";
        int n7 = "o\u000e\u00f7\u0099\u00db\u00a9\u009c{\u000fr\u00fc\u00d2!,\"4".length();
        int n8 = 0;
        do {
            byte[] byArray = string2.substring(n8, n8 += 8).getBytes("ISO-8859-1");
            int n9 = n6++;
            lArray2[n9] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n8 < n7);
        c = lArray2;
        d = new Long[2];
    }

    private static int a(int n2, long l2) {
        int n3 = n2 ^ (int)(l2 & 0x7FFFL) ^ 0x3626;
        if (b[n3] == null) {
            VI.b[n3] = (int)(a[n3] ^ l2);
        }
        return b[n3];
    }

    private static long b(int n2, long l2) {
        int n3 = (n2 ^ (int)l2 ^ 0x5100) & Short.MAX_VALUE;
        if (d[n3] == null) {
            VI.d[n3] = c[n3] ^ l2;
        }
        return d[n3];
    }
}

