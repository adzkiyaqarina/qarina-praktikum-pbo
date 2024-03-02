package org.walimahasiswa;

public class WaliMahasiswa {
    private String nomorHp;
    private String alamat;

    public WaliMahasiswa(String nama, String nik, String nomorHp, String alamat) {
        this.nomorHp = nomorHp;
        this.alamat = alamat;
    }

    public String getNomorHp() {
        return nomorHp;
    }

    public void setNomorHp(String nomorHp) {
        this.nomorHp = nomorHp;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}
