/**
 * @author Lakshya
 *
 */

//import java.util.Arrays;
import java.util.Scanner;
public class maxMinNumberinArray {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int count = 0;
	System.out.println("Enter the Size of Array in Numbers");
	count = sc.nextInt();
	int Numbers[] = new int[count];
	System.out.println("Enter the numbers in Array");
	for (int i = 0; i < count ; i++)
	{
		Numbers[i] = sc.nextInt(); 
	}
	sc.close();
	int len = 0, temp = 0;
	len = Numbers.length; 
	for (int j = 0; j < len - 1; j++)
	{
		for (int k = j+1; k < len; k++)
		{
			if (Numbers[j] > Numbers[k])
			{
				temp = Numbers[j];
				Numbers[j] = Numbers[k];
				Numbers[k] = temp;
			}
		}
	 
	}
	
	System.out.println("Maximum Number in Array is "+Numbers[len-1]+" and the Minimum Number in Array is "+Numbers[0]);
	}
}
