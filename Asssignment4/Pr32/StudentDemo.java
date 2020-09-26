import java.util.Scanner;
class Student{
   private int rno;
   private String name;
    static int count=0;

    Student(int roll,String sname){
        rno=roll;
        name=sname;
        count++;
    }
    public void setData(int r,String n){
        rno=r;
        name=n;
    }

    public void showData()
    {
        System.out.println("Roll No = "+rno);
        System.out.println("Name = "+name);
    }
}

class StudentDemo{
   
    public static void main(String[] args) {
        char choice;
        do{
            System.out.println("You want to Add Student Info if Yes press y/n");
            Scanner sc=new Scanner(System.in);
             choice=sc.next().charAt(0);
            if(choice=='y' || choice=='Y')
            {
                int roll;
                String studName;
                System.out.println("Enter the Roll No ");
                roll=sc.nextInt();
                System.out.println("Enter the Name ");
                studName=sc.next();

                Student st=new Student(roll,studName);
                
            }
        }while(choice!='n');
        
        System.out.println(Student.count+" Students Object Created");

    }
}