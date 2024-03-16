package org.kendaraan.truk;

import org.kendaraan.Kendaraan;

public class Truk extends Kendaraan {
    private int kapasitasMuatan;
    private int beratMuatan;

    public Truk(String nama, int kapasitasMuatan) {
        super(nama);
        this.kapasitasMuatan = kapasitasMuatan;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Jenis: Truk, Kapasitas Muatan: " + kapasitasMuatan + " ton");
        System.out.println("Berat Muatan: " + beratMuatan + " ton");
    }

    public void muatBarang(int berat) {
        if (beratMuatan + berat <= kapasitasMuatan) {
            beratMuatan += berat;
        } else {
            System.out.println("Kapasitas muatan terlampaui!");
        }
    }

    @Override
    public void klakson() {
        System.out.println(nama + " berbunyi, Honk Honk!");
    }
}
