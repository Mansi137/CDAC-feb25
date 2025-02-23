/*
Snippet 25: 
public class Switch { 
 public static void main(String[] args) { 
 double score = 85.0; 
 switch(score) { 
 case 100: 
 System.out.println("Perfect score!"); 
 break; 
 case 85: 
 System.out.println("Great job!"); 
 break; 
 default: 
 System.out.println("Keep trying!"); 
 } 
 } 
} 
 Error to Investigate: Why does this code not compile? What does the error tell you about the 
types allowed in switch expressions? How can you modify the code to make it work?
*/

public class Main25{ 
 public static void main(String[] args) { 
 int score = 85; 
 switch(score) { 
 case 100: 
 System.out.println("Perfect score!"); 
 break; 
 case 85: 
 System.out.println("Great job!"); 
 break; 
 default: 
 System.out.println("Keep trying!"); 
 } 
 } 
} 

/*

OBSERVATION:

 error: selector type double is not allowed
 switch(score) {


#The given Java program does not compile because the switch statement is trying to use a double value (score = 85.0), which is not allowed as a switch expression.

#I did some research and i found out that
 In Java, switch expressions only support certain data types. As per Java's rules, a switch statement can work with:
 byte, short, char, int
 Their corresponding wrapper classes (Byte, Short, Character, Integer)
 String,enum types
 Floating-point types (float and double) are not supported because they can have precision issues, which may lead to 
 unexpected behavior in comparisons. 



*/