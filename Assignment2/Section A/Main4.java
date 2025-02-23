/*
Snippet 4: 
public class Main { 
 public static void main() { 
 System.out.println("Hello, World!"); 
 } 
} 
 What happens when you compile and run this code? Why is String[] args needed?

*/
  
// CORRECTED CODE
public class Main4{ 
 public static void main(String[] args) { 
 System.out.println("Hello, World!"); 
 } 
} 

/*
Before:
#The code compiles successfully!
#Error occur while running the program:
#Error: Main method not found in class Main4, please define the main method as:
   public static void main(String[] args)
or a JavaFX application class must extend javafx.application.Application

#The method public static void main() is valid Java syntax, so the compiler does not throw an error.
#The String[] args parameter allows users to pass input values while running the program 




After:
#Added (String[] args) keyword to the main method, making it public static void main(String[] args), which is required 
#In Java, the main method must be declared as public static void main(String[] args).so that it can access 


*/

