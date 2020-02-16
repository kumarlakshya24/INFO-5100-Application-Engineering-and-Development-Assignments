package Assignment5;
 import java.util.Scanner;
 /**
 * @author Lakshya
 *
 */
public class mainZero {
 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in array please:");
		int len = 0;
		len = sc.nextInt();
		int a[] = new int[len];
		System.out.println("Enter the elements:");
		for(int i = 0; i < len; i++)
        {
            a[i] = sc.nextInt();
        }
		sc.close();
		pushZeroesBack p = new pushZeroesBack();
		p.zeroatEnd(a); 
        }
	}
		
	

	
