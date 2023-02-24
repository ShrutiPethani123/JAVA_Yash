/*

Array: collection of similar type data


-> all elements of array have continuos memory location
-> index start with 0
-> index end with size-1

disadvantages:
1.

 */

import java.util.Scanner;
public class Array1 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        for(int i=0;i<a.length;i++)
        {
            System.out.print("Enter a[" + i +"]: ");
            a[i] = sc.nextInt();
        }

        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+ " ");
        }

        // for each
        System.out.println();
        for(int x: a)
        {
            System.out.print(x+ " ");
        }


    }
}

/*

1. Take one array from user and print that array.
2. Take one array from user and count all negative number.
3. Take one array from user and print sum of all element.




 */
