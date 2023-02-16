/*

-> If else
-> Switch
-> loops


-> simple if
-> else if
-> else if ladder
-> nested if

 */


 import java.util.Scanner;
public class ConditionalStatment {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("ENter a no: ");
        int n=sc.nextInt();

        // if(n>0)
        // {
        //     if(n>10)
        //     {
        //         System.out.println("Greater than 10");
        //     }else{
        //         System.out.println("Less than 10");
        //     }
        //     System.out.println("Positive");

        // }else if(n==0)
        // {
        //     System.out.print("zero\n");
        // }
        // else{
        //     System.out.println("Negative");
        // }

        if(n%5==0)
            System.out.println("Devisible by 5!!");
            // System.out.println("Thank you");
        else
            System.out.println("Not divisible by 5");
            System.out.println("Thank you");


    }
}

/*

1. Take one number from user and check number is positive , negative or zero.
2. Take one number from user and check number is odd or even.
3. Take two number from user and find minimum number.
4. Take Three number from user and find maximum number.
5. Take ruppess from user and count total number of  minimum notes.

    rs - 2567

    500 - 5
    200 - 0
    100 - 0
    50 - 1
    10 - 1
    5 - 1
    1 - 2

    rs = 2567
    n500 = 2567/500 = 5
    // rs= rs - 500*n500 (2567 - 500*5 = 67)
    rs = rs%500

    n200 = rs/200
    // rs = rs - 200*n200

6.  Write a program to input electricity unit charge and calculate the total 
	electricity bill according to the given condition:

	For first 50 units Rs. 0.50/unit
	For next 100 units Rs. 0.75/unit
	For next 100 units Rs. 1.20/unit
	For unit above 250 Rs. 1.50/unit

    
    unit = 30 
    bill = 30*0.50 = 15

    unit =120
    bill = 50 * 0.50 = 25
          70 * 0.75 = 52.5
          =77.5

    unit - 300
    bill
    50 * 0.50 = 25
    100 * 0.75 = 75
    100 * 1.20 = 120
    50 *  1.50 = 75

    bill=295





    class A{

        private int a
        static int b
        final int c=67;

        A()
        {
            a=5;
        }

        void add()
        {

        }

        void add(int a)
        {

        }

        void add(int a,int b)
        {

        }

    }


 */