import java.util.Scanner;

public class WeekDays{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a number (1-7) for the day of the week: ");
        int day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday");
                switch ("weekday") {
                    case "weekday":
                        System.out.println("It's a Weekday.");
                        break;
                }
                break;
            case 2:
                System.out.println("Tuesday");
                switch ("weekday") {
                    case "weekday":
                        System.out.println("It's a Weekday.");
                        break;
                }
                break;
            case 3:
                System.out.println("Wednesday");
                switch ("weekday") {
                    case "weekday":
                        System.out.println("It's a Weekday.");
                        break;
                }
                break;
            case 4:
                System.out.println("Thursday");
                switch ("weekday") {
                    case "weekday":
                        System.out.println("It's a Weekday.");
                        break;
                }
                break;
            case 5:
                System.out.println("Friday");
                switch ("weekday") {
                    case "weekday":
                        System.out.println("It's a Weekday.");
                        break;
                }
                break;
            case 6:
                System.out.println("Saturday");
                switch ("weekend") {
                    case "weekend":
                        System.out.println("It's a Weekend.");
                        break;
                }
                break;
            case 7:
                System.out.println("Sunday");
                switch ("weekend") {
                    case "weekend":
                        System.out.println("It's a Weekend.");
                        break;
                }
                break;
            default:
                System.out.println("Invalid input! Please enter a number between 1 and 7.");
        }

        scanner.close();
    }
}
