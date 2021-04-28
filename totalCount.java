package Zoho;
import java.util.*;
public class totalCount {
    public static void main(String[] args) {
     /*Given an array Arr of N positive integers and a number K
     where K is used as a threshold value to divide each element
      of the array into sum of different numbers. Find the sum of
      count of the numbers in which array elements are divided.*/
        int arr[]={5, 8, 10, 13};
        int k=3;
        System.out.println(totalCount(arr,k));
    }
    static int totalCount(int[] arr, int k) {
        int count=0;
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            //we just increment if the number is less than k
            if (arr[i]<=k)
                count++;
            else
            {
                int m=(arr[i]/k);
                count=count+m;
                //we add the quotient to find number of times it can be divided
                if(arr[i]%k!=0)
                    //if reminder is zero,it is perfectly divided so cant increment
                    count++;

            }
        }
        return count;
        // code here
    }
}
