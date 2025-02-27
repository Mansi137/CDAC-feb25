/*
Snippet 26: 
public class Switch { 
 public static void main(String[] args) { 
 int number = 5; 
 switch(number) { 
 case 5: 
 System.out.println("Number is 5"); 
 break; 
 case 5: 
 System.out.println("This is another case 5"); 
 break; 
 default: 
 System.out.println("This is the default case"); 
 } 
 } 
} 
 Error to Investigate: Why does the compiler complain about duplicate case labels? What 
happens when you have two identical case labels in the same switch block? 

*/

public class Main26{
    public static void main(String[] args) {
        int number = 5;
        switch(number) {
            case 5:
                System.out.println("Number is 5");
                break;
            default:
                System.out.println("This is the default case");
        }
    }
}
 


/*
OBSERVATION:

 error: duplicate case label
 case 5:
 ^

#Java does not allow multiple case labels with the same constant value within a single switch statement.

#The Java compiler detects duplicate case values at compile-time and throws an error,switch requires each case to be unique.
#If the compiler allowed duplicate case labels,It wouldn’t know which block to execute when number matches 5


*/


