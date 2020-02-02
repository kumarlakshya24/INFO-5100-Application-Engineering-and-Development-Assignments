/**
 * @author Lakshya
 *
 */
public class Psychiatrist extends Mood{
	
	public void examine(Mood mood) {
	System.out.println("How are you feeling today?");
	mood.queryMood();
	}
	public void observe (Mood mood) {
	mood.expressFeelings();
	System.out.println("Observation: "+mood);
	}
		
	@Override
	protected String getMood() {
		return null;
	}
	protected void expressFeelings() {}
	}