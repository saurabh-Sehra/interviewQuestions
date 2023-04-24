package com.practice.question;

public class PalimdromStr {

    public static void main(String args[]) {

        String str = "racaar";
        StringBuilder stringBuilder = new StringBuilder(str);
        String reverse = stringBuilder.reverse().toString();
        System.out.println(reverse);
        if(str.equals(reverse))
            System.out.println("palindrom");
        else
            System.out.println("not palimdrom");


    }

}
