/* 

      Start
         |
  define number
         |
  If number <0
    /       \
  Yes       No
  |         |
Negative    End
         |
       End



*/


public class CheckNegative{
    public static void main(String[] args) {
        int number = 1; 


        if (number < 0)  
                  {
            System.out.println(number + " is a Negative number.");
                   } 

       else
              {
            System.out.println(number + " is not Negative number.");
              }
   
        }
}
