package multigenesyscodingquestions;

public class Pattern {
    public static void main(String[] args) {
        int n = 4;

        for (int i = 1; i <= 2 * n - 1; i++) {
            for (int j = 1; j <= 2 * n - 1; j++) {

                int top = i - 1;
                int left = j - 1;
                int right = (2 * n - 1) - j;
                int bottom = (2 * n - 1) - i;

                int min = Math.min(Math.min(top, bottom), Math.min(left, right));

                System.out.print((n - min) + " ");
            }
            System.out.println();
        }
    }
}
