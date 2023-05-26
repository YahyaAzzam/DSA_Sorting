import java.util.Arrays;

public class Insertion implements Sort {
    public int[][] sort(int[] array) {
        int[][] intermediate = new int[array.length*array.length][array.length];
        intermediate[0] = array.clone();
        int place = 1;
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    int swap = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = swap;
                    intermediate[place++] = array.clone();
                }
            }
        }
        return Arrays.copyOfRange(intermediate, 0, place);
    }
}

