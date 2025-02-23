import java.util.Scanner;

public class Prime{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Input number: ");
        int num = scanner.nextInt();

        boolean prime = true;

       
        if (num <= 1) {
            prime = false; // Numbers <= 1 are not prime
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    prime = false; // If divisible, it's not prime
                    break;
                }
            }
        }

       
        if (prime) {
            System.out.println("The number " + num + " is prime.");
        } else {
            System.out.println("The number " + num + " is Not prime.");
        }

        scanner.close();
    }
}
