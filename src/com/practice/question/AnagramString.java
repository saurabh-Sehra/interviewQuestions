package com.practice.question;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AnagramString {

    public static void isAnagram(String str,String str2){

        String s1 =str.replaceAll("\\s","");
        String s2 =str2.replaceAll("\\s","");
        boolean status= true;
        if (s1.length() != s2.length()){
            status = false;
        }else {
            char[] c = s1.toLowerCase().toCharArray();
            char[] a = s2.toLowerCase().toCharArray();
            Arrays.sort(a);
            Arrays.sort(c);
            status = Arrays.equals(c, a);
        }
            if(status){
                System.out.println(" anagram");
            }else {
                System.out.println("not");
            }
        }

    public static void main(String args[]){
        isAnagram("HEART", "EARTH");
        isAnagram("TRIANGLE", "INTEGRAL");
        isAnagram("TOSS", "SHOT");

    }
}
