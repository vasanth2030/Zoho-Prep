package Zoho;
import java.util.*;
public class removeDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int arr[]={1,1,2,2,2,3,4,5,6,6,7,8};
        int n=remove_duplicate(arr);
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
    static int remove_duplicate(int arr[]){
        int n=arr.length;
        int j=0;
        for(int i=0;i<n-1;i++)
        {
            //if arr[i] is not the same as arr[i+1] we append that to the array
            //even though there might exist extra characters we'll return the
            //size of the array and the modified array so the extra characters
            //can be ignored
            if(arr[i]!=arr[i+1])
            {
                arr[j++]=arr[i];
            }
        }
        arr[j++]=arr[n-1];
        return j;
        // code here
    }
}
