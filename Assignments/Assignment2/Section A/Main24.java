/*
Snippet 24: 
public class MissingBreakCase { 
 public static void main(String[] args) { 
 int level = 1; 
 switch(level) { 
 case 1: 
 System.out.println("Level 1"); 
 case 2: 
 System.out.println("Level 2"); 
 case 3: 
 System.out.println("Level 3"); 
 default: 
 System.out.println("Unknown level"); 
 } 
 } 
} 
 Error to Investigate: When level is 1, why does it print "Level 1", "Level 2", "Level 3", and 
"Unknown level"? What is the role of the break statement in this situation? 
*/

public class Main24{ 
    public static void main(String[] args) { 
        int level = 1; 
        switch(level) { 
            case 1: 
                System.out.println("Level 1"); 
                break;
            case 2: 
                System.out.println("Level 2"); 
                break;
            case 3: 
                System.out.println("Level 3"); 
                break;
            default: 
                System.out.println("Unknown level"); 
        } 
    } 
}


/*
OBSERVATION:

C:\Users\hp\Desktop>java -cp . Main24
Level 1
Level 2
Level 3
Unknown level

#In given Java program, there is a switch statement without break statements after each case. This causes fall-through behavior, means that once a case matches, execution continues into the following cases until it encounters a break or the end of the switch statement.





*/
