package org.main;

import org.kendaraan.Kendaraan;
import org.kendaraan.mobil.Mobil;
import org.kendaraan.motor.Motor;
import org.kendaraan.truk.Truk;

public class MKendaraan {
    public static void main(String[] args) {
        Kendaraan kendaraan = new Kendaraan("Kendaraan Nathan");
        Mobil mobil = new Mobil("Bugatti Chiron", 2);
        Motor motor = new Motor("Ducati Panigale V4 R", 998);
        Truk truk = new Truk("Mercedes-Benz Actros", 20);

        kendaraan.klakson(); // output: Kendaraan Nathan berbunyi
        mobil.klakson(); // output: Bugatti Chiron berbunyi, Vroom Vroom!
        motor.klakson(); // output: Ducati Panigale V4 R berbunyi, Womp Womp!
        truk.klakson(); // output: Mercedes-Benz Actros berbunyi, Honk Honk!
    }
}
