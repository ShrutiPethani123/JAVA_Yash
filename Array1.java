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
        // System.out.println();
        // for(int x: a)
        // {
        //     System.out.print(x+ " ");
        // }

        int odd[] = new int[a.length];
        int even[] = new int[a.length];

        int oddIndex=0,evenIndex=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%2==0)
            {
                even[evenIndex]=a[i];
                evenIndex++;
            }else{
                odd[oddIndex]=a[i];
                oddIndex++;
            }
        }

        System.out.println("\nEven Array: ");
        for(int i=0;i<evenIndex;i++)
        {
            System.out.print(even[i]+ " ");
        }

        System.out.println("\nOdd Array: ");
        for(int i=0;i<oddIndex;i++)
        {
            System.out.print(odd[i]+ " ");
        }



    }
}

/*

1. Take one array from user and print that array.
2. Take one array from user and count all negative number.
3. Take one array from user and print sum of all element.

    a - 1 5 4 2 3
    sum: 15

4. Take one array from user and find maximum element of array.

    a - 5 6 8 7  1 2
    max: 8

5. Take one array from user and add all even element into even array and all odd element into odd array.

    a - 4 7 5 1 2 3 6

    odd[] - 7 5 1 3
    even[] - 4 2 6






 */
