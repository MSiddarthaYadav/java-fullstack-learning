import java.util.TreeMap;
public class TreeMapDemo{
    public static void main(String[] args) {
        TreeMap<Integer,String>map=new TreeMap<>();
        map.put(3,"Three");
        map.put(2,"Two");
        map.put(1,"one");
        System.out.println(map);
    }
}