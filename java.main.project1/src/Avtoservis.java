public class Avtoservis {

    public static void main(String[] args){

        avtomobil a1 = new avtomobil("Форд Фокус",6000,2012,2300);

        robochi rob1 = new robochi("Володимир","Ветошко",10,20000,5);

        remont rem1 = new remont(2500,12,"Ліве крило");

        a1.harakterystyka("Синій");
        System.out.println(rob1.personal());
        rem1.obsluhovuvannya();
    }

}
