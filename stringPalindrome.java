package Zoho;
import java.util.*;
public class stringPalindrome {
    public static void main(String[] args) {
        String s="hannah";
        System.out.println(isPlaindrome(s));
    }
    static int isPlaindrome(String s) {
        char[]c=s.toCharArray();
        int n=c.length;
        int i=0;
        int j=n-1;
        while(i<j)
        {
            if(c[i]!=c[j])
                return 0;
            else{
                i++;
                j--;
            }

        }
        return 1;

        // code here
    }
}
