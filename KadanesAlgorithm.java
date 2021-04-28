package Zoho;
import java.util.*;
public class KadanesAlgorithm {
    public static void main(String[] args) {
        int arr[]={1,2,3,-2,5};
        System.out.println(maxSubArray(arr));
        int arr1[]={-1,-2,-3,-4};
        System.out.println(maxSubArray(arr1));

    }
    static int maxSubArray(int arr[])
    {
        int sum=0;
        int max=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            if(sum>max)
                max=sum;
            if(sum<0)
                sum=0;

        }
        return max;
    }
}
