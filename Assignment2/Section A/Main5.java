/*Snippet 5: 
public class Main { 
 public static void main(String[] args) { 
 System.out.println("Main method with String[] args"); 
 } 
 public static void main(int[] args) { 
 System.out.println("Overloaded main method with int[] args"); 
 } 
} 
 Can you have multiple main methods? What do you observe?
*/

 
public class Main5{ 
 public static void main(String[] args) { 
 System.out.println("Main method with String[] args");
     main(new int[]{1, 2});
 
 } 
 public static void main(int[] args) { 
 System.out.println("Overloaded main method with int[] args"); 
 } 
} 

/*
Observations:

#The program compiles successfully as method overloading allows multiple methods with the same name but different parameter.
#When I run the program,only the main(String[] args) method executed because Java looks for its predefined parameters.
#To run main(int[] args) we have to call it explicitly in another method.


*/
