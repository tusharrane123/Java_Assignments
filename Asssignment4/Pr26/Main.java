import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Rows You want");
        int row=sc.nextInt();
        int arr[][]=new int[row][];

        for(int i=0;i<arr.length;i++)
        {
            System.out.println("Enter the columns");
            int col=sc.nextInt();
            arr[i]=new int[col];

            for(int j=0;j<arr[i].length;j++)
            {
                System.out.println("Enter the Element");
                arr[i][j]=sc.nextInt();
            }
        }
int sum=0;
        for(int ar[]:arr)
        {
            for(int a:ar)
            {
                sum+=a;
                System.out.print(" "+a);
            }
            System.out.println("");
        }

        System.out.println("Sum Of All Array Elements = "+sum);
    }
}