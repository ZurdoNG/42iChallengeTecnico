package org.example;

import java.util.Arrays;

public class SmallestDifferenceMain {
    public static void main(String[] args) {
        try{
            int[] a = {1, 3, 15, 11, 2};
            int[] b = {23, 127, 235, 19, 8};
            /*int[] a = {3, 8, 4, 15, 10};
            int[] b = {7, 5, 1};*/

            int result = smallestDifference(a, b);
            System.out.println("The smallest difference is: " + result);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    public static int smallestDifference(int[] a, int[] b) {
        // Sort both arrays to simplify the comparison process
        Arrays.sort(a);
        Arrays.sort(b);

        // Initialize indices and a variable to track the smallest difference
        int i = 0;
        int j = 0;
        int minDifference = Integer.MAX_VALUE;

        // Compare elements from both arrays while iterating
        while (i < a.length && j < b.length) {
            // Calculate the absolute difference between current elements
            int difference = Math.abs(a[i] - b[j]);
            // Update the minimum difference if a smaller one is found
            minDifference = Math.min(minDifference, difference);

            // Move the index of the array with the smaller element
            if (a[i] < b[j]) {
                i++;
            } else {
                j++;
            }
        }

        return minDifference;
    }
}