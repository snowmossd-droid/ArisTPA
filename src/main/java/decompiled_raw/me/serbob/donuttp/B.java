/*
 * Decompiled with CFR 0.152.
 */
package me.serbob.donuttp;

import java.lang.invoke.LambdaMetafactory;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Proxy;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import me.serbob.donuttp.O;
import me.serbob.donuttp.V;
import me.serbob.donuttp.VV;
import me.serbob.donuttp.j;
import me.serbob.donuttp.p;
import me.serbob.donuttp.q;
import me.serbob.donuttp.s;
import me.serbob.donuttp.u;
import me.serbob.donuttp.y;
import me.serbob.donuttp.z;

public class B<T extends VV>
implements InvocationHandler {
    private static final Map<Method, Function<r, Object>> S;
    private final Class<T> X;
    private final j h;
    private boolean u;
    private static final String[] a;
    private static final String[] b;

    public B(long l2, j j2, Class clazz) {
        long l3 = l2 ^ 0x19900C444E8DL;
        if (!clazz.isInterface()) {
            throw new s(l3, B.a(1148435340 - 30744, 1148435340 - (char)-23117, (int)l2));
        }
        this.X = clazz;
        this.h = j2;
    }

    public B<T> D() {
        this.u = true;
        return this;
    }

    public T c() {
        VV vV = (VV)Proxy.newProxyInstance(this.getClass().getClassLoader(), new Class[]{this.X}, (InvocationHandler)this);
        vV.i();
        return (T)vV;
    }

    @Override
    public Object invoke(Object object, Method method2, Object[] objectArray) throws Throwable {
        S.computeIfAbsent(method2, method -> {
            long l2 = 3541755972972L;
            long l3 = l2 ^ 0x1BAECCC8943CL;
            return B.N(l3, (VV)object, method);
        });
        return S.get(method2).apply(new r(this.X, (VV)object, this.u, this.h, objectArray));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static Function N(long var0, VV var2_1, Method var3_2) {
        block43: {
            block44: {
                block41: {
                    block40: {
                        block45: {
                            block39: {
                                block37: {
                                    block38: {
                                        block36: {
                                            block42: {
                                                block35: {
                                                    v0 = var0;
                                                    v1 = v0 ^ 39635697757778L;
                                                    var4_3 = (int)(v1 >>> 48);
                                                    var5_4 = (int)(v1 << 16 >>> 48);
                                                    var6_5 = (int)(v1 << 32 >>> 32);
                                                    var7_6 = v0 ^ 73231370092970L;
                                                    if (!B.a(-1842582060 + -12099, 1842582060 + 17464, (int)var0).equals(var3_2.getName())) break block35;
                                                    v2 = var3_2.getParameterCount();
                                                    if (var0 > 0L) {
                                                        if (v2 != 0) break block35;
                                                    }
                                                    ** GOTO lbl35
                                                    v4 = var3_2;
                                                    if (var0 > 0L) {
                                                        if (v4.getReturnType() != String.class) break block35;
                                                    }
                                                    ** GOTO lbl33
                                                    return (Function<r, Object>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$createFunction$1(me.serbob.donuttp.B$r ), (Lme/serbob/donuttp/B$r;)Ljava/lang/Object;)();
                                                }
                                                v4 = var3_2;
lbl33:
                                                // 2 sources

                                                if (var0 < 0L) break block42;
                                                v2 = (int)v4.isDefault();
lbl35:
                                                // 2 sources

                                                if (v2 == 0) break block36;
                                                v4 = var3_2;
                                            }
                                            return (Function<r, Object>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$createFunction$2(java.lang.reflect.Method me.serbob.donuttp.B$r ), (Lme/serbob/donuttp/B$r;)Ljava/lang/Object;)((Method)v4);
                                        }
                                        v8 = var9_7 = B.W(var7_6, var3_2);
                                        v9 = z.D.SET;
                                        if (var0 >= 0L) {
                                            if (v8 == v9) {
                                                var10_8 = B.x((short)var4_3, var2_1.g(), (char)var5_4, var6_5, var3_2);
                                                return (Function<r, Object>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$createFunction$3(java.lang.String me.serbob.donuttp.B$r ), (Lme/serbob/donuttp/B$r;)Ljava/lang/Object;)((String)var10_8);
                                            }
                                            v8 = var9_7;
                                            v9 = z.D.GET;
                                        }
                                        if (var0 <= 0L) break block43;
                                        if (v8 != v9) break block44;
                                        var10_9 = var3_2.getReturnType();
                                        var11_11 = B.x((short)var4_3, var2_1.g(), (char)var5_4, var6_5, var3_2);
                                        v10 = var10_9;
                                        if (var0 < 0L) break block37;
                                        if (!v10.isInterface()) break block38;
                                        v10 = VV.class;
                                        v11 /* !! */  = var10_9;
                                        if (var0 <= 0L) break block39;
                                        if (!v10.isAssignableFrom(v11 /* !! */ )) break block38;
                                        return (Function<r, Object>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$createFunction$4(java.lang.String java.lang.Class me.serbob.donuttp.B$r ), (Lme/serbob/donuttp/B$r;)Ljava/lang/Object;)((String)var11_11, var10_9);
                                    }
                                    v10 = var10_9;
                                }
                                if (var0 < 0L) break block45;
                                v11 /* !! */  = y.class;
                            }
                            if (v10 != v11 /* !! */ ) break block40;
                            v10 = (Class)((ParameterizedType)var3_2.getGenericReturnType()).getActualTypeArguments()[0];
                        }
                        var12_12 = v10;
                        v14 = var12_12;
                        if (var0 >= 0L) {
                            if (v14 == null) break block40;
                            v14 = var12_12;
                        }
                        if (!v14.isInterface()) break block40;
                        if (!VV.class.isAssignableFrom((Class<?>)var12_12)) break block40;
                        return (Function<r, Object>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$createFunction$5(java.lang.String java.lang.Class me.serbob.donuttp.B$r ), (Lme/serbob/donuttp/B$r;)Ljava/lang/Object;)((String)var11_11, (Class)var12_12);
                    }
                    var12_12 = var2_1.A(var10_9);
                    v18 = var12_12;
                    if (var0 > 0L) {
                        if (v18 == null) break block41;
                        v18 = var12_12;
                    }
                    return (Function<r, Object>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$createFunction$6(me.serbob.donuttp.u java.lang.String me.serbob.donuttp.B$r ), (Lme/serbob/donuttp/B$r;)Ljava/lang/Object;)((u)v18, (String)var11_11);
                }
                return (Function<r, Object>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$createFunction$7(java.lang.String java.lang.Class me.serbob.donuttp.B$r ), (Lme/serbob/donuttp/B$r;)Ljava/lang/Object;)((String)var11_11, var10_9);
            }
            v8 = var9_7;
            v9 = z.D.HAS;
        }
        if (v8 == v9) {
            var10_10 = B.x((short)var4_3, var2_1.g(), (char)var5_4, var6_5, var3_2);
            return (Function<r, Object>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$createFunction$8(java.lang.String me.serbob.donuttp.B$r ), (Lme/serbob/donuttp/B$r;)Ljava/lang/Object;)((String)var10_10);
        }
        throw new IllegalArgumentException(B.a(-1842582060 + -12092, 1842582060 + 425, (int)var0) + var3_2.getName() + B.a(-1842582060 + -12085, -1842582060 + -1095, (int)var0) + var3_2.getDeclaringClass().getName() + B.a(-1842582060 + -12095, 1842582060 + 6324, (int)var0));
    }

    /*
     * Unable to fully structure code
     */
    private static z.D W(long var0, Method var2_1) {
        block43: {
            block42: {
                block41: {
                    block38: {
                        block40: {
                            block39: {
                                var3_2 = var2_1.getAnnotation(z.class);
                                if (var0 <= 0L || var3_2 == null) break block38;
                                v0 = var3_2.j();
                                v1 = z.D.HAS;
                                if (var0 > 0L) {
                                    if (v0 != v1) break block39;
                                }
                                ** GOTO lbl31
                                if (var0 < 0L || var2_1.getParameterCount() != 0) break block39;
                                if (var0 < 0L || var2_1.getReturnType() != Boolean.TYPE) break block39;
                                return z.D.HAS;
                            }
                            v0 = var3_2.j();
                            v1 = z.D.GET;
lbl31:
                            // 2 sources

                            if (var0 >= 0L) {
                                if (v0 != v1 || var2_1.getParameterCount() != 0) break block40;
                            }
                            ** GOTO lbl46
                            return z.D.GET;
                        }
                        if (var0 < 0L) break block38;
                        v0 = var3_2.j();
                        v1 = z.D.SET;
lbl46:
                        // 2 sources

                        if (v0 != v1) break block38;
                        v8 = var2_1.getParameterCount();
                        if (var0 >= 0L) {
                            if (v8 != 1) break block38;
                        }
                        ** GOTO lbl61
                        return z.D.SET;
                    }
                    v8 = var2_1.getName().startsWith(B.a(333573150 - (char)-21276, 333573150 - 31138, (int)var0));
lbl61:
                    // 2 sources

                    if (var0 >= 0L) {
                        if (v8 == 0) break block41;
                        v8 = var2_1.getParameterCount();
                        if (var0 > 0L) {
                            if (v8 != 1) break block41;
                        }
                    }
                    ** GOTO lbl78
                    return z.D.SET;
                }
                v8 = (int)var2_1.getName().startsWith(B.a(333573150 - (char)-21273, 333573150 - (char)-8885, (int)var0));
lbl78:
                // 2 sources

                if (var0 >= 0L) {
                    if (v8 == 0) break block42;
                    v8 = var2_1.getParameterCount();
                    if (var0 >= 0L) {
                        if (v8 != 0) break block42;
                    }
                }
                ** GOTO lbl96
                return z.D.GET;
            }
            v8 = (int)var2_1.getName().startsWith(B.a(333573150 - (char)-21278, -333573150 - -((char)-22865), (int)var0));
lbl96:
            // 2 sources

            if (var0 > 0L) {
                if (v8 == 0) break block43;
                v8 = var2_1.getParameterCount();
            }
            if (v8 != 0) break block43;
            if (var2_1.getReturnType() != Boolean.TYPE) break block43;
            return z.D.HAS;
        }
        return null;
    }

    private static String x(short s2, O o2, char c2, int n2, Method method) {
        long l2 = (long)s2 << 48 | (long)c2 << 48 >>> 16 | (long)n2 << 32 >>> 32;
        z z2 = method.getAnnotation(z.class);
        if (z2 != null) {
            return z2.value();
        }
        return o2.N(method.getName().substring(3));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static Object i(j j2, long l2, VV vV, String string, Object object) {
        long l3;
        block48: {
            u<?> u2;
            block47: {
                u<?> u3;
                long l4 = l2;
                long l5 = l4 ^ 0x63A9B14E0F23L;
                long l6 = l4 ^ 0xDF82ED5091DL;
                long l7 = l4 ^ 0x4B28091CEEC1L;
                int n2 = (int)(l7 >>> 48);
                int n3 = (int)(l7 << 16 >>> 48);
                int n4 = (int)(l7 << 32 >>> 32);
                long l8 = l4 ^ 0x591EB9D4E2B8L;
                long l9 = l4 ^ 0x605142109551L;
                long l10 = l4 ^ 0x1192423DC959L;
                long l11 = l4 ^ 0x52E02D1ACDFCL;
                int n5 = (int)(l11 >>> 48);
                int n6 = (int)(l11 << 16 >>> 48);
                int n7 = (int)(l11 << 32 >>> 32);
                l3 = l4 ^ 0xDC767BCB85EL;
                long l12 = l4 ^ 0xCC15BD46FFDL;
                long l13 = l4 ^ 0x7EF3577C1120L;
                long l14 = l4 ^ 0x453F36786CF7L;
                long l15 = l4 ^ 0x7D2ADB2331D4L;
                long l16 = l4 ^ 0x3051B2E12A4AL;
                long l17 = l4 ^ 0x646047022393L;
                long l18 = l4 ^ 0x9C9E1FECA5DL;
                int n8 = (int)(l18 >>> 32);
                int n9 = (int)(l18 << 32 >>> 48);
                int n10 = (int)(l18 << 48 >>> 48);
                if (object == null) {
                    j2.m(string, l17);
                    return null;
                }
                boolean bl = object instanceof Boolean;
                if (l2 > 0L) {
                    if (bl) {
                        j2.y(string, (Boolean)object, l10);
                        return null;
                    }
                    bl = object instanceof Byte;
                }
                if (l2 > 0L) {
                    if (bl) {
                        j2.j(string, (Byte)object, l8);
                        return null;
                    }
                    bl = object instanceof Short;
                }
                if (l2 > 0L) {
                    if (bl) {
                        j2.q(string, (Short)object, l16);
                        return null;
                    }
                    bl = object instanceof Integer;
                }
                if (l2 >= 0L) {
                    if (bl) {
                        j2.V(l15, string, (Integer)object);
                        return null;
                    }
                    bl = object instanceof Long;
                }
                if (l2 > 0L) {
                    if (bl) {
                        j2.V((short)n5, (short)n6, string, n7, (Long)object);
                        return null;
                    }
                    bl = object instanceof Float;
                }
                if (l2 >= 0L) {
                    if (bl) {
                        j2.w(string, (Float)object, l5);
                        return null;
                    }
                    bl = object instanceof Double;
                }
                if (l2 > 0L) {
                    if (bl) {
                        j2.x((char)n2, string, (short)n3, n4, (Double)object);
                        return null;
                    }
                    bl = object instanceof byte[];
                }
                if (l2 >= 0L) {
                    if (bl) {
                        j2.r(string, l6, (byte[])object);
                        return null;
                    }
                    bl = object instanceof int[];
                }
                if (l2 >= 0L) {
                    if (bl) {
                        j2.U(l12, string, (int[])object);
                        return null;
                    }
                    bl = object instanceof long[];
                }
                if (l2 >= 0L) {
                    if (bl) {
                        j2.d(l9, string, (long[])object);
                        return null;
                    }
                    bl = object instanceof String;
                }
                if (l2 > 0L) {
                    if (bl) {
                        j2.I(string, (String)object, l14);
                        return null;
                    }
                    bl = object instanceof UUID;
                }
                if (l2 >= 0L) {
                    if (bl) {
                        j2.f(n8, string, (char)n9, (char)n10, (UUID)object);
                        return null;
                    }
                    if (l2 < 0L) return null;
                    bl = object.getClass().isEnum();
                }
                if (bl) {
                    j2.X(string, (Enum)object, l13);
                    return null;
                }
                u2 = u3 = vV.A(object.getClass());
                if (l2 < 0L) break block47;
                if (u2 == null) break block48;
                u2 = u3;
            }
            u2.n(l3, j2, string, object);
            return null;
        }
        Iterator<u<Object>> iterator = vV.t().iterator();
        do {
            u<Object> u4;
            if (!iterator.hasNext()) throw new IllegalArgumentException(B.a(-416802600 - -29692, 416802600 - (char)-20316, (int)l2) + object.getClass().getName() + B.a(-416802600 - -29691, -416802600 - -((char)-6787), (int)l2));
            u<Object> u5 = u4 = iterator.next();
            if (l2 >= 0L) {
                if (!u5.r(object)) continue;
                u5 = u4;
            }
            u5.n(l3, j2, string, object);
            return null;
        } while (l2 >= 0L);
        throw new IllegalArgumentException(B.a(-416802600 - -29692, 416802600 - (char)-20316, (int)l2) + object.getClass().getName() + B.a(-416802600 - -29691, -416802600 - -((char)-6787), (int)l2));
    }

    private static /* synthetic */ Object lambda$createFunction$8(String string, r r2) {
        long l2 = 29424551516759L;
        long l3 = l2 ^ 0x709EE73CF766L;
        return r2.O.k(l3, string);
    }

    private static /* synthetic */ Object lambda$createFunction$7(String string, Class clazz, r r2) {
        long l2 = 105472860906703L;
        long l3 = l2 ^ 0x739C7611FF56L;
        return r2.O.D(string, l3, clazz);
    }

    private static /* synthetic */ Object lambda$createFunction$6(u u2, String string, r r2) {
        long l2 = 109555162424512L;
        long l3 = l2 ^ 0x5100770649CDL;
        return u2.c(l3, r2.O, string);
    }

    private static /* synthetic */ Object lambda$createFunction$5(String string, Class clazz, r r2) {
        long l2 = 21528948122607L;
        long l3 = l2 ^ 0x56586A2A44BFL;
        int n2 = (int)(l3 >>> 48);
        int n3 = (int)(l3 << 16 >>> 48);
        int n4 = (int)(l3 << 32 >>> 32);
        return new V(r2.O.v((short)n2, (char)n3, n4, string), clazz);
    }

    private static /* synthetic */ Object lambda$createFunction$4(String string, Class clazz, r r2) {
        long l2;
        long l3;
        block5: {
            long l4;
            long l5 = l4 = 116169147167564L;
            l3 = l5 ^ 0x2CF7074C97FAL;
            l2 = l5 ^ 0x61BD7238C799L;
            long l6 = l5 ^ 0x3FBB40C1E7DL;
            long l7 = l5 ^ 0x14BBCD4B52AAL;
            long l8 = l5 ^ 0x35670B08D977L;
            if (r2.O.k(l6, string) && r2.O.n(l7, string) != p.NBTTagCompound) {
            }
            break block5;
            throw new s(l8, B.a(1128250560 + 6082, 1128250560 + 9668, (int)l4) + clazz + B.a(1128250560 + 6091, -1128250560 + -3669, (int)l4) + string + B.a(1128250560 + 6085, -1128250560 - -5240, (int)l4));
        }
        return new B(l3, r2.O.m(string, l2), clazz).c();
    }

    private static /* synthetic */ Object lambda$createFunction$3(String string, r r2) {
        long l2;
        long l3 = l2 = 92392011526922L;
        long l4 = l3 ^ 0x8C706CE1931L;
        long l5 = l3 ^ 0x32ACA9D1981AL;
        if (r2.e) {
            throw new s(l4, B.a(1324986630 - (char)-25536, -1324986630 - -((char)-22817), (int)l2));
        }
        return B.i(r2.O, l5, r2.J, string, r2.U[0]);
    }

    private static /* synthetic */ Object lambda$createFunction$2(Method method, r r2) {
        long l2 = 106412786933232L;
        long l3 = l2 ^ 0x2EFB8293FD2DL;
        return q.D(r2.H, r2.J, l3, method, r2.U);
    }

    private static /* synthetic */ Object lambda$createFunction$1(r r2) {
        return r2.O.toString();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block20: {
            block19: {
                var5 = new String[14];
                var3_1 = 0;
                var2_2 = "\u0097\u00f0#K0\u00fcx\u00d0\u009b\u00c1\u00ec\u00d8\u00c2}\u00bc\u0018\u009c\u00c3\u00a1\u00ec\u009a\u00d7\u0013\u00b3\u00fb@\u00a13g\u0011\u00b9p\u00adH\u0092N\u0094\u0080\u0087\u0001\u00d8e1h\u00b28$C\u00cf\u009e\u00b6\u0010/\u00fb\u00e9\u00fb\u009d\u0017\u009d\u00daP\u00fb\u0083\u00e4\u00c5\u00b7SR\u00af0H\u00dbM0UY\u008c\u00eb]=\u00b5\u00dd\u00f1\u009a\u00b1y\u00a5\u001eVk\u0012\u00bd\u0002\u0099\u007f\u0097\u00a8\u00a5\u00b4z\u0080\u0006\u00c0>\u0084\u00d2\u0003\u00a1\u0087D\u0018\u00d5*o\u001f\u0088\u00db\u000f\",tL\u00abW$\u00a8\u00e66\u007f\u00ff\\2(z\u00ac\u0003\u0015'\u00ad\b>`\b\u00f6>1p\u000bI|G\u00f0\u00b2{nq\u0094\u00e6\u00b1\u00b1/\u0086J0n\u00a1\u00f5\u0001\u00ccn\u00c6w\t\u00d2\u0094\u00ba!\u009c\u0088W\u00bc\u00d4\u0086\u00b5\u0094{2\u00eb\u009d\\\u009f\u00ad :N\u007f\u00fb\f\u00d3Sn*&|\u009f\u00cc\u00fc\u00d2\u00b5\f\u0081\u00bc\u009c3\u00a9\u00c2[\u0019\"6+GI\u0011p\u00a7\u00bd\u00cc|j\u00e5\u00c4\u008d\u00f0\u00b6)\u00e4\u0089\u00faSmO\u00bc\u00a7\u0088\u0005\u0081\u00f5\u00da+\u0018\r-\u00ed\u0001\u008c\u0088L\u009b\u0081\u00fc\u0087\u00a3\u00b3\u0011\u00c2\u00f7\u0003XX\u001d\u00e8\u000f\u00cf\u00f5\u00b9U\u000e\u00d1\u0082\u0011\u001b\b56\u009bj\u00d7w^\u0080\u008aYDD\u00061\u00ce\u00a5\b\u00e1U\u00a9\u00c4~\u0006\u0088D\u00ea\u00d7;\u001e\u009e\u009b\u009enF\u00bf\u0087\u00be7N\u0093\u0017\u0010\u00a6]p\u00a3EI\u0010\u008a\u0092\u00b0\u0014\u008c$\u00b5\u00b3\r\u00f8\u00e6/\u001d!\u0003k\u0086\u00f4\u0011\u00ab\u009c\u00a4\u00c6\u00c0Mr\u00e6L\u0007\u0016\u0000\u009dfW5\u00e6\u0006\u0084L\\\u00cf\u009b\u0001";
                var4_3 = "\u0097\u00f0#K0\u00fcx\u00d0\u009b\u00c1\u00ec\u00d8\u00c2}\u00bc\u0018\u009c\u00c3\u00a1\u00ec\u009a\u00d7\u0013\u00b3\u00fb@\u00a13g\u0011\u00b9p\u00adH\u0092N\u0094\u0080\u0087\u0001\u00d8e1h\u00b28$C\u00cf\u009e\u00b6\u0010/\u00fb\u00e9\u00fb\u009d\u0017\u009d\u00daP\u00fb\u0083\u00e4\u00c5\u00b7SR\u00af0H\u00dbM0UY\u008c\u00eb]=\u00b5\u00dd\u00f1\u009a\u00b1y\u00a5\u001eVk\u0012\u00bd\u0002\u0099\u007f\u0097\u00a8\u00a5\u00b4z\u0080\u0006\u00c0>\u0084\u00d2\u0003\u00a1\u0087D\u0018\u00d5*o\u001f\u0088\u00db\u000f\",tL\u00abW$\u00a8\u00e66\u007f\u00ff\\2(z\u00ac\u0003\u0015'\u00ad\b>`\b\u00f6>1p\u000bI|G\u00f0\u00b2{nq\u0094\u00e6\u00b1\u00b1/\u0086J0n\u00a1\u00f5\u0001\u00ccn\u00c6w\t\u00d2\u0094\u00ba!\u009c\u0088W\u00bc\u00d4\u0086\u00b5\u0094{2\u00eb\u009d\\\u009f\u00ad :N\u007f\u00fb\f\u00d3Sn*&|\u009f\u00cc\u00fc\u00d2\u00b5\f\u0081\u00bc\u009c3\u00a9\u00c2[\u0019\"6+GI\u0011p\u00a7\u00bd\u00cc|j\u00e5\u00c4\u008d\u00f0\u00b6)\u00e4\u0089\u00faSmO\u00bc\u00a7\u0088\u0005\u0081\u00f5\u00da+\u0018\r-\u00ed\u0001\u008c\u0088L\u009b\u0081\u00fc\u0087\u00a3\u00b3\u0011\u00c2\u00f7\u0003XX\u001d\u00e8\u000f\u00cf\u00f5\u00b9U\u000e\u00d1\u0082\u0011\u001b\b56\u009bj\u00d7w^\u0080\u008aYDD\u00061\u00ce\u00a5\b\u00e1U\u00a9\u00c4~\u0006\u0088D\u00ea\u00d7;\u001e\u009e\u009b\u009enF\u00bf\u0087\u00be7N\u0093\u0017\u0010\u00a6]p\u00a3EI\u0010\u008a\u0092\u00b0\u0014\u008c$\u00b5\u00b3\r\u00f8\u00e6/\u001d!\u0003k\u0086\u00f4\u0011\u00ab\u009c\u00a4\u00c6\u00c0Mr\u00e6L\u0007\u0016\u0000\u009dfW5\u00e6\u0006\u0084L\\\u00cf\u009b\u0001".length();
                var1_4 = 33;
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
                    var2_2 = "\u00b6\u00c9\u000bp\u00b13g\u00c9\u0084^>p\u001e~\u00fdJxl)\u0093\u00b8\u00df\u0012~\u00d5\u00c0\u0014\u00c1\u00dd\u00c5\u00b3\u00d5O\u00e6\u00e9\u00c5\u001dFx\u00bf\u0006F\u00bf";
                    var4_3 = "\u00b6\u00c9\u000bp\u00b13g\u00c9\u0084^>p\u001e~\u00fdJxl)\u0093\u00b8\u00df\u0012~\u00d5\u00c0\u0014\u00c1\u00dd\u00c5\u00b3\u00d5O\u00e6\u00e9\u00c5\u001dFx\u00bf\u0006F\u00bf".length();
                    var1_4 = 12;
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
                            v13 = 41;
                            break;
                        }
                        case 1: {
                            v13 = 49;
                            break;
                        }
                        case 2: {
                            v13 = 67;
                            break;
                        }
                        case 3: {
                            v13 = 42;
                            break;
                        }
                        case 4: {
                            v13 = 28;
                            break;
                        }
                        case 5: {
                            v13 = 57;
                            break;
                        }
                        default: {
                            v13 = 102;
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
        B.a = var5;
        B.b = new String[14];
        B.S = new ConcurrentHashMap<Method, Function<r, Object>>();
    }

    private static String a(int n2, int n3, int n4) {
        int n5 = (n2 ^ n4 ^ 0xFFFFE7C4) & 0xFFFF;
        if (b[n5] == null) {
            int n6;
            int n7;
            char[] cArray = a[n5].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n7 = 102;
                    break;
                }
                case 1: {
                    n7 = 147;
                    break;
                }
                case 2: {
                    n7 = 194;
                    break;
                }
                case 3: {
                    n7 = 52;
                    break;
                }
                case 4: {
                    n7 = 0;
                    break;
                }
                case 5: {
                    n7 = 25;
                    break;
                }
                case 6: {
                    n7 = 101;
                    break;
                }
                case 7: {
                    n7 = 105;
                    break;
                }
                case 8: {
                    n7 = 183;
                    break;
                }
                case 9: {
                    n7 = 92;
                    break;
                }
                case 10: {
                    n7 = 238;
                    break;
                }
                case 11: {
                    n7 = 243;
                    break;
                }
                case 12: {
                    n7 = 226;
                    break;
                }
                case 13: {
                    n7 = 144;
                    break;
                }
                case 14: {
                    n7 = 153;
                    break;
                }
                case 15: {
                    n7 = 111;
                    break;
                }
                case 16: {
                    n7 = 95;
                    break;
                }
                case 17: {
                    n7 = 96;
                    break;
                }
                case 18: {
                    n7 = 56;
                    break;
                }
                case 19: {
                    n7 = 169;
                    break;
                }
                case 20: {
                    n7 = 103;
                    break;
                }
                case 21: {
                    n7 = 13;
                    break;
                }
                case 22: {
                    n7 = 121;
                    break;
                }
                case 23: {
                    n7 = 209;
                    break;
                }
                case 24: {
                    n7 = 239;
                    break;
                }
                case 25: {
                    n7 = 175;
                    break;
                }
                case 26: {
                    n7 = 189;
                    break;
                }
                case 27: {
                    n7 = 228;
                    break;
                }
                case 28: {
                    n7 = 10;
                    break;
                }
                case 29: {
                    n7 = 5;
                    break;
                }
                case 30: {
                    n7 = 229;
                    break;
                }
                case 31: {
                    n7 = 113;
                    break;
                }
                case 32: {
                    n7 = 31;
                    break;
                }
                case 33: {
                    n7 = 9;
                    break;
                }
                case 34: {
                    n7 = 160;
                    break;
                }
                case 35: {
                    n7 = 197;
                    break;
                }
                case 36: {
                    n7 = 135;
                    break;
                }
                case 37: {
                    n7 = 174;
                    break;
                }
                case 38: {
                    n7 = 107;
                    break;
                }
                case 39: {
                    n7 = 15;
                    break;
                }
                case 40: {
                    n7 = 126;
                    break;
                }
                case 41: {
                    n7 = 50;
                    break;
                }
                case 42: {
                    n7 = 49;
                    break;
                }
                case 43: {
                    n7 = 80;
                    break;
                }
                case 44: {
                    n7 = 82;
                    break;
                }
                case 45: {
                    n7 = 231;
                    break;
                }
                case 46: {
                    n7 = 145;
                    break;
                }
                case 47: {
                    n7 = 172;
                    break;
                }
                case 48: {
                    n7 = 51;
                    break;
                }
                case 49: {
                    n7 = 222;
                    break;
                }
                case 50: {
                    n7 = 71;
                    break;
                }
                case 51: {
                    n7 = 37;
                    break;
                }
                case 52: {
                    n7 = 241;
                    break;
                }
                case 53: {
                    n7 = 152;
                    break;
                }
                case 54: {
                    n7 = 26;
                    break;
                }
                case 55: {
                    n7 = 225;
                    break;
                }
                case 56: {
                    n7 = 38;
                    break;
                }
                case 57: {
                    n7 = 161;
                    break;
                }
                case 58: {
                    n7 = 248;
                    break;
                }
                case 59: {
                    n7 = 23;
                    break;
                }
                case 60: {
                    n7 = 55;
                    break;
                }
                case 61: {
                    n7 = 192;
                    break;
                }
                case 62: {
                    n7 = 188;
                    break;
                }
                case 63: {
                    n7 = 87;
                    break;
                }
                case 64: {
                    n7 = 136;
                    break;
                }
                case 65: {
                    n7 = 17;
                    break;
                }
                case 66: {
                    n7 = 4;
                    break;
                }
                case 67: {
                    n7 = 70;
                    break;
                }
                case 68: {
                    n7 = 78;
                    break;
                }
                case 69: {
                    n7 = 205;
                    break;
                }
                case 70: {
                    n7 = 115;
                    break;
                }
                case 71: {
                    n7 = 252;
                    break;
                }
                case 72: {
                    n7 = 187;
                    break;
                }
                case 73: {
                    n7 = 151;
                    break;
                }
                case 74: {
                    n7 = 140;
                    break;
                }
                case 75: {
                    n7 = 168;
                    break;
                }
                case 76: {
                    n7 = 212;
                    break;
                }
                case 77: {
                    n7 = 236;
                    break;
                }
                case 78: {
                    n7 = 94;
                    break;
                }
                case 79: {
                    n7 = 14;
                    break;
                }
                case 80: {
                    n7 = 180;
                    break;
                }
                case 81: {
                    n7 = 125;
                    break;
                }
                case 82: {
                    n7 = 230;
                    break;
                }
                case 83: {
                    n7 = 42;
                    break;
                }
                case 84: {
                    n7 = 99;
                    break;
                }
                case 85: {
                    n7 = 91;
                    break;
                }
                case 86: {
                    n7 = 146;
                    break;
                }
                case 87: {
                    n7 = 132;
                    break;
                }
                case 88: {
                    n7 = 39;
                    break;
                }
                case 89: {
                    n7 = 166;
                    break;
                }
                case 90: {
                    n7 = 27;
                    break;
                }
                case 91: {
                    n7 = 57;
                    break;
                }
                case 92: {
                    n7 = 190;
                    break;
                }
                case 93: {
                    n7 = 138;
                    break;
                }
                case 94: {
                    n7 = 244;
                    break;
                }
                case 95: {
                    n7 = 119;
                    break;
                }
                case 96: {
                    n7 = 227;
                    break;
                }
                case 97: {
                    n7 = 90;
                    break;
                }
                case 98: {
                    n7 = 53;
                    break;
                }
                case 99: {
                    n7 = 202;
                    break;
                }
                case 100: {
                    n7 = 109;
                    break;
                }
                case 101: {
                    n7 = 173;
                    break;
                }
                case 102: {
                    n7 = 193;
                    break;
                }
                case 103: {
                    n7 = 220;
                    break;
                }
                case 104: {
                    n7 = 182;
                    break;
                }
                case 105: {
                    n7 = 106;
                    break;
                }
                case 106: {
                    n7 = 58;
                    break;
                }
                case 107: {
                    n7 = 100;
                    break;
                }
                case 108: {
                    n7 = 67;
                    break;
                }
                case 109: {
                    n7 = 154;
                    break;
                }
                case 110: {
                    n7 = 224;
                    break;
                }
                case 111: {
                    n7 = 81;
                    break;
                }
                case 112: {
                    n7 = 116;
                    break;
                }
                case 113: {
                    n7 = 203;
                    break;
                }
                case 114: {
                    n7 = 64;
                    break;
                }
                case 115: {
                    n7 = 219;
                    break;
                }
                case 116: {
                    n7 = 246;
                    break;
                }
                case 117: {
                    n7 = 12;
                    break;
                }
                case 118: {
                    n7 = 133;
                    break;
                }
                case 119: {
                    n7 = 88;
                    break;
                }
                case 120: {
                    n7 = 3;
                    break;
                }
                case 121: {
                    n7 = 68;
                    break;
                }
                case 122: {
                    n7 = 93;
                    break;
                }
                case 123: {
                    n7 = 198;
                    break;
                }
                case 124: {
                    n7 = 127;
                    break;
                }
                case 125: {
                    n7 = 73;
                    break;
                }
                case 126: {
                    n7 = 2;
                    break;
                }
                case 127: {
                    n7 = 46;
                    break;
                }
                case 128: {
                    n7 = 122;
                    break;
                }
                case 129: {
                    n7 = 167;
                    break;
                }
                case 130: {
                    n7 = 242;
                    break;
                }
                case 131: {
                    n7 = 66;
                    break;
                }
                case 132: {
                    n7 = 22;
                    break;
                }
                case 133: {
                    n7 = 123;
                    break;
                }
                case 134: {
                    n7 = 16;
                    break;
                }
                case 135: {
                    n7 = 237;
                    break;
                }
                case 136: {
                    n7 = 139;
                    break;
                }
                case 137: {
                    n7 = 211;
                    break;
                }
                case 138: {
                    n7 = 45;
                    break;
                }
                case 139: {
                    n7 = 253;
                    break;
                }
                case 140: {
                    n7 = 19;
                    break;
                }
                case 141: {
                    n7 = 165;
                    break;
                }
                case 142: {
                    n7 = 21;
                    break;
                }
                case 143: {
                    n7 = 164;
                    break;
                }
                case 144: {
                    n7 = 159;
                    break;
                }
                case 145: {
                    n7 = 44;
                    break;
                }
                case 146: {
                    n7 = 223;
                    break;
                }
                case 147: {
                    n7 = 207;
                    break;
                }
                case 148: {
                    n7 = 114;
                    break;
                }
                case 149: {
                    n7 = 40;
                    break;
                }
                case 150: {
                    n7 = 210;
                    break;
                }
                case 151: {
                    n7 = 29;
                    break;
                }
                case 152: {
                    n7 = 60;
                    break;
                }
                case 153: {
                    n7 = 104;
                    break;
                }
                case 154: {
                    n7 = 72;
                    break;
                }
                case 155: {
                    n7 = 176;
                    break;
                }
                case 156: {
                    n7 = 196;
                    break;
                }
                case 157: {
                    n7 = 108;
                    break;
                }
                case 158: {
                    n7 = 249;
                    break;
                }
                case 159: {
                    n7 = 186;
                    break;
                }
                case 160: {
                    n7 = 179;
                    break;
                }
                case 161: {
                    n7 = 35;
                    break;
                }
                case 162: {
                    n7 = 177;
                    break;
                }
                case 163: {
                    n7 = 75;
                    break;
                }
                case 164: {
                    n7 = 195;
                    break;
                }
                case 165: {
                    n7 = 235;
                    break;
                }
                case 166: {
                    n7 = 149;
                    break;
                }
                case 167: {
                    n7 = 157;
                    break;
                }
                case 168: {
                    n7 = 156;
                    break;
                }
                case 169: {
                    n7 = 47;
                    break;
                }
                case 170: {
                    n7 = 148;
                    break;
                }
                case 171: {
                    n7 = 54;
                    break;
                }
                case 172: {
                    n7 = 181;
                    break;
                }
                case 173: {
                    n7 = 83;
                    break;
                }
                case 174: {
                    n7 = 162;
                    break;
                }
                case 175: {
                    n7 = 255;
                    break;
                }
                case 176: {
                    n7 = 158;
                    break;
                }
                case 177: {
                    n7 = 150;
                    break;
                }
                case 178: {
                    n7 = 117;
                    break;
                }
                case 179: {
                    n7 = 69;
                    break;
                }
                case 180: {
                    n7 = 130;
                    break;
                }
                case 181: {
                    n7 = 215;
                    break;
                }
                case 182: {
                    n7 = 141;
                    break;
                }
                case 183: {
                    n7 = 221;
                    break;
                }
                case 184: {
                    n7 = 208;
                    break;
                }
                case 185: {
                    n7 = 97;
                    break;
                }
                case 186: {
                    n7 = 7;
                    break;
                }
                case 187: {
                    n7 = 20;
                    break;
                }
                case 188: {
                    n7 = 250;
                    break;
                }
                case 189: {
                    n7 = 131;
                    break;
                }
                case 190: {
                    n7 = 170;
                    break;
                }
                case 191: {
                    n7 = 34;
                    break;
                }
                case 192: {
                    n7 = 247;
                    break;
                }
                case 193: {
                    n7 = 124;
                    break;
                }
                case 194: {
                    n7 = 218;
                    break;
                }
                case 195: {
                    n7 = 24;
                    break;
                }
                case 196: {
                    n7 = 191;
                    break;
                }
                case 197: {
                    n7 = 98;
                    break;
                }
                case 198: {
                    n7 = 201;
                    break;
                }
                case 199: {
                    n7 = 120;
                    break;
                }
                case 200: {
                    n7 = 232;
                    break;
                }
                case 201: {
                    n7 = 62;
                    break;
                }
                case 202: {
                    n7 = 1;
                    break;
                }
                case 203: {
                    n7 = 43;
                    break;
                }
                case 204: {
                    n7 = 59;
                    break;
                }
                case 205: {
                    n7 = 110;
                    break;
                }
                case 206: {
                    n7 = 240;
                    break;
                }
                case 207: {
                    n7 = 18;
                    break;
                }
                case 208: {
                    n7 = 76;
                    break;
                }
                case 209: {
                    n7 = 137;
                    break;
                }
                case 210: {
                    n7 = 118;
                    break;
                }
                case 211: {
                    n7 = 63;
                    break;
                }
                case 212: {
                    n7 = 74;
                    break;
                }
                case 213: {
                    n7 = 65;
                    break;
                }
                case 214: {
                    n7 = 178;
                    break;
                }
                case 215: {
                    n7 = 79;
                    break;
                }
                case 216: {
                    n7 = 36;
                    break;
                }
                case 217: {
                    n7 = 11;
                    break;
                }
                case 218: {
                    n7 = 234;
                    break;
                }
                case 219: {
                    n7 = 134;
                    break;
                }
                case 220: {
                    n7 = 206;
                    break;
                }
                case 221: {
                    n7 = 217;
                    break;
                }
                case 222: {
                    n7 = 171;
                    break;
                }
                case 223: {
                    n7 = 128;
                    break;
                }
                case 224: {
                    n7 = 84;
                    break;
                }
                case 225: {
                    n7 = 245;
                    break;
                }
                case 226: {
                    n7 = 86;
                    break;
                }
                case 227: {
                    n7 = 185;
                    break;
                }
                case 228: {
                    n7 = 89;
                    break;
                }
                case 229: {
                    n7 = 199;
                    break;
                }
                case 230: {
                    n7 = 142;
                    break;
                }
                case 231: {
                    n7 = 32;
                    break;
                }
                case 232: {
                    n7 = 112;
                    break;
                }
                case 233: {
                    n7 = 254;
                    break;
                }
                case 234: {
                    n7 = 213;
                    break;
                }
                case 235: {
                    n7 = 163;
                    break;
                }
                case 236: {
                    n7 = 41;
                    break;
                }
                case 237: {
                    n7 = 61;
                    break;
                }
                case 238: {
                    n7 = 143;
                    break;
                }
                case 239: {
                    n7 = 216;
                    break;
                }
                case 240: {
                    n7 = 214;
                    break;
                }
                case 241: {
                    n7 = 129;
                    break;
                }
                case 242: {
                    n7 = 85;
                    break;
                }
                case 243: {
                    n7 = 233;
                    break;
                }
                case 244: {
                    n7 = 8;
                    break;
                }
                case 245: {
                    n7 = 33;
                    break;
                }
                case 246: {
                    n7 = 200;
                    break;
                }
                case 247: {
                    n7 = 155;
                    break;
                }
                case 248: {
                    n7 = 6;
                    break;
                }
                case 249: {
                    n7 = 77;
                    break;
                }
                case 250: {
                    n7 = 28;
                    break;
                }
                case 251: {
                    n7 = 30;
                    break;
                }
                case 252: {
                    n7 = 204;
                    break;
                }
                case 253: {
                    n7 = 48;
                    break;
                }
                case 254: {
                    n7 = 184;
                    break;
                }
                default: {
                    n7 = 251;
                }
            }
            int n8 = n7;
            int n9 = ((n3 ^= n4) & 0xFF) - n8;
            if (n9 < 0) {
                n9 += 256;
            }
            if ((n6 = ((n3 & 0xFFFF) >>> 8) - n8) < 0) {
                n6 += 256;
            }
            int n10 = 0;
            while (n10 < cArray.length) {
                int n11 = n10 % 2;
                int n12 = n10;
                char[] cArray2 = cArray;
                char c2 = cArray[n12];
                if (n11 == 0) {
                    cArray2[n12] = (char)(c2 ^ n9);
                    n9 = ((n9 >>> 3 | n9 << 5) ^ cArray[n10]) & 0xFF;
                } else {
                    cArray2[n12] = (char)(c2 ^ n6);
                    n6 = ((n6 >>> 3 | n6 << 5) ^ cArray[n10]) & 0xFF;
                }
                ++n10;
            }
            B.b[n5] = new String(cArray).intern();
        }
        return b[n5];
    }

    private static class r {
        Class<?> H;
        VV J;
        j O;
        Object[] U;
        boolean e;

        public r(Class<?> clazz, VV vV, boolean bl, j j2, Object[] objectArray) {
            this.H = clazz;
            this.J = vV;
            this.O = j2;
            this.U = objectArray;
            this.e = bl;
        }
    }
}

