package com.company;

public class InPlaceSorts {
    public static void bubbleSort(String[] list1) {
        boolean isSorted = false;
        int lastSorted = list1.length - 1;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < lastSorted; i++) {
                if (list1[i].compareTo(list1[i+1]) > 0) {
                    String temp = list1[i+1];
                    list1[i+1] = list1[i];
                    list1[i] = temp;
                    isSorted = false;
                }
            }
            lastSorted--;
        }
    }

    public static void selectionSort(double[] list1) {
        int swapPos = 0;
        double minValue = 0;
        for (int i = 0; i < list1.length; i++) {
            swapPos = i;
            minValue = list1[i];
            for (int x = i + 1; x < list1.length; x++) {
                if (list1[x] < minValue) {
                    swapPos = x;
                    minValue = list1[x];
                }
            }
            double temp = list1[i];
            list1[i] = minValue;
            list1[swapPos] = temp;
        }
    }

    public static void insertionSort (int[] list1) {
        for (int i = 1; i < list1.length; i++) {
            int currHold = list1[i];
            int currPos = i;
            while (currPos > 0 && list1[currPos -1] > currHold) {
                list1[currPos] = list1[currPos - 1];
                currPos--;
            }
            list1[currPos] = currHold;
        }
    }
}