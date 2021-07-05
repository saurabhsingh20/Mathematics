package com.Saurabh;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(Count(x));
    }
    public static long Count(int x){
        int res = 0;
        while(x>0){
            x = x/10;
            res ++;
        }
        return res;
    }
}
