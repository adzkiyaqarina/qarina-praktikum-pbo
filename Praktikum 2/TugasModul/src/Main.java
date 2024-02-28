public class Main {
    public static void main(String[] args) {
        Titik titikAwal = new Titik(1, 2);
        Titik titikAkhir = new Titik(7, 3);

        Garis g1 = new Garis(titikAwal, titikAkhir);

        double panjangGaris = g1.getPanjang();
        System.out.println("Panjang garis g1: " + panjangGaris);
    }

}
