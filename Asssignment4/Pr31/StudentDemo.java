class Student{
    int rno;
    String name;

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
        
        while(){
            Student st=new Student();
            int rno=10;
            String name="Sushil";
            st.setData(rno,name);
            st.showData();
        }
        
    }
}