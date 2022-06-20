
package bankingproject;
import java.util.Scanner;
public class CustomerAccount {
    
	private int accNo;
	private String name;
	private int accbal;

	Scanner sc = new Scanner(System.in);

	public void openAcc()
	{
		System.out.println("Enter Account Number:");
		accNo = sc.nextInt();
		System.out.println("Enter Name:");
		name = sc.next();
		System.out.println("Enter Balance:");
		accbal = sc.nextInt();
	}
	public void deposit() {
		int amt;
		System.out.println("Enter the amount you want to deposit:");
		amt = sc.nextInt();
		accbal +=amt;
		System.out.println("Balance after Depositing:" +accbal);
		Transaction t = new Transaction(accNo, amt, "deposit", accbal);
		
		TransDetails.addTrans(t);
		System.out.println("Deposit Completed");
	}
	
	public void withdrawal() {
		int amt;
		System.out.println("Enter the amount you want to withdraw:");
		amt = sc.nextInt();
		if(accbal >= amt) {
		accbal -=amt;
		System.out.println("Balance after withdrawal:" +accbal);
		}
		else
		{
			System.out.println("Balance is not Sufficient");
		}
		
		Transaction t = new Transaction(accNo, amt, "withdraw", accbal);
		
		TransDetails.addTrans(t);
		System.out.println("Withdrawal Completed");
	}
	
	public void showAcc() {
		System.out.println("Name of account holder:"+name);
		System.out.println("Account Number:"+accNo);
		System.out.println("Balance:"+accbal);
	}
	
	public boolean search(int acc_no) {
		if(accNo == acc_no) {
			showAcc();
			return(true);
		}return(false);
	}
        }

    

