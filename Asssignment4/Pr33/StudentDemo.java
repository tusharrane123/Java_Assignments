import java.util.Scanner;
class Student{
   private int roll;
   private String name;
    
    Student(){
        this.roll=0;
        this.name="default";    
    }

    Student(int roll,String sname){
        this.roll=roll;
        this.name=sname;    
    }
    
    

    public void showData()
    {
        System.out.println("Roll No = "+roll);
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
                sc.nextLine();
                studName=sc.nextLine();

                Student st=new Student(roll,studName);
                System.out.println("****************************************");
                st.showData();
            }
        }while(choice!='n');
        
    }
}