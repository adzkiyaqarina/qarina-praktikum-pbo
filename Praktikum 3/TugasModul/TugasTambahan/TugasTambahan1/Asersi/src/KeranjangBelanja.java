//Nama: Adzkiya Qarina Salsabila
//NIM: 24060122140138
//Lab: C2

public class KeranjangBelanja {
    private String[] keranjang;
    private int count;

    public KeranjangBelanja() {
        keranjang = new String[5];
        count = 0;
    }

    public void addItem(String item) {
        assert count < keranjang.length : "Keranjang sudah penuh";
        keranjang[count++] = item;
    }

    public void printItems() {
        for (int i = 0; i < keranjang.length; i++) {
            System.out.println(keranjang[i]);
        }
    }
}
