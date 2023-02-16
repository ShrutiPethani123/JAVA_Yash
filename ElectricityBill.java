import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        
        int unit;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter unit: ");
        unit=sc.nextInt();
        double bill=0;

        if(unit<=50)
        {
            bill = unit*0.50;
        }
        else if(unit<=150) // unit>=50 && unit<=150
        {
            bill = 50*0.50 + (unit-50)*0.75;
        }
        else if(unit<=250)
        {
            bill = 100 + (unit-150)*1.20;
        }else{
            bill = 220 + (unit-250)*1.50;
        }

        System.out.println("Total bill is: "+ bill);


    }

}
