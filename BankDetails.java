package bankingApp;
import java.util.Scanner;
public class BankDetails 
{
    private String accno;
    private String name;
    private String acc_type;
    private long balance;
    Scanner scn = new Scanner(System.in);
    // Method to open new account
    public void openAccount() 
    {
        System.out.println("Enter Account no: ");
        accno = scn.next();
        System.out.println("Enter Account type: ");
        acc_type = scn.next();
        System.out.println("Enter Name: ");
        name = scn.next();
        System.out.println("Enter Balance: ");
        balance = scn.nextLong();
    }
    // Method to display account details
    public void displayAccount() 
    {
        System.out.println("Name of the Account Holder: " + name);
        System.out.println("Account Number: " + accno);
        System.out.println("Account Type: " + acc_type);
        System.out.println("Balance: " + balance);
    }
    // Method to deposit
    public void deposit() 
    {
        System.out.println("Enter the amount you want to deposit: ");
        long amt = scn.nextLong();
        balance += amt;
        System.out.println("Balance after deposit: " + balance);
    }
    // Method to withdraw
    public void withdrawal() 
    {
        System.out.println("Enter the amount you want to withdraw: ");
        long amt = scn.nextLong();
        if (balance >= amt) 
        {
            balance -= amt;
            System.out.println("Balance after withdrawal: " + balance);
        } 
        else 
        {
            System.out.println("Your balance is less than " + amt + ". Transaction failed!");
        }
    }
    // Method to search account
    public boolean search(String ac_no) 
    {
        if (accno.equals(ac_no)) 
        {
            displayAccount();
            return true;
        }
        return false;
    }
}