import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Radix implements Sort{

    public int[][] sort(int[] array) {
        int place = 1, max = 0;
        for (int k : array) {
            max = Math.max(max, k);
        }
        max = (int) Math.log10(max) + 1;
        int[][] intermediate = new int[max+1][array.length];
        intermediate[0] = array.clone();
        ArrayList<Queue<Integer>> buckets = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            buckets.add(new LinkedList<>());
        }
        for (int i = 0; i < max; i++) {
            int next = 0;
            for (int j : array) {
                buckets.get((j / (int) Math.pow(10, i)) % 10).add(j);
            }
            for (int j = 0; j < 10; j++) {
                while (!buckets.get(j).isEmpty()) {
                    array[next++] = buckets.get(j).remove();
                }
            }
            intermediate[place++] = array.clone();
        }
        return intermediate;
    }
}
