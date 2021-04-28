package Zoho;
import java.util.*;
public class specialArrayReversal {
    public static void main(String[] args) {
        //reverse string without reversing the symbols
        System.out.println("Vasa$%nt(h");
        System.out.println(reverse("Vasa$%nt(h"));

    }
    static String reverse(String str)
    {
        char[]c=str.toCharArray();
        int n=c.length;
        int i=0;
        int j=n-1;
        while(i<j)
        {
            if(!((c[i]>='a'&&c[i]<='z')||(c[i]>='A'&&c[i]<='Z')))
            {
                i++;
                continue;
            }
            if(!((c[j]>='a'&&c[j]<='z')||(c[j]>='A'&&c[j]<='Z')))
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
        String s1=new String(c);
        return s1;
    }
}
