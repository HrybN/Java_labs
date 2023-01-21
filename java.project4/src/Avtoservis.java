public class Avtoservis {

    public static void main(String[] args) {

        avtomobil avto1 = new avtomobil(10);
        avto1.mega_method();

        avto1.setVaga(2000);
        System.out.println(avto1.getVaga());
        avto1.setRikVypusku(2007);
        System.out.println(avto1.getRikVypusku());
        avto1.setRozmirBenzobaku(2);
        System.out.println(avto1.getRozmirBenzobaku());
        avto1.model = "Ford Focus";
        System.out.println(avto1.model);

        //
        remont rem1 = new remont(10000);
        no_logic nl = new no_logic(rem1.getTsina());

        System.out.println(nl.prosto_method());
        System.out.println(nl.no_logic_method());

        System.out.println(nl.prosto_method2_demo());
        System.out.println(nl.no_logic_method2());

        rem1.setTsina(10000);
        System.out.println(rem1.getTsina());
        rem1.setChas(48);
        System.out.println(rem1.getChas());
        rem1.detal = "Lobove Sklo";
        System.out.println(rem1.detal);

        robochi rob1 = new robochi(40);
        rob1.mini_method();

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
        avto1.method();

        System.out.println(client.groshi);
        System.out.println(client.borg());
        client.zapiznennya();
    }
}
