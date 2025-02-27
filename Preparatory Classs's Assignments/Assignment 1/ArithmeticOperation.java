import java.util.Scanner;

public class ArithmeticOperation{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter 2nd number: ");
        int num2 = scanner.nextInt();

        int result1 = num1 + num2;
            System.out.println("Sum is: " + result1);

        int result2 = num1 - num2;
            System.out.println(" Substraction is: " + result2);

        int result3 = num1 * num2;
            System.out.println("Multiplication is: " + result3);

        int result4 = num1 / num2;
              System.out.println("Division is: " + result4);

        int result5= num1 % num2;
             System.out.println("Mod is: " + result5);

    }
}
