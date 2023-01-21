public class client {
    static double groshi;
    static double chas_clienta = 24;

    static {
        groshi = chas_clienta * 10;
    }
    static double borg() {
        double b;
        remont remont = new remont(10000);
        b = groshi - remont.getTsina();
        return b;
    }
    static void zapiznennya(){
        remont remont = new remont(10000);
        double zap = chas_clienta - remont.getChas();
        System.out.println(zap);
    }
}
