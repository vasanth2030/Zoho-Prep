package Zoho;
import java.util.*;
public class reversingTheVowels {
    public static void main(String[] args) {
        String s=modify("Vasenth");
        System.out.println(s);

    }
    static String modify(String s)
    {
        char[]c=s.toCharArray();
        int i=0;
        int j=c.length-1;
        while(i<j)
        {
            if(!isVowel(c[i]))
            {
                i++;
                continue;
            }
            if(!isVowel(c[j]))
            {
                j--;
                continue;
            }
            char temp=c[i];
            c[i]=c[j];
            c[j]=temp;
            i++;
            j--;

        }
        return String.valueOf(c);
        // your code here
    }
    static boolean isVowel(char c)
    {
        return(c=='a' ||c=='e' ||c=='i' ||c=='o' ||c=='u' ||c=='A' ||c=='E' ||c=='I' ||c=='O' ||c=='U' );
    }
}
