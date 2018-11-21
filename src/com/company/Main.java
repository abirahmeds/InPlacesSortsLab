package com.company;

public class Main {
    public static void main (String[] args) {
        String[] strArr = randomStringArray(10000);
        double[] doubleArr = randomDoubleArray(10000);
        int[] intArr = randomIntArray(10000);

        long start, end;
        double elapsedTime = 0;
        start = System.currentTimeMillis();
        InPlaceSorts.bubbleSort(strArr);
        end = System.currentTimeMillis();
        elapsedTime = ((double)(end - start) / 1000);
        System.out.println("Bubble Sort Time: " + (elapsedTime) + " Seconds");

        start = System.currentTimeMillis();
        InPlaceSorts.selectionSort(doubleArr);
        end = System.currentTimeMillis();
        elapsedTime = ((double)(end - start) / 1000);
        System.out.println("Selection Sort Time: " + (elapsedTime) + " Seconds");

        start = System.currentTimeMillis();
        InPlaceSorts.insertionSort(intArr);
        end = System.currentTimeMillis();
        elapsedTime = ((double)(end - start) / 1000);
        System.out.println("Insertion Sort Time: " + (elapsedTime) + " Seconds");
    }

    /**
     * Generates a random Integer array from 0 - 10,000.
     * @param count Integer representing the length of the array.
     * @return 1D Integer Array.
     */
    public static int[] randomIntArray(int count) {
        int[] arr = new int[count];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 10000);
        }
        return arr;
    }

    /**
     * Generates a random Double array from  0 - 10,000.
     * @param count Integer representing the length of the array.
     * @return 1D Double Array.
     */
    public static double[] randomDoubleArray(int count) {
        double[] arr = new double[count];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (Math.random() * 100);
        }
        return arr;
    }


    public static String[] randomStringArray(int count) {
        String[] arr = new String[count];
        for (int i = 0; i < arr.length; i++) {
            int wordLength = (int)((Math.random() * 10) + 1);
            String word = "";
            for (int x = 0; x < wordLength; x++) {
                int randomChoice = (int)((Math.random() * 100) + 1);
                char ch;
                if (randomChoice > 50) {
                    ch = (char) ((int) ((Math.random() * 26) + 65));
                } else {
                    ch = (char) ((int) ((Math.random() * 26) + 97));
                }
                word+= ch;
            }
            arr[i] = word;
        }
        return arr;
    }
}