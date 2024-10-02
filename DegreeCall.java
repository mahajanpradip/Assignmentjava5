package JavaAssignment5;

public class DegreeCall {
    public static void main(String[] args) {
        Degree d = new Degree();
        d.getDegree();
        System.out.println("============================");
       d = new UnderGraduate();
        d.getDegree();
        System.out.println("============================");
        d = new Postgraduate();
        d.getDegree();
    }

}
