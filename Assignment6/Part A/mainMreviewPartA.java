package Assignment6;
/**
 * @author Lakshya
 *
 */
public class mainMreviewPartA {

	public static void main(String[] args) {
		Mreview mreview = new Mreview("Kill Bill", 3);
		mreview.addRating(4);
		mreview.addRating(3);
		System.out.println(mreview);
		Mreview mreview2 = new Mreview("Bill Killed", 4);
		mreview2.addRating(3);
		mreview2.addRating(2);
		System.out.println(mreview2);
	}

}
