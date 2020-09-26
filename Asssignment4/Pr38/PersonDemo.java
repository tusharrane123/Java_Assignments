import java.util.Scanner;
class Employee{
    private static int empNo=0;
   private int salary;
   private static int totalSalary=0;
    
    Employee(int salary){
        this.empNo++;
        this.salary=salary;
        this.totalSalary+=salary;
    }

    public void display()
    {
        System.out.println("empNo = "+empNo);
        System.out.println("Salary = "+salary);
        System.out.println("Total Salary = "+totalSalary);
    }
}

class PersonDemo {
   
    public static void main(String[] args) {
             Scanner sc=new Scanner(System.in);
                int n=0;
            System.out.println("How Many record Wants To store.....");
            int size=sc.nextInt();

            Employee arr[]=new Employee[size];
           
            while(n<size)
            {
            System.out.println("Enter the Salary:");
            int salary=sc.nextInt();
            
            Employee e=new Employee(salary);
            arr[n]=e;
            n++;
            System.out.println("*****************************");
            
            e.display();

            System.out.println("*****************************");
            
            }
    }
}