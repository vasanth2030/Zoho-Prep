package Zoho;
import java.util.*;
public class distanceBetweenPoints {
    public static void main(String[] args) {
        System.out.println(distance(0, 0, 2, -2));
    }
    static int distance(int x1, int y1, int x2, int y2)
    {
        //distance between two points formula
        //root of((x1-x2)^2-(y1-y2)^2)
        int distance;
        distance=(int)Math.round(Math.pow(Math.pow(x1-x2,2)+Math.pow(y1-y2,2),0.5));
        return distance;
        // Code here
    }
}
