package org.example;

import java.util.Arrays;

public class NonConstructibleChangeMain {
    public static void main(String[] args) {
        int[] coins = {5, 7, 1, 1, 2, 3, 22};
        //int[] coins = {3, 2, 7, 10, 1};
        try {
            int result = minUnreachableChange(coins);
            System.out.println("The minimum amount of change that cannot be created is: " + result);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    public static int minUnreachableChange(int[] coins) {
        Arrays.sort(coins); // Sort the coins in ascending order

        int minChange = 1; // Initialize the minimum change amount to 1

        for (int coin : coins) {
            // If the current coin is less than or equal to the current minimum change amount,
            // then we can form all sums up to minChange + coin - 1.
            // So, update minChange by adding the value of the current coin.
            if (coin <= minChange) {
                minChange += coin;
            } else {
                break; // If not, we've found the minimum unreachable change
            }
        }

        return minChange;
    }
}