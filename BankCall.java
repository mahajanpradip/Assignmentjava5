package JavaAssignment5;

public class BankCall {
    public static void main(String[] args) {
        BankA B = new BankA(1000);
        BankB B1 = new BankB(1500);
        BankC B2 = new BankC(2000);

        System.out.println("For Bank 1 ");
        System.out.println("Balance is : "+ B.getBalance());
        System.out.println("After appying interest: "+B.applyInterest());
        System.out.println("==============================================");
        System.out.println("For Bank 2 ");
        System.out.println("Balance is : "+ B1.getBalance());
        System.out.println("After appying interest: "+B1.applyInterest());
        System.out.println("==============================================");
        System.out.println("For Bank 3 ");
        System.out.println("Balance is : "+ B2.getBalance());
        System.out.println("After appying interest: "+B2.applyInterest());
        System.out.println("==============================================");
    }
}
