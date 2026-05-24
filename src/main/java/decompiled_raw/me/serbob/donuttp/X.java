/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParser
 *  org.bukkit.configuration.file.YamlConfiguration
 */
package me.serbob.donuttp;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.logging.Level;
import me.serbob.donuttp.F;
import me.serbob.donuttp.r;
import org.bukkit.configuration.file.YamlConfiguration;

public class X {
    private static final String z;
    private static final String C;
    public static boolean W;
    private static final String[] a;
    private static final String[] b;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected static void y(long l2) throws Exception {
        block20: {
            JsonElement jsonElement;
            block14: {
                block17: {
                    int n2;
                    JsonObject jsonObject;
                    long l3;
                    block18: {
                        int n3;
                        block19: {
                            block15: {
                                block16: {
                                    long l4 = l2;
                                    long l5 = l4 ^ 0x31D540B7E7D2L;
                                    l3 = l4 ^ 0x21E5D6BF0BF1L;
                                    URL uRL = new URL(X.a(-81787680 + -((char)-16132), -81787680 + -((char)-14671), (int)l2));
                                    HttpURLConnection httpURLConnection = (HttpURLConnection)uRL.openConnection();
                                    httpURLConnection.addRequestProperty(X.a(-81787680 + -((char)-16148), 81787680 + (char)-11277, (int)l2), X.a(-81787680 + -((char)-16129), 81787680 + (char)-31444, (int)l2));
                                    InputStream inputStream = httpURLConnection.getInputStream();
                                    InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
                                    jsonElement = new JsonParser().parse((Reader)inputStreamReader);
                                    if (!jsonElement.isJsonArray()) break block14;
                                    JsonArray jsonArray = (JsonArray)jsonElement;
                                    jsonObject = (JsonObject)jsonArray.get(jsonArray.size() - 1);
                                    n2 = n3 = X.o(l5, jsonObject.get(X.a(-81787680 + -((char)-16136), -81787680 + -((char)-30682), (int)l2)).getAsString());
                                    if (l2 < 0L) break block15;
                                    if (n2 != -1) break block16;
                                    r.e().log(Level.WARNING, X.a(-81787680 + -((char)-16135), -81787680 + -((char)-20293), (int)l2) + X.W(l3) + X.a(-81787680 + -((char)-16130), 81787680 + (char)-18356, (int)l2));
                                    r.e().log(Level.WARNING, X.a(-81787680 + -((char)-16134), -81787680 + -((char)-4483), (int)l2) + jsonObject.get(X.a(-81787680 + -((char)-16131), -81918750 - -((char)-690), (int)l2)).getAsString() + "'");
                                    r.e().log(Level.WARNING, X.a(-81787680 + -((char)-16140), -81787680 + -((char)-4757), (int)l2));
                                    break block17;
                                }
                                n2 = n3;
                            }
                            if (l2 < 0L) break block18;
                            if (n2 != 0) break block19;
                            if (!W) {
                                r.e().log(Level.INFO, X.a(-81787680 + -((char)-16139), 81787680 + (char)-21360, (int)l2));
                            }
                            break block17;
                        }
                        if (l2 <= 0L) break block17;
                        n2 = n3;
                    }
                    if (n2 == 1) {
                        r.e().log(Level.INFO, X.a(-81787680 + -((char)-16138), 81787680 + (char)-14750, (int)l2) + X.W(l3) + X.a(-81787680 + -((char)-16133), 81787680 + (char)-25506, (int)l2));
                        r.e().log(Level.INFO, X.a(-81787680 + -((char)-16149), -81787680 + -((char)-16490), (int)l2) + jsonObject.get(X.a(-81787680 + -((char)-16131), -81918750 - -((char)-690), (int)l2)).getAsString() + "'");
                    }
                }
                if (l2 > 0L) break block20;
            }
            r.e().log(Level.WARNING, X.a(-81787680 + -((char)-16143), -81787680 + -((char)-21135), (int)l2) + jsonElement.toString() + "'");
        }
    }

