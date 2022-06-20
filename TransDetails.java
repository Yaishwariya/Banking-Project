
package bankingproject;
import java.util.LinkedList;
import java.util.List;
public class TransDetails {
 	
	public static List<Transaction> transList = new LinkedList<>();
	
	public static void addTrans(Transaction t) {
		transList.add(t);
	}
	
	public static void Statement(int accNo)
	{
		System.out.println("Statement for account number:"+accNo);
		System.out.println();
		for(Transaction t : transList)
		{
		if(t.getAccNo() == accNo){
		System.out.println(t.getAccNo()+"-"+t.getTranAmt()+"-"+
                        t.getTranType()+"-"+t.getFinalbal());
				
			}
		}
	}

}


