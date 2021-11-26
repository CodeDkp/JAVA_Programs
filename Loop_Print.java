/*Different ways to print arrays*/
public class Loop_Print {
    public static void main(String [] s)
    {
        int a[] = new int[3];
        a[0]=10;
        a[1]=20;
        a[2]=30;

        for(int i=0;i<3;i++)
        {
            System.out.println(a[i]+ " ");
        }

        int b[]=new int[3];
        b[0]=100;
        b[1]=200;
        b[2]=300;

        for(int var : b)
        System.out.println(var+" ");
    }
}
/*
10 
20 
30
*/
//for each loop use for(var : name of array)
/*100
200
300*/