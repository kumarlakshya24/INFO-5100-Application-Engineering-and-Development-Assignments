package Assignment4;
public class Cookie extends DessertItem{
	private int numberCount;
	private int priceinCents;
	private int totalcostinCents;

	public Cookie(String name, int numberCount, int priceinCents) {
		super(name);
		this.numberCount = numberCount;
		this.priceinCents = priceinCents;
	}
	
	public int getCost() {
		this.totalcostinCents = (int) (this.priceinCents * (this.numberCount/12d));
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
        String s = numberCount + " dz @ $" + DessertShoppe.cents2dollarAndCentsmethod(priceinCents) + " /dz";
        s += "\n" + super.getName() + "\t";
        s += DessertShoppe.cents2dollarAndCentsmethod(getCost());
        return s;
    }

}
