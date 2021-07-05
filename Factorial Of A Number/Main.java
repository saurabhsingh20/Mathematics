package com.Saurabh;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Factorial(n));
    }
    public static int Factorial(int n)
    {
        int res = 1;
        for(int i = 2; i <= n ; i++)
            res = res * i;
        return res;
    }
}
