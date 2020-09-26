import java.util.Scanner;
class Product{
      int pid;
      int price;
      int quantity;
    
    Product(int pid,int price,int quantity){
        this.pid=pid;
        this.price=price;
        this.quantity=quantity;
    }

    static int calculate(int p,int q)
    {
        return p*q;
    }

}

class ProductDemo{
   
    public static void main(String[] args) {
             Scanner sc=new Scanner(System.in);
                
            System.out.println("How Many record Wants To store.....");
            int size=sc.nextInt();
        
            Product arr[]=new Product[size];

            for(int i=0;i<arr.length;i++){
                System.out.println("************************************");
                System.out.println("Enter the Pid :");
                int pid=sc.nextInt();        

                System.out.println("Enter the price :");
                int price=sc.nextInt();        

                System.out.println("Enter the quantity :");
                int quantity=sc.nextInt();        

                Product p=new Product(pid,price,quantity);

                arr[i]=p;
            }

            int highest = arr[0].price;
            int pid=arr[0].pid;

            for(Product k:arr)
            {
                if(k.price > highest)
                { 
                    highest=k.price;
                    pid=k.pid;
                }

                int singleProduct=Product.calculate(k.price,k.quantity);
                System.out.println(k.pid+"of product on total amount spent on "+singleProduct);
            }


            System.out.println("\n");
            System.out.println("Highest price Product Pid = "+pid);
            
            
            
    }
}