/*
Snippet 20: 
public class Main { 
 public static void main(String[] args) { 
 System.out.println("Hello, World") 
 } 
} 
 What syntax error occurs? How does the missing semicolon affect compilation?


*/


public class Main20{ 
 public static void main(String[] args) { 
 System.out.println("Hello, World");
 } 
} 



/*
Observation:

 error: ';' expected
 System.out.println("Hello, World")



#In Java, every statement must end with a semicolon (;),The Java compiler expects a semicolon to end of the statement.
The System.out.println("Hello, World") statement is missing a semicolon at the end, causing a syntax error.







*/