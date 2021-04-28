package Zoho;
import java.util.*;
public class easeTheArray {
    public static void main(String[] args) {
        int arr[]={2, 2, 0, 4, 0, 8};
        modifyAndRearrangeArr(arr);
        for(int i:arr)
            System.out.print(i+" ");

    }
    static void modifyAndRearrangeArr (int arr[]) {
        int n=arr.length;
        for(int i=0;i<n-1;i++)
        {
            //checking whether the numbers are equal and non zero.
            //if yes. 2*arr[i] and arr[i+1]=0
            if(arr[i]==arr[i+1] && arr[i]!=0)
            {
                arr[i]=2*arr[i];
                arr[i+1]=0;
            }

        }
        int count=0;
        //zeros to last
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0)
            {
                int temp=arr[i];
                arr[i]=arr[count];
                arr[count]=temp;
                count++;
            }
        }
        // Complete the function
    }
}
