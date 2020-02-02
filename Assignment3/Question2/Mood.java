/**
 * @author Lakshya
 *
 */
public abstract class Mood {
	
	protected abstract String getMood(); {}
	
	protected abstract void expressFeelings(); {}
	
	public void queryMood() {
		System.out.println("I feel "+getMood()+" today!");
	}
	
	public static void main(String[] args) {
		Psychiatrist p = new Psychiatrist();
		Happy h = new Happy();
		Sad s = new Sad();
		p.examine(h);
		System.out.println(" ");
		p.observe(h);
		System.out.println(" ");
		p.examine(s);
		System.out.println(" ");
		p.observe(s);
	}
}
