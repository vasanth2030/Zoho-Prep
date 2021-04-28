package Zoho;
import java.util.*;
public class findMissinginSecondArray {
    public static void main(String[] args) {
        int arr1[]={1, 2, 3, 4, 5, 10};
        int arr2[]={2, 3, 1, 0, 5};
        ArrayList<Integer> a=new ArrayList<Integer>(findMissing(arr1,arr2));
        for(int i: a)
            System.out.print(i+" ");
    }
    static ArrayList<Integer> findMissing(int A[], int B[])
    {
        ArrayList<Integer>ans=new ArrayList<Integer>();
        HashSet<Integer> h=new HashSet<Integer>();
        int N=A.length;
        int M=B.length;
        for(int i=0;i<M;i++)
        {
            //we add all elements of B to a hashset
            h.add(B[i]);
        }
        for(int i=0;i<N;i++)
        {
            //now we check whether the hashset comtains the elements
            //if not we add it to the resultant arraylist
            if(!h.contains(A[i]))
                ans.add(A[i]);
        }
        return ans;
    }
}

