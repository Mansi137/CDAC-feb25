/*
Snippet 9: 
public class Main { 
 public static void main(String[] args) { 
 int class = 10; 
 System.out.println(class); 
 } 
} 
 What error occurs? Why can't reserved keywords be used as identifiers?
*/

public class Main9{ 
 public static void main(String[] args) { 
 int class1 = 10; 
 System.out.println(class1); 
 } 
} 


/* OBSERVATION :
error:not a statement
 int class = 10;
 ^
error: ';' expected
 int class = 10;
    ^
error: <identifier> expected
 int class = 10;
          ^
error: illegal start of expression
 System.out.println(class);
                    ^
error: <identifier> expected
 System.out.println(class);
                         ^
#The variable name class is a reserved keyword in Java which cannot be used as an identifier (variable,method or class name).
#The compiler detects class as part of Java’s class syntax rather than a variable name, results in error


#Predefined meaning of keywords like class, int, for etc., are part of the Java language syntax.
#Using reserved keywords as identifiers would create confusion, making it unclear whether a word refers to a syntax or a defined variable.


*/