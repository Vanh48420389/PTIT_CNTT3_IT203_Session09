class Employee {
    protected String name;
    protected double salary;

    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    public void display(){
        System.out.println("Ho va Ten :" + this.name);
        System.out.println("Luong : " + this.salary);
    }
}

class Manager extends Employee{
    private String department;


    public Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    public void display(){
        super.display();
        System.out.println("Department : " +this.department);
    }
}

public class Bai3 {
    public static void main(String[] args) {
        Manager manager = new Manager("Viet Anh", 2500, "C201");

        manager.display();
    }
}
