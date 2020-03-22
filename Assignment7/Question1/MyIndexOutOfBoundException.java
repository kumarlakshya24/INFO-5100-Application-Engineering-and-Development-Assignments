package Assignment7;
/**
 * @author Lakshya
 *
 */
@SuppressWarnings("serial")
public class MyIndexOutOfBoundException extends Exception{
	int lowerBound = 0;
	int upperBound = 9;
	int index;
	
	public MyIndexOutOfBoundException(int index) {
		this.index = index;
	}
	
	public String toString() {
		return "Error Message: Index "+index+" but Lower Bound: "+lowerBound+", Upper Bound: "+upperBound;
	}
}

