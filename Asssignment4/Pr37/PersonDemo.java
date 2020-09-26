import java.util.Scanner;
class Person{
   private String name;
   private int age;
    
    Person(String name){
        this.name=name;
        this.age=18;
    }

    Person(String name,int age){
        this.name=name;    
        this.age=age;
    }
    
    

    public void display()
    {
        System.out.println("Name = "+name);
        System.out.println("Age = "+age);
    }
}

class PersonDemo{
   
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);

            System.out.println("Enter the Name :");
            String name=sc.nextLine();
            System.out.println("Enter the Age :");
            int age=sc.nextInt();
            
            System.out.println("*****************************");

            Person p=new Person(name,age);
            p.display();
            
            System.out.println("*****************************");
            Person p1=new Person("Jayesh");
            p1.display();

    }
}