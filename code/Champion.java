
public class Champion {
    public static void main(String[] args) {
        int[] wins = {1, 0, 3};
        int[] ties = {2, 2, 0};
        int[] points = new int[3];
        for (int i = 0; i < points.length; i++) {
            points[i] = (3 * wins[i]) + (ties[i]);

        }

        int greater = points[0];
        for (int i = 1; i < points.length; i++) {

            greater = points[i] > greater ? points[i] : greater;


        }
        System.out.println(greater);

    }
}
