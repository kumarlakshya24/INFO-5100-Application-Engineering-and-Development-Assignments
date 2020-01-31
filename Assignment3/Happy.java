/**
 * @author Lakshya
 *
 */
public class Happy extends Mood{
	public void expressFeelings() {
		System.out.println("hehehe...hahahah...HAHAHAHAHA!!!");
	}
			
	public String toString() {
		String h1 = "Subject laughs a lot";
		return h1;
	}
	
	@Override
	protected String getMood() {
		return "happy";
	}
}
