/*Average of Arary Elements*/

public class Average_of_Array {
    public static void main(String [] s)
    {
        int []a={10,20,30,40,50};
        double sum=0;

        for(int i=0;i<a.length;i++)
        sum+=a[i];

        System.out.print("Average of the Array Elements is : "+sum/a.length);
    }
}
//Average of the Array Elements is : 30.0