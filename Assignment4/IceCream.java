package Assignment4;
public class IceCream extends DessertItem {
	private int numberCount = 0;
	private int priceinCents;
	private int totalcostinCents;

	public IceCream(String name, int i) {
		super(name);
		this.priceinCents = i;
		numberCount++;
	}
	
	public IceCream(String name, int numberCount, int priceinCents) {
		super(name);
		this.numberCount = numberCount;
		this.priceinCents = priceinCents;
	}
	
	public int getCost() {
		this.totalcostinCents = (this.priceinCents * this.numberCount);
		return totalcostinCents;
	}

	public int getPrice() {
		return priceinCents;
	}
	
	public int getnumberCount() {
		return numberCount;
	}

	@Override
    public String toString()
    {
        String s = numberCount + " @ $" + DessertShoppe.cents2dollarAndCentsmethod(priceinCents) + " /item";
        s += "\n" + super.getName() + "\t";
        s += DessertShoppe.cents2dollarAndCentsmethod(getCost());
        return s;
    }
}
