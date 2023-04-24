package com.practice.question;

import java.util.Scanner;

public class ArmstrongNum {
public static void main(String args[]){

    Scanner scanner=new Scanner(System.in);
    System.out.println("enter number ");
    int num = scanner.nextInt();
    int sum = 0;
    int original= num;
    int b = Integer.toString(num).length();
    while(num>0) {
        int c = num % 10;
        double a = Math.pow(c, b);
        sum += a;
        num=num/10;
    }
    if(sum==original){
        System.out.println("ArmstrongNumber");
    }else {
        System.out.println("not ");
    }
}
}
