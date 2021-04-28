package Zoho;
import java.util.*;
public class secondLargestNumber {
    public static void main(String[] args) {
        int arr[]={1,3,6,98,3,2,6,9,42,6};
        System.out.println(print2largest(arr));
    }
    static int print2largest(int arr[])
    {
        int n=arr.length;
        int largest=arr[0];
        int second=-1;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>largest)
            {
                second=largest;
                largest=arr[i];
            }
            else if(arr[i]<largest &&arr[i]>second)
                second=arr[i];
        }
        return second;
        //CODE HERE
    }
}
