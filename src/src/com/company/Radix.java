package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Radix implements Sort{

    public int[][] sort(int[] array, boolean steps) {
        int place = 1, max = 0, n = 0,next, using;
        for (int k : array) {
            max = Math.max(max, Math.abs(k));
            if (k < 0) n++;
        }
        max = (int) Math.log10(max) + 1;
        int[] negative = new int[n], positive = new int[array.length-n];
        int a = 0, b = 0;
        for (int k : array) {
            if (k < 0) negative[a++] = k;
            else positive[b++] = k;
        }
        int[][] intermediate;
        if (steps) {
            intermediate = new int[max+1][array.length];
            intermediate[0] = array.clone();
        } else intermediate = new int[1][array.length];
        int[][] buckets = new int[10][array.length];
        int[] pop = new int[10];

        for (int i = 0; i < max; i++) {
            for (int j : positive) {
                next = (j / (int) Math.pow(10, i)) % 10;
                buckets[next][pop[next]++] = j;
            }
            next = 0;
            for (int j = 0; j < 10; j++) {
                using = 0;
                while (pop[j] != 0) {
                    positive[next++] = buckets[j][using++];
                    pop[j]--;
                }
            }
            for (int j : negative) {
                next = ((-j) / (int) Math.pow(10, i)) % 10;
                buckets[next][pop[next]++] = j;
            }
            next = 0;
            for (int j = 0; j < 10; j++) {
                using = 0;
                while (pop[j] != 0) {
                    negative[next++] = buckets[j][using++];
                    pop[j]--;
                }
            }
            if (steps) {
                for (int k : negative) {
                    intermediate[place][--next] = k;
                }
                System.arraycopy(positive, 0, intermediate[place], n, positive.length);
                place++;
            }
        }
        next=n;
        for (int k : negative) {
            array[--next] = k;
        }
        System.arraycopy(positive, 0, array, n, positive.length);
        if (!steps) intermediate[0] = array.clone();
        return intermediate;
    }
}
