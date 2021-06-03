package com.edabit;

/**
 * Create a function that finds how many prime numbers there are, up to the given integer.
 * <p>
 * Examples
 * primeNumbers(10) ➞ 4
 * // 2, 3, 5 and 7
 * <p>
 * primeNumbers(20) ➞ 8
 * // 2, 3, 5, 7, 11, 13, 17 and 19
 * <p>
 * primeNumbers(30) ➞ 10
 * // 2, 3, 5, 7, 11, 13, 17, 19, 23 and 29
 */
public class PrimeNumbers {

    public static int primeNumbers(int num) {
        int result = 0;

        for (int i = 2; i < num; i++) {
            if (checkIfPrime(i)){
                result++;
            }
        }
        return result;
    }

    private static boolean checkIfPrime(int num) {
        boolean flag = true;
        for (int i = 2; i < num; ++i) {
            if (num % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }

}
