import java.util.Scanner;
abstract class Processor{
        int data;
       void showData()
       {
           System.out.println("Data :"+data);
       }

       abstract void process();
}

class Factorial extends Processor{
    int i,fact=1; 
        Factorial(int i)
        {
            data=i;
        }

        void process()
        {
                 
                for(i=1;i<=data;i++){    
                    fact=fact*i;    
                }    
                    
        } 

        void showData()
        {
          System.out.println("Factorial of "+data+" is: "+fact);    
        } 
}



class Circle extends Processor{
    final float PI=3.14F;
    float area;
        Circle(int i)
        {
            data=i;
        }

        void process()
        {
            area=(float) PI*data*data;    
                
        } 

        void showData()
        {
           System.out.println("Area of Circle is : "+area);    
        }
}


class AbstractDemo{
	public static void main(String args[]){

    Scanner sc=new Scanner(System.in);
    int no,ch;
    do{
        System.out.println("\n 1.Factorial \n 2.Area Of Circle \n 3.Exit");
        System.out.println("Enter the choice");
         ch=sc.nextInt();

        switch(ch)
        {
            case 1: System.out.println("Enter the number");
                    no=sc.nextInt();
                    Factorial f=new Factorial(no);
                    f.process();
                    f.showData();
            break;

            case 2: System.out.println("Enter the number");
                    no=sc.nextInt();
                    Circle c=new Circle(no);
                    c.process();
                    c.showData();
            break;

            case 3: System.exit(0);
            break;

            default: System.out.println("Invalid Input");
        }

    }while(ch!=3);
    
    }
}

