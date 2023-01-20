class robochi {
    String name;
    String surname;
    private int hodynyRoboty;
    private int zarplata;
    private int robochiDni;

    // прописую методи set() і get()
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
        this.zarplata = zarplata * 2; //прописую автоматичне збільшення значення удвічі
    }

    public int getRobochiDni() {
        return robochiDni;
    }
    public void setRobochiDni(int robochiDni) {
        this.robochiDni = robochiDni;
    }

    // Завдання 2
    private double Valute;
        robochi(double Valute){
            this.Valute = Valute;
        }
        double dollars(){
            double d;
            d = zarplata / Valute;
            return d;
        }
    public double getValute() {
        return Valute;
    }
    public void setValute(double Valute) {
        this.Valute = Valute;
    }



    // перевизначений метод, що повертає значення заробітньої плати в годину
    int zarplataVhodynu(int zarplata, int robochiDni, int hodynyRoboty){
        int zVh = zarplata / robochiDni / hodynyRoboty;
        return zVh;
    }

    String personal(){
        return "Ремонтує: "+name + " " + surname;
    }
}
