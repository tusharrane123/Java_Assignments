import java.util.Scanner;
public class Prime1
{
	public static void main(String args[])
	{
		int num1, num2,count = 0, i, j;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Number : "); 
		num1 = sc.nextInt();
		System.out.print("Enter Secomd Number :"); 
		num2 = sc.nextInt();
		System.out.println("Prime numbers between given range are :");

		for(i = num1; i <= num2; i++)
		{
			for( j = 2; j < i; j++)
			{
				if(i % j == 0)
				{
					count = 0;
					break;
				}
				else
				{
					count = 1;
				}
			}
			if(count == 1)
			{
				System.out.println(i);
			}
		}
	}
}