class Kupu {
    void gerak() {}
}

class Ulat extends Kupu {
    void gerak() {
        System.out.println("ulat merayap");
    }
}

class Data<T> {
    private T isi;

    T getIsi() {
        return this.isi;
    }

    void setIsi(T x) {
        this.isi = x;
    }
}