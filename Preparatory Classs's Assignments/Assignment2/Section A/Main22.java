/*
Snippet 22: 
public class Main { 
 public static void main(String[] args) { 
 static void displayMessage() { 
 System.out.println("Message"); 
 } 
 } 
} 
 What syntax error occurs? Can a method be declared inside another method?


*/

public class Main22{ 
    public static void displayMessage() { 
        System.out.println("Message"); 
    } 

    public static void main(String[] args) { 
        displayMessage();  // Correct method call
    } 
}
 

/*
OBSERVATION:

error: illegal start of expression
 static void displayMessage() {
 ^
Main22.java:21: error: class, interface, enum, or record expected
}

#In Java, method definitions can be ovreloaded but cannot be nested. Here, displayMessage() is declared inside main(), which is not allowed.







*/