/*
Snippet 14: 
public class Main { 
 public static void main(String[] args) { 
 double num = "Hello"; 
 System.out.println(num); 
 } 
} 
 What compilation error occurs? Why does Java enforce data type constraints?
*/


public class Main14{ 
 public static void main(String[] args) { 
 double num = 13.07; 
 System.out.println(num); 
 } 
} 



/*
OBSERVATION :
error: incompatible types: String cannot be converted to double
 double num = "Hello";
(Compilation Error)

#The variable num is declared as double, which means it should hold a numeric (floating-point) value
#Hello is a String, which cannot be assigned to a double because they are incompatible data types.

#Java enforce data type constraints to avoid  runtime issues by catching incorrect assignments at compile-time.







*/
