package bankingApplication1;
import java .util.Scanner;
public class Banking_application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


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
        }

    }

    void withdraw(int amount){
        if(amount!=0){
            balance=balance-amount;
            previousTransactions= -amount;
        }
    }

    void getpreviousTransactions(){
        if(previousTransactions>0){
            System.out.println("deposited"+previousTransactions);
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
            switch (option){
                case 'A':
                    System.out.println("=============");
                    System.out.println("Balance is:-"+ balance);
                    System.out.println("==============");
                    break;
                case 'B':
                    System.out.println("==============");
                    System.out.println("enter the amount to deposit");
                    System.out.println("==============");
                    int amount=sc.nextInt();
                    deposit(amount);
                    break;
                case 'C':
                    System.out.println("==============");
                    System.out.println("enter the amount to withdraw");
                    System.out.println("==============");
                    int amount2=sc.nextInt();
                    withdraw(amount2);
                    break;
                case 'D':
                    System.out.println("==============");
                    getpreviousTransactions();
                    System.out.println("==============");
                    break;
                case'E':
                    System.out.println("==============");
                    break;

                default:
                    System.out.println("==============");
                    System.out.println("invalid option");
                    break;
            }
        }while (option!='E');

    }



 }
