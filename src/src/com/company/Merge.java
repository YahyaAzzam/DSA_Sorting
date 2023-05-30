package com.company;

import java.util.Arrays;

public class Merge implements Sort {

    private int place = 1;
    private int[][] intermediate;
    private boolean steps;
    int[] array;

    public int[][] sort(int[] array, boolean steps) {
        this.steps = steps;
        this.array = array;
        if (steps) {
            intermediate = new int[array.length][array.length];
            intermediate[0] = array.clone();
        } else intermediate = new int[1][array.length];
        mergeSort(0, array.length - 1);
        if (!steps) intermediate[0] = array.clone();
        return Arrays.copyOfRange(intermediate, 0, place);
    }

    private void mergeSort(int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            mergeSort(left, middle);
            mergeSort(middle + 1, right);

            int n1 = middle - left + 1;
            int n2 = right - middle;

            int[] leftArray = Arrays.copyOfRange(array, left, left + n1);
            int[] rightArray = Arrays.copyOfRange(array, middle + 1, middle + 1 + n2);

            int i = 0, j = 0, k = left;

            while (i < n1 && j < n2) {
                if (leftArray[i] <= rightArray[j]) {
                    array[k] = leftArray[i];
                    i++;
                } else {
                    array[k] = rightArray[j];
                    j++;
                }
                k++;
            }

            while (i < n1) {
                array[k] = leftArray[i];
                i++;
                k++;
            }

            while (j < n2) {
                array[k] = rightArray[j];
                j++;
                k++;
            }
            if (steps) intermediate[place++] = array.clone();
        }
    }
}