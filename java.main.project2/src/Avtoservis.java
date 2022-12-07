public class Avtoservis {

    public static void main(String[] args){

        //проведемо ініціалізацію змінних екземплярів
        //класу із застосуванням усіх перевизначених конструкторів
        avtomobil a1 = new avtomobil(6,2012);
        avtomobil a2 = new avtomobil(a1);
        avtomobil a3 = new avtomobil();
        a3.vaga = 2000;
        a3.rikVypusku = 2007;
        a3.rozmirBenzobaku = 2;
        a3.model = "Шевроле Нива";

        robochi rob1 = new robochi("Володимир","Ветошко",10,20000,5);

        remont rem1 = new remont(2500,12,"Ліве крило");

        a1.harakterystyka("Синій");
        System.out.println(rob1.personal());
        rem1.obsluhovuvannya();

        // викликаю перевизначений метод
        robochi rob2 = new robochi("Володимир","Ветошко",10,20000,5);
        System.out.println(rob2.zarplataVhodynu() + "гривень");

        //викликаю на виконання усі новостворені методи (завдання 2)
        avtomobil avto_one = new avtomobil(3, 2001);
        avtomobil avto_two = new avtomobil(3, 2001);
        System.out.println(avto_one.equals(avto_two));
        avto_one.audit_1(avto_two);

        //викликаю рекурсивний метод
        remont rem2 = new remont(3000,12,"Права передня фара");
        System.out.println(rem2.oplata(0));
    }
}