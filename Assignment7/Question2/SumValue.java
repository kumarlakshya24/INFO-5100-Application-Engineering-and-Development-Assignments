package Assignment7;
import java.util.*;
/**
 * @author Lakshya
 *
 */
public class SumValue {
	public static void main(String[] args) throws InterruptedException{
		 int[] arr = new int[4000000];
		 generateRandomArray(arr);
		 long sum = sum(arr);
		 System.out.println("Sum: " + sum);
		 }
	 /*generate array of random numbers*/
	 static void generateRandomArray(int[] arr){
			Random r = new Random();
			int len = arr.length;
			for (int i = 0; i < len; i++) {
				arr[i] = r.nextInt(4000000);
			}	
	 }
	 
	 /*get sum of an array using 4 threads*/
	 private static long sum(int[] arr) throws InterruptedException {
			long sum = 0;
			int l = arr.length/4;
			fourThreads s1 = new fourThreads(arr, 0, l);
			fourThreads s2 = new fourThreads(arr, l, l * 2);
			fourThreads s3 = new fourThreads(arr, l * 2, l * 3);
			fourThreads s4 = new fourThreads(arr, l * 3, l * 4);
			s1.start();
			s2.start();
			s3.start();
			s4.start();
			s1.join();
			s2.join();
			s3.join();
			s4.join();
			sum = s1.getSum() + s2.getSum() + s3.getSum() + s4.getSum();
			return sum;
		}
	 
	 static long sumwithoutThread(int[] arr){
		 long sum = 0;
		 for (int i = 0; i < arr.length; i++) {
			 sum += arr[i];
		 }
	 return sum;
	 }
	 	
}

class fourThreads extends Thread {
	 private int[] arr;
	 private int start;
	 private int end;
	 private long sum;
	 
public fourThreads(int arr[], int start, int end) {
	 this.start = start;
	 this.end = end;
	 this.arr = arr;
}

public long getSum() {
	return sum;
}

@Override
public void run() {
	for (int i = start; i < end; i++) {
		sum += arr[i];
	}
}
}