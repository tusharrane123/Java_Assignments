import java.util.Scanner;
public class ArraySum {

    public static void main(String[] args) {
       
        Scanner input= new Scanner(System.in);
        double a[]=new double[5];
        double sum=0.0, average;
        int i;
        for(i=0;i<5;i++)
        {
            System.out.print("Enter number in Array=");
            a[i]=input.nextDouble();
            sum = sum + a[i];
        }   
        average = sum / 5.0;
        System.out.println("Sum ="+sum+ " and Average="+average);
    }
    
}