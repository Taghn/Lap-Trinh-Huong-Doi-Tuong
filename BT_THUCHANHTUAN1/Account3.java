public class Account3 {
    private String name;
    private double balance;
    public Account3(String name, double balance) {
        this.name= name;
        if(balance>0.0)
            this.balance=balance;
    }
    public void setName(String name) {
        this.name=name;
    }
    public  String getName() {
        return name;
    }

    public void deposit(double depositAccount3) {
        if(depositAccount3>0.0){
            balance += depositAccount3;
        }
    }

    public double getBalance(){
        return balance;
    }
}
