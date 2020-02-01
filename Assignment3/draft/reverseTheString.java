import java.util.Scanner;

public class reverseTheString {
	public String reverseWords(String s) {
        String[] p = s.trim().split("\\s+");
        
        
        
        String r = "";
        for (int i = p.length - 1; i > 0; i--) {
            r = r+ p[i] + " ";
        }
        return r + p[0];
    }


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(); 
        sc.close();
        String r = new reverseTheString().reverseWords(str);
        System.out.print(r);
}

}
