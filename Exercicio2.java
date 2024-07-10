import java.util.*;

public class Exercicio2 {
    public static void main(String[] args) {
        int[] arr = {3, 8, 50, 5, 1, 18, 12};
        System.out.println(paresMenoresDiferenças(arr));
    }

    public static List<List<Integer>> paresMenoresDiferenças(int[] arr) {
        Arrays.sort(arr);
        int minDiff = Integer.MAX_VALUE;
        List<List<Integer>> pairs = new ArrayList<>();

        for (int i = 0; i < arr.length - 1; i++) {
            int diff = Math.abs(arr[i] - arr[i + 1]);
            if (diff < minDiff) {
                minDiff = diff;
                pairs.clear();
                pairs.add(Arrays.asList(arr[i], arr[i + 1]));
            } else if (diff == minDiff) {
                pairs.add(Arrays.asList(arr[i], arr[i + 1]));
            }
        }

        return pairs;
    }
}