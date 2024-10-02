//5.Implement Multilevel Inheritance with Method Overriding
//        Create a base class Person.Create a subclass Employee that extends Person, and includes the methods
//        work() and getSalary().Create another subclass HRManager that extends Employee,
//        overrides the work() method, and adds a new method addEmployee() to simulate adding employees.

package JavaAssignment5;

public class Person {
    protected String name;
    protected int age;
    public Person(String name,int age) {
        this.name = name;
        this.age=age;

    }
  void Display(){
      System.out.println("Name: "+name+"\nAge: "+age);
  }
   void work(){
       System.out.println("Doing work");
   }

}
