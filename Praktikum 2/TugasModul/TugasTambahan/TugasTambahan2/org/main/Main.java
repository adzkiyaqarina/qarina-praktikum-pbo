package org.main;

import org.mahasiswa.Mahasiswa;
import org.walimahasiswa.WaliMahasiswa;

public class Main {
    public static void main(String[] args) {
        WaliMahasiswa wali = new WaliMahasiswa("Fulan", "12345678", "081997279788", "Alamat Wali");
        Mahasiswa mahasiswa = new Mahasiswa("Adzkiya Qarina", "Mahasiswa NIK", "24060122140138", "Informatika", wali);
        mahasiswa.cetak();
    }
}
