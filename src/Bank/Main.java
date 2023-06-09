package Bank;

public class Main {
    public static void main(String[] args){
        BankDetails p1 = new BankDetails("Amrit Raj", "SBI0020");
        BankDetails p2 = new BankDetails("Ankit Raj", "SBI0120");
        User u1 = new User(p1, "Amrit Raj", "6056784512", 23);
        User u2 = new User(p2, "Ankit Raj", "7895665562", 13);
        System.out.println("Before Depositing : " + u2.b1.totalBalance());
        Deposit_Department d1 = new Deposit_Department(u2, 100000);
        System.out.println("After Depositing : " + u2.b1.totalBalance());
    }
}
