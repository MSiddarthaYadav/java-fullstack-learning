import java.io.*;
public class BufferedReaderDemo{
    public static void main(String[] args) {
        try {
            BufferedReader br= new BufferedReader(new FileReader("data.txt"));
            System.out.println(br.readLine());  
            br.close();
        }
        catch(Exception e){
            System.out.println(e);
        }   
     }
}