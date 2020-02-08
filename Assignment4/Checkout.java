package Assignment4;
import java.util.ArrayList;
public class Checkout extends java.lang.Object {
private int numberofItems = 0;
ArrayList<DessertItem> DessertList = new ArrayList<DessertItem>(numberofItems);
public Checkout() {
	
}

public int numberofItems() {
	return numberofItems;
}

public void enterItem(DessertItem item) {
	DessertList.add(item);	
	numberofItems++;
}

public void clear () {
	DessertList.clear();
	numberofItems = 0;
}

public int totalCost() {
	int totalcostinCents = 0;
	for (int i = 0; i < numberofItems; i++)
	{
		totalcostinCents = DessertList.get(i).getCost();
		
	}
	return totalcostinCents;
}

public int totalTax() {
	int totaltaxinCents = 0;
	int cost = this.totalCost();
	double tax = DessertShoppe.tax;
	cost = (int) (cost * tax);
	totaltaxinCents = (Math.round(cost));
	return totaltaxinCents;
}

public int getNumberofItems() {
	return numberofItems;
}

public void setNumberofItems(int numberofItems) {
	this.numberofItems = numberofItems;
}

@Override
public String toString()
{
    String output = "";
    int number = DessertList.size();
    output += DessertShoppe.nameoftheStore + "\n";
    output += "--------------------\n";
    output += "Number of Items: " + number + "\n\n";
   
    int costpreTax = 0;
    for(int i = 0; i < number; i++)
    {
        output += DessertList.get(i) + "\n";
        costpreTax += DessertList.get(i).getCost();
    }
    
    output += "\n" + "Tax";
    int tax = (int)Math.round(costpreTax * DessertShoppe.tax);
    String taxSum = DessertShoppe.cents2dollarAndCentsmethod(tax);
    int widthTax = DessertShoppe.maxwidthofcostprint + 15;
    output += String.format("%" + widthTax + "s%n", taxSum);
    output += "Total";
    int total = costpreTax + tax;
    String totalSum = DessertShoppe.cents2dollarAndCentsmethod(total);
    int widthTotal = DessertShoppe.maxwidthofcostprint + 13;
    output += String.format("%" + widthTotal + "s%n", totalSum);
    return output;
}

}
