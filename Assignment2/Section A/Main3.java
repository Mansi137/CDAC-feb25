/*
Snippet 3: 
public class Main { 
 public static int main(String[] args) { 
 System.out.println("Hello, World!"); 
 return 0; 
 } 
} 
 What error do you encounter? Why is void used in the main method?

*/

//CORRECTED CODE 

public class Main3{ 
 public static void main(String[] args) { 
 System.out.println("Hello, World!"); 
 
 } 
} 


/*
Before:
Error: Main method must return a value of type void in class Main3, please
define the main method as:public static void main(String[] args)

In Java, the main method must have a return type of void.
The provided code has public static int main(String[] args), which returns an int.


After:
Changed the return type from int to void, making it as public static void main(String[] args), which is correct.
As void methods do not return a value,Removed  return 0; statement. 

*/