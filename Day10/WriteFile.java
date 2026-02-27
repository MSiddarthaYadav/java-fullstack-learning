import java.io.*;
public class WriteFile{
    public static void main(String[] args) {
        try {
            FileWriter fw=new FileWriter("data.txt");
            fw.write("Hello John");
            fw.close();
            System.out.println("File Written");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}