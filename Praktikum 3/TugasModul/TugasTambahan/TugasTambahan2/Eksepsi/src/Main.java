public class Main {
    public static void main(String[] args) {
        Anggota anggota = new Anggota("Prabroro");
        Buku buku1 = new Buku("Java Programming");
        Buku buku2 = new Buku("Python Basics");
        Buku buku3 = new Buku("Data Structures");
        Buku buku4 = new Buku("Algorithms");

        try {
            anggota.pinjamBuku(buku1);
            anggota.pinjamBuku(buku2);
            anggota.pinjamBuku(buku3);
            anggota.pinjamBuku(buku4);
            buku2.setTersedia(false);
        } catch (MaksimumBukuTerpinjamException e) {
            System.out.println("Gagal meminjam buku: " + e.getMessage());
        } catch (BukuTidakTersediaException e) {
            System.out.println("Gagal meminjam buku: " + e.getMessage());
        }
    }
}