import java.util.LinkedHashSet;
    public class LinkedHashSetDemo{
        public static void main(String[] args) {
            LinkedHashSet<Integer> set=new LinkedHashSet<>();
            set.add(3);
            set.add(1);
            set.add(2);
            System.out.println(set);
        }
    }