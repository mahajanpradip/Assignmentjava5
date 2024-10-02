//2.    Create a class to print the area of a square and a rectangle.The class has two methods ‘printArea’
//        and ‘printPerimeter’ with the same name but different number of parameters.
//        The method for printing area of Rectangle has two parameters which are length and breadth respectively while
//        the other method for printing area of square has one parameter which is side of square.

package JavaAssignment5;

import JavaAssignments.Assignment6;

public class Assignment2 {
    private double side;
    private double length;
    private double breadth;

    void printArea(double side){
        double res = side*side;
        System.out.println("Area of square: "+res);
    }
    void printPerimeter(double side){
        double res = 4*side;
        System.out.println("Perimeter of square: "+res);
    }
    void printArea(double length,double breadth){
        double res = length*breadth;
        System.out.println("Area of rectangle : "+res);
    }
    void printPerimeter(double length,double breadth){
        double res = 2*(length+breadth);
        System.out.println("Perimeter of rectangle : "+res);
    }

    public static void main(String[] args) {
        Assignment2 a2 = new Assignment2();
        a2.printArea(5);
        a2.printPerimeter(5);
        a2.printArea(3,4);
        a2.printPerimeter(3,4);
    }
}
