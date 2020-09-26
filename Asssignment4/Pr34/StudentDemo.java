//Calculate Area Of circle

import java.util.Scanner;
class Student{
   private float radius;
   private float area;
    public  final float PI=3.14f;
    
    void init(float radius){
        this.radius=radius;   
    }

    void calculateArea(){
          this.area=PI*radius*radius;
    }
    
    public void display()
    {
        System.out.println("Area = "+area);
    }
}

class StudentDemo{
   
    public static void main(String[] args) {
        
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter The Radius ");
            float radius=sc.nextFloat();
            Student st=new Student(); 
            st.init(radius);  
            st.calculateArea();
            st.display();
    }
}