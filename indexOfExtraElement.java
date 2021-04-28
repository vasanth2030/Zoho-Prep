package Zoho;
import java.util.*;
public class indexOfExtraElement {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,7,8,9};
        int b[]={1,2,3,4,5,7,8};
        System.out.println(findExtra(arr,b));
    }
    static int findExtra(int a[], int b[]) {
        // since array B is one element less than A
        //we stop with the last before element
        //if there's no element that's extra before n-1,
        //then the extra element must be at last n-1th position
        int n=a.length;
        for(int i=0;i<n-1;i++)
        {
            if(a[i]!=b[i])
                return i;
        }
        return n-1;
    }
}
