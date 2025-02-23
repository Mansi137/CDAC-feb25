/*
Snippet 19: 
public class Main { 
 public static void main(String[] args) { 
 int a = 10; 
 int b = 0; 
 int result = a / b; 
 System.out.println(result); 
 } 
} 
 What runtime exception is thrown? Why does division by zero cause an issue in Java

*/


public class Main19{ 
 public static void main(String[] args) { 
 double a = 10; 
 int b = 0; 
 double result = a / b; 
 System.out.println(result); 
 } 
} 



/*
OBSERVATION:

Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Main19.main(Main19.java:20)


#Division by zero is not allowed in java and results in an ArithmeticException at runtime,this is because there is no valid integer  for division by zero
#but in case of float and double it does give me infinity and not exception.
#To fix this error we can use datatypes such as float or double.










*/
