package Assignment5;
import java.util.Scanner;
 /**
 * @author Lakshya
 *
 */
public class mainnonRepeating {
 public static void main(String[] args) {
		String str = new String();
		System.out.println("Enter the string please");
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		new nonRepeatingChar();
		int r = nonRepeatingChar.nonRC(str);
		System.out.println(r);
		sc.close();
	}

}
