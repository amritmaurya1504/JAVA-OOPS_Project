package Bank;

public class User extends Person {
    BankDetails b1;
    public User(BankDetails b1, String name, String aadharNumber, int age){
        super(name, aadharNumber, age);
        this.b1 = b1;
    }
}