    /*
     * Unable to fully structure code
     */
    private static int o(long var0, String var2_1) {
        block49: {
            block50: {
                block48: {
                    block47: {
                        block45: {
                            block46: {
                                block43: {
                                    block44: {
                                        block42: {
                                            var3_2 = X.a(-1146600360 - -24525, 1146600360 - 25082, (int)var0);
                                            v0 = var3_2.equals(var2_1);
                                            if (var0 <= 0L) break block42;
                                            if (v0 != 0) {
                                                return 0;
                                            }
                                            v0 = -1146600360 - -24548;
                                        }
                                        var4_3 = X.a(v0, -1146600360 - -((char)-27510), (int)var0);
                                        v2 = var3_2.split(var4_3).length;
                                        if (var0 <= 0L) break block43;
                                        if (v2 != 3) break block44;
                                        v3 = var2_1.split(var4_3).length;
                                        if (var0 <= 0L) break block45;
                                        if (v3 == 3) break block46;
                                    }
                                    v2 = -1;
                                }
                                return v2;
                            }
                            v3 = Integer.parseInt(var3_2.split(var4_3)[0]);
                        }
                        var5_4 = v3;
                        var6_5 = Integer.parseInt(var3_2.split(var4_3)[1]);
                        var7_6 = var3_2.split(var4_3)[2];
                        var8_7 = Integer.parseInt(var2_1.split(var4_3)[0]);
                        var9_8 = Integer.parseInt(var2_1.split(var4_3)[1]);
                        var10_9 = var2_1.split(var4_3)[2];
                        v6 = var5_4;
                        v7 = var8_7;
                        if (var0 >= 0L) {
                            if (v6 < v7) {
                                return -1;
                            }
                        }
                        ** GOTO lbl52
                        v6 = var5_4;
                        v7 = var8_7;
lbl52:
                        // 2 sources

                        if (var0 >= 0L) {
                            if (v6 > v7) {
                                return 1;
                            }
                        }
                        ** GOTO lbl62
                        v6 = var6_5;
                        v7 = var9_8;
lbl62:
                        // 2 sources

                        if (var0 > 0L) {
                            if (v6 < v7) {
                                return -1;
                            }
                        }
                        ** GOTO lbl73
                        v6 = var6_5;
                        if (var0 <= 0L) break block47;
                        v7 = var9_8;
lbl73:
                        // 2 sources

                        if (v6 > v7) {
                            return 1;
                        }
                        v6 = Integer.parseInt(var7_6.split("-")[0]);
                    }
                    var11_10 = v6;
                    var12_11 = Integer.parseInt(var10_9.split("-")[0]);
                    v12 = var11_10;
                    v13 = var12_11;
                    if (var0 > 0L) {
                        if (v12 < v13) {
                            return -1;
                        }
                    }
                    ** GOTO lbl96
                    v12 = var11_10;
                    if (var0 <= 0L) ** GOTO lbl105
                    v13 = var12_11;
lbl96:
                    // 2 sources

                    if (v12 > v13) {
                        return 1;
                    }
                    v12 = (int)var10_9.contains("-");
lbl105:
                    // 2 sources

                    if (var0 > 0L) {
                        if (v12 != 0) break block48;
                        v12 = (int)var7_6.contains("-");
                        if (var0 >= 0L) {
                            if (v12 == 0) break block48;
                        }
                    }
                    ** GOTO lbl122
                    return -1;
                }
                v12 = (int)var10_9.contains("-");
lbl122:
                // 2 sources

                if (var0 < 0L) break block49;
                if (v12 == 0) break block50;
                v12 = (int)var7_6.contains("-");
                if (var0 < 0L) break block49;
                if (v12 == 0) break block50;
                return 0;
            }
            v12 = 1;
        }
        return v12;
    }

