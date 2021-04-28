package Zoho;
import java.util.*;
public class reverseStringSpacesIntact {
    public static void main(String[] args) {
        System.out.println(reverseWithSpacesIntact("Vasanth is a good boy"));
    }
    static String reverseWithSpacesIntact(String S)
    {
        char c[]=S.toCharArray();
        int i=0;
        int j=c.length-1;
        while(i<j)
        {
            if(c[i]==' ')
            {
                i++;
                continue;
            }
            if(c[j]==' ')
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
}
