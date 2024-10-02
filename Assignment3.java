//Create a class 'Student' with three data members which are name, age and address.
//        The constructor of the class assigns default values name as "unknown", age as '0'
//        and address as "not available". It has two
//        Members with the same name 'setInfo'. First method has two
//        parameters for name and age and assigns the same whereas the second method takes has three
//        parameters which are assigned to name, age and address respectively. Print the name, age and address of 10 students.
//        Hint-Use array of objects.

package JavaAssignment5;

public class Assignment3 {

   private int age;
    private String name;
    private String address;


    public Assignment3(){
        age=0;
        name="Unknown";
        address="Not available";
    }

    void setInfo(int age,String name){
        this.age=age;
        this.name=name;
    }
    void setInfo(int age,String name,String address){
        this.age=age;
        this.name=name;
        this.address=address;
    }
    void displayinfo(){
        System.out.println("Name of the student is "+name);
        System.out.println("Age of the student is "+age);
        System.out.println("Address of student  "+address);
        System.out.println("===========================");
    }


public static void main(String[]args) {
    Assignment3 s[] = new Assignment3[10];
    for (int i = 0; i < s.length; i++) {
        s[i] = new Assignment3();
    }
    s[0].setInfo(20, "Akshay");
    s[1].setInfo(25, "Akasashay", "pune");
    s[2].setInfo(21, "Akshasay");
    s[3].setInfo(28, "Akshay", "dehli");
    s[4].setInfo(27, "Akshay");
    s[5].setInfo(24, "Akshay", "indapur");
    s[6].setInfo(26, "Akshay");
    s[7].setInfo(23, "Akshay", "Baramati");
    s[8].setInfo(22, "Akshay");
    s[9].setInfo(20, "Akshay", "nhavi");

    for (int i = 0; i < 10; i++) {
        s[i].displayinfo();
    }
}
        }






