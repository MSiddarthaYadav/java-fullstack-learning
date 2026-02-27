package miniproject;

public class Student {

    private int id;
    private String name;
    private int age;
    private String course;
    private double fee;

    // Constructor
    public Student(int id, String name, int age, String course, double fee) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
        this.fee = fee;
    }

    // Getters
    public int getId() {
        return id;
    }

    public double getFee() {
        return fee;
    }

    // Convert object -> String (save to file)
    public String toString() {
        return id + "," + name + "," + age + "," + course + "," + fee;
    }

    // Convert String -> object (load from file)
    public static Student fromString(String line) {
        String[] p = line.split(",");
        return new Student(
                Integer.parseInt(p[0]),
                p[1],
                Integer.parseInt(p[2]),
                p[3],
                Double.parseDouble(p[4])
        );
    }
}
