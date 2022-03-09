package junit;
import java.util.Scanner;

	public class Payment { 
	    static void monthlyPayment(double principal,double r,double n) {
	        double result = principal * r / (1 - Math.pow((1 + r),-n));
	        System.out.println("The monthly payment : "+result);
	    }
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the principal amount: ");
	        double principal = sc.nextDouble();
	        System.out.println("Enter the year : ");
	        double year = sc.nextDouble();
	        System.out.println("Enter the rate of interest : ");
	        double rate = sc.nextDouble();
	        double n = 12 * year;
	        double r = rate / (12 * 100);
	        monthlyPayment(principal,r,n);
	    }
	}
				