/*
Snippet 11: 
public class Main { 
 public static void main(String[] args) { 
 int[] arr = {1, 2, 3}; 
 System.out.println(arr[5]); 
 } 
} 
 What runtime exception do you encounter? Why does it occur
*/

public class Main11{ 
 public static void main(String[] args) { 
 int[] arr = {1, 2, 3}; 
 System.out.println(arr[2]); 
 } 
} 

/*
OBSERVATION :

Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 5
at Main11.main(Main11.java:15)


#The array arr is declared with 3 elements: {1, 2, 3}.
#In Java, array indices start from 0, so valid indices for this array are 0, 1, and 2.
#code trieD to access arr[5], but index 5 is out of bounds since the array only has 3 elements.
#When an invalid index is accessed,it throws ArrayIndexOutOfBoundsException at runtime.



*/