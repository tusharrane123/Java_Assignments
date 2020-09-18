import java.util.Scanner;
 class Circle{
 public static void main(String ag[]) {
  int rad;
  double pie = 3.14, ar , circum;
  Scanner s = new Scanner(System.in);
  System.out.print("Enter radius of circle:");
  rad = s.nextInt();
  ar = pie * rad * rad;
  circum = 2 * pie * rad;
  System.out.println("Area of circle:" + ar);
  System.out.println("Circmference of circle:" + circum);
 }
}