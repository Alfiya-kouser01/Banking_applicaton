package bankingApplication1;
import java .util.Scanner;
public class Banking_application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //create the object of the class bankAccount
        BankAccount bank1=new BankAccount("xyz","15SE55157");
        bank1.showMenu();

    }
}
 class BankAccount{
    int balance;
    int previousTransactions;
    String customerName;
    String customerID;

     BankAccount(String name, String ID){
         this.customerName=name;
         this.customerID=ID;

     }


    void deposit(int amount){
        if(amount!=0){
            balance=balance+amount;
            previousTransactions=amount;

            System.out.println("amount deposited is:"+previousTransactions);
            System.out.println("balance is:"+balance);
        }

    }

    void withdraw(int amount){
        if(amount!=0){
            balance=balance-amount;

            previousTransactions= -amount;
            System.out.println("amount withdraw is:"+previousTransactions);
            System.out.println("balance is:"+balance);

        }
    }

    void getpreviousTransactions(){
        if(previousTransactions>0){
            System.out.println("deposited   "+previousTransactions);
        }
        else if(previousTransactions<0){
            System.out.println("withdraw:"+Math.abs(previousTransactions));
        }
        else{
            System.out.println("no transaction occur");
        }
    }

    void showMenu(){
        char option ='\0';
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome"+customerName);
        System.out.println("your ID is- "+customerID);
        System.out.println("A. check Balance");
        System.out.println("B. Deposit");
        System.out.println("C. withdraw");
        System.out.println("D. previous transaction");
        System.out.println("E. exit");

        do{
            System.out.println("==============");
            System.out.println("select the object");
            System.out.println("==============");
            option =sc.next().charAt(0);
            Character.toUpperCase(option);
            switch (option){
                case 'A':
                    System.out.println("=============");
                    System.out.println("Balance is:-"+ balance);
                    System.out.println("==============");
                    System.out.println();
                    break;
                case 'B':
                    System.out.println("==============");
                    System.out.println("enter the amount to deposit");
                    System.out.println("==============");
                    int amount=sc.nextInt();
                    deposit(amount);
                    System.out.println();
                    break;
                case 'C':
                    System.out.println("==============");
                    System.out.println("enter the amount to withdraw");
                    System.out.println("==============");
                    int amount2=sc.nextInt();
                    withdraw(amount2);
                    System.out.println();
                    break;
                case 'D':
                    System.out.println("==============");
                    getpreviousTransactions();
                    System.out.println("==============");
                    System.out.println();
                    break;
                case'E':
                    System.out.println("==============");
                    System.out.println("THANK YOU (;");
                    System.out.println();
                    break;

                default:
                    System.out.println("==============");
                    System.out.println("invalid option");
                    System.out.println();
                    break;
            }
        }while (option!='E');

    }



 }
