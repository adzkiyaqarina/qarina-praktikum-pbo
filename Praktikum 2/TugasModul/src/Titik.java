class Titik {
    //atribut
    private double absis, ordinat;
    private static double counterTitik;

    //overload constructor baru
    //karena ada parameternya maka bisa diakses langsung di main
    public Titik(double a, double o)
    {
        this.absis = a;
        this.ordinat = o;
        counterTitik++;
    }

    public Titik()
    {
        this(0,0);
    }

    public double getJarakPusat() {
        return Math.sqrt((absis * absis) + (ordinat * ordinat));
    }

    private void refleksiSumbuX (Titik titik) {
        double ordinat = titik.getOrdinat();
        ordinat = ordinat * -1;
        titik.setOrdinat(ordinat);
    }

    private void refleksiSumbuY (Titik titik) {
        double absis = titik.getAbsis();
        absis = absis * -1;
        titik.setAbsis(absis);
    }

    public Titik getRefleksiX (Titik titik) {
        refleksiSumbuX(titik);
        return titik;
    }

    public Titik getRefleksiY (Titik titik) {
        refleksiSumbuY(titik);
        return titik;
    }

    public void setAbsis(double a)
    {
        absis = a;
    }

    public double getAbsis()
    {
        return absis;
    }

    public void setOrdinat(double o)
    {
        ordinat = o;
    }

    public double getOrdinat()
    {
        return ordinat;
    }

    static double getCounterTitik()
    {
        return counterTitik;
    }
}
