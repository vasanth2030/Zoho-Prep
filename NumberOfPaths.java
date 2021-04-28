package Zoho;
import java.util.*;
public class NumberOfPaths {
    public static void main(String[] args) {
        int m=3;
        int n=3;
        System.out.println(numberOfPaths(m,n));
        /*
        Let the given input 3*3 matrix is filled
        as such:
        A B C
        D E F
        G H I
        The possible paths which exists to reach
        'I' from 'A' following above conditions
        are as follows:ABCFI, ABEHI, ADGHI, ADEFI,
        ADEHI, ABEFI
        */

    }
    static int numberOfPaths(int m, int n) {
        if(m==1)
            return 1;
        if(n==1)
            return 1;
        //returns the number of paths
        return numberOfPaths(m-1,n)+numberOfPaths(m,n-1);

    }
}
