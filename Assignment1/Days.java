import java.util.Scanner;
class Days {

    public static void main(String[] Strings) {



        Scanner input = new Scanner(System.in);

        System.out.print("Input the number of days: ");

        double min = input.nextDouble();

        long years = (long) (min / 365);
		long months = (long) (min % 365) / 30 ;
        int days = (int) (min % 365 % 12 );

        System.out.println(" Years "+years);
		System.out.println(" Months "+months);
		System.out.println(" Days "+days);
    }
	}