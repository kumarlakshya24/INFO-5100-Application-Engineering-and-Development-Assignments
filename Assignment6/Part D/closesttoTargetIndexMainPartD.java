package Assignment6;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Lakshya
 *
 */
public class closesttoTargetIndexMainPartD{
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception{
    System.out.println("Enter the number of elements");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	if(n > 0) 
	{
		int[] A = new int[n];
		System.out.println("Enter array elements");
		for(int j = 0; j < A.length; j++) 
			{
				A[j] = sc.nextInt();
			}
		Arrays.sort(A);
		closestToTarget c = new closestToTarget();
		System.out.println("Enter the target:");
		int target = sc.nextInt();
		int index = 0;
		try 
		{
			index = c.closestTargetIndex(A, target);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		System.out.print("\nThe Array is: ");
		for(int j = 0; j < A.length; j++) 
		{
			System.out.print(A[j] + " ");
		}
		System.out.println("\n\nClosest index is: " +index);
		}	
	else  
	{
		throw new Exception("Enter positive value");
	}
	sc.close();
	}

}
