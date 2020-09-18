import java.util.Scanner;
class Prime{
public static void main(String args[]){
	int count=0;
Scanner sc = new Scanner (System.in);
System.out.println("Enter any Number");
int num = sc.nextInt();

for(int i=2; i<num; i++)
{
if (num%i==0){
count++;
break;
}
}
if (count == 0)
{
System.out.print("This is a Prime Number");
        }
        else
        {
            System.out.print("This is not a Prime Number");
        }
    }
}



