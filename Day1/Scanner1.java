import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = sc.nextLine();

        System.out.println("Enter your age:");
        int age = sc.nextInt();

        System.out.println("Enter your CGPA:");
        double cgpa = sc.nextDouble();

        System.out.println("-----Output------");
        System.out.println("name: " + name);
        System.out.println("age: " + age);
        System.out.println("cgpa: " + cgpa);

        sc.close();
    }
}
