package Zoho;
import java.util.*;
public class unionOfTwoArrays {
    public static void main(String[] args) {
        int arr1[]={1,2};
        int arr2[]={2,3,1,4,56};
        System.out.println(doUnion(arr1,arr2));

    }
    static int doUnion(int a[], int b[])
    {
        int n=a.length;
        int m=b.length;
        //append all elements to hashset. we can get union
        HashSet <Integer> h=new HashSet<Integer>();
        for(int i=0;i<n;i++)
            h.add(a[i]);
        for(int i=0;i<m;i++)
            h.add(b[i]);
        return h.size();
    }
}
