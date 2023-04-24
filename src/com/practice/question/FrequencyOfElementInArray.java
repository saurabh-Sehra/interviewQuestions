package com.practice.question;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfElementInArray {

    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 22, 33, 11, 11, 55}; // Example array

           Map<Integer , Integer> map = new HashMap<>();

           for(int i = 0; i< arr.length; i++){
               int num = arr[i];
             if(map.containsKey(num)){
                 map.put(num , map.get(num) +1);
             }else {
                 map.put(num ,1);
             }
           }

           for(Map.Entry<Integer , Integer> entry : map.entrySet()){
               System.out.println( "Element "+ entry.getKey()+" occurs "+  entry.getValue()+"times");
           }
    }
}
