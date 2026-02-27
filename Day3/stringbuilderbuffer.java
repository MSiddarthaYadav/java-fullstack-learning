public class stringbuilderbuffer {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Siddartha");
        sb.append("  yadav");
        System.out.println(sb);
        sb.insert(10," hey");
        System.out.println(sb);
        sb.replace(10,14,"hello");
        System.out.println(sb);
        sb.delete(10,15);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
    }
}
