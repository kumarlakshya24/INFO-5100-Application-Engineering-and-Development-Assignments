package Assignment5;
 /**
 * @author Lakshya
 *
 */
public class longestPalindrome {
	 public String longestPalindromeSubString(String s) {
	        int startPosition = 0;
	        int endPosition = 0;
	        int len = s.length();
	        for (int i = 0; i < len; i++) 
		{
	            char c = s.charAt(i);
	            int left = i;
	            int right = i;

	            while (left >= 0 && s.charAt(left) == c) 
	            {
	                left--;
	            }

	            while (right < len && s.charAt(right) == c) 
	            {
	                right++;
	            }

	            while (left >= 0 && right < len)
	            {
	                if (s.charAt(left) != s.charAt(right))
	                {
	                    break;
	                }

	                left--;
	                right++;
	            }
	            
	            int p = endPosition - startPosition;
	            left++; //This will be the start position(index) of palindrome string
	            int r = right - left;
	            if (p < r) 
	            {
	            	startPosition = left;
	            	endPosition = right;
	            }
	            	            
	        }
	        String palindrome = s.substring(startPosition, endPosition);
	        return palindrome;
	    }
	}

