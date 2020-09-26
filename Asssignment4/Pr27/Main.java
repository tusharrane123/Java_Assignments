import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        System.out.println("Enter the 5 array Elements");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

        for(int j=0;j<arr.length;j++)
        {
            if(j==arr.length-1)
            {
                break;
            }
            for(int k=j+1;k<arr.length;k++)
            {
                if(arr[j]>arr[k])
                {
                    //swap logic without using third variable for integer values
                    arr[j]=arr[j]+arr[k];
                    arr[k]=arr[j]-arr[k];
                    arr[j]=arr[j]-arr[k];
                }
            }
        }

        System.out.println("Minimum Number in the array is "+ arr[0]);
        System.out.println("Minimum Number in the array is "+ arr[arr.length-1]);
        
    }
}