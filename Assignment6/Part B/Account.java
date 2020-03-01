package Assignment6;
/**
 * @author Lakshya
 *
 */
public class Account {

	protected String FirstName;
	protected String LastName;
	protected double CurBalance;
	
	public Account(String fname, String lname, double curbalance) 
	{
		this.FirstName = fname;
		this.LastName = lname;
		this.CurBalance = curbalance;
	}
	
	public String getAcctType() 
	{
		return getClass().getSimpleName();
		
	}
	
	public double DebitTransaction(double debitAmount)
	{
		//Subtracts the transaction debit amount from the current balance, and returns the new balance.
		CurBalance -= debitAmount;
		return CurBalance;
	}
	
	public double CreditTransaction(double creditAmount) 
	{
		//Adds the transaction credit amount to the current balance, and returns the new balance.
		CurBalance += creditAmount;
		return CurBalance;		
	}
	
	@Override
	public String toString () 
	{
		return "Account Name: " + FirstName + " " + LastName + " || " + "Account Type: " + getAcctType() + " || " + "Account Balance: $" + CurBalance;
	}
}
