package com.practice.question;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayListDuplicate {

    public static void main(String args[]) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(1);
        arrayList.add(3);
        System.out.println(arrayList);
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arrayList.size(); i++) {
            if (set.contains(arrayList.get(i))) {
                System.out.println(arrayList.get(i) + " is duplicated");
            } else set.add(arrayList.get(i));
        }
        System.out.println(set);
       /* List<Integer> arrayList1 = arrayList.stream().distinct().collect(Collectors.toList());
        System.out.println("ArrayList without duplicate elements: " + arrayList1);*/


    }
}