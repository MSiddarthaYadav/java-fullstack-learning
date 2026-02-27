import java.util.LinkedList;
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String>list=new LinkedList<>();
        list.add("Java");
        list.add("Python");
        list.add("C");
        list.addFirst("Start");
        list.addLast("End");
        System.out.println(list);
    }
}