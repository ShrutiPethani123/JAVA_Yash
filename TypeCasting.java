/*
  
Implicite Type Casting : byte -> short ->int -> long -> float-> double
Explicite Type Casting : double -> float -> long -> int -> short -> byte

 */

public class TypeCasting{

    public static void main(String[] args) {
        
        // int a=30;
        // float f=a;

        // float f = 56.34f;
        // int a=(int)f;

        // long a=34554623332l;
        // float f = a;

        float f = 34.57658f;
        // long a = (long)f;
        long a = (int)f;

        System.out.println(a);
        System.out.println(f);



    }  
}

