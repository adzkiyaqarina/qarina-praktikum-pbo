public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException{
        if(angka == 13){
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial");
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        //blok try untuk menangkap eksepsi
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        }
        catch(AngkaSialException ase){ //jika eksepsi terjadi line kode ini akan dieksekusi
            //method getMessage() untuk mendapatkan pesan dari exception
            //method getmessage() telah ada di class Exception
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }
}
/*
1.  Pertanyaan :
    Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi?
    Jawab :
    Tidak, ketika eksepsi terjadi maka baris ke 12 pada soal atau baris 6 disini tidak dieksekusi
    karena ketika eksepsi terjadi maka program tersebut berhenti dan dilemparkan lalu
    akan ditangkap oleh blok catch dengan mengeluarkan pesan sesuai yang ada pada (AngkaSialException ase)
    lalu melaksanakan method .getMessage().
    Lalu akan mengeularkan pesan ouput juga yaitu "hati-hati memasukkan angka!!!" karena masih
    bagian dari catch tersebut dan mengikuti code di klausa catch dan tidak melaksanakan baris 12 (baris 6).

2.  Pertanyaan :
    Apakah baris 21 pada angkaSial.java di atas dieksekusi?
    Jawab :
    Baris 21 pada soal atau baris 17 disini akan dieksekusi apabila eksepsi terjadi. Hal ini dikarenakan
    ketika metode cobaAngka(13) melakukan throw AngkaSialException, sesuai dengan klausa if else maka akan
    segera dialihkan ke blok catch yang menangani pengecualian ini. Sisa pernyataan dalam blok try setelah
    pernyataan yang melempar pengecualian tidak akan dieksekusi.
    as.cobaAngka(12) tidak akan dieksekusi karena etika ditemukan ekspresi maka program tersebut akan didetermasi
*/