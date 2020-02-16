package Assignment5;
/**
 * @author Lakshya
 *
 */
public class addDigits {
	public int addTheDigits (int input) {
	int sum = 0;
	while (input > 0 || sum > 9)
	{
		if (input == 0) 
		{
			input = sum; 
			sum = 0; 
		}
		sum = sum + (input % 10);
		input = (input / 10);
	}
	return sum;
	}
	
}
