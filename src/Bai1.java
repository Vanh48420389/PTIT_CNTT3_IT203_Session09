class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}

class Student extends Person {
    private String studentId;
    private double gpa;

    public Student(String name, int age, String studentId, double gpa) {
        super(name, age);
        this.studentId = studentId;
        this.gpa = gpa;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("ID: " + this.studentId);
        System.out.println("GPA: " + this.gpa);
    }
}

public class Bai1 {
    public static void main(String[] args) {
        Student s1 = new Student("Nguyen Van A", 20, "B20DCCN001", 3.5);

        s1.display();
    }
}