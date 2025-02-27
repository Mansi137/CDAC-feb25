import java.util.Scanner;

public class MultipicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter  number: ");
        int num = scanner.nextInt();
         System.out.println("Multipication table of :"+num);

        for(int n=0 ; n<=10 ;n++){
             
        int result = num * n;

       
       System.out.println(+result);


       }
    }
}
