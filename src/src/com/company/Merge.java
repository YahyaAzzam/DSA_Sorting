package com.company;

import java.util.Arrays;

public class Merge implements Sort {

    private int place = 1;
    private int[][] intermediate;

    public int[][] sort(int[] array, boolean steps) {
        if (steps) {
            intermediate = new int[array.length*(int)(Math.log(array.length)/Math.log(2))+2][array.length];
            intermediate[0] = array.clone();
        } else intermediate = new int[1][array.length];
        mergeSort(array, 0, array.length - 1, steps);
        if (!steps) intermediate[0] = array.clone();
        return Arrays.copyOfRange(intermediate, 0, place);
    }

    private void mergeSort(int[] array, int left, int right, boolean steps) {
        if (left < right) {
            int middle = (left + right) / 2;
            mergeSort(array, left, middle, steps);
            mergeSort(array, middle + 1, right, steps);
            merge(array, left, middle, right, steps);
        }
    }

    private void merge(int[] array, int left, int middle, int right, boolean steps) {
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