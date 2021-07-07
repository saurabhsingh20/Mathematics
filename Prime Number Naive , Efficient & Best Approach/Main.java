package com.Saurabh;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(BestPrime(n));
    }
    public static boolean isPrime(int n )
    {
        if(n == 1)
            return false;
        for(int i = 2 ; i < n ; i++)
            if (n % i == 0)
                return false;
        return true;
    }

    public static boolean EfficentPrime(int n)
    {
        if( n == 1 )
            return false;
        for(int i = 2 ; i*i <= n ; i++)
            if( n % i == 0)
                return false;
        return true;
    }

    public static boolean BestPrime(int n)
    {
        if( n == 1)
            return false;
        if(n == 2 || n == 3)
            return false;
        if( n % 2 == 0 || n % 3 == 0)
            return false;
        for(int i = 5; i*i<=n;i=i+6)
            if(n % 2 ==0 || n %(i+2)==0)
                return false;
            return true;
    }
}
