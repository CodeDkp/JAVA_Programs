//Copy Array elements to another elements
public class Copy_Array_Elements {
  public static void main(String [] s)
  {
      int a[]={10,20,30,40,50};
      int b[]=new int[a.length];
      for(int i=0;i<=a.length-1;i++)
      {
          b[i]=a[i];
      }

      System.out.print("Elements of array a are: ");
      for(int c:a)
      System.out.print(c+" ");

      System.out.print("\nElements of array b are: ");
      for(int c:b)
      System.out.print(c+" ");
  }  
}
/*
Elements of array a are: 10 20 30 40 50 
Elements of array b are: 10 20 30 40 50
*/
