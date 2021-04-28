package Zoho;
import java.util.*;
public class mergeWithoutExtraSpace {
    public static void main(String[] args) {
        int arr1[] = {1, 3, 5, 7};
        int arr2[] = {0, 2, 6, 8, 9};
        merge(arr1,arr2);
        for(int i: arr1)
            System.out.print(i+" ");
        for(int i: arr2)
            System.out.print(i+" ");


    }
    static void merge(int arr1[], int arr2[])
    {
        int n=arr1.length;
        int m=arr2.length;
        int i=0;
        int j=n-1;
        while(j>=0&&i<m)
        {
            //the idea is to bring all min elements to first array
            //so check max of first array with min of second array
            //if it's greater then swap
            //else increment i and j
            if(arr1[j]>=arr2[i])
            {
                int temp=arr1[j];
                arr1[j]=arr2[i];
                arr2[i]=temp;
            }
            i++;
            j--;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        // code here
    }
}
