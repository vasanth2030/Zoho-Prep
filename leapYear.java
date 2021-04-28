package Zoho;
import java.util.*;
public class leapYear {
    public static void main(String[] args) {
        int n=2021;
        if(isLeap(n))
            System.out.println("Leap Year");
        else
            System.out.println("Not Leap Year");
    }
    static boolean isLeap(int N){
        if(N%100!=0 && N%4==0)
            return true;
        else if(N%400==0)
            return true;
        else
            return false;
        //code here
    }
}
