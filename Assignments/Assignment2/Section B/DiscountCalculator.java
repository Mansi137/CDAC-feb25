import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     System.out.print("Enter the total purchase amount : ");
        double totalAmount = scanner.nextDouble()
     
     System.out.print("Do you have a membership card? (yes/no): ");
        String membership = scanner.next().toLowerCase();

       
        double discountPercentage;

        if (totalAmount >= 1000)
            {
            discountPercentage = 20;
         }
           
            else if (totalAmount >= 500) 
              {
            discountPercentage = 10;
        } 
        
           else {
            discountPercentage = 5;
        }

        
        if (membership.equals("yes")) {
            discountPercentage += 5;
        }

        
        double discountAmount = (discountPercentage / 100) * totalAmount;
        double finalAmount = totalAmount - discountAmount;

        
        System.out.println("Discount Applied: " + discountPercentage + "%");
        System.out.println("Discount Amount: Rs. " + discountAmount);
        System.out.println("Final Price After Discount: Rs. " + finalAmount);

        scanner.close();
    }
}
