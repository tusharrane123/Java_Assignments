import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Row Size of 2D array");
        int row=sc.nextInt();
        int col=sc.nextInt();
        int arr[][]=new int[row][col];
        int sum=0;
        
        for(int i=0;i<arr.length;i++)
        {   
            System.out.println(i+" Row ");
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.println("Col "+j);
                arr[i][j]=sc.nextInt();
                if(i==j)
                {
                    sum+=arr[i][j];
                }
            }
            
        }

        System.out.println("Sum Of All Diagonal Elements = "+sum);

    }
}