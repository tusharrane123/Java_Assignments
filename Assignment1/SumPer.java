import java.util.Scanner;
 class SumPer{
 public static void main(String args[]) {
 int sub1,sub2,sub3,sub4,sub5, sum;
 float avg;
  Scanner s = new Scanner(System.in);
  System.out.print("Enter marks of subject1:");
  sub1 = s.nextInt();
  
  System.out.print("Enter marks of subject2:");
  sub2 = s.nextInt();
  
  System.out.print("Enter marks of subject3:");
  sub3 = s.nextInt();
  
  System.out.print("Enter marks of subject4:");
  sub4 = s.nextInt();
  
  System.out.print("Enter marks of subject5:");
  sub5 = s.nextInt();
  sum = sub1 + sub2 + sub3 +sub4 + sub5;
  System.out.println("Sum of all subjects is:" + sum);
   
  avg = ( sum / 5 );
  System.out.println("Percentage marks = " +avg " % ");
	}
	}
  
  