package Zoho;
import java.util.*;
public class sumOfPrimesDigits {
    public static void main(String[] args) {
        int n=333;
        System.out.println(primeSum(n));
    }
    static int primeSum(int N){
        //compute sum of primes nos as digits in the number
        int sum=0;
        int rem;
        while(N>0)
        {
            rem=N%10;
            if(rem==2||rem==3||rem==5||rem==7)
                sum+=rem;
            N=N/10;
        }
        return sum;
        // code here
    }
}
