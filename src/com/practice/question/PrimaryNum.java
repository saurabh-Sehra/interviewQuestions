package com.practice.question;

import java.util.Scanner;

public class PrimaryNum {

    static int i = 2;

    // Function check whether a number
    // is prime or not
    public static boolean isPrime(int n) {

        boolean isPrime = true;
        if (n <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
               // System.out.println(Math.sqrt(n));
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
return isPrime;
    }
    // Driver Code
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter First number ");
        int start = scanner.nextInt();
        System.out.println("enter last number ");
        int last = scanner.nextInt();
        //int num = scanner.nextInt();
       // System.out.println(Math.sqrt(4));
        for (int j= start; j<=last; j++){
           if( isPrime(j)){
               System.out.println(j);
           }
        }

      /*  if (isPrime(num)) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }*/
    }
}







