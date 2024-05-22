import java.io.*;
class Personn implements Serializable {
    private String name;
    public Personn(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
}

public class SerializePerson{
    public static void main(String[] args){
        Personn person = new Personn("Panji");
        try{
            FileOutputStream f = new FileOutputStream("person.ser");
            ObjectOutputStream s = new ObjectOutputStream(f);
            s.writeObject(person);
            System.out.println("selesai menulis objek person");
            s.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
