package Zoho;
import java.util.*;
public class SumOfElementsInaMatrix {
    public static void main(String[] args) {
        int mat[][]={{10,20,30},{40,50},{70,80,90}};
        for(int i[]: mat)
        {
            for(int j: i)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println("\n");
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[i].length;j++)
            {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
