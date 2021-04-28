package Zoho;
import java.util.*;
public class rearrangeArrayAlternatively {
    public static void main(String[] args) {
        /*Given a sorted array of positive integers.
        Your task is to rearrange  the array elements
        alternatively i.e first element should be max
         value, second should be min value, third should
         be second max, fourth should be second min and
         so on.*/
        int arr[]={1,2,3,4,5,6};
        rearrange(arr);
        for(int i:arr)
            System.out.print(i+" ");
    }
    static void rearrange(int arr[]){
        int n=arr.length;
        int max_index=n-1;
        int min_index=0;
        //in sorted array max element is always the last element
        int max=arr[n-1]+1;
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            {
                arr[i]=arr[i]+arr[max_index]%max*max;
                max_index--;
            }
            else
            {
                arr[i]=arr[i]+arr[min_index]%max*max;
                min_index++;
            }

        }
        for(int i=0;i<n;i++)
            arr[i]=arr[i]/max;

    }
}
