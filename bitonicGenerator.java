package Zoho;
import java.util.*;
public class bitonicGenerator {
    public static void main(String[] args) {
        //sort all even-placed numbers in increasing and odd-place numbers in decreasing order
        int arr[]={0, 1, 2, 3, 4, 5, 6, 7};
        bitonicGenerator(arr);
        for(int i:arr)
            System.out.print(i+" ");
    }
    static void bitonicGenerator(int arr[])
    {
        //create two arraylists to store values for even and odd
        //add the elements. sort them individually
        //then add them to original array
        int n=arr.length;
        ArrayList<Integer>even=new ArrayList<Integer>();
        ArrayList<Integer>odd=new ArrayList<Integer>();
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
                even.add(arr[i]);
            else
                odd.add(arr[i]);
        }
        Collections.sort(even);
        Collections.sort(odd,Collections.reverseOrder());
        for(int i=0;i<even.size();i++)
            arr[i]=even.get(i);
        for(int i=even.size();i<n;i++)
            arr[i]=odd.get(i-even.size());

    }
}
