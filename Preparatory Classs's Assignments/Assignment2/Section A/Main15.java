/*
Snippet 15: 
public class Main { 
 public static void main(String[] args) { 
 int num1 = 10; 
 double num2 = 5.5; 
 int result = num1 + num2; 
 System.out.println(result); 
 } 
} 
 What error occurs when compiling this code? How should you handle different data types 
in operations?
*/


public class Main15{ 
 public static void main(String[] args) { 
 int num1 = 10; 
 double num2 = 5.5; 
double result = num1 + num2; 
 System.out.println(result); 
 } 
} 


/*
OBSERVATION :
error: incompatible types: possible lossy conversion from double to int
 int result = num1 + num2;
                   ^
#Here in this code num1 is an int (10) ,num2 is a double (5.5).
#While performing num1 + num2, it performs int to double, so the expression results in a double.
#Since double cannot be directly assigned to an int without explicit conversion, to avoid data loss it throws an error.

#To fix this we can change the datatype from int to double or we can use type casting.










*/





