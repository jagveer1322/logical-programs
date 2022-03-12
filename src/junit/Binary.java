package junit;
import java.util.Scanner;

public class Binary {
    static void toBinary(int n) {
        if (n == 0) {
            return;
        }
        int remainder = n % 2;
        n = n / 2;
        //
        System.out.printf(" " +remainder);
      
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        toBinary(n);
    }

}
