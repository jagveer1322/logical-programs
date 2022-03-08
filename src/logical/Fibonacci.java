package logical;
import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		System.out.println("enter range of series ");
		Scanner sc = new Scanner(System.in);
		int range = sc.nextInt();

        int a = 0, b = 1 ,c;
	    System.out.println("Fibonacci Series till " + range + " terms:");

	    for (int i = 1; i <= range; ++i) {
	      System.out.print(a + ", ");

	 
	      c = a + b;
	      a = b;
	      b = c;
	    }
	  }
}
