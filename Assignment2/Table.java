import java.util.Scanner;
class Table{
public static void main(String args[]){
Scanner sc = new Scanner (System.in);
System.out.println("Enter any Number");
int num = sc.nextInt();

for (int i=1; i<=10; i++){
int z = num * i;
System.out.println(z);
}
}
}
