import java.io.*;
public class DeletefileDemo{
    public static void main(String[] args) {
        try {
            new File("data.txt").delete();
            System.out.println("Deleted");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}