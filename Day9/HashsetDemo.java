import java.util.HashSet;
public class HashsetDemo{
    public static void main(String[] args) {
        HashSet<String>set=new HashSet<>();
        set.add("Apple");
        set.add("Mango");
        set.add("Apple");
        System.out.println(set);
    }
}