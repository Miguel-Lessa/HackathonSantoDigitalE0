import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número de elementos no conjunto:");
        int n = scanner.nextInt();
        int[] nums = new int[n];
        System.out.println("Digite os elementos do conjunto:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        List<List<Integer>> subsets = subconjuntos(nums);

        System.out.println("Subconjuntos:");
        for (List<Integer> subset : subsets) {
            System.out.println(subset);
        }
    }

    public static List<List<Integer>> subconjuntos(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, result, new ArrayList<>(), 0);
        return result;
    }

    private static void backtrack(int[] nums, List<List<Integer>> result, List<Integer> subset, int start) {
        result.add(new ArrayList<>(subset));
        for (int i = start; i < nums.length; i++) {
            subset.add(nums[i]);
            backtrack(nums, result, subset, i + 1);
            subset.remove(subset.size() - 1);
        }
    }
}