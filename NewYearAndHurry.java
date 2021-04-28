package Zoho;
import java.util.*;
public class NewYearAndHurry {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int k=s.nextInt();
        System.out.println(newYearCodeForces(n,k));

    }
    static int newYearCodeForces(int n,int k)
    {
        int rem_time=240-k;
        int presum[]=new int[10];
        presum[0]=5;
        for(int i=1;i<presum.length;i++)
        {
            presum[i]=presum[i-1]+(5*i);
        }
        for(int i=0;i<n;i++)
        {

            if(rem_time>=presum[i]) {
                if(i==n-1)
                    return i+1;
                else
                    continue;
            }
            else
                return i;
        }
        return -1;
    }

}
