package app3;
import java.util.Scanner;
public class ScannerExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter some integer value");
		int i = sc.nextInt();
		 
		System.out.println("enter some another integer value");
		int j = sc.nextInt();
		
		ScannerExample se = new ScannerExample();
		int k = se.add(i, j);
		System.out.println(k);
	  }
		
		public int add(int i ,int j)
		{
		int  k = i +j;
		return k;
	  }


}
