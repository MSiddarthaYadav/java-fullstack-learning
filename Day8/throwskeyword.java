import java.io.*;

public class throwskeyword {

    static void readFile() throws IOException {
        FileReader f = new FileReader("abc.txt");
    }

    public static void main(String[] args) {

        try {
            readFile();   // calling method
        }
        catch(IOException e) {
            System.out.println("File not found");
        }
    }
}
