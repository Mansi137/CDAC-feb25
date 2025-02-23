
/* 

      Start
         |
  define number
         |
  If number > 0?
    /       \
  Yes       No
  |         |
Positive    End
         |
       End



*/


public class CheckPositive{
    public static void main(String[] args) {
        int number = -1; 


        if (number > 0) {
            System.out.println(number + " is a positive number.");
                   } 

       else  {
            System.out.println(number + " is not positive number.");
              }
   
      
    }
}
