package org.kendaraan;

public class Kendaraan {
    private String nama;
    private int kecepatan;

    public Kendaraan(String nama) {
        this.nama = nama;
    }

    public void cetakInfo() {
        System.out.println("Nama: " + nama + ", Jenis: Kendaraan, Kecepatan: " + kecepatan + " km/h");
    }

    public void gas(int kecepatan, int durasi) {
        this.kecepatan += kecepatan * durasi;
    }

    public void berhenti() {
        kecepatan = 0;
    }

    public void klakson() {
        System.out.println(nama + " berbunyi");
    }
}