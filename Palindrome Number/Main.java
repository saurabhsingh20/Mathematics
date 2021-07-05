package com.Saurabh;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Palindrome(n));
    }

    public static boolean Palindrome(int n ){
        int rev = 0;
        int temp = n;
        while(temp != 0){
            int ld = temp % 10;
            rev = rev * 10 + ld;
            temp = temp/10;
        }
        return (rev == n);
    }
}
