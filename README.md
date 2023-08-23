# 42iChallengeTecnico
Resolution of the two challenges in Java

# 1) Smallest Difference

Given two arrays of integers, compute the pair of values (one value in each array) with the smallest (non-negative) difference. 
Return the difference.

**Examples:**

`const a = [1, 3, 15, 11, 2];`

`const b = [23, 127, 235, 19, 8];`

`smallestDifference(a, b); // output: 3`

------------------------------------------

`const a = [10, 5, 40];`

`const b = [50, 90, 80];`

`smallestDifference(a, b); // output: 10`



# 2) Non-Constructible Change

Given an array of positive integers representing the values of coins in your possession, write a function that returns the minimum
amount of change (the minimum sum of money) that you **cannot** create. The given coins can have any positive integer value and aren’t 
necessarily unique (i.e., you can have multiple coins of the same value).

For example, if you’re given coins = `[1, 2, 5]`, the minimum amount of change that you can’t create is `4`. If you’re given no coins, 
the minimum amount of change that you can’t create is 1.

### **Sample Input**

`coins = [5, 7, 1, 1, 2, 3, 22]`

### **Sample Output**

`20`
