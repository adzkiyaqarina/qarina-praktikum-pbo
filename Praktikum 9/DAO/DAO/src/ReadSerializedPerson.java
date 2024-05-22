import java.io.*;
public class ReadSerializedPerson {
    public static void main(String[] args){
        Personn person = null;
        try{
            FileInputStream f = new FileInputStream("person.ser");
            ObjectInputStream s = new ObjectInputStream(f);
            person = (Personn)s.readObject();
            s.close();
            System.out.println("serialized person name = "+person.getName());
        }catch (Exception ioe){
            ioe.printStackTrace();
        }
    }
}
