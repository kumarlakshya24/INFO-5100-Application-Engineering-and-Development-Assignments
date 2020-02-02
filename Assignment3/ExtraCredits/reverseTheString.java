import java.util.*;

/**
 * @author Lakshya
 *
 */
public class reverseTheString {
	public String reverse(String s){
	String[] a = new String[100];
	Arrays.toString(a);
	a = s.split(" +");
	int len = a.length;
	for (int i = 0; i < len; i ++ ) 
	{
		a[i] = a[i].trim();
	}		
	String temp = "";
        for (int j = 0; j < len - 1; j++, len--) 
	{
            	temp = a[j];
            	a[j] = a[len - 1];
            	a[len - 1] = temp;            
        }
        String r =  String.join(" ", a);
        return r;
    }
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the string to be reversed below:");
        String str = sc.nextLine();
        sc.close();
        String reverse = new reverseTheString().reverse(str);
        System.out.println(reverse);
}
}
