
class Lingkaran {
    private double jariJari;
    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }
    public double hitungKeliling() {
        double keliling = 2 * Math.PI * jariJari;
        return keliling;
    }
}
public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = 0;
        assert(jariJari > 0) : "jari jari tidak boleh nol!!!";
        Lingkaran lingkaran = new Lingkaran(jariJari);
        double kelilingLingkaran = lingkaran.hitungKeliling();
        System.out.println("keliling lingkaran = " + kelilingLingkaran);
    }
}

/*
Pertanyaan :
Secara konsep, ada yang kurang tepat pada program Asersi2 di atas?

Jawaban :
Secara umum, konsep program Asersi2 sudah tepat. Namun, ada satu hal yang kurang tepat yaitu pada saat penggunaan assert.
Pada program tersebut, assert digunakan untuk memastikan bahwa jariJari > dari nol sebelum objek Lingkaran dibuat. Namun,
secara default, assert akan dinonaktifkan pada waktu runtime. Oleh karena itu, kondisi jariJari>0 tidak akan dicek pada
waktu program dijalankan.
Untuk memastikan kondisi tersebut selalu terpenuhi, kita bisa menggunakan mekanisme exception (eksepsi). Asersi biasanya
digunakan untuk tujuan debugging dan pengujian dan seharusnya tidak digunakan untuk penanganan kesalahan dalam
kode produksi. Dalam kode produksi, disarankan untuk menggunakan mekanisme penanganan kesalahan yang sesuai yaitu eksepsi, untuk
menangani kesalahan dan kondisi yang tidak terduga yang mungkin terjadi selama eksekusi program karena konsep dari asersi merupakan
bukan bagian dari implementasi digunakan untuk keperluan debugging, semestinya tidak digunakan untuk mengubah state dari objek.
*/
