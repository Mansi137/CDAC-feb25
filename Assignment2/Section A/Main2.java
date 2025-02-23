/*
Snippet 2: 
public class Main { 
 static void main(String[] args) { 
 System.out.println("Hello, World!"); 
 } 
} 
 What happens when you compile and run this code?

*/


//CORRECTED CODE

public class Main2{ 
 public static void main(String[] args) { 
 System.out.println("Hello, World!"); 
 } 
} 


 /*
Before:
Error: Main method not found in class Main2, please define the main method as:
   public static void main(String[] args)
or a JavaFX application class must extend javafx.application.Application

The main method is declared as static void main(String[] args),leading to a runtime error.


After :
Added public keyword to the main method, making it public static void main(String[] args), which is required 
In Java, the main method must be declared as public static void main(String[] args).





*/


