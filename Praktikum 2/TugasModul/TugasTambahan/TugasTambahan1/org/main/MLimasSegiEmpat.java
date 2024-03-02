package org.main;

import org.bangunruang.LimasSegiempat;

public class MLimasSegiEmpat {
    public static void main(String[] args) {
        LimasSegiempat limas = new LimasSegiempat(5, 10);
        double luasPermukaan = limas.hitungLuasPermukaan();
        double volume = limas.hitungVolume();

        System.out.println("Luas Permukaan Limas Segiempat: " + luasPermukaan);
        System.out.println("Volume Limas Segiempat: " + volume);
    }
}
