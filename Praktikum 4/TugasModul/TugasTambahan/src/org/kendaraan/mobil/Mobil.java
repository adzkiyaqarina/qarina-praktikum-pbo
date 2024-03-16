package org.kendaraan.mobil;

import org.kendaraan.Kendaraan;

public class Mobil extends Kendaraan {
    private int jumlahPintu;

    public Mobil(String nama, int jumlahPintu) {
        super(nama);
        this.jumlahPintu = jumlahPintu;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Jenis: Mobil, Jumlah Pintu: " + jumlahPintu);
    }

    public void bukaPintu(int nomorPintu) {
        System.out.println("Pintu nomor " + nomorPintu + " terbuka");
    }

    @Override
    public void klakson() {
        System.out.println(nama + " berbunyi, Vroom Vroom!");
    }
}
