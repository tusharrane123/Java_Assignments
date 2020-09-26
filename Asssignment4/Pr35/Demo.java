import java.util.Scanner;
class MathOperation{
    static int add(int a,int b)
    {
        return a+b;
    }

    static int subtract(int a,int b)
    {
        return a-b;
    }

    static int multiply(int a,int b)
    {
        return a*b;
    }

    static float power(int a,int b)
    {
        return (int) Math.pow(a,b);
    }
}

class Demo{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Radius ");
        int no1=sc.nextInt();
        int no2=sc.nextInt();

        System.out.println("Addition = "+MathOperation.add(no1,no2));
        System.out.println("Subtraction = "+MathOperation.subtract(no1,no2));
        System.out.println("Multiplication = "+MathOperation.multiply(no1,no2));
        System.out.println("Power = "+ MathOperation.power(no1,no2));
    }
}