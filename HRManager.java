package JavaAssignment5;

public class HRManager extends Employee {


    public HRManager(String name, int age, double sal) {
        super(name, age, sal);
    }

    void work(){
        super.Display();
        System.out.println("is a HrManager ");
    }
    void  addEmployee(){
        System.out.println("Hr adding new Employee" );
    }
}
