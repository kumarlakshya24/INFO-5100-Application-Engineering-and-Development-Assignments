package Assignment5;
 import java.util.LinkedHashMap;
/**
 * @author Lakshya
 *
 */
public class nonRepeatingChar {
	public static int nonRC(String str) {
	int len = str.length();
        LinkedHashMap<Character,Integer> nonrcmap1 = new LinkedHashMap<Character,Integer>();
        for(int i = 0; i < len; i++)
        {
        	char c = str.charAt(i);
            if(nonrcmap1.containsKey(c))
            {
                int j = nonrcmap1.get(c);
                j++;
                nonrcmap1.put(c,j);
            }
            else
            {
                nonrcmap1.put(c,1);
            }
        }
        for(int i = 0; i < len; i++)
        {
        	char c = str.charAt(i);
            if(nonrcmap1.get(c) == 1)
                return i;
        }
        
        if(len == 0)
        {
        	return -1;
        }
        
      return -1;
        
        
    }
}

