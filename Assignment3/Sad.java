/**
 * @author Lakshya
 *
 */
public class Sad extends Mood{
	public void expressFeelings() {
		System.out.println("'wah' 'boo hoo' 'weep' 'sob' 'weep'");
	}
		
	public String toString() {
		String s1 = "Subject cries a lot";;
		return s1;
	}

	@Override
	protected String getMood() {
		return "sad";
	}
}
