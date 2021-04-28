package Zoho;
import java.util.*;
public class numberOfOccurences {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,2,2,3,4,2,2};
        System.out.println(count(arr,2));
    }
    static int count(int[] arr, int x) {
        int count=0;
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==x)
                count++;
        }
        return count;
        // code here
    }
}
