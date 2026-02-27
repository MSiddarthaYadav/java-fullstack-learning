package miniproject;

import java.io.*;
import java.util.*;

public class StudentService {

    private ArrayList<Student> students = new ArrayList<>();

    // Add student
    public void addStudent(Student s) {
        students.add(s);
        System.out.println("Student Added Successfully!");
    }

    // View all
    public void viewAll() {
        if (students.isEmpty()) {
            System.out.println("No students found!");
            return;
        }

        for (Student s : students)
            System.out.println(s);
    }

    // Search
    public void search(int id) {
        for (Student s : students) {
            if (s.getId() == id) {
                System.out.println(s);
                return;
            }
        }
        System.out.println("Student not found!");
    }

    // Delete
    public void delete(int id) {
        students.removeIf(s -> s.getId() == id);
        System.out.println("Deleted if existed.");
    }

    // Count
    public void count() {
        System.out.println("Total Students: " + students.size());
    }

    // Sort by fee
    public void sortByFee() {
        students.sort((a, b) -> Double.compare(a.getFee(), b.getFee()));
        System.out.println("Sorted by fee.");
    }

    // Save to file
    public void save() throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("students.txt"));

        for (Student s : students) {
            bw.write(s.toString());
            bw.newLine();
        }

        bw.close();
    }

    // Load from file
    public void load() throws IOException {
        File f = new File("students.txt");
        if (!f.exists()) return;

        BufferedReader br = new BufferedReader(new FileReader(f));
        String line;

        while ((line = br.readLine()) != null) {
            students.add(Student.fromString(line));
        }

        br.close();
    }
}
