package org.bangunruang;

import org.bangundatar.SegitigaSamaSisi;

public class LimasSegiempat {
    private double sisiAlas;
    private double tinggiSegitiga;

    public LimasSegiempat(double sisiAlas, double tinggiSegitiga) {
        this.sisiAlas = sisiAlas;
        this.tinggiSegitiga = tinggiSegitiga;
    }

    public double hitungLuasPermukaan() {
        SegitigaSamaSisi segitiga = new SegitigaSamaSisi(sisiAlas);
        double luasAlas = sisiAlas * sisiAlas;
        double luasSegitiga = segitiga.hitungLuas();
        return luasAlas + 4 * luasSegitiga;
    }

    public double hitungVolume() {
        double luasAlas = sisiAlas * sisiAlas;
        return (luasAlas * tinggiSegitiga) / 3;
    }
}
