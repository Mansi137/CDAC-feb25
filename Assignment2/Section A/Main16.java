/*
Snippet 16: 
public class Main16{ 
 public static void main(String[] args) { 
 int num = 10; 
 double result = num / 4; 
 System.out.println(result); 
 } 
} 
 What is the result of this operation? Is the output what you expected?
*/

public class Main16{ 
 public static void main(String[] args) { 
 int num = 10; 
 double result = num / 4; 
 System.out.println(result); 
 } 
} 

// 
OBSERVATION:

Output :
C:\Users\hp\Desktop>java -cp . Main16
2.0

#Both operands we used are integers,as result we get integer division.10 / 4 in integer division gives 2 and not 2.5 which i expected .
This 2 (int) is then implicitly converted to 2.0 (double) before storing in result.










