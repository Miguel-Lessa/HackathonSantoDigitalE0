import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printAsterisks(n);
    }

    public static void printAsterisks(int n) {
        List<String> result = gerarArrays(n);
        for (String str : result) {
            System.out.println(str);
        }
    }

    public static List<String> gerarArrays(int n) {
        List<String> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            char[] chars = new char[i];
            Arrays.fill(chars, '*');
            result.add(new String(chars));
        }
        return result;
    }
}