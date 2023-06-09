package Bank;

public class Deposit_Department extends Department{
    User user;
    int amount_deposited;
    public Deposit_Department(User user, int amount_deposited){
        super("Deposit Department", 5, 100000);
        this.user = user;
        this.amount_deposited = amount_deposited;
        addMoney();
    }
    public void addMoney(){
        this.user.b1.addMoney(this.amount_deposited);
    }
}
