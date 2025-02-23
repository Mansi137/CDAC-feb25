/*
Snippet 17: 
public class Main { 
 public static void main(String[] args) { 
 int a = 10; 
 int b = 5; 
 int result = a ** b; 
 System.out.println(result); 
 } 
} 
 What compilation error occurs? Why is the ** operator not valid in Java
*/


public class Main17{ 
 public static void main(String[] args) { 
 int a = 10; 
 int b = 5; 
 double result = Math.pow(10,5); 
 System.out.println(result); 
 } 
} 



/*
OBSERVATION :

error: illegal start of expression
 int result = a ** b;
                 ^

#In Java, the ** operator does not exist. It is not a valid arithmetic operator.
#Many programming languages use ** for power operation, but Java does not support it, java uses Math.pow(base, exponent) for power calculations.

*/


