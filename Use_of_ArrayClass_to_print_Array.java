//java program to print array elements using array class method
/*toString() asList() deepToString()*/

import java.util.Arrays;
public class Use_of_ArrayClass_to_print_Array {
    public static void main(String [] s)
    {
        String a[]={"Learn","Cooding","KeyPoints","Education"};

        System.out.println("Using toString() Method "+Arrays.toString(a));

        System.out.println("Using asList() Method"+Arrays.asList(a));

        int arr[][]={{10,20,30},{40,50,60}};
        System.out.println("Using deepToString() method "+Arrays.deepToString(arr));
    }
}
//Using toString() Method [Learn, Cooding, KeyPoints, Education]
//Using asList() Method[Learn, Cooding, KeyPoints, Education]
//Using deepToString() method [[10, 20, 30], [40, 50, 60]]
