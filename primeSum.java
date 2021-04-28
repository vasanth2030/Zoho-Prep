package Zoho;
import java.util.*;
public class primeSum {
    public static void main(String[] args) {
        System.out.println(isSumOfTwo(34));
        System.out.println(isSumOfTwo(21));

    }
    static String isSumOfTwo(int N){
        //Goldbach's conjecture states that any EVEN number greater than 2
        //is a perfect sum of two prime nos.
        if(N>2 &&N%2==0)    //EVEN NUMBER GREATER THAN 2
            return "Yes";
            //Sum of two prime numbers is always even. if it is odd,
            //then only possibility is it is added with 2.
            //so we check whether x-2 is a prime no or not.
        else if(N>2 && isPrime(N-2)==true)
            return "Yes";
        else
            return "No";
        // code here
    }
    static boolean isPrime(int n)
    {
        //to find whether given number is prime
        //while i^2 less than number. check whether it divides perfectly
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }
}
