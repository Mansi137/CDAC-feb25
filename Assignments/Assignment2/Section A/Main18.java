/*
Snippet 18: 
public class Main { 
 public static void main(String[] args) { 
 int a = 10; 
 int b = 5; 
 int result = a + b * 2; 
 System.out.println(result); 
 } 
} 
 What is the output of this code? How does operator precedence affect the result?

*/

public class Main18{ 
 public static void main(String[] args) { 
 int a = 10; 
 int b = 5; 
 int result = a + b * 2; 
 System.out.println(result); 
 } 
} 




/*
OBSERVATION:

C:\Users\hp\Desktop>java -cp . Main18
20

#As java follows operator precedence rule,where multiplication (*) has higher precedence than addition (+).
Thast why we get 20 as output

#whereas I can change this precedence of multiplication operator by using parentheses,in that case addition operation will get executed.




*/