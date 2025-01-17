package bankingApp;
import java.util.Scanner;

public class BankApp 
{
    public static void main(String[] args) 
    {
        Scanner scn = new Scanner(System.in);
        // Create initial accounts
        System.out.println("How many number of customers do you want to input?");
        int n = scn.nextInt();
        BankDetails[] BD = new BankDetails[n];
        for (int i = 0; i < BD.length; i++) 
        {
            BD[i] = new BankDetails();
            BD[i].openAccount();
        }

        int choice;
        do {
            System.out.println("\nBanking System Application Menu:");
            System.out.println("1. Display all account details");
            System.out.println("2. Search account number");
            System.out.println("3. Deposit the amount");
            System.out.println("4. Withdraw the amount");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scn.nextInt();

            switch (choice) 
            {
                case 1: for (BankDetails account : BD)
                		{
                			account.displayAccount();
                		}
                    break;
                case 2: System.out.println("Enter account number you want to search: ");
		                System.out.println("Enter account number you want to search: ");
		                String ac_no = scn.next();
		                boolean found = false;
		                for (BankDetails account : BD) 
		                {
		                    found = account.search(ac_no);
		                    if (found) break;
		                }
		                	if (!found) 
		                	{
		                		System.out.println("Search Failed! Account doesn't exist.");
		                	}
		                	break;
                    
                case 3: System.out.println("Enter account number: ");
		                String ac_no1 = scn.next();
		                found = false;
		                	for (BankDetails account : BD) 
		                	{
		                		found = account.search(ac_no1);
		                		if (found) 
		                		{
		                			account.deposit();
		                			break;
		                    	}
		                	}
		                		if (!found) 
		                		{
		                			System.out.println("Search Failed! Account doesn't exist.");
		                		}
		                		break;
	            case 4: System.out.println("Enter account number: ");
			            String ac_no2 = scn.next();
			            found = false;
			            for (BankDetails account : BD) 
			            {
			            	found = account.search(ac_no2);
			            	if (found) 
			            	{
			            		account.withdrawal();
			            		break;
			            	}
			            }
			                if (!found) 
			                {
			                    System.out.println("Search Failed! Account doesn't exist.");
			                }
			                break;
                case 5:	System.out.println("Thank you for using the banking system. Goodbye!");
                		break;
                default:System.out.println("Invalid choice! Please try again.");
            }
        } 
        while (choice != 5);
        scn.close();
    }
}
