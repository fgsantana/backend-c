import java.util.Scanner;

public class CreepyHours {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int total = 0;
        String[] moments = in.next().split(",");
        for (String moment : moments) {
            if (creepy(moment)) {
                total++;
            }
        }
        System.out.println(total);

    }

    static boolean creepy(String moment) {
        char[] left = moment.split(":")[0].toCharArray();
        char[] right = moment.split(":")[1].toCharArray();
        return (left[0] == right[1] && left[1] == right[0]) || (left[0] == right[0] && left[1] == right[1] ||
                (left[0] == left[1] && right[0] == right[1]));
    }
}
