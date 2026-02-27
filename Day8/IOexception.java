import java.io.*;
public class IOexception{
    public static void main(String[] args){
        try{
            FileReader F=new FileReader("abc.txt");
        }
        catch(IOException e){
            System.out.println("IO Exception occured");
        }
    }
}