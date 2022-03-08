package logical;
import java.util.Scanner;
public class Reversenumber {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	    int num = sc.nextInt();
	    int reverse = 0;
	    System.out.println("Original Number: " + num);
	    while(num != 0) {
	    int digit = num % 10;
	    reverse = reverse * 10 + digit; 
	    System.out.println("Reverse Number: " + reverse);// remove the last digit from num
	    num /= 10;
	    }
	    System.out.println("Reverse Number: " + reverse);
	  }
	}


