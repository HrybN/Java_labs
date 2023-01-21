class remont {
    private int tsina;
    private int chas;
    String detal;

    remont(int tsina){
        this.tsina = tsina;
    }

    double prosto_method(){
        double pm;
        pm = tsina + chas;
        return pm;
    }
    private double prosto_method2(){
        double pm2;
        pm2 = tsina - chas;
        return pm2;
    }
    double prosto_method2_demo(){
        double pm2demo = prosto_method2();
        return pm2demo;
    }


    public int getTsina() {
        return tsina;
    }
    public void setTsina(int tsina) {
        this.tsina = tsina * 2;
    }

    public int getChas() {
        return chas;
    }
    public void setChas(int chas) {
        this.chas = chas;
    }
}
