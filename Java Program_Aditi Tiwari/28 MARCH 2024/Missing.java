import java.util.Scanner;
class Missing{
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the n value: ");
      int n = sc.nextInt();
      int Array[] = new int[n];
      System.out.println("Enter (n-1) numbers: ");
      for(int i=0; i<=n-2; i++) {
         Array[i] = sc.nextInt();
      }
      int sumOfAll = (n*(n+1))/2;
      int sumOfArray = 0;
      for(int i=0; i<=n-2; i++) {
         sumOfArray = sumOfArray+Array[i];
      }
      int missingNumber = sumOfAll-sumOfArray;
      System.out.println("Missing number is: "+missingNumber);
   }
}
