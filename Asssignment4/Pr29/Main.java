import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Row Size of 2D array");
        int row=sc.nextInt();
        int arr[][]=new int[row][];

        for(int i=0;i<arr.length;i++)
        {
            System.out.println("Enter the Columns Size of 2D array of row "+i);
            int col=sc.nextInt();
            arr[i]=new int[col];
            System.out.println("Enter the "+col+ " elements of row "+i);
            for(int j=0;j<arr[i].length;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }

   
        for(int ar[]:arr)
        {
            for(int k:ar)
            {
                System.out.print(k+" ");
            }
            System.out.println("");
            System.out.println("");
        }

        System.out.println("\n **********************************");
        int d1=arr.length;
        
        System.out.println(d1+" 1D arrays in 2D array ");
        System.out.println("\n **********************************");
        for(int l=0;l<arr.length;l++)
        {
            int count=0;
            for(int m=0;m<arr[l].length;m++)
            {
                count++;
            }
            System.out.println(count +" Elements in "+l+" row ");   
        }

    }
}