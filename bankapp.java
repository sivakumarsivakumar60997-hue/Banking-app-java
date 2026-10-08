import java.util.Scanner;
public class bankapp{
    static String accountnumber;
    static String customername;
    static double  balance;
    static Scanner sc = new Scanner (System.in);

    static void entry(){
        System.out.println("welcome to INDIAN  BANK(*_*)");
        System.out.println("Enter  the account number :");
        accountnumber = sc.nextLine();
        System.out.println("Enter the customer name : ");
        customername = sc.nextLine();
        System.out.println("Enter the intial balance :");
        balance = sc.nextDouble();
        System.out.println("Account details stored succesfully ");

    }
    static void deposit(){
        System.out.println("Enter the deposit ammount :");
        double amount = sc. nextDouble();
         if(amount > 0){
            balance = balance + amount;
            System.out.println(amount+"Amount deposit successfully");
         }else{
            System.out.println("Deposit amount must be graterthan 0/-");
         }
    }
    static void withdraw(){
        System.out.println("Enter withdrawal amount :");
        double amount = sc.nextDouble();
        if (amount <= 0){
            System.out.println("Please enter the amount greaterthan 0/-");
        }else if(amount<= balance){
            System.out.println(amount+" Amount withdrawal successfully");
        }else{
            System.out.println("Insufficient balance");
        }
    }
    static void returnbalance(){
        System.out.println("Current balance :"+balance);
    }
    static void exit(){
        System.out.println("..... Thanks for visiting Indian bank .....");
        System.out.println(".....vist again.....");
    }
    public static void main(String [] args){
        entry();
        int choice;
        do{
            System.out.println("1.Deposit");
            System.out.println("2.Withdraw");
            System.out.println("3.Check balance");
            System.out.println("4.Exit");
            System.out.println("Choose the above choice ");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    deposit();
                    break;
                case 2:
                    withdraw();
                    break;
                case 3:
                    returnbalance();
                    break;
                case 4:
                    exit();
                    break;
                default:
                    System.out.println("Invalid choice! please try again.");
            }

        }while(choice!=4);
        
    }
}