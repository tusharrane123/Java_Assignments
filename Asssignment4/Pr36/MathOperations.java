import java.util.Scanner;
class MathOp{
    int arr[]=new int[3];
    int mul=1;
    MathOp(){
               
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter the Three Elements");
                
                for(int i=0;i<arr.length;i++)
                {
                    arr[i]=sc.nextInt();
                }
            }

    void multiply(){
        for(int k:arr)
        {
           mul=mul*k;
        }
        System.out.println("multiplication of All Array Elements "+mul);
    }

    void multiply(int a,int b){
        System.out.println("multiplication of two Integer nos "+a*b);
    }

    void multiply(float a,float b,float c){
        System.out.println("multiplication of Three Float nos "+a*b*c);
    }

    void multiply(double a,int b){
        System.out.println("multiplication of double And Integer "+a*b);
    }

}
class MathOperations{
    public static void main(String[] args) {
        MathOp ob=new MathOp();
        ob.multiply();
        ob.multiply(2,3);
        ob.multiply(2.3F,3.2F,4.1F);
        ob.multiply(22.3,5);
    }
}