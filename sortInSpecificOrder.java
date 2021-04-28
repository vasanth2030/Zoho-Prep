package Zoho;
import java.util.*;
public class sortInSpecificOrder {
    public static void main(String[] args) {
        //goal is to sort odd numbers in descending order
        //even numbers in ascending order
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        sortIt(arr);
        for(int i:arr)
            System.out.print(i+" ");

    }
    static void sortIt(int arr[])
    {
        //we convert odd numbers to their respective negatives
        //now while sorting all the negative odd numbers come to front
        //then we remove the negative sign
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2!=0)
                arr[i]*=-1;
        }
        Arrays.sort(arr);
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2!=0)
                arr[i]*=-1;
        }
    }
}
