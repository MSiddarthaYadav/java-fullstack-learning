import java.io.*;

public class ReadFile {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("data.txt");
            byte[] b = fis.readAllBytes();
            System.out.println(new String(b));
            fis.close();
            System.out.println("Done");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
