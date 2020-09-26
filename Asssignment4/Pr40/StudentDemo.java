import java.util.Scanner;
class Student{
      int rollNo;
      String name;
      int age;
      int score;
    
    Student(int rollNo,String name,int age,int score){
        this.rollNo=rollNo;
        this.name=name;
        this.age=age;
        this.score=score;
    }
}

class StudentDemo{
    public static void main(String[] args) {
             Scanner sc=new Scanner(System.in);
                
            System.out.println("How Many Student record Wants To store.....");
            int size=sc.nextInt();
        
            Student arr[]=new Student[size];

            for(int i=0;i<arr.length;i++){
                System.out.println("************************************");
                System.out.println("Enter the rollNo :");
                int rollNo=sc.nextInt();        

                System.out.println("Enter the Name :");
                sc.nextLine();
                String name=sc.nextLine();        

                System.out.println("Enter the Age :");
                int age=sc.nextInt();        

                System.out.println("Enter the Score :");
                int score=sc.nextInt();        


                Student s=new Student(rollNo,name,age,score);

                arr[i]=s;
            }

            for(int j=0;j<arr.length;j++)
            {
                for(int k=j+1;k<arr.length;k++)
                {
                    if(arr[j].score>arr[k].score)
                    {
                        Student obj=arr[j];
                        arr[j]=arr[k];
                        arr[k]=obj;
                    }
                }
            }

        System.out.println("///////////////////////////////////////////////////////////////////");

            for(int m=0;m<arr.length;m++)
            {
                if(arr[m].score>=0 && arr[m].score<=50)
                {
                    System.out.println("\n\nGroup of [0-50] : SCORE "+arr[m].score);
                        System.out.println("Name : "+arr[m].name);
                        System.out.println("Roll No : " + arr[m].rollNo);
                        System.out.println("Age : "+ arr[m].age);
                }

                if(arr[m].score>50 && arr[m].score<=65)
                {
                    System.out.println("\n\nGroup of [50-65] : SCORE "+arr[m].score);
                        System.out.println("Name : "+arr[m].name);
                        System.out.println("Roll No : " + arr[m].rollNo);
                        System.out.println("Age : "+ arr[m].age);
                }

                if(arr[m].score>65 && arr[m].score<=80)
                {
                    System.out.println("\n\nGroup of [65-80] : SCORE "+arr[m].score);
                        System.out.println("Name : "+arr[m].name);
                        System.out.println("Roll No : " + arr[m].rollNo);
                        System.out.println("Age : "+ arr[m].age);
                }                

                if(arr[m].score>80 && arr[m].score<=100)
                {
                    System.out.println("\n\nGroup of [80-100] : SCORE "+arr[m].score);
                        System.out.println("Name : "+arr[m].name);
                        System.out.println("Roll No : " + arr[m].rollNo);
                        System.out.println("Age : "+ arr[m].age);
                }
            }
            // for(Student l:arr)
            // {
            //     System.out.println("roll :"+l.rollNo);
            //     System.out.println("name :"+l.name);
            //     System.out.println("Age :"+l.age);
            //     System.out.println("Score :"+l.score);
            // }            
    }
}