/*
Snippet 10:
public class Main { 
 public void display() { 
 System.out.println("No parameters"); 
 } 
 public void display(int num) { 
 System.out.println("With parameter: " + num); 
 } 
 public static void main(String[] args) { 
 display(); 
 display(5); 
 } 
} 
*/

public class Main10{ 
    public void display() { 
        System.out.println("No parameters"); 
    } 

    public void display(int num) { 
        System.out.println("With parameter: " + num); 
    } 

    public static void main(String[] args) { 
        Main10 obj = new Main10(); // Create an instance of the class
        obj.display();         // Call instance method using object
        obj.display(5);        // Call overloaded method
    } 
}

/*
OBSERVATION :
error: non-static method display() cannot be referenced from a static context
 display();
 ^
error: non-static method display(int) cannot be referenced from a static context
 display(5);


#The display() and display(int num) methods are valid overloaded methods because they have the same name but different parameters.


#The display() and display(int num) methods are instance methods they do not have the static keyword.
#We need to create an instance of the Main class to call them,created an instance of Main and called the display methods using that instance






*/