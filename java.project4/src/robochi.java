class robochi extends avtomobil{
    String name;
    String surname;
    private int hodynyRoboty;
    private int zarplata;
    private int robochiDni;

    public robochi(int b){
        super(b);
    }
    void mini_method(){
        int c = super.a * 2;
    }

    public int getHodynyRoboty() {
        return hodynyRoboty;
    }
    public void setHodynyRoboty(int hodynyRoboty) {
        this.hodynyRoboty = hodynyRoboty;
    }

    public int getZarplata() {
        return zarplata;
    }
    public void setZarplata(int zarplata) {
        this.zarplata = zarplata * 2;
    }

    public int getRobochiDni() {
        return robochiDni;
    }
    public void setRobochiDni(int robochiDni) {
        this.robochiDni = robochiDni;
    }


    private double Valute;
    public double getValute() {
        return Valute;
    }
}