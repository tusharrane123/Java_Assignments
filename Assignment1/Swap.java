import java.util.*;
 
public class Swap {
    public static void main(String args[]) {
        int A, B;
   
        Scanner in = new Scanner(System.in);
        System.out.println("Enter First Integer");
        A = in.nextInt();
        System.out.println("Enter Second Integer");
        B = in.nextInt();
         
        A = A + B;
        B = A - B;
        A = A - B;
 
        System.out.println("After Swapping");
        System.out.println("A = " + A + "\nB = " + B);
    }
}