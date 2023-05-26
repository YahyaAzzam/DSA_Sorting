import java.util.Arrays;

public class Heap implements Sort {
  // HeapSort Start
    public int[][] sort(int[] array) {
        int[][] intermediate = new int[array.length*array.length][array.length];
        int place = 1;
        intermediate[0] = array.clone();
      // Build Max Heap Start
        int parent = array.length/2-1;
        if (array.length%2==0&&array[array.length-1]>array[parent]) {
            int swap = array[array.length-1];
            array[array.length-1] = array[parent];
            array[parent--] = swap;
            intermediate[place++] = array.clone();
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
                intermediate[place++] = array.clone();
            }
            if (array.length - 1 == (parent*2)+1 && array[parent] < array[(parent*2)+1]) {
                swap = array[(parent*2)+1];
                array[(parent*2)+1] = array[parent];
                array[parent] = swap;
                intermediate[place++] = array.clone();
            }
            parent = p;
        }
        // Max Heapify End
      // Build Max Heap End
        place++;
        int last = array.length - 1;
        for (int i = 1; i < array.length; i++) {
          // Heap Extract Max Start
            int swap = array[0];
            array[0] = array[last];
            array[last] = swap;
            last--;
            parent = 0;
            intermediate[place++] = array.clone();
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
                intermediate[place++] = array.clone();
            }
            if (last == (parent*2)+1 && array[parent] < array[(parent*2)+1]) {
                swap = array[(parent*2)+1];
                array[(parent*2)+1] = array[parent];
                array[parent] = swap;
                intermediate[place++] = array.clone();
            }
            // Heap Extract Max End
        }
        return Arrays.copyOfRange(intermediate, 0, place);
    }
  // HeapSort End
}
