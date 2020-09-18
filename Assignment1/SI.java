import java.util.Scanner;
 class SI{
 public static void main(String args[]) {
 int pri, time;
 float roi, SI;
  Scanner s = new Scanner(System.in);
  System.out.print("Enter Principle:");
  pri = s.nextInt();
  
  System.out.print("Enter time:");
  time = s.nextInt();
  
  System.out.print("Enter rate of interest:");
  roi = s.nextFloat();
  SI = pri * time * roi;
  
  System.out.println(SI);
  }
  }
  