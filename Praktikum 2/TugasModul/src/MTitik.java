class MTitik
{
    public static void main(String[] args)
    {
        Titik t1, t2, t3;
        Titik t = new Titik();

        t1 = new Titik();
        t2 = new Titik();

        t1.setAbsis(1);
        t1.setOrdinat(2);

        t2.setAbsis(3);
        t2.setOrdinat(4);

        t3 = new Titik(5, 6);

        System.out.println("Jumlah objek titik : " + Titik.getCounterTitik());
        System.out.println("Jarak pusat t1 : " + t1.getJarakPusat());

        System.out.println("\nSebelum refleksi");
        System.out.println( "t1(" + t1.getAbsis() + ", " + t1.getOrdinat() + ")" );
        System.out.println( "t2(" + t2.getAbsis() + ", " + t2.getOrdinat() + ")" );
        System.out.println( "t3(" + t3.getAbsis() + ", " + t3.getOrdinat() + ")" );

        System.out.println("\nRefleksi terhadap sumbu X");
        t.getRefleksiX(t1);
        System.out.println("t1(" + t1.getAbsis() + "," + t1.getOrdinat() + ")");
        t.getRefleksiX(t2);
        System.out.println( "t2(" + t2.getAbsis() + ", " + t2.getOrdinat() + ")" );
        t.getRefleksiX(t3);
        System.out.println( "t3(" + t3.getAbsis() + ", " + t3.getOrdinat() + ")" );

        System.out.println("\nRefleksi terhadap sumbu Y");
        t.getRefleksiY(t1);
        System.out.println("t1(" + t1.getAbsis() + "," + t1.getOrdinat() + ")");
        t.getRefleksiY(t2);
        System.out.println( "t2(" + t2.getAbsis() + ", " + t2.getOrdinat() + ")" );
        t.getRefleksiY(t3);
        System.out.println( "t3(" + t3.getAbsis() + ", " + t3.getOrdinat() + ")" );
    }
}