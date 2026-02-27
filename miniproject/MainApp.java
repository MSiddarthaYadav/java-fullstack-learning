package miniproject;

import java.util.*;

public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentService service = new StudentService();

        try {
            service.load();
        } catch (Exception e) {
            System.out.println("File load error");
        }

        while (true) {

            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. View All");
            System.out.println("3. Search");
            System.out.println("4. Delete");
            System.out.println("5. Count");
            System.out.println("6. Sort by Fee");
            System.out.println("7. Save & Exit");

            try {
                int ch = sc.nextInt();

                switch (ch) {

                    case 1:
                        System.out.print("ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Name: ");
                        String name = sc.nextLine();

                        System.out.print("Age: ");
                        int age = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Course: ");
                        String course = sc.nextLine();

                        System.out.print("Fee: ");
                        double fee = sc.nextDouble();

                        service.addStudent(new Student(id, name, age, course, fee));
                        break;

                    case 2:
                        service.viewAll();
                        break;

                    case 3:
                        System.out.print("Enter ID: ");
                        service.search(sc.nextInt());
                        break;

                    case 4:
                        System.out.print("Enter ID: ");
                        service.delete(sc.nextInt());
                        break;

                    case 5:
                        service.count();
                        break;

                    case 6:
                        service.sortByFee();
                        break;

                    case 7:
                        service.save();
                        System.out.println("Saved. Bye!");
                        System.exit(0);

                    default:
                        System.out.println("Invalid choice");
                }

            } catch (Exception e) {
                System.out.println("Invalid input!");
                sc.nextLine();
            }
        }
    }
}
