import java.io.*;
public class Createfile{
    public static void main(String[] args) {
        try {
            new File("data.txt").createNewFile();
            System.out.println("File Created");   
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}