import java.util.Scanner;
class Rev{
public static void main(String args[]){
int rev=0;
Scanner sc = new Scanner (System.in);
System.out.println("Enter any Number");
int num = sc.nextInt();

while (num !=0)
{
int rem = num % 10;
 rev = rev * 10 + rem;
num = num / 10;
}
System.out.print("Reverse = " +rev);
}
}