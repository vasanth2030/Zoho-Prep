package Zoho;
import java.util.*;
public class findDuplicatesInArray {
    public static void main(String[] args) {
        int arr[]={2,3,1,2,3};
        ArrayList<Integer> a=duplicates(arr);
        for(int i:a)
            System.out.print(i+" ");
    }
    static ArrayList<Integer> duplicates(int arr[]) {
        int n=arr.length;
        int max=0;
        for(int i=0;i<n;i++)
        {
            //creating an array of maximum element
            if(arr[i]>max)
                max=arr[i];
        }
        int arr1[]=new int[max+1];
        for(int i=0;i<n;i++)
        {
            //creating a hashtable/ hash array to count occurences
            arr1[arr[i]]++;
        }
        ArrayList<Integer> a=new ArrayList<Integer>();
        for(int i=0;i<arr1.length;i++)
        {
            if(arr1[i]>1)
                a.add(i);

        }
        if(a.isEmpty())
        {
            a.add(-1);
            return a;
        }
        return a;
        // code here
    }
}
