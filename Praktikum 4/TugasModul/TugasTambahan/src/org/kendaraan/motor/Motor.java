package org.kendaraan.motor;

import org.kendaraan.Kendaraan;

public class Motor extends Kendaraan {
    private int cc;

    public Motor(String nama, int cc) {
        super(nama);
        this.cc = cc;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Jenis: Motor, Kapasitas Mesin CC: " + cc);
    }

    public double hitungHorsepower(int angka) {
        return cc / (double) angka;
    }

    @Override
    public void klakson() {
        System.out.println(nama + " berbunyi, Womp Womp!");
    }
}
