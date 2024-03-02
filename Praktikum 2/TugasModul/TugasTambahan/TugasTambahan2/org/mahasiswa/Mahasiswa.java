package org.mahasiswa;

import org.walimahasiswa.WaliMahasiswa;

public class Mahasiswa {
    private String nim;
    private String jurusan;
    private WaliMahasiswa wali;

    public Mahasiswa(String nama, String nik, String nim, String jurusan, WaliMahasiswa wali) {
        this.nim = nim;
        this.jurusan = jurusan;
        this.wali = wali;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public WaliMahasiswa getWali() {
        return wali;
    }

    public void setWali(WaliMahasiswa wali) {
        this.wali = wali;
    }

    public void cetak() {
        System.out.println("NIM: " + nim);
        System.out.println("Jurusan: " + jurusan);
        System.out.println("Wali Mahasiswa:");
        System.out.println("  Nomor HP: " + wali.getNomorHp());
        System.out.println("  Alamat: " + wali.getAlamat());
    }
}
