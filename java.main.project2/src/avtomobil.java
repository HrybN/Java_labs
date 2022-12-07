public class avtomobil {
    String model;
    int rozmirBenzobaku;
    int rikVypusku;
    int vaga;

    // генерований конструктор
    public avtomobil(int rozmirBenzobaku, int rikVypusku) {
        this.model = model;
        this.rozmirBenzobaku = rozmirBenzobaku;
        this.rikVypusku = rikVypusku;
        this.vaga = vaga;
    }
    // перевизначений конструктор, яким передбачено
    // створення клону існуючого екземпляра класу
    public avtomobil(avtomobil avto) {
        model = avto.model;
        rozmirBenzobaku = avto.rozmirBenzobaku;
        rikVypusku = avto.rikVypusku;
        vaga = avto.vaga;
    }
    // перевизначений конструктор, що не
    // приймає жодного параметру
    public avtomobil() {
    }

    public void harakterystyka(String kolir){
        System.out.println("Модель автомобіля: "+model+"\n"
                +"Розмір бензобаку: "+rozmirBenzobaku+" л"+"\n"
                +"Рік випуску: "+rikVypusku+"\n"
                +"Вага: "+vaga+" кг"+"\n"
                +"Колір: "+kolir);
    }

    //метод, який в якості параметру приймає
    // екземпляр того ж класу
    boolean audit (avtomobil a){
        if (a.model == model && a.vaga == vaga &&
        a.rozmirBenzobaku == rozmirBenzobaku
        && a.rikVypusku == rikVypusku) return true;
        else return false;
    }
    void audit_1 (avtomobil a) {
        if (a.vaga == vaga) {
            System.out.println("Рівність підтверджена");
        }else{
            System.out.println("Рівність НЕ підтверджена");
        }
    }

}
