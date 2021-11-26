public class Sum_of_Array_Elements {
    public static void main (String n [] )
    {
        int sum=0;
        int []a={10,20,30};

        for(int i=0;i<a.length;i++)
        sum+=a[i];

        System.out.println("Sum of the Array Elements are: "+sum);
    }
}
//Sum of the Array Elements are: 60
