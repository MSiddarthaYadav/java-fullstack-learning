import java.util.ArrayList;
    public class ArrayListDemo{
        public static void main(String[] args) {
            ArrayList<String>names=new ArrayList<>();
            names.add("John");
            names.add("Paul");
            System.out.println(names);
            System.out.println(names.get(0));
            names.remove("John");
            System.out.println(names.size());
    }
}