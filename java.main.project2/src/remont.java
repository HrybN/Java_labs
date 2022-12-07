public class remont {
    int tsina;
    int chas;
    String detal;

    public remont(int tsina, int chas, String detal) {
        this.tsina = tsina;
        this.chas = chas;
        this.detal = detal;
    }

        //рекурсивний метод (без відношення до логіки проекту)
        int oplata(int o){
            if(o == 10000){
            return 10000;
        }else{
            int res = oplata(o + 100);
                return res;
            }
        }

    public void obsluhovuvannya(){
        System.out.println("Замовлення ремонту: "+"\n"
                +"Несправна деталь: "+detal+"\n"
                +"Ціна та час ремонту: "+tsina+" гривень "+"/"+chas+" годин");
    }
}