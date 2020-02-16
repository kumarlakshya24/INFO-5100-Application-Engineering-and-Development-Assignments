package Assignment5;
import java.util.*;
/**
 * @author Lakshya
 *
 */
public class mainAddDigits {
 public static void main(String[] args) {
		System.out.println("Enter the Number to begin finding the sum of digits");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		addDigits add = new addDigits();
		int sumFinal = add.addTheDigits(n);
		System.out.println("Result of computing sum of all digits to unit digit is" + "\n"+sumFinal);
	}

}
