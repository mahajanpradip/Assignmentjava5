package JavaAssignment5;

public class Employee extends Person{
    protected double sal;

    public Employee(String name, int age,double sal) {
        super(name, age);
        this.sal=sal;
    }

    void work(){
        super.Display();
        System.out.println("Employee has work");
    }
    void  getSalary(){
        System.out.println("Get salary of : "+sal);
    }
}
