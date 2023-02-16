/*
boolean - nextBoolean();
byte - nextByte();
short - nextShort();
int - nextInt();
long - nextLong();
float - nextFloat();
double - nextDouble();
// char - nextChar() - invalid

String - next()  , nextLine()
char - next().charAt(0)


 */

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        
        // class_Name object_name = new class_name();
        Scanner sc = new Scanner(System.in); 
        // System.out.println("Enter a no: ");
        // byte b = sc.nextByte();
        // int c = sc.nextInt();

        // System.out.println("Enterd value is: "+ c);

        System.out.println("Enter your name:  ");
        String name;
        // name = sc.next();
        // name = sc.nextLine();
        sc.nextLine();
        // char ch = sc.next().charAt(0);
        System.out.println("Name is: "+ ch);


    }
}

/*

Make one form  take values from user:

Fname (String)
Lname (String)
Address (String)
age (byte)
roll no (long)
Departmant(String)
spi (float)
gender(M,F)(char)
want to become Alumani (True , False )(Boolean)?







 */
