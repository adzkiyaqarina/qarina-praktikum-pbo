/*
Nama = Adzkiya Qarina Salsabila
NIM = 24060122140138
 */
import java.util.HashMap;
import java.util.Map;

public class LambdaMap{
    public static void main(String[] args){
        Map<String, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("24060122140138 :", "Qarina" );
        mahasiswaMap.put("24060122130085 :", "Meyta" );
        mahasiswaMap.put("24060122140169 :", "Lala" );
        mahasiswaMap.put("24060122120037:", " Widia" );;

        //lambda digunakan sebagai paramener
        mahasiswaMap.forEach((nim, nama) -> System.out.println(nim + nama));
    }
}