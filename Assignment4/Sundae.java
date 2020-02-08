package Assignment4;
public class Sundae extends IceCream {
	private String nameofTopping;
	private int priceperTopping;
	private int totalcostinCents;

	public Sundae(String nameofIceCream, int costofIceCream, String nameofTopping, int priceperTopping) {
		super(nameofIceCream, costofIceCream);
		this.nameofTopping = nameofTopping;
		this.priceperTopping = priceperTopping;
	}

	@Override
	public int getCost() {
		int costofIceCream = super.getCost();
		this.totalcostinCents = this.priceperTopping + costofIceCream;
		return totalcostinCents;
	}

	@Override
	public int getPrice() {
		return priceperTopping;
	}
	
	public String getToppingName() {
		return nameofTopping;
	}
	
	@Override
    public String toString()
    {
        String s = nameofTopping + " Sundae with" +"\n" + super.getName() + "\t";
        s += DessertShoppe.cents2dollarAndCentsmethod(getCost());
        return s;
    }

}
