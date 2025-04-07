import java.util.*;

class Student implements Comparable<Student> {
    int rollNo;
    String name;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    // Implement compareTo method (sort by roll number)
    @Override
    public int compareTo(Student other) {
        return this.rollNo - other.rollNo; // Ascending order
    }

    @Override
    public String toString() {
        return rollNo + " - " + name;
    }
}

public class LambdaComparable {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(103, "Alice"));
        students.add(new Student(101, "Bob"));
        students.add(new Student(102, "Charlie"));

        Collections.sort(students); // Uses Comparable (compareTo method)

        System.out.println("Sorted by roll number:");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
