import java.util.ArrayList;
import java.util.Collections;
public class CollectionsDemo{
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(40);
        list.add(10);
        list.add(30);
        Collections.sort(list);
        int max = Collections.max(list);
        int min = Collections.min(list);
        System.out.println(list);
        System.out.println(max);
        System.out.println(min);
    }
}