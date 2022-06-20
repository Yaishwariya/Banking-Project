
package bankingproject;
public class Transaction {
    
	private int accNo;
	private int tranAmt;
	private String tranType;
	private int finalbal;
	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Transaction(int accNo, int tranAmt, String tranType, 
                int finalbal) {
		super();
		this.accNo = accNo;
		this.tranAmt = tranAmt;
		this.tranType = tranType;
		this.finalbal = finalbal;
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public int getTranAmt() {
		return tranAmt;
	}
	public void setTranAmt(int tranAmt) {
		this.tranAmt = tranAmt;
	}
	public String getTranType() {
		return tranType;
	}
	public void setTranType(String tranType) {
		this.tranType = tranType;
	}
	public int getFinalbal() {
		return finalbal;
	}
	public void setFinalbal(int finalbal) {
		this.finalbal = finalbal;
	}

	
}

    

