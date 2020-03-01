package Assignment6;

public class accountMainPartB {

	public static void main(String[] args) {
		CheckingAccount c = new CheckingAccount("Eden", "Hazard", 17000);
		System.out.println(c);
		c.CreditTransaction(400);
		c.DebitTransaction(500);
		System.out.println("\nAfter transactions:" + "\n\n" + c);;
	}

}
