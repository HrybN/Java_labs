public class Avtoservis {

    public static void main(String[] args) {

        avtomobil avto1 = new avtomobil();

        avto1.setVaga(2000);
        System.out.println(avto1.getVaga());
        avto1.setRikVypusku(2007);
        System.out.println(avto1.getRikVypusku());
        avto1.setRozmirBenzobaku(2);
        System.out.println(avto1.getRozmirBenzobaku());
        avto1.model = "Ford Focus";
        System.out.println(avto1.model);

        remont rem1 = new remont();

        rem1.setTsina(10000);
        System.out.println(rem1.getTsina());
        rem1.setChas(48);
        System.out.println(rem1.getChas());
        rem1.detal = "Lobove Sklo";
        System.out.println(rem1.detal);

        robochi rob1 = new robochi(40);

        rob1.setHodynyRoboty(20);
        System.out.println(rob1.getHodynyRoboty());
        rob1.setZarplata(6000);
        System.out.println(rob1.getZarplata());
        rob1.setRobochiDni(5);
        System.out.println(rob1.getRobochiDni());
        rob1.name = "Andriy";
        System.out.println(rob1.name);
        rob1.surname = "Normal";
        System.out.println(rob1.surname);

        rob1.getValute();
        // викликаю метод
        avto1.method();

        // Завдання 3
        System.out.println(client.groshi);
        System.out.println(client.borg());
        client.zapiznennya();

        no_logic nl = new no_logic(10);
        System.out.println(nl.b);
        System.out.println(nl.num());
    }
}