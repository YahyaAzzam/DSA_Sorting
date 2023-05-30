package com.company;

import java.util.Arrays;

public class Heap implements Sort {
  // HeapSort Start
    public int[][] sort(int[] array, boolean steps) {
        int[][] intermediate;
        if (steps) {
            double x = Math.log(array.length)/Math.log(2);
            int y = (int) Math.pow(2, (int) x), z = (int) Math.ceil(x) - 1, l = (z + 1) * (array.length - (int) Math.pow(2, z));
            y += (array.length - y)/2 + 1;
            for (int i = 0; i < z; i++) l += (i + 1) * (int) Math.pow(2, i);
            intermediate = new int[y + l][array.length];
            intermediate[0] = array.clone();
        } else intermediate = new int[1][array.length];
        int place = 1;
      // Build Max Heap Start
        int parent = array.length/2-1;
        if (array.length%2==0&&array[array.length-1]>array[parent]) {
            int swap = array[array.length-1];
            array[array.length-1] = array[parent];
            array[parent--] = swap;
            if (steps) intermediate[place++] = array.clone();
        }
        // Max Heapify Start
        for (; parent >= 0; parent--) {
            int p = parent, swap;
            while (array.length - 1 > (parent*2)+1 && array[parent] < Math.max(array[(parent*2)+1], array[(parent+1)*2])) {
                if (array[(parent*2)+1] >= array[(parent+1)*2]) {
                    swap = array[(parent*2)+1];
                    array[(parent*2)+1] = array[parent];
                    array[parent] = swap;
                    parent = (parent*2)+1;
                } else {
                    swap = array[(parent+1)*2];
                    array[(parent+1)*2] = array[parent];
                    array[parent] = swap;
                    parent = (parent+1)*2;
                }
                if (steps) intermediate[place++] = array.clone();
            }
            if (array.length - 1 == (parent*2)+1 && array[parent] < array[(parent*2)+1]) {
                swap = array[(parent*2)+1];
                array[(parent*2)+1] = array[parent];
                array[parent] = swap;
                if (steps) intermediate[place++] = array.clone();
            }
            parent = p;
        }
        // Max Heapify End
      // Build Max Heap End
        if (steps) place++;
        int last = array.length - 1;
        for (int i = 1; i < array.length; i++) {
          // Heap Extract Max Start
            int swap = array[0];
            array[0] = array[last];
            array[last] = swap;
            last--;
            parent = 0;
            if (steps) intermediate[place++] = array.clone();
            while (last > (parent*2)+1 && array[parent] < Math.max(array[(parent*2)+1], array[(parent+1)*2])) {
                if (array[(parent*2)+1] >= array[(parent+1)*2]) {
                    swap = array[(parent*2)+1];
                    array[(parent*2)+1] = array[parent];
                    array[parent] = swap;
                    parent = (parent*2)+1;
                } else {
                    swap = array[(parent+1)*2];
                    array[(parent+1)*2] = array[parent];
                    array[parent] = swap;
                    parent = (parent+1)*2;
                }
                if (steps) intermediate[place++] = array.clone();
            }
            if (last == (parent*2)+1 && array[parent] < array[(parent*2)+1]) {
                swap = array[(parent*2)+1];
                array[(parent*2)+1] = array[parent];
                array[parent] = swap;
                if (steps) intermediate[place++] = array.clone();
            }
            // Heap Extract Max End
        }
        if (!steps) intermediate[0] = array.clone();
        return Arrays.copyOfRange(intermediate, 0, place);
    }
  // HeapSort End
}