    protected static String W(long l2) {
        ClassLoader classLoader = X.class.getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream(X.a(765448800 + 30140, 765448800 + (char)-26186, (int)l2));
        if (inputStream != null) {
            String string;
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            try {
                YamlConfiguration yamlConfiguration = YamlConfiguration.loadConfiguration((Reader)inputStreamReader);
                string = yamlConfiguration.getString(X.a(765448800 + 30130, 765448800 + 14177, (int)l2));
            }
            catch (Throwable throwable) {
                try {
                    try {
                        inputStreamReader.close();
                    }
                    catch (Throwable throwable2) {
                        throwable.addSuppressed(throwable2);
                    }
                    throw throwable;
                }
                catch (IOException iOException) {
                    // empty catch block
                }
            }
            inputStreamReader.close();
            return string;
        }
        return F.class.getPackage().getName();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block20: {
            block19: {
                var0 = 34193775698991L;
                var7_1 = new String[19];
                var5_2 = 0;
                var4_3 = "\u0089\u00d7Io4\u00f5\u00fa\u0087\u00f8s\u0011\u00eb\u00df\u00b5\u008a|\u00b2\n\u00edS\u00f3\r\u00ac\u00f6\u0000U\u00069k\u00c3\u000b/\u00c3\u0012i9`\u00ae\u00faYk\u00ac\u00e4\u00f7\u00d4\u0090\u00d7\u00d7\u00d5\u00a4>\u00fe\u00e3\u00ee\u0090\u0002\u00e0qyC\u00f5\u008d\u00d01\u008fH\u00d9\u0089\u00de]\u00eb4\u00f9\u00e5Ld;\u0002\u00cd\u00fb&\u00cd\u00da\u00e4\u00c8?\u0017e<C\u000f\u0012:\u00ca\u0001\u0080~\u00fc7km\b\u00df\u00f1\u00ce\u00b5\u0084\u001bG\u008a\u00c3\u00d3Q%\u0016y\u00f7\u0003\f\u00da\u00e8\u00cdu\u0019\u008a\u00fe\u00b4e\u00a9H\u000e?\u0083!\u00deR\u00df8z\u0010\u00d95~\u0006\u00b6s\u0092\u00dal(d\u0019\u00d9\u00ab\u0081r\u001e|%Q*@\u00dd\u00d6B\u009b\u00f7n\u0011\u0086\u009fLOYm\u0087\u00fd3?u]\u00a9\u0085\u0007V>D\u00ba\rk\u00b4\u00f2\u001d-\u00e8\u00dd9\u00e9[\u00b1\u00d7\u00d4\u0096|4_\u00b2`A\u00e1\u00ceL(\u00dd\u008a\u0083)\u00ff$\u0004\u00f1\u000f\u0018\u008f3?\u008a\u0086\u001c\u0015\u00c5\u00bd\u00a7`\nH\u00a3\u008e\u00a8X/\u00d4\f.r\u00a9F\u00ad\u00c7\u000f\u009c:\u00fd\u009df\u00ed E\u00f0#{\u0016\u009f\u00f7x\u00a3\u00a2\u00a3\u00bd_5\u00c2\u00f9d\u00e2\u00b9p\u00c5\u00b4\u00d1\u0000R\u00a0n\u00c9(\u0083:\u0094|\u00a4\u00cdR\u0017<\u00e6\u00f5]\u00a9=\u0002\u00e2\u00e0%\u00af\u00e0A\"[\u00ad\u0004R\u00efL\u0001\u0017\u00b3\u00db\u000e\u00ee\u00dc\u00c5\u00e7\u0081[\u00b3e\u00f3Q\u00b6UI\u0094BlhcJJ\n\u0013\u00ff\u00a1\u00ad\u00e3\u00ec\u00d0\u009eR!\u0099 S\u00bem\u00f9\u009f\u00d9-\u00b5\u00cb*#y\u0018\u00de\u00f0\u00af\u009e/p\u00bf\u00ff\u00e3\u008a\u00e4\u00abe4\u0013\u009b\u00e1)y\u00e3\u00e6\u00f3\u00b0\u00fe\u008e%(\u00db\u0094\u00be\u00dc\u00b1\u001b\u00eerH\u001b\u00d0\u00da\u00e6\u00ac{\u00bac\f\u009b\u00d3L\u00d5\u001c\u00eb\u000e\u0001\u00f0\u00b8\u008e\u00e4S\u0090\u00d3\u0088\u008aH\u00cdc:\u001c\u0080\u00b6\u00876\u008d\u009br\u00b4\u00b9\u001c\u0012Fc\u00cbEZ+5\u00ea\u00ba%\u00d8\u00a5\u00e0\u00e5\u0093$\naG\u00c2\f7\f$\u0089D\u00bd<\u00b5\u0007\u0084D\u00b2\u000fE\u00955\u0014\u00e9\u0090x\f\u008a\u009e'8\u0014^\u001e\u0082mW\u0083\u00d8\u0096\u00b8\u0018\u009eIV\f>\u0006\u009bzta\u00bc\u00caI\u00d7Rx\u00b0\u00e0\u009egVh\u00e2c\te\u00b3\u00ecW\u00a2\u00e7\u00cb\u00b9M\u00b2\u00b9 ;\u00ec:[\u0015\u008b\u00ff\u00fc~\u001b]v\u00c1\u008e\u0016\u00a0\u00a6$M \u000e\u00c3\u009f\u00e81\u008e\u00abrf\u00a8\u0002\u00e1\u0016\u0015/p\u00fa\u00d9\u00a1\u007f\u00d6h\u0006\u0084\u00faO\u00b6]%\u00c7\u00ac`\u009a\u00b67\u0004\u0098\u00a9\u0015\u00c9,u\u00fb\u0014x\u00ac=sy\u00e0E\u0084vi\u008f\u0092\u00ec\u00bd\u00d6\nF\u00fd\u00020\u00f0v\u00c1\u0092\u0097\u00c0\u00e60Im)?\n#ngN\u00b9\u0093\u00c6g\u0019\u00e4\u00f4&\u0099\u00ea\u0001\u00bb\u00fe\u00f9\u00b5\u00a7h\rL\u001e\u0094,\u00d98\u00a7\u00bb$\u00f3(.3\u00fbU\u00c5\u00ad\u0096\u00874.\b\u00b8\u0084+\u0085\u00fa;,,\u00fd\u00a1\u00edH1\u00b5\u00c4\u00da~\u00bd\u001f\u0083hg\u00e0\nl\u00b0\u00d9\u0099\u0003K\u00efh\u0006xO)\u0087\u0015>N\u00a6\u0084";
                var6_4 = "\u0089\u00d7Io4\u00f5\u00fa\u0087\u00f8s\u0011\u00eb\u00df\u00b5\u008a|\u00b2\n\u00edS\u00f3\r\u00ac\u00f6\u0000U\u00069k\u00c3\u000b/\u00c3\u0012i9`\u00ae\u00faYk\u00ac\u00e4\u00f7\u00d4\u0090\u00d7\u00d7\u00d5\u00a4>\u00fe\u00e3\u00ee\u0090\u0002\u00e0qyC\u00f5\u008d\u00d01\u008fH\u00d9\u0089\u00de]\u00eb4\u00f9\u00e5Ld;\u0002\u00cd\u00fb&\u00cd\u00da\u00e4\u00c8?\u0017e<C\u000f\u0012:\u00ca\u0001\u0080~\u00fc7km\b\u00df\u00f1\u00ce\u00b5\u0084\u001bG\u008a\u00c3\u00d3Q%\u0016y\u00f7\u0003\f\u00da\u00e8\u00cdu\u0019\u008a\u00fe\u00b4e\u00a9H\u000e?\u0083!\u00deR\u00df8z\u0010\u00d95~\u0006\u00b6s\u0092\u00dal(d\u0019\u00d9\u00ab\u0081r\u001e|%Q*@\u00dd\u00d6B\u009b\u00f7n\u0011\u0086\u009fLOYm\u0087\u00fd3?u]\u00a9\u0085\u0007V>D\u00ba\rk\u00b4\u00f2\u001d-\u00e8\u00dd9\u00e9[\u00b1\u00d7\u00d4\u0096|4_\u00b2`A\u00e1\u00ceL(\u00dd\u008a\u0083)\u00ff$\u0004\u00f1\u000f\u0018\u008f3?\u008a\u0086\u001c\u0015\u00c5\u00bd\u00a7`\nH\u00a3\u008e\u00a8X/\u00d4\f.r\u00a9F\u00ad\u00c7\u000f\u009c:\u00fd\u009df\u00ed E\u00f0#{\u0016\u009f\u00f7x\u00a3\u00a2\u00a3\u00bd_5\u00c2\u00f9d\u00e2\u00b9p\u00c5\u00b4\u00d1\u0000R\u00a0n\u00c9(\u0083:\u0094|\u00a4\u00cdR\u0017<\u00e6\u00f5]\u00a9=\u0002\u00e2\u00e0%\u00af\u00e0A\"[\u00ad\u0004R\u00efL\u0001\u0017\u00b3\u00db\u000e\u00ee\u00dc\u00c5\u00e7\u0081[\u00b3e\u00f3Q\u00b6UI\u0094BlhcJJ\n\u0013\u00ff\u00a1\u00ad\u00e3\u00ec\u00d0\u009eR!\u0099 S\u00bem\u00f9\u009f\u00d9-\u00b5\u00cb*#y\u0018\u00de\u00f0\u00af\u009e/p\u00bf\u00ff\u00e3\u008a\u00e4\u00abe4\u0013\u009b\u00e1)y\u00e3\u00e6\u00f3\u00b0\u00fe\u008e%(\u00db\u0094\u00be\u00dc\u00b1\u001b\u00eerH\u001b\u00d0\u00da\u00e6\u00ac{\u00bac\f\u009b\u00d3L\u00d5\u001c\u00eb\u000e\u0001\u00f0\u00b8\u008e\u00e4S\u0090\u00d3\u0088\u008aH\u00cdc:\u001c\u0080\u00b6\u00876\u008d\u009br\u00b4\u00b9\u001c\u0012Fc\u00cbEZ+5\u00ea\u00ba%\u00d8\u00a5\u00e0\u00e5\u0093$\naG\u00c2\f7\f$\u0089D\u00bd<\u00b5\u0007\u0084D\u00b2\u000fE\u00955\u0014\u00e9\u0090x\f\u008a\u009e'8\u0014^\u001e\u0082mW\u0083\u00d8\u0096\u00b8\u0018\u009eIV\f>\u0006\u009bzta\u00bc\u00caI\u00d7Rx\u00b0\u00e0\u009egVh\u00e2c\te\u00b3\u00ecW\u00a2\u00e7\u00cb\u00b9M\u00b2\u00b9 ;\u00ec:[\u0015\u008b\u00ff\u00fc~\u001b]v\u00c1\u008e\u0016\u00a0\u00a6$M \u000e\u00c3\u009f\u00e81\u008e\u00abrf\u00a8\u0002\u00e1\u0016\u0015/p\u00fa\u00d9\u00a1\u007f\u00d6h\u0006\u0084\u00faO\u00b6]%\u00c7\u00ac`\u009a\u00b67\u0004\u0098\u00a9\u0015\u00c9,u\u00fb\u0014x\u00ac=sy\u00e0E\u0084vi\u008f\u0092\u00ec\u00bd\u00d6\nF\u00fd\u00020\u00f0v\u00c1\u0092\u0097\u00c0\u00e60Im)?\n#ngN\u00b9\u0093\u00c6g\u0019\u00e4\u00f4&\u0099\u00ea\u0001\u00bb\u00fe\u00f9\u00b5\u00a7h\rL\u001e\u0094,\u00d98\u00a7\u00bb$\u00f3(.3\u00fbU\u00c5\u00ad\u0096\u00874.\b\u00b8\u0084+\u0085\u00fa;,,\u00fd\u00a1\u00edH1\u00b5\u00c4\u00da~\u00bd\u001f\u0083hg\u00e0\nl\u00b0\u00d9\u0099\u0003K\u00efh\u0006xO)\u0087\u0015>N\u00a6\u0084".length();
                var3_5 = 92;
                var2_6 = -1;
lbl8:
                // 2 sources

                while (true) {
                    v0 = ++var2_6;
                    v1 = var4_3.substring(v0, v0 + var3_5);
                    v2 = -1;
                    break block19;
                    break;
                }
lbl13:
                // 1 sources

                while (true) {
                    var7_1[var5_2++] = v3.intern();
                    if ((var2_6 += var3_5) < var6_4) {
                        var3_5 = var4_3.charAt(var2_6);
                        ** continue;
                    }
                    var4_3 = "\u00ab\u0019'\u0098e\u00d2\u0085\u008f\u009b\u0084\u0006\u00879},\u00f3\u00ba";
                    var6_4 = "\u00ab\u0019'\u0098e\u00d2\u0085\u008f\u009b\u0084\u0006\u00879},\u00f3\u00ba".length();
                    var3_5 = 10;
                    var2_6 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v4 = ++var2_6;
                        v1 = var4_3.substring(v4, v4 + var3_5);
                        v2 = 0;
                        break block19;
                        break;
                    }
                    break;
                }
lbl27:
                // 1 sources

                while (true) {
                    var7_1[var5_2++] = v3.intern();
                    if ((var2_6 += var3_5) < var6_4) {
                        var3_5 = var4_3.charAt(var2_6);
                        ** continue;
                    }
                    break block20;
                    break;
                }
            }
            v5 = v1.toCharArray();
            var8_7 = 0;
            v6 = v5.length;
            v7 = v5;
            v8 = v6;
            if (v6 > 1) ** GOTO lbl77
            do {
                v9 = v7;
                v10 = v7;
                v11 = var8_7;
                while (true) {
                    v12 = v9[v11];
                    switch (var8_7 % 7) {
                        case 0: {
                            v13 = 30;
                            break;
                        }
                        case 1: {
                            v13 = 6;
                            break;
                        }
                        case 2: {
                            v13 = 11;
                            break;
                        }
                        case 3: {
                            v13 = 20;
                            break;
                        }
                        case 4: {
                            v13 = 4;
                            break;
                        }
                        case 5: {
                            v13 = 62;
                            break;
                        }
                        default: {
                            v13 = 70;
                        }
                    }
                    v9[v11] = (char)(v12 ^ v13);
                    ++var8_7;
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
            } while (v8 > var8_7);
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
        X.a = var7_1;
        X.b = new String[19];
        X.C = X.a(1541054753, -1541047978, (int)var0);
        X.z = X.a(1541054760, 1541076913, (int)var0);
        X.W = false;
    }

    private static String a(int n2, int n3, int n4) {
        int n5 = (n2 ^ n4 ^ 0x50B) & 0xFFFF;
        if (b[n5] == null) {
            int n6;
            int n7;
            char[] cArray = a[n5].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n7 = 143;
                    break;
                }
                case 1: {
                    n7 = 39;
                    break;
                }
                case 2: {
                    n7 = 207;
                    break;
                }
                case 3: {
                    n7 = 198;
                    break;
                }
                case 4: {
                    n7 = 194;
                    break;
                }
                case 5: {
                    n7 = 55;
                    break;
                }
                case 6: {
                    n7 = 89;
                    break;
                }
                case 7: {
                    n7 = 105;
                    break;
                }
                case 8: {
                    n7 = 77;
                    break;
                }
                case 9: {
                    n7 = 50;
                    break;
                }
                case 10: {
                    n7 = 134;
                    break;
                }
                case 11: {
                    n7 = 191;
                    break;
                }
                case 12: {
                    n7 = 185;
                    break;
                }
                case 13: {
                    n7 = 140;
                    break;
                }
                case 14: {
                    n7 = 242;
                    break;
                }
                case 15: {
                    n7 = 8;
                    break;
                }
                case 16: {
                    n7 = 44;
                    break;
                }
                case 17: {
                    n7 = 183;
                    break;
                }
                case 18: {
                    n7 = 168;
                    break;
                }
                case 19: {
                    n7 = 244;
                    break;
                }
                case 20: {
                    n7 = 95;
                    break;
                }
                case 21: {
                    n7 = 148;
                    break;
                }
                case 22: {
                    n7 = 94;
                    break;
                }
                case 23: {
                    n7 = 70;
                    break;
                }
                case 24: {
                    n7 = 62;
                    break;
                }
                case 25: {
                    n7 = 170;
                    break;
                }
                case 26: {
                    n7 = 61;
                    break;
                }
                case 27: {
                    n7 = 179;
                    break;
                }
                case 28: {
                    n7 = 6;
                    break;
                }
                case 29: {
                    n7 = 118;
                    break;
                }
                case 30: {
                    n7 = 0;
                    break;
                }
                case 31: {
                    n7 = 12;
                    break;
                }
                case 32: {
                    n7 = 253;
                    break;
                }
                case 33: {
                    n7 = 19;
                    break;
                }
                case 34: {
                    n7 = 51;
                    break;
                }
                case 35: {
                    n7 = 85;
                    break;
                }
                case 36: {
                    n7 = 104;
                    break;
                }
                case 37: {
                    n7 = 227;
                    break;
                }
                case 38: {
                    n7 = 81;
                    break;
                }
                case 39: {
                    n7 = 30;
                    break;
                }
                case 40: {
                    n7 = 174;
                    break;
                }
                case 41: {
                    n7 = 65;
                    break;
                }
                case 42: {
                    n7 = 155;
                    break;
                }
                case 43: {
                    n7 = 129;
                    break;
                }
                case 44: {
                    n7 = 250;
                    break;
                }
                case 45: {
                    n7 = 138;
                    break;
                }
                case 46: {
                    n7 = 162;
                    break;
                }
                case 47: {
                    n7 = 40;
                    break;
                }
                case 48: {
                    n7 = 135;
                    break;
                }
                case 49: {
                    n7 = 63;
                    break;
                }
                case 50: {
                    n7 = 249;
                    break;
                }
                case 51: {
                    n7 = 139;
                    break;
                }
                case 52: {
                    n7 = 149;
                    break;
                }
                case 53: {
                    n7 = 56;
                    break;
                }
                case 54: {
                    n7 = 112;
                    break;
                }
                case 55: {
                    n7 = 167;
                    break;
                }
                case 56: {
                    n7 = 84;
                    break;
                }
                case 57: {
                    n7 = 220;
                    break;
                }
                case 58: {
                    n7 = 10;
                    break;
                }
                case 59: {
                    n7 = 23;
                    break;
                }
                case 60: {
                    n7 = 98;
                    break;
                }
                case 61: {
                    n7 = 111;
                    break;
                }
                case 62: {
                    n7 = 54;
                    break;
                }
                case 63: {
                    n7 = 193;
                    break;
                }
                case 64: {
                    n7 = 229;
                    break;
                }
                case 65: {
                    n7 = 121;
                    break;
                }
                case 66: {
                    n7 = 18;
                    break;
                }
                case 67: {
                    n7 = 197;
                    break;
                }
                case 68: {
                    n7 = 96;
                    break;
                }
                case 69: {
                    n7 = 7;
                    break;
                }
                case 70: {
                    n7 = 161;
                    break;
                }
                case 71: {
                    n7 = 90;
                    break;
                }
                case 72: {
                    n7 = 205;
                    break;
                }
                case 73: {
                    n7 = 80;
                    break;
                }
                case 74: {
                    n7 = 180;
                    break;
                }
                case 75: {
                    n7 = 164;
                    break;
                }
                case 76: {
                    n7 = 188;
                    break;
                }
                case 77: {
                    n7 = 125;
                    break;
                }
                case 78: {
                    n7 = 92;
                    break;
                }
                case 79: {
                    n7 = 216;
                    break;
                }
                case 80: {
                    n7 = 254;
                    break;
                }
                case 81: {
                    n7 = 36;
                    break;
                }
                case 82: {
                    n7 = 132;
                    break;
                }
                case 83: {
                    n7 = 239;
                    break;
                }
                case 84: {
                    n7 = 27;
                    break;
                }
                case 85: {
                    n7 = 124;
                    break;
                }
                case 86: {
                    n7 = 4;
                    break;
                }
                case 87: {
                    n7 = 25;
                    break;
                }
                case 88: {
                    n7 = 159;
                    break;
                }
                case 89: {
                    n7 = 33;
                    break;
                }
                case 90: {
                    n7 = 246;
                    break;
                }
                case 91: {
                    n7 = 241;
                    break;
                }
                case 92: {
                    n7 = 156;
                    break;
                }
                case 93: {
                    n7 = 32;
                    break;
                }
                case 94: {
                    n7 = 86;
                    break;
                }
                case 95: {
                    n7 = 120;
                    break;
                }
                case 96: {
                    n7 = 15;
                    break;
                }
                case 97: {
                    n7 = 154;
                    break;
                }
                case 98: {
                    n7 = 11;
                    break;
                }
                case 99: {
                    n7 = 76;
                    break;
                }
                case 100: {
                    n7 = 163;
                    break;
                }
                case 101: {
                    n7 = 115;
                    break;
                }
                case 102: {
                    n7 = 209;
                    break;
                }
                case 103: {
                    n7 = 2;
                    break;
                }
                case 104: {
                    n7 = 99;
                    break;
                }
                case 105: {
                    n7 = 72;
                    break;
                }
                case 106: {
                    n7 = 234;
                    break;
                }
                case 107: {
                    n7 = 46;
                    break;
                }
                case 108: {
                    n7 = 145;
                    break;
                }
                case 109: {
                    n7 = 58;
                    break;
                }
                case 110: {
                    n7 = 232;
                    break;
                }
                case 111: {
                    n7 = 206;
                    break;
                }
                case 112: {
                    n7 = 219;
                    break;
                }
                case 113: {
                    n7 = 226;
                    break;
                }
                case 114: {
                    n7 = 130;
                    break;
                }
                case 115: {
                    n7 = 199;
                    break;
                }
                case 116: {
                    n7 = 35;
                    break;
                }
                case 117: {
                    n7 = 114;
                    break;
                }
                case 118: {
                    n7 = 31;
                    break;
                }
                case 119: {
                    n7 = 204;
                    break;
                }
                case 120: {
                    n7 = 64;
                    break;
                }
                case 121: {
                    n7 = 16;
                    break;
                }
                case 122: {
                    n7 = 181;
                    break;
                }
                case 123: {
                    n7 = 37;
                    break;
                }
                case 124: {
                    n7 = 202;
                    break;
                }
                case 125: {
                    n7 = 136;
                    break;
                }
                case 126: {
                    n7 = 214;
                    break;
                }
                case 127: {
                    n7 = 127;
                    break;
                }
                case 128: {
                    n7 = 34;
                    break;
                }
                case 129: {
                    n7 = 195;
                    break;
                }
                case 130: {
                    n7 = 157;
                    break;
                }
                case 131: {
                    n7 = 102;
                    break;
                }
                case 132: {
                    n7 = 68;
                    break;
                }
                case 133: {
                    n7 = 192;
                    break;
                }
                case 134: {
                    n7 = 108;
                    break;
                }
                case 135: {
                    n7 = 175;
                    break;
                }
                case 136: {
                    n7 = 45;
                    break;
                }
                case 137: {
                    n7 = 22;
                    break;
                }
                case 138: {
                    n7 = 78;
                    break;
                }
                case 139: {
                    n7 = 17;
                    break;
                }
                case 140: {
                    n7 = 97;
                    break;
                }
                case 141: {
                    n7 = 160;
                    break;
                }
                case 142: {
                    n7 = 196;
                    break;
                }
                case 143: {
                    n7 = 93;
                    break;
                }
                case 144: {
                    n7 = 243;
                    break;
                }
                case 145: {
                    n7 = 107;
                    break;
                }
                case 146: {
                    n7 = 137;
                    break;
                }
                case 147: {
                    n7 = 24;
                    break;
                }
                case 148: {
                    n7 = 131;
                    break;
                }
                case 149: {
                    n7 = 103;
                    break;
                }
                case 150: {
                    n7 = 53;
                    break;
                }
                case 151: {
                    n7 = 224;
                    break;
                }
                case 152: {
                    n7 = 210;
                    break;
                }
                case 153: {
                    n7 = 231;
                    break;
                }
                case 154: {
                    n7 = 211;
                    break;
                }
                case 155: {
                    n7 = 228;
                    break;
                }
                case 156: {
                    n7 = 208;
                    break;
                }
                case 157: {
                    n7 = 255;
                    break;
                }
                case 158: {
                    n7 = 223;
                    break;
                }
                case 159: {
                    n7 = 150;
                    break;
                }
                case 160: {
                    n7 = 75;
                    break;
                }
                case 161: {
                    n7 = 123;
                    break;
                }
                case 162: {
                    n7 = 91;
                    break;
                }
                case 163: {
                    n7 = 3;
                    break;
                }
                case 164: {
                    n7 = 144;
                    break;
                }
                case 165: {
                    n7 = 236;
                    break;
                }
                case 166: {
                    n7 = 190;
                    break;
                }
                case 167: {
                    n7 = 217;
                    break;
                }
                case 168: {
                    n7 = 88;
                    break;
                }
                case 169: {
                    n7 = 66;
                    break;
                }
                case 170: {
                    n7 = 71;
                    break;
                }
                case 171: {
                    n7 = 235;
                    break;
                }
                case 172: {
                    n7 = 67;
                    break;
                }
                case 173: {
                    n7 = 248;
                    break;
                }
                case 174: {
                    n7 = 171;
                    break;
                }
                case 175: {
                    n7 = 42;
                    break;
                }
                case 176: {
                    n7 = 26;
                    break;
                }
                case 177: {
                    n7 = 177;
                    break;
                }
                case 178: {
                    n7 = 79;
                    break;
                }
                case 179: {
                    n7 = 28;
                    break;
                }
                case 180: {
                    n7 = 245;
                    break;
                }
                case 181: {
                    n7 = 29;
                    break;
                }
                case 182: {
                    n7 = 186;
                    break;
                }
                case 183: {
                    n7 = 52;
                    break;
                }
                case 184: {
                    n7 = 158;
                    break;
                }
                case 185: {
                    n7 = 222;
                    break;
                }
                case 186: {
                    n7 = 73;
                    break;
                }
                case 187: {
                    n7 = 69;
                    break;
                }
                case 188: {
                    n7 = 126;
                    break;
                }
                case 189: {
                    n7 = 83;
                    break;
                }
                case 190: {
                    n7 = 178;
                    break;
                }
                case 191: {
                    n7 = 200;
                    break;
                }
                case 192: {
                    n7 = 119;
                    break;
                }
                case 193: {
                    n7 = 87;
                    break;
                }
                case 194: {
                    n7 = 213;
                    break;
                }
                case 195: {
                    n7 = 247;
                    break;
                }
                case 196: {
                    n7 = 187;
                    break;
                }
                case 197: {
                    n7 = 48;
                    break;
                }
                case 198: {
                    n7 = 152;
                    break;
                }
                case 199: {
                    n7 = 47;
                    break;
                }
                case 200: {
                    n7 = 189;
                    break;
                }
                case 201: {
                    n7 = 182;
                    break;
                }
                case 202: {
                    n7 = 201;
                    break;
                }
                case 203: {
                    n7 = 20;
                    break;
                }
                case 204: {
                    n7 = 147;
                    break;
                }
                case 205: {
                    n7 = 176;
                    break;
                }
                case 206: {
                    n7 = 166;
                    break;
                }
                case 207: {
                    n7 = 38;
                    break;
                }
                case 208: {
                    n7 = 43;
                    break;
                }
                case 209: {
                    n7 = 82;
                    break;
                }
                case 210: {
                    n7 = 106;
                    break;
                }
                case 211: {
                    n7 = 110;
                    break;
                }
                case 212: {
                    n7 = 5;
                    break;
                }
                case 213: {
                    n7 = 184;
                    break;
                }
                case 214: {
                    n7 = 142;
                    break;
                }
                case 215: {
                    n7 = 57;
                    break;
                }
                case 216: {
                    n7 = 100;
                    break;
                }
                case 217: {
                    n7 = 128;
                    break;
                }
                case 218: {
                    n7 = 233;
                    break;
                }
                case 219: {
                    n7 = 237;
                    break;
                }
                case 220: {
                    n7 = 21;
                    break;
                }
                case 221: {
                    n7 = 14;
                    break;
                }
                case 222: {
                    n7 = 173;
                    break;
                }
                case 223: {
                    n7 = 251;
                    break;
                }
                case 224: {
                    n7 = 117;
                    break;
                }
                case 225: {
                    n7 = 101;
                    break;
                }
                case 226: {
                    n7 = 215;
                    break;
                }
                case 227: {
                    n7 = 238;
                    break;
                }
                case 228: {
                    n7 = 122;
                    break;
                }
                case 229: {
                    n7 = 230;
                    break;
                }
                case 230: {
                    n7 = 13;
                    break;
                }
                case 231: {
                    n7 = 116;
                    break;
                }
                case 232: {
                    n7 = 60;
                    break;
                }
                case 233: {
                    n7 = 172;
                    break;
                }
                case 234: {
                    n7 = 221;
                    break;
                }
                case 235: {
                    n7 = 41;
                    break;
                }
                case 236: {
                    n7 = 1;
                    break;
                }
                case 237: {
                    n7 = 141;
                    break;
                }
                case 238: {
                    n7 = 212;
                    break;
                }
                case 239: {
                    n7 = 133;
                    break;
                }
                case 240: {
                    n7 = 113;
                    break;
                }
                case 241: {
                    n7 = 74;
                    break;
                }
                case 242: {
                    n7 = 218;
                    break;
                }
                case 243: {
                    n7 = 153;
                    break;
                }
                case 244: {
                    n7 = 9;
                    break;
                }
                case 245: {
                    n7 = 49;
                    break;
                }
                case 246: {
                    n7 = 240;
                    break;
                }
                case 247: {
                    n7 = 146;
                    break;
                }
                case 248: {
                    n7 = 169;
                    break;
                }
                case 249: {
                    n7 = 151;
                    break;
                }
                case 250: {
                    n7 = 203;
                    break;
                }
                case 251: {
                    n7 = 225;
                    break;
                }
                case 252: {
                    n7 = 252;
                    break;
                }
                case 253: {
                    n7 = 109;
                    break;
                }
                case 254: {
                    n7 = 165;
                    break;
                }
                default: {
                    n7 = 59;
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
            X.b[n5] = new String(cArray).intern();
        }
        return b[n5];
    }
}

