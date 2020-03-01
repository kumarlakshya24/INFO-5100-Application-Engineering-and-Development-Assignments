package Assignment6;
/**
 * @author Lakshya
 *
 */
public class CheckingAccount extends Account{

	private static double MinimumAccountBalance = 500;
	private static double PenaltyFee = 25;
	
	public CheckingAccount(String fname, String lname, double cb) {
		super(fname, lname, cb);
	}
	
	@Override
	public double DebitTransaction(double debitAmount) 
	{
		CurBalance = super.DebitTransaction(debitAmount);
		ChargeFee();
		return CurBalance;
	}
	
	@Override
	public double CreditTransaction(double creditAmount) 
	{
		CurBalance = super.DebitTransaction(creditAmount);
		ChargeFee();
		return CurBalance;
	}
	
	private void ChargeFee() 
	{
		if(CurBalance < MinimumAccountBalance) 
		{
			CurBalance -= PenaltyFee;
		}
	}

}
