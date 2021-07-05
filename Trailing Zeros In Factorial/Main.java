package com.Saurabh;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("For Naive Approch type:1 \nFor Efficient Approch type:2 ");
        int approach = sc.nextInt();
        if(approach == 1)
            System.out.println(countZero(n));
        else
        System.out.println(TrailingZero(n));
    }
    // Naive approach here after certain digit overflow occurs
    public static int countZero(int n ){
        int fact = 1 ;

        for(int i = 2 ; i <= n ; i++)
            fact = fact * i;
        int res = 0;
        while(fact % 10 == 0)
        {
            res ++;
            fact = fact / 10;
        }
        return res;
    }

    //Efficient  Approach
    public static int TrailingZero(int n )
    {
        int res = 0;
        for(int i = 5;i <= n ; i=i*5)
            res = res + n/i;
        return res;
    }
}
