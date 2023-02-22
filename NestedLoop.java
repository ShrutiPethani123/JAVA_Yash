// Nested loop - loop inside loop

public class NestedLoop {
    
    public static void main(String[] args) {
        
        // for(int i=1;i<=5;i++)
        // {
        //     System.out.println("i");
        // }

        // for(int j=1;j<=5;j++)
        // {
        //     for(int i=1;i<5;i++)
        //     {
        //         System.out.print("Hello ");
        //     }
        //     System.out.println();
        // }
        System.out.println();
        
    //    int k;
    //     for(int j=1;j<=4;j++)
    //     {
    //         k=j;
    //         for(int i=1;i<5;i++)
    //         {
    //             System.out.print(k + " ");
    //             k+=j;
    //         }
    //         System.out.println();
    //     }

        for(int i=1;i<5;i++)
        {
            for(int j=1;j<5;j++)
            {
                if(j==1 || j==4 || i==1 || i==4)
                {
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }

            }
            System.out.println();
        }
    }
}

/*

1.

5 6 7 8
5 6 7 8
5 6 7 8
5 6 7 8

2.

2 2 2 2
3 3 3 3
4 4 4 4
5 5 5 5

3.

1 2 3 4
5 6 7 8
9 10 11 12

4.

2 4 6 
8 10 12
14 16 18
20 22 24

5.

1 2 3 4
2 4 6 8
3 6 9 12
4 8 12 16

6.

*
**
***
****
*****

7.

1 
2 3
4 5 6
7 8 9 10


8.
n=4

* * * *
*     *
*     *
* * * *


* * * * *
*       *
*       *
* * * * *

 */


