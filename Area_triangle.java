
/*Area of thriangle */
import java.util.*;

//import java.lang.*;//java .lang package is the bydefault package imorted in every program.
public class Area_triangle {
    public static void main(String[] args) {
        double a, b, c, area, sp;
        System.out.print("Enter the sides of the triangle: ");
        Scanner sc = new Scanner(System.in);

        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        sp = (a + b + c) / 2;// sp is Called as Semi parameter

        area = Math.sqrt(sp * (sp - a) * (sp - b) * (sp - c));
        System.out.println("Area of the Triangle = " + area);
    }
}
/*
 * Enter the sides of the triangle: 12 16 20 Area of the Triangle = 96.0
 */
