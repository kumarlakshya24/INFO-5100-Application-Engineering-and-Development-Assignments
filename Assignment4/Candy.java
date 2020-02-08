package Assignment4;
public class Candy extends DessertItem {
	private double pound;
	private int priceinCents;
	private int totalcostinCents;

	public Candy(String name, double pound, int priceinCents) {
		super(name);
		this.pound = pound;
		this.priceinCents = priceinCents;
	}
	
	@Override
	public int getCost() {
		this.totalcostinCents = (int) (this.priceinCents * this.pound);
		return totalcostinCents;
	}

	public int getPrice() {
		return priceinCents;
	}
	
	@Override
    public String toString()
    {
        String s = pound + " lbs" + " @ $" +DessertShoppe.cents2dollarAndCentsmethod(priceinCents) + " /lb";
        s += "\n" + super.getName() + "\t";
        s += DessertShoppe.cents2dollarAndCentsmethod(getCost());
        return s;
    }
	
	public double getweightinPounds() {
		return pound;
	}
}
