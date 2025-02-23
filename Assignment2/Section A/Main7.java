/*
Snippet 7: 
public class Main { 
 public static void main(String[] args) { 
 int x = "Hello"; 
 System.out.println(x); 
 } 
} 
 What compilation error do you see? Why does Java enforce type safety?
*/

// CORRECTED CODE

public class Main7{ 
 public static void main(String[] args) { 
 int x = 13; 
 System.out.println(x); 
 } 
} 


/*
OBSERVATIONS :

#error: incompatible types: String cannot be converted to int
 int x = "Hello";

#In java we need to define data types explicitly.
#We cannot assign a value of a specific datatype to another.
#In this case, "Hello" is a String, whereas x is declared as an int.
#Java does not allow automatic type conversion between String and int.

#For successful execution of program we can either change the datatype or its value.


*/