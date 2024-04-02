import java.util.Arrays;
class RotateLeft
{
    static void rotateNum(int a[])
    {
        int i=0,j=(a.length-1),temp;
        temp = a[i];
        for(i=1;i<a.length;i++)
        {
        a[i-1] =a[i];
        }
        a[a.length-1]=temp;
        System.out.println("Left Rotated Array is :"+Arrays.toString(a));
    }
    public static void main(String args[])
    {
        int a[] = {1,2,3,4,5,6,7,8};
        System.out.println("Original Array is : "+Arrays.toString(a));
        rotateNum(a);
    }
}