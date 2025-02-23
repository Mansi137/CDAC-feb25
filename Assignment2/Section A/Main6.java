/*
Snippet 6: 
public class Main { 
 public static void main(String[] args) { 
 int x = y + 10; 
 System.out.println(x); 
 } 
} 
 What error occurs? Why must variables be declared?
*/

// CORRECTED CODE

public class Main6{ 
 public static void main(String[] args) { 
 int y =7;
 int x = y + 10; 
 System.out.println(x); 
 } 
} 


/*

OBSERVATIONS :
#error: variable y might not have been initialized
int x = y + 10;

#The variable y is not declared.
#In Java, all variables must be declared before they are used.
#The compiler does not define their data type and allocate default memory for undeclared variable. 


*/