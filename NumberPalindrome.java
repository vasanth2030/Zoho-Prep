package Zoho;
import java.util.*;
public class NumberPalindrome {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println(palindrome(n));

    }
    static String palindrome(int n)
    {
        String Y="Yes";
        String N="No";
        String s=String.valueOf(n);
        StringBuilder sb=new StringBuilder(s);
        sb=sb.reverse();
        String s1=sb.toString();
        if(s.equals(s1))
            return Y;
        else
            return N;
    }
    public String is_palindrome(int m)
    {
        String s=String.valueOf(m);
        char[]c=s.toCharArray();
        int n=c.length;
        int i=0;
        int j=n-1;
        while(i<j)
        {
            if(c[i]!=c[j])
                return "No";
            else
            {
                i++;
                j--;
            }
        }
        return "Yes";
    }
}

