package org.bangundatar;

import org.poligon.Poligon;

public class SegitigaSamaSisi extends Poligon {
    private double sisi;

    public SegitigaSamaSisi(double sisi) {
        this.jumlahSisi = 3;
        this.sisi = sisi;
    }

    public double getSisi() {
        return sisi;
    }

    public double hitungLuas() {
        return (Math.sqrt(3) / 4) * sisi * sisi;
    }
}
