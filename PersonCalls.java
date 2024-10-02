package JavaAssignment5;

public class PersonCalls {
    public static void main(String[] args) {
        Person p =new Person("Akshay",22);
        p.work();
        p.Display();
        System.out.println("===================================");
        Employee E =new Employee("Akshay",22,500000);
        E.work();
        E.getSalary();
        System.out.println("===================================");
        HRManager Hr =new HRManager("Akshay",22,500000);
        Hr.work();
        Hr.addEmployee();
    }
}
