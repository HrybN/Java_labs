class remont {
    private int tsina;
    private int chas;
    String detal;

    // прописую методи set() і get()
    public int getTsina() {
        return tsina;
    }
    public void setTsina(int tsina) {
        this.tsina = tsina * 2; //прописую автоматичне збільшення значення удвічі
    }

    public int getChas() {
        return chas;
    }
    public void setChas(int chas) {
        this.chas = chas;
    }
}