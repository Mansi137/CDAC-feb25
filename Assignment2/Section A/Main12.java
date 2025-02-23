/*
Snippet 12: 
public class Main { 
 public static void main(String[] args) { 
 while (true) { 
 System.out.println("Infinite Loop"); 
 } 
 } 
} 
 What happens when you run this code? How can you avoid infinite loops?
*/

public class Main12{ 
    public static void main(String[] args) { 
        int count = 0;
        while (count < 5) { 
            System.out.println(count);
                count++; 
        }
    } 
}
 




/*
OBSERVATION :

C:\Users\hp\Desktop>java -cp . Main12
Infinite Loop
Infinite Loop
Infinite Loop
Infinite Loop
..... 


#When I run this program, it enter in an infinite loop and print continuously
#There shoould be a condition that eventually becomes false to exit the loop ,to exit the loop we can use for loop , break statement or it can be a condition that will eventually get false.










*/