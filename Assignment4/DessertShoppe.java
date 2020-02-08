package Assignment4;
public class DessertShoppe {
	public final static double tax = 0.02;
	public final static String nameoftheStore = "M & M Dessert Shoppe";
	public final static int maxsizeofItem = 100;
	public final static int maxwidthofcostprint = 10;
	
	
	public static String cents2dollarAndCentsmethod(int c) {
		int dollarValue = c / 100;
		int centsValue = c % 100;
		String finale = "";
		if (dollarValue > 0)
		{
			finale = finale + dollarValue;
		}
		
		finale = finale + ".";
		if (centsValue < 10)
		{
			finale = finale + "0";
		}
		
		finale = finale + centsValue;
		return finale;
		}
	
		public static void main(String[] args){
		System.out.println(DessertShoppe.nameoftheStore);
		
		}
}