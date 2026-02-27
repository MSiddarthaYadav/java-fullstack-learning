public class strings{
    public static void main(String[] args) {
//String methods
        String name=new String("siddartha yadav");
        System.out.println(name + " hello");
        System.out.println(name);
        System.out.println(name.charAt(4));
        System.out.println(name.concat(" yadav"));
        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.substring(3,7));
        System.out.println(name.contains("sid"));
        System.out.println(name.trim());
        System.out.println(name.startsWith("sid"));
        System.out.println(name.endsWith("tha"));
        System.out.println(name.replace("yadav","m"));
//String is Immutable
        String s1="Good";
        String s2="morning";
        System.out.println(s1+s2);
        String s3= s1+"evening";
        System.out.println(s3);
//split method
        String A = "Java,Python,SQL,HTML";
        String[] B = A.split(",");
        for (String C : B) {
            System.out.println(C);
        }
    }
}