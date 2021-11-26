
/*cONVERT ENTERED CHARACTER TO UPPER AND LOWER CASES*/
import java.util.*;

public class Converting_Entered_Alphabet {
    public static void main(String[] args) {
        char ch, ch1, ch2;
        System.out.print("Enter any Character: ");
        Scanner sc = new Scanner(System.in);

        ch = sc.next().charAt(0);
        if (ch >= 'A' && ch <= 'Z') {
            ch1 = Character.toLowerCase(ch);
            System.out.println(ch1);
        } else {
            ch2 = Character.toUpperCase(ch);
            System.out.println(ch2);
        }
    }
}
/*
Enter any Character: a
A

Enter any Character: Z
z
*/
