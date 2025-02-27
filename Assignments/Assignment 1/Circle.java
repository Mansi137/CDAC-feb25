import java.util.Scanner;

public class Circle{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

                System.out.print("Input the radius: ");
        double radius = scanner.nextDouble();

                double area = 3.142* radius * radius;

               System.out.println("Area of the circle: " + area);

        scanner.close();
    }
}
