package Assignment7;
/**
 * @author Lakshya
 *
 */
public class ReverseHelloMain{
	public static void main(String[] args) throws InterruptedException {
	Thread t = new ReverseHello();
	t.start();
	t.join();
	}
}

