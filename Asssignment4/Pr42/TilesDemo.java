import java.util.Scanner;
class Tile{
    int length;

    Tile(int length){
        this.length=length;
    }
}


class Floor{
    int length;
    int width;

    Floor(int length,int width)
    {
        
        this.length=length;
        this.width=width;
    }

    void totalTiles(Tile t)
    {
        int fArea=length*width;
        int totalTiles=(int) fArea/t.length;
        System.out.println("\n"+totalTiles+" Tiles needed to cover the floor completely");
    }
}

class TilesDemo {
   
    public static void main(String[] args) {
             Scanner sc=new Scanner(System.in);
              
            System.out.println("Enter the Tile length");
            int tSize=sc.nextInt();

            Tile t=new Tile(tSize);

            System.out.println("Enter the length of Floor:");
            int len=sc.nextInt();

            System.out.println("Enter the width of Floor:");
            int width=sc.nextInt();
            
            Floor f=new Floor(len,width);
            f.totalTiles(t);
    }
}