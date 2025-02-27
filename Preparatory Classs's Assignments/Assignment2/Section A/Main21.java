/*
Snippet 21: 
public class Main { 
 public static void main(String[] args) { 
 System.out.println("Hello, World!"); 
 // Missing closing brace here 
} 
 What does the compiler say about mismatched braces?


*/


public class Main21{ 
 public static void main(String[] args) { 
 System.out.println("Hello, World!"); 
 }
} 



/*
OBSERVATION:

 error: reached end of file while parsing
}
 ^

#The compiler expects a closing brace (}) to properly end the Main class since the last closing brace belongs to the main method
#The error "reached end of file while parsing" means that the compiler expected more closing braces


*/