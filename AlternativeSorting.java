package Zoho;
import java.util.*;
public class AlternativeSorting {
    public static void main(String[] args) {
        int arr[]={7, 1, 2, 3, 4, 5, 6};
        ArrayList<Integer> ans=new ArrayList<Integer>(alternateSort(arr));
        for(int i: ans)
            System.out.print(i+" ");
    }
    static ArrayList<Integer> alternateSort(int arr[])
    {
        int N=arr.length;
        Arrays.sort(arr);
        ArrayList<Integer> a=new ArrayList<Integer>();
        int k=-1;
        for(int i=0;i<N;i++)
        {
            //we use extra variable k to keep track of the inserted elements
            if(i%2==0)
                a.add(arr[N-1-(++k)]);
            else
                //k is not incremented for odd to maintain the numbers
                //always even is executed first. so no problem.
                a.add(arr[k]);
        }
        return a;
        // Your code goes here

    }
}
