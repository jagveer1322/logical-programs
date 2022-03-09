package junit;
import java.util.Scanner;

public class UtilTemp {
    static void temperatureConversion(double temp,int code) {
        if (code == 1) {
            double f=temp*9/5+32;
            System.out.println("Temperature in Fahrenheit : "+f+" F");
        }
        if (code == 2) {
            double c=(temp-32)*5/9;
            System.out.println("Temperature in Celsius : "+c+" C");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Which type of conversion \n 1. Celsius to Fahrenheit  \n 2. Fahrenheit to Celsius");
        int code=sc.nextInt();
        System.out.println("Enter Temperature :");
        double temp=sc.nextDouble();
        temperatureConversion(temp, code);
    }
}
	

