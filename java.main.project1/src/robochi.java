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

    public void zarplataVhodynu(){
        System.out.println(name+surname+"\n"
        +"Зарплата в годину: "+zarplata/robochiDni/hodynyRoboty+" гривень");
    }

    String personal(){
        return "Ремонтує: "+name + " " + surname;
    }
}
