import java.io.FileNotFoundException;
import java.io.FileReader;
public class checkedexceptions{
    public static void main(String[] args) {
        try {
            FileReader File =new FileReader("test.txt");
            System.out.println("File opened successfully");
        }
        catch(FileNotFoundException e){
            System.out.println("File Not Found");
        }
    }
}