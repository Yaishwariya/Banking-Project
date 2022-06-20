
package bankingproject;
import java.util.Scanner;
public class BankingProject {

    public static void main(String[] args) {
	try (Scanner sc = new Scanner(System.in)) {
	int ch,n;
        System.out.println("Enter the number of Customers:");
	n = sc.nextInt();
	CustomerAccount C[] = new CustomerAccount[n];
	for(int i=0; i<C.length; i++)
	{
	    C[i] = new CustomerAccount();
	    C[i].openAcc();
	}
			
	do {
	    System.out.println("\n BANKING SYSTEM");
	    System.out.println("1. Display all Customers "
                    + "\n 2. Search by account number \n 3. Deposit amount "
                    +"\n 4. Withdraw amount \n 5. Mini Statement \n 6. Exit");
	    System.out.println("Enter your choice:");
	    ch= sc.nextInt();
	    
            switch(ch)
	    {
		case 1:
		for(int i=0; i<C.length; i++)
		{
			C[i].showAcc();
		}
			break;
					
		case 2:
		System.out.println("Enter account number to search:");
		int acc_no = sc.nextInt();
		boolean found = false;
		for(int i=0; i<C.length; i++)
		{
			found = C[i].search(acc_no);
			if (found) {
			break;
			}
		}
			if (!found) {
			System.out.println("Account doesnot exist!");
			}
			break;
					
		case 3:
		System.out.println("Enter account number:");
		acc_no = sc.nextInt();
		found = false;
		for(int i=0; i<C.length; i++)
		{
			found = C[i].search(acc_no);
			if (found) {
			C[i].deposit();
			break;
			}
		}
		        if (!found) {
			System.out.println("Account doesnot exist!");
			}
			break;
					
		case 4:
		System.out.println("Enter account number:");
		acc_no = sc.nextInt();
		found = false;
		for(int i=0; i<C.length; i++){
			found = C[i].search(acc_no);
			if (found) {
			C[i].withdrawal();
			break;
			}
		}if (!found) {
			System.out.println("Account doesnot exist!");
			}break;
		case 5:
		System.out.println("Enter account number:");
		acc_no = sc.nextInt();
		found = false;
		for(int i=0; i<C.length; i++){
		        found = C[i].search(acc_no);
		        if (found) {
			TransDetails.Statement(acc_no);
			break;
			}
		}if (!found) {
			System.out.println("Account doesnot exist!");
                }break;
		case 6:
		System.out.println("THANK YOU!");
		break;
	       }
                }while(ch!=6);
              }}}

    
    

