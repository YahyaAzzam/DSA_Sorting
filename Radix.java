import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Radix implements Sort{

    public int[][] sort(int[] array, boolean steps) {
        int place = 1, max = 0, n = 0;
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
        ArrayList<Queue<Integer>> buckets = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            buckets.add(new LinkedList<>());
        }
        for (int i = 0; i < max; i++) {
            int next = 0;
            for (int j : positive) {
                buckets.get((j / (int) Math.pow(10, i)) % 10).add(j);
            }
            for (int j = 0; j < 10; j++) {
                while (!buckets.get(j).isEmpty()) {
                    positive[next++] = buckets.get(j).remove();
                }
            }
            next = 0;
            for (int j : negative) {
                buckets.get(((-j) / (int) Math.pow(10, i)) % 10).add(j);
            }
            for (int j = 0; j < 10; j++) {
                while (!buckets.get(j).isEmpty()) {
                    negative[next++] = buckets.get(j).remove();
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
        System.arraycopy(negative, 0, array, 0, n);
        System.arraycopy(positive, 0, array, n, positive.length);
        if (!steps) intermediate[0] = array.clone();
        return intermediate;
    }
}
