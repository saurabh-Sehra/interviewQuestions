package com.practice.question;

public class StringReverse {
    public static void main(String args[]) {


        String string = "Saurabh is good boy";
        System.out.println(string);
      StringBuilder stringBuilder = new StringBuilder(string);
      String reverseStr = stringBuilder.reverse().toString();
        System.out.println(reverseStr);

        String[] words = string.split(" ");
        StringBuilder stringBuilder1 = new StringBuilder();
        for (int i = words.length - 1; i>=0 ; i--){
                   stringBuilder1.append(words[i]).append(" ");

        }
        String reverseStr1 = stringBuilder1.toString();
        System.out.println(reverseStr1);
    }
}
