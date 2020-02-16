package Assignment5;
 /**
 * @author Lakshya
 *
 */
public class pushZeroesBack {
	public void zeroatEnd(int [] number) {
		int z = 0, l = 0;
		int r = number.length;
	    while (l < r) 
	    {
	        if (number[l] != 0)
	        {
	            int temp = number[z];
	            number[z++] = number[l];
	            number[l] = temp;
	        }
	        l++;
	    }
	    for (int i=0; i < r; i++) 
            System.out.print(number[i] + "\t");
	}
}
