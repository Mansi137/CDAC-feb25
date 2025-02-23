import java.util.Scanner;

public class ReverseNum{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Input number: ");
        int num = scanner.nextInt();

        int reverse = 0;


                while (num != 0) {
            int digit = num % 10; 

            reverse = reverse * 10 + digit; 
            num /= 10;         }

       
        System.out.println("The reverse of the number is " + reverse);

        scanner.close();
    }
}
