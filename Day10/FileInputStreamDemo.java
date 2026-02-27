import java.io.*;
public class FileInputStreamDemo{
    public static void main(String[] args) {
        try {
            FileInputStream fis=new FileInputStream("data.txt");
            System.out.println(new String(fis.readAllBytes()));
        fis.close();   
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}