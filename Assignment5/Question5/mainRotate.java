package Assignment5;
import java.util.*;
/**
 * @author Lakshya
 *
 */
public class mainRotate {
 public static void main(String[] args) {
		int [][] m = 
			{
					{1,2,3},
					{4,5,6},
					{7,8,9}
			};
	
	rotate r = new rotate();
	r.rotateMatrix(m);
	System.out.println("The Array after rotation is: ");
	int len = m.length;
	for (int i = 0; i < len; i++)
	{
		System.out.println(Arrays.toString(m[i]));
	}
}
}
