public class BankAccount {
    private int cid;
    private double balance;
    private String type;
    private static int cidgen = 0;
    public String user=null;

    public BankAccount(String typesString){
        cid = cidgen;
        cidgen += 1;
        balance = 0;
        type = typesString;
    }
    public boolean withdraw(double amount){
        if(balance-amount>0){
            balance=balance-amount;
            return true;
        }
        else {
            return false;
        }
    }
    public boolean deposit(double amount){
        if(amount>0){
            setBalance(amount+balance);
            return true;
        }
        return false;
    }

    public double getBalance(){
        return balance;
    }
    public void setBalance(double amount){
        balance=balance+amount;
    }

}
