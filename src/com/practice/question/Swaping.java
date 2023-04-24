package com.practice.question;

public class Swaping {

    public static void  main(String args[]){

        int a= 10;
        int b=20;
        int c;
//with third variable
       /* c = a;
        a= b;
        b=c;*/

        //without third variable
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a = "+a+"  "+"b = "+b);
    }
}
