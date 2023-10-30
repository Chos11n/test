import java.util.Scanner;

public class BankSystem{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("请输入你的账号");
        String ba = sc.nextLine();
        BankAccount ba1 = new BankAccount("debit");
         BankAccount ba2 = new BankAccount("debit");
         BankAccount ba3 = new BankAccount("debit");
         BankAccount ba4 = new BankAccount("debit");
        switch (ba) {
            case "ba1":
                ba1.user = "taken";
                while(true){
                gui2();
                int selection = sc.nextInt();
                if (selection == 1){
                System.out.println("\n Please enter the amount of cash");
                double amount = sc.nextDouble();
                if (ba1.getBalance()>amount){
                ba1.withdraw(amount);
                System.out.println("operation succeed");}
                else{
                System.out.println("sorry,balance is not enough");
                }
                }
                if (selection == 2){
                    System.out.println("\n Please enter the amount of cash");
                    double amount = sc.nextDouble();
                    ba1.deposit(amount);
                    System.out.println("\n operation succeed ");
                }
                if (selection == 3){

                    System.out.println("\n current balance:");
                    System.out.println(ba1.getBalance());
                }
                if (selection == 4){
                System.exit(selection);
                }
             }
            case "ba2":
            while(true){
                gui2();
                int selection = sc.nextInt();
                if (selection == 1){
                System.out.println("\n Please enter the amount of cash");
                double amount = sc.nextDouble();
                if (ba2.getBalance()>amount){
                ba2.withdraw(amount);
                System.out.println("operation succeed");}
                else{
                System.out.println("sorry,balance is not enough");
                }
                }
                if (selection == 2){
                    System.out.println("\n Please enter the amount of cash");
                    double amount = sc.nextDouble();
                    ba2.deposit(amount);
                    System.out.println("\n operation succeed ");
                }
                if (selection == 3){

                    System.out.println("\n current balance:");
                    System.out.println(ba3.getBalance());
                }
                if (selection == 4){
                System.exit(selection);
                }
             
                ba2.user = "taken";
            }
            case "ba3":
            while(true){
                gui2();
                int selection = sc.nextInt();
                if (selection == 1){
                System.out.println("\n Please enter the amount of cash");
                double amount = sc.nextDouble();
                if (ba3.getBalance()>amount){
                ba3.withdraw(amount);
                System.out.println("operation succeed");}
                else{
                System.out.println("sorry,balance is not enough");
                }
                }
                if (selection == 2){
                    System.out.println("\n Please enter the amount of cash");
                    double amount = sc.nextDouble();
                    ba3.deposit(amount);
                    System.out.println("\n operation succeed ");
                }
                if (selection == 3){

                    System.out.println("\n current balance:");
                    System.out.println(ba3.getBalance());
                }
                if (selection == 4){
                System.exit(selection);
                }
             
                ba3.user = "taken";
                break;}
            case "ba4":
            while(true){
                gui2();
                int selection = sc.nextInt();
                if (selection == 1){
                System.out.println("\n Please enter the amount of cash");
                double amount = sc.nextDouble();
                if (ba4.getBalance()>amount){
                ba4.withdraw(amount);
                System.out.println("operation succeed");}
                else{
                System.out.println("sorry,balance is not enough");
                }
                }
                if (selection == 2){
                    System.out.println("\n Please enter the amount of cash");
                    double amount = sc.nextDouble();
                    ba4.deposit(amount);
                    System.out.println("\n operation succeed ");
                }
                if (selection == 3){

                    System.out.println("\n current balance:");
                    System.out.println(ba4.getBalance());
                }
                if (selection == 4){
                System.exit(selection);
                }
             
                ba4.user = "taken";
                break;}
            default:
                System.out.println("账号无效");
                System.exit(0);}}
            
    

            
        
    
    public static void gui2(){
        System.out.println("You wanna......");
        System.out.println("1.withdraw");
        System.out.println("2.deposit");
        System.out.println("3.display");
        System.out.println("4.exit");
    }
    public static boolean gui1(){
        System.out.println("Welcome to bankaccount system!");
        System.out.println("please enter your userid");
        String inString = sc.nextLine();
        if(inString == "ba"){
         return true;
        }
        else{
         return false;
        }
    }


}