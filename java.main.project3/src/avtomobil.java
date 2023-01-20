 class avtomobil {
     String model;
     private int rozmirBenzobaku;
     private int rikVypusku;
     private int vaga;

     // прописую методи set() і get()
     public int getRozmirBenzobaku() {
         return rozmirBenzobaku;
     }

     public void setRozmirBenzobaku(int rozmirBenzobaku) {
         this.rozmirBenzobaku = rozmirBenzobaku;
     }

     public int getRikVypusku() {
         return rikVypusku;
     }

     public void setRikVypusku(int rikVypusku) {
         this.rikVypusku = rikVypusku;
     }

     public int getVaga() {
         return vaga;
     }

     public void setVaga(int vaga) {
         this.vaga = vaga * 2; //прописую автоматичне збільшення значення удвічі
     }

     // прописую метод із довільною логікою, який в якості параметрів або внутрішніх змінних
     // використовує змінну екземплярів інших двох класів
     void method() {
         remont remont = new remont();
         robochi robochi = new robochi(40);
         int prybutok = remont.getTsina() + robochi.getZarplata();
         System.out.println(prybutok + "грн");
     }


         avtomobil(int rozmirBenzobaku, int rikVypusku) {
        this.model = model;
        this.rozmirBenzobaku = rozmirBenzobaku;
        this.rikVypusku = rikVypusku;
        this.vaga = vaga;
    }

    avtomobil(avtomobil avto) {
        model = avto.model;
        rozmirBenzobaku = avto.rozmirBenzobaku;
        rikVypusku = avto.rikVypusku;
        vaga = avto.vaga;
    }

    avtomobil() {
    }

    void harakterystyka(String kolir){
        System.out.println("Модель автомобіля: "+model+"\n"
                +"Розмір бензобаку: "+rozmirBenzobaku+" л"+"\n"
                +"Рік випуску: "+rikVypusku+"\n"
                +"Вага: "+vaga+" кг"+"\n"
                +"Колір: "+kolir);
    }


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