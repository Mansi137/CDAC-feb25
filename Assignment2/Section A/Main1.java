/*
Snippet 1: 
public class Main { 
 public void main(String[] args) { 
 System.out.println("Hello, World!"); 
 } 
} 
 What error do you get when running this code?
*/


//CORRECTED CODE

public class Main1 { 
 public static void main(String[] args) { 
 System.out.println("Hello, World!"); 
 } 
} 


/*
Before :
Error: Main method is not static in class Main, please define the main method as:
 public static void main(String[] args) –

The main method is  declared as public void main(String[] args)


After:
Added static keyword to the main method, making it public static void main(String[] args), which is required 
In Java, the main method must be declared as public static void main(String[] args).

*/


