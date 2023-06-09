package Bank;

/*
Note :-
1. Final keyword - final means value if not going to change afterwards. if function is final then no override, if class is
final then no inheritance
2. Static keyword - the variable belongs to the class itself rather than to any specific instance of the class.
This means that there is only one copy of the variable in memory, regardless of how many instances of the class
are created.
3. We can create a many constructor as we want.
4. we cannot use non-static variable in static function;
 */

public class BankDetails {
    String name;
    static int numOfAccounts;
    private int accountNumber;
    String ifsc;
    final static String BANK_NAME="SBI";
    private Double balance;
    public BankDetails(String name, String ifsc){
        this.balance = 0.0;
        this.name = name;
        this.ifsc = ifsc;
        numOfAccounts++;
        accountNumber = numOfAccounts;
    }
    public int getAccountNumber(){
        return this.accountNumber;
    }
    public double totalBalance(){
        return this.balance;
    }
    public void addMoney(double submitAmount){
        this.balance = this.balance + submitAmount;
    }
    public void withdrawAmount(double submitAmount){
        this.balance = this.balance - submitAmount;
    }
}
