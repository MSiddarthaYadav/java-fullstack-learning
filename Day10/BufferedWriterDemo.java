import java.io.*;
public class BufferedWriterDemo{
    public static void main(String[] args) {
        try { 
            BufferedWriter bw = new BufferedWriter(new FileWriter("data.txt"));
            bw.write("Buffered writing example");
            bw.close();
            System.out.println("hi");
        }
        catch(Exception e){
            System.out.println(e);
        }
        }
}