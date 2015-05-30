package com.hackbulgaria.corejava;

import java.util.HashMap;

public class Problems2Impl implements Problems2 {

    @Override
    public boolean isOdd(int number) {
        if (number % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }

    @Override
    public int min(int... array) {
        // TODO Auto-generated method stub
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    @Override
    public int kthMin(int k, int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int swap = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = swap;
                }
            }
        }
        return array[k - 1];
    }

    @Override
    public float getAverage(int[] array) {
        float sum = 0;
        for (int i : array) {
            sum += i;
        }

        return (sum / array.length);
    }

    @Override
    public long getSmallestMultiple(int upperBound) {

        return 0;
    }

    @Override
    public long getLargestPalindrome(long N) {

        return 0;
    }

    @Override
    public int[] histogram(short[][] image) {

        return null;
    }

    @Override
    public long doubleFac(int n) {
        int firstFac = 1;
        int secondFac = 1;
        for (int i = 1; i <= n; i++) {
            firstFac *= i;
        }
        for (int i = 1; i <= firstFac; i++) {
            secondFac *= i;
        }
        return secondFac;
    }

    @Override
    public long kthFac(int k, int n) {

        return 0;
    }

    @Override
    public int getOddOccurrence(int[] array) {
        HashMap<Integer, Integer> numbers = new HashMap<Integer, Integer>();
        for (Integer symbol : array) {
            if (numbers.containsKey(symbol)) {
                numbers.put(symbol, numbers.get(symbol) + 1);
            } else {
                numbers.put(symbol, 1);
            }
        }
        for (Integer currentKey : numbers.keySet()) {
            if (numbers.get(currentKey) % 2 != 0) {
                return currentKey;
            }
        }
        return 0;
    }

    @Override
    public long pow(int a, int b) {

        return 0;
    }

    @Override
    public long maximalScalarSum(int[] a, int[] b) {

        return 0;
    }

    @Override
    public int maxSpan(int[] array) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean canBalance(int[] array) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public int[][] rescale(int[][] original, int newWidth, int newHeight) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String reverseMe(String argument) {
        String reversed = new StringBuilder(argument).reverse().toString();
        return reversed;
    }

    @Override
    public String copyEveryChar(String input, int k) {
        for (int i = 0; i <= k; i++) {

        }
        return null;
    }

    @Override
    public String reverseEveryWord(String arg) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean isPalindrome(String argument) {
        if (argument.equals(reverseMe(argument))) {
            return true;
        }
        return false;
    }

    @Override
    public boolean isPalindrome(int number) {
        String numberToString = Integer.toString(number);
        if (isPalindrome(numberToString))
            return true;
        return false;
    }

    @Override
    public int getPalindromeLength(String input) {
        return 0;
    }

    @Override
    public int countOcurrences(String needle, String haystack) {

        return 0;
    }

    @Override
    public String decodeURL(String input) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int sumOfNumbers(String input) {

        return 0;
    }

    @Override
    public boolean areAnagrams(String A, String B) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean hasAnagramOf(String string, String string2) {
        // TODO Auto-generated method stub
        return false;
    }

}
