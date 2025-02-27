     /*  Start
         |
         
      numbers
         |
  If a >= b and a >= c?
    /          \
  Yes          No
  |            |
  a   If b >= a and b >= c?
                 /          \
               Yes          No
               |            |
               b            c
                      |
                      End
             
*/


import java.util.Scanner;

public class LargestNumber{
    public static void main(String[] args) {
        int a = 13, b = 7, c = 29; 

        if (a >= b && a >= c) 
               {
            System.out.println("Largest number is: " + a);
        } 
        else if (b >= a && b >= c)
            {
            System.out.println("Largest number is: " + b);
        } 
        else 
           {
            System.out.println("Largest number is: " + c);
        }
    }
}
