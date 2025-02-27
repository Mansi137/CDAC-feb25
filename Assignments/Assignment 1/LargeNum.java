import java.util.Scanner;

public class LargeNum{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Input first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Input second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Input third number: ");
        int num3 = scanner.nextInt();

        
        int largest = num1; 

        if (num2 > largest) {
            largest = num2; 
        }

        if (num3 > largest) {
            largest = num3; 
        }

        System.out.println("The largest number is " + largest);

        scanner.close();
    }
}
