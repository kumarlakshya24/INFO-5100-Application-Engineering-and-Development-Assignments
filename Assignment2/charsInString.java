import java.util.Scanner;

/**
 * @author Lakshya
 *
 */

public class charsInString {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the string input");
	String str;
	String c2;
	str = sc.nextLine();
	System.out.println("Enter the character");
	c2 = sc.nextLine();
	char c3 = c2.charAt(0);
	int counter = 0;
	sc.close();
	char[] ch = str.toCharArray();
	//Converting the search character to Lower Case in order to search for both Upper and Lower cases 
	char c4 = Character.toLowerCase(c3);
	char c5 = Character.toUpperCase(c3);
	for (char c : ch)
	{
		if (c4 == c || c5 == c)
		{
			counter++;
		}
			
	}
	System.out.println("The character '"+c3+"' is present in '"+str+"' "+counter+" time(s)");
		}
	}


