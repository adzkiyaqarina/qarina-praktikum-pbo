/*
Nama = Adzkiya Qarina Salsabila
NIM = 24060122140138
 */
import java.util.ArrayList;

public class LambdaList{
    public static void main(String[] args) {
        ArrayList<String> mahasiswaList = new ArrayList<>();
        mahasiswaList.add("Adi");
        mahasiswaList.add("Bambang");
        mahasiswaList.add("Cici");
        mahasiswaList.add("Didi");

        //lambda digunakan sebagai parameter
//        mahasiswaList.forEach((nama) -> System.out.println(nama));

        //menggunakan block statement
        mahasiswaList.forEach((nama) -> {
            System.out.println(nama);
        });
    }
}