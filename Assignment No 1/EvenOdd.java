/*       Start
         |
         
      number
         |
         
  number % 2 == 0 
    /       \
  Yes       No
  |         |
           
Even        Odd 
       |
         
       End
*/
public class EvenOdd{
    public static void main(String[] args) {
        int number = 4; 


        if (number % 2 == 0) {
            System.out.println(number + " is an even number.");
                 } 
         else {
            System.out.println(number + " is an odd number.");
        }
    }
}
 

