import java.util.Scanner;
class Product{
      int pid;
  

        Product()
        {
            System.out.println("Product Class parameterless Constructor called");
        }
    Product(int pid){
         this();  //this line will call to parameterless constructor of current object
        this.pid=pid;
        System.out.println("Parameterised constructor called");
    }
}

class ProductDemo{
   
    public static void main(String[] args) {
             Scanner sc=new Scanner(System.in);
                
                Product p=new Product(1);
    }
}