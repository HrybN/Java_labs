public class no_logic {
    final double a = 100;
    double b;

    public no_logic(double b){
        this.b = b;
    }

    double num() {
        double c = 0;
        if (b == 100) {
            c = a * 2;
        }
        return c;
    }
}
