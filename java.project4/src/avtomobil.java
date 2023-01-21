class avtomobil extends no_logic{
    String model;
    private int rozmirBenzobaku;
    private int rikVypusku;
    private int vaga;

    public avtomobil(int a){
        super(a);
    }

    void mega_method(){
        int b = super.a * super.a;
    }

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
        this.vaga = vaga * 2;
    }

    void method() {
        remont remont = new remont(10000);
        robochi robochi = new robochi(40);
        int prybutok = remont.getTsina() + robochi.getZarplata();
        System.out.println(prybutok + "грн");
    }
}