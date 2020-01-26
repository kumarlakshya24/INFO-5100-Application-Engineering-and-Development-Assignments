/**
 * @author Lakshya
 *
 */
import java.util.Scanner;

public class addDigits{
	
		public static int addTheDigits (int input) {
		int sum = 0;
		//Only if the value of n is greater than zero and the sum already is not in single digit
		while (input > 0 || sum > 9)
		{
			//In case the input is already zero, the sum can be returned as zero
			if (input == 0) 
			{
				input = sum; 
				sum = 0; 
			}
			
			//Computing the sum of the digits until single digit left
			sum = sum + (input % 10);
			input = (input / 10);
		}
		return sum;
		}
		
		public static void main (String[] args)
		{	
			System.out.println("Enter the Number to begin finding the sum of digits");
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			sc.close();
			int sumFinal = addTheDigits(n);
			System.out.println("Result of computing sum of all digits to unit digit is "+sumFinal);
		}
}
