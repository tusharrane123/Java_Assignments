import java.util.Scanner;
class OneBHK{
      int roomArea;
      int hallArea;
      int price;
     static int totalPrice=0;

        OneBHK()
        {
            roomArea=50;
            hallArea=50;
            price=500000;
        }

        OneBHK(int room1,int hall,int price)
        {
            this();
            this.roomArea=room1;
            this.hallArea=hall;
            this.price=price;
            totalPrice+=price;
        }

    void show(){
        System.out.println("Room1 Area :"+roomArea);
        System.out.println("Hall Area:"+hallArea);
        System.out.println("Price :"+price);
    }
}


class TwoBHK extends OneBHK{
      int room2Area;
     
        TwoBHK()
        {
            this.room2Area=60;
        }

        TwoBHK(int room1,int hall,int price,int room2)
        {
            super(room1,hall,price);
            this.room2Area=room2;
        }

    void show(){
        System.out.println("Room1 Area :"+roomArea);
        System.out.println("Hall Area:"+hallArea);
        System.out.println("Price :"+price);
        System.out.println("Room2 Area :"+room2Area);
    }
}


class Demo{
   
    public static void main(String[] args) {
             Scanner sc=new Scanner(System.in);


             for(int i=0;i<3;i++)
             {
                System.out.println("Enter the Area of Room 1"); 
                int room1=sc.nextInt();

                System.out.println("Enter the Area of Room2"); 
                int room2=sc.nextInt();

                System.out.println("Enter the Area of Hall"); 
                int hall=sc.nextInt();

                System.out.println("Enter the Price of flat"); 
                int price=sc.nextInt();
                
                TwoBHK b=new TwoBHK(room1,hall,price,room2);
                b.show();

                System.out.println("All flats Total Price "+OneBHK.totalPrice);
             }
    }
}