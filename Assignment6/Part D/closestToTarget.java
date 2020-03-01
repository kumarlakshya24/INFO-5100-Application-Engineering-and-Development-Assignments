package Assignment6;
/**
 * @author Lakshya
 *
 */
public class closestToTarget {
		public int closestTargetIndex(int[] A, int target) throws Exception {
			 {
		        if (A == null || A.length == 0)
		        {
		        	throw new Exception("Null or zero entered");
		        }
		        int first = 0;
		        int len = A.length;
		        int last = len - 1;
		        while (first + 1 < last) 
		        {
		            int middle = first + (last - first) / 2;
		            if (A[middle] <= target) {
		            	first = middle;
		            } else {
		            	last = middle;
		            }
		        }
		        int dl = A[last] - target;
		        int dr = target - A[first];
		        if (dl >= dr) 
		        {
		        	last--;
		        }
		        else
		        {
		        	first++;
		        }
		        return last;
		    }
		}		
}