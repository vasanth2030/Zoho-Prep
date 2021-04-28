package Zoho;
import java.util.*;
public class keyPair {
    public static void main(String[] args) {
        int arr[] = {1, 4, 45, 6, 10, 8};
        int x=16;
        if(hasArrayTwoCandidates(arr,x))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
    static boolean hasArrayTwoCandidates(int arr[], int x) {
        HashSet<Integer> h=new HashSet<Integer>();
        int n=arr.length;
        //we add all elements to hashset
        //check whether hashset has x-arr[i]...(i.e)the key pair
        for(int i=0;i<n;i++)
        {
            if(h.contains(x-arr[i]))
                return true;
            else
                h.add(arr[i]);
        }
        return false;
        // code here
    }
}
