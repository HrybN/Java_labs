public class robochi {
    String name;
    String surname;
    int hodynyRoboty;
    int zarplata;
    int robochiDni;

    public robochi(String name, String surname, int hodynyRoboty, int zarplata, int robochiDni) {
        this.name = name;
        this.surname = surname;
        this.hodynyRoboty = hodynyRoboty;
        this.zarplata = zarplata;
        this.robochiDni = robochiDni;
    }

    double zarplataVhodynu() {
        double zVh;
        zVh = zarplata / robochiDni / hodynyRoboty;
        return zVh;
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