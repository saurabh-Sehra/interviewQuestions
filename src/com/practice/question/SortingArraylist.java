package com.practice.question;

import java.util.ArrayList;

public class SortingArraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(1);
        list.add(9);
        list.add(3);
        list.add(7);
        list.add(2);

        System.out.println("Original list: " + list);

        list.sort(Integer::compareTo);
        System.out.println(list);


        // sort the list using bubble sort
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - i - 1; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }

        System.out.println("Sorted list: " + list);
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(5);
        list1.add(1);
        list1.add(9);
        list1.add(3);
        list1.add(7);
        list1.add(2);
        System.out.println(list1);
        //Selection sort
        for(int i=0; i<list1.size()-1; i++) {
            int smallest = i;
            for(int j=i+1; j<list1.size(); j++) {

                if(list1.get(j) < list1.get(smallest)) {
                    smallest = j;
                }
            }
            //swap
            int temp = list1.get(smallest);
            list1.set(smallest,list1.get(i)) ;
            list1.set(i,temp);
        }
        System.out.println("using selection sort"+list1);
        System.out.println(" first largest  "+list1.get(list1.size()-1));
        System.out.println(" second largest  "+list1.get(list1.size()-2));


    }
}
