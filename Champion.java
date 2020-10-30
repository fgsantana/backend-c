import java.util.Arrays;
import java.util.Scanner;

public class Champion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] input = in.next().split(",");
        int[] wins = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();
        input = in.next().split(",");
        int[] ties = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();
        int[] points = new int[ties.length];
        for (int i = 0; i < points.length; i++) {
            points[i] = (3 * wins[i]) + (ties[i]);

        }

        int greater = 0;
        for (int i = 1; i < points.length; i++) {
            if (points[i] >= points[greater]) {
                greater = i;
            }

        }
        System.out.println(points[greater]);

    }
}
