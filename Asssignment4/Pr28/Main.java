import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Size of Students List");
        int size=sc.nextInt();
        String students[]=new String[size];

        for(int i=0;i<students.length;i++)
        {
            students[i]=sc.nextLine();
        }

        int count=1;
        for(String k:students)
        {
            System.out.println(count+" "+k);
            count++;
        }
    }
}