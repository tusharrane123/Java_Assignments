import java.util.Scanner;
 class GreatestNum{ 
{
    public static void main(String[] args) 
    {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Number:");
        num1 = scanner.nextInt();
        System.out.println("Enter Second Number:");
        num2 = scanner.nextInt();
        System.out.println("Enter Third Number:");
        num3 = scanner.nextInt();
        scanner.close();
       
        temp = num1>num2 ? num1:num2;
        result = num3>temp ? num3:temp;
        System.out.println("Largest Number is:"+result);
    }
}

/*
import java.util.Scanner ;
class Ass13a {

	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the numbers");
	int i = sc.nextInt();
	int j = sc.nextInt();
	int k = sc.nextInt();

	String s =(i > j && i > k)? "i is greater": j>k ? "J is greater" : "K is greater";
System.out.println(s);
	}




}
/