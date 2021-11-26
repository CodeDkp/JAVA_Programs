/*Search array Element and show its Index posn*/

public class Search_Array_Element {
   public static void main(String [] s)
   {
       int a[]={10,20,30,40,50};
       int n,count=0;
       System.out.println("Array Elements are: ");
       for(int z:a)
      System.out.print(z+" ");
      System.out.print("\nChoose a Number: ");
      java.util.Scanner sc =new java.util.Scanner(System.in);
      n=sc.nextInt();
      for(int i=0;i<a.length;i++)
      {
          if(a[i]==n)
          break;
          count++;
      }
      System.out.print("Entry Index is: "+count);

   } 
}
/*Array Elements are: 
10 20 30 40 50 
Choose a Number: 20
Entry Index is: 1*/
