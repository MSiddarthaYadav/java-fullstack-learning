class Student {
    int id;
    String name;

    // 1) Default Constructor
    Student() {
        System.out.println("Default Constructor Called");
        id = 0;
        name = "Unknown";
    }

    // 2) Parameterized Constructor
    Student(int id) {
        System.out.println("Parameterized Constructor Called");
        this.id = id;
        name = "Not Given";
    }

    // 3) Constructor Overloading (2 parameters)
    Student(int id, String name) {
        System.out.println("Constructor Overloading Called");
        this.id = id;       // this keyword
        this.name = name;   // this keyword
    }

    void show() {
        System.out.println("ID: " + id + ", Name: " + name);
        System.out.println("----------------------");
    }
}

public class AllConstructortypes {
    public static void main(String[] args) {

        // Default Constructor
        Student s1 = new Student();
        s1.show();

        // Parameterized Constructor
        Student s2 = new Student(101);
        s2.show();

        // Constructor Overloading
        Student s3 = new Student(102, "Siddartha");
        s3.show();
    }
}
