public class avtomobil {
    String model;
    int rozmirBenzobaku;
    int rikVypusku;
    int vaga;

    public avtomobil(String model, int rozmirBenzobaku, int rikVypusku, int vaga) {
        this.model = model;
        this.rozmirBenzobaku = rozmirBenzobaku;
        this.rikVypusku = rikVypusku;
        this.vaga = vaga;
    }

    public void harakterystyka(String kolir){
        System.out.println("Модель автомобіля: "+model+"\n"
                +"Розмір бензобаку: "+rozmirBenzobaku+" л"+"\n"
                +"Рік випуску: "+rikVypusku+"\n"
                +"Вага: "+vaga+" кг"+"\n"
                +"Колір: "+kolir);
    }
}
