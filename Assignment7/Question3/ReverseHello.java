package Assignment7;
/**
 * @author Lakshya
 *
 */
public class ReverseHello extends Thread{
	private int num = 0;
	private static int count = 50;
	public ReverseHello() {
		
	}
	public ReverseHello(int num) {
	this.num = num;
	}
	
	@Override
	public void run () {
		if (num < count) {
			num++;
			Thread t = new ReverseHello(num);
			System.out.println("Hello from Thread:" +(count - num + 1)+ "!");
			t.start();		
		}
	}
	
}
