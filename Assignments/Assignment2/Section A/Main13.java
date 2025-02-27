/*
Snippet 13: 
public class Main { 
 public static void main(String[] args) { 
 String str = null; 
 System.out.println(str.length()); 
 } 
} 
 What exception is thrown? Why does it occur?
*/


public class Main13{ 
 public static void main(String[] args) { 
 String str = "HI"; 
 System.out.println(str.length()); 
 } 
} 

/*
OBSERVATION :

Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "<local1>" is null
(runtime exception)

#The variable str is declared as a String but is explicitly assigned null.
#null represents the absence of an object reference.
#Since there is no actual String object in memory, Java throws a NullPointerException (NPE).










*/