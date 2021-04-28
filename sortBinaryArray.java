package Zoho;
import java.util.*;
public class sortBinaryArray {
    public static void main(String[] args) {
        int arr[]={0,1,1,0,0,0,1,1,1,0,0};
        int arr1[]=SortBinaryArray(arr);
        for(int i:arr1)
            System.out.print(i+" ");
    }
    static int[] SortBinaryArray(int arr[])
    {
        int n=arr.length;
        int count=0;
        for(int i=0;i<n;i++)
        {
            //same as print zeros to last. but here 1
            if(arr[i]==0)
            {
                int temp=arr[i];
                arr[i]=arr[count];
                arr[count]=temp;
                count++;
            }
        }
        return arr;
    }
}
