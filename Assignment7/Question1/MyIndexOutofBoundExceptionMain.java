package Assignment7;
/**
 * @author Lakshya
 *
 */
public class MyIndexOutofBoundExceptionMain {
	public static void main(String[] args) throws MyIndexOutOfBoundException{
		int index = 0;
		for(int i = 0; i <= 10; i++) {
			index++;
		}
		if(index > 10) {
			MyIndexOutOfBoundException exception = new MyIndexOutOfBoundException(index);
			throw exception;
		}
	}

}
