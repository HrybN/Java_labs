public class client {   // Завдання 3
    static double groshi;
    static double chas_clienta = 24;

    static {
        groshi = chas_clienta * 10;
    }
    static double borg() {
        double b;
        remont remont = new remont();
        b = groshi - remont.getTsina();
        return b;
    }
    static void zapiznennya(){
        remont remont = new remont();
        double zap = chas_clienta - remont.getTsina();
        System.out.println(zap + "hours");
    }
}
