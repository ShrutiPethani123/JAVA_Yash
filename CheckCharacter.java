import java.util.Scanner;
public class CheckCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any chracter: ");
        char ch = sc.next().charAt(0);

        if(ch>='0' && ch<='9')
        {
            System.out.println("Number");
        }
        else if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
        {
            System.out.println("Alphabet");
        }else{
            System.out.println("Special character!!");
        }

    }
}
