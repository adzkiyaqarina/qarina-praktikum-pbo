public class BangunDatarGeneric<T extends BangunDatar>{
    private T bangunDatar;

    public void set(T tipeBangunDatar){
        bangunDatar = tipeBangunDatar;
    }

    public T get(){
        return bangunDatar;
    }

    public double hitungKeliling(){
        return bangunDatar.hitungKeliling();
    }
}

/*
Jawaban:
    T adalah naming dari parameter generic standarisasi, walaupun
    diganti menjadi T1, T2, T1234, tetap akan berjalan dengan baik tanpa mempengaruhi
    fungsionalitas tersebut.
*/