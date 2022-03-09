package junit;
import java.util.Scanner;

public class SquareRoot {
   
    static double sqroot(double input) {
        double t = Math.sqrt(input);
        return t;
    }
     
   
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int input=scan.nextInt();
        System.out.println("Square root of " +input +" is " +sqroot(input));
    }
}