import java.io.*;
public class Appendfile{
    public static void main(String[] args) {
        try{
            FileWriter fw=new FileWriter("data.txt",true);
            fw.write("\n Java Full Stack");
            fw.close();
            System.out.println("File Appended");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}