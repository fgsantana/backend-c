import java.util.Scanner;

public class AngryMarvinBirds {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int stars = 0;
        String[] result = in.next().split(",");
        for (String stage : result) {
            stars += countStars(stage);
        }
        System.out.println(stars);
    }

    static int countStars(String stage) {
        int total = 0;
        for (char c : stage.toCharArray()) {
            if (c == '*') {
                total++;
            }
        }
        return total;
    }
}
