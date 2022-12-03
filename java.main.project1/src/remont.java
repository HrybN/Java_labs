public class remont {
    int tsina;
    int chas;
    String detal;

    public remont(int tsina, int chas, String detal) {
        this.tsina = tsina;
        this.chas = chas;
        this.detal = detal;
    }

    public void obsluhovuvannya(){
        System.out.println("Замовлення ремонту: "+"\n"
        +"Несправна деталь: "+detal+"\n"
        +"Ціна та час ремонту: "+tsina+" гривень "+"/"+chas+" годин");
    }

}
