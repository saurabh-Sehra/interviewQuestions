package com.practice.question;

public class LargestElementInArray {

    public static void findLargestTwo(int[] arr) {
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++) {
            if(arr[i] > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = arr[i];
            }
            else if(arr[i] > secondLargest && arr[i] != firstLargest) {
                secondLargest = arr[i];
            }
        }

        System.out.println("First largest element: " + firstLargest);
        System.out.println("Second largest element: " + secondLargest);
    }


    public static void main(String args[]){
    int[] arr = {1,2,3,3,7,9,20};
        findLargestTwo(arr);



}
}
