package Assignment5;
 import java.util.Scanner;
 /**
 * @author Lakshya
 *
 */
public class mainlongestPalindrome {
 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s = "";
		s = sc.nextLine();
		String out = new longestPalindrome().longestPalindromeSubString(s);
		System.out.println(out);
		sc.close();
	}

}
