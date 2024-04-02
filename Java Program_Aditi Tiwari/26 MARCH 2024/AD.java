import java.util.*;

class AD
{
   static void printOrder(int[] a, int n)
   {
     int temp;
     for(int i=0;i < n-1;i++)
     {
        for(int j = 0;j < n/2; j++) { if(a[j]>a[j+1])
            {
              temp=a[j];
              a[j]=a[j+1];
              a[j+1]=temp;
            }
        }

        for(int j = n/2;j < n-1; j++)
        {
            if(a[j] < a[j+1])
            {
               temp=a[j];
               a[j]=a[j+1];
               a[j+1]=temp;
            }
         }
      }

      for(int i = 0; i < n; i++)
         System.out.print(a[i] + " ");

   }

   public static void main(String[] args)
   {
       int[] arr = new int[8];
	Scanner sc=new Scanner(System.in);
System.out.println("Enter the elements of array:\n");
for(int i=0;i< arr.length;i++)
{
arr[i]=sc.nextInt();
}
System.out.println("The elements of array:\n");
for(int i=0;i< arr.length;i++)
{
System.out.println(arr[i]);
}
       int n = arr.length;
       printOrder(arr, n);
    }
}