import java.io.*;
public class FileOutputStreamDemo{
    public static void main(String[] args) {
        try{
            FileOutputStream fos=new FileOutputStream("data.txt");
            fos.write("ByteStream".getBytes());
            fos.close();
            System.out.println("Done");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}