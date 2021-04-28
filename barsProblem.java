package Zoho;
import java.util.*;
public class barsProblem {
    public static void main(String[] args) {
 /*Vasiliy likes to rest after a hard work, so you may often meet him in some bar nearby. As all programmers do, he loves the famous drink "Beecola", which can be bought in n different shops in the city. It's known that the price of one bottle in the shop i is equal to xi coins.

Vasiliy plans to buy his favorite drink for q consecutive days. He knows, that on the i-th day he will be able to spent mi coins. Now, for each of the days he want to know in how many different shops he can buy a bottle of "Beecola".
Input

The first line of the input contains a single integer n (1 ≤ n ≤ 100 000) — the number of shops in the city that sell Vasiliy's favourite drink.

The second line contains n integers xi (1 ≤ xi ≤ 100 000) — prices of the bottles of the drink in the i-th shop.

The third line contains a single integer q (1 ≤ q ≤ 100 000) — the number of days Vasiliy plans to buy the drink.

Then follow q lines each containing one integer mi (1 ≤ mi ≤ 109) — the number of coins Vasiliy can spent on the i-th day.
Output

Print q integers. The i-th of them should be equal to the number of shops where Vasiliy will be able to buy a bottle of the drink on the i-th day.*/
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int bars[]=new int[n];
        for(int i=0;i<n;i++)
        {
            bars[i]=s.nextInt();
        }
        int m=s.nextInt();
        int money;
        for(int i=0;i<m;i++)
        {
            money=s.nextInt();
            barProblem(money,bars);
        }



    }
    static void barProblem(int money,int bars[])
    {
        int n=bars.length;
        int countArr[]=new int[100001];
        for(int i=0;i<n;i++)
        {
            countArr[bars[i]]++;
        }
        for(int i=1;i<100001;i++)
        {
            countArr[i]=countArr[i]+countArr[i-1];
        }
        if(money>100000)
                System.out.println(money);
        else
            System.out.println(countArr[money]);
        }

    }
