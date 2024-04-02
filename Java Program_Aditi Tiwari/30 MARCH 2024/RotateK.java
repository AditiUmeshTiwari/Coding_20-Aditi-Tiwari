import java.util.*; 
class RotateK
{
 static void RightRotate(int a[],int n, int k)           
{
    k=k%n;
    for(int i = 0; i < n; i++)
    {
        if(i<k)
  	 {
            System.out.print(a[n + i - k]+ " ");   
        }
        else
        { 
            System.out.print(a[i - k]+ " ");
        }
    }
}
public static void main(String args[])
{
    int Array[] = {1, 2, 3, 4, 5,6,7,8};
    Scanner  sc = new Scanner(System.in);
    System.out.println("Enter the value of k : ");
    int K = sc.nextInt();
    RightRotate(Array,Array.length, K);
}
}