package domain;

public class Exercise {
    public static long Calculate(int X, int K) {
        long[] possMovesToSpace = new long[X];
        possMovesToSpace[0] = 1;
        for (int i = 1; i < X; i++) {
            for (int j = 1; j <= K && i - j >= 0; j++) {
                possMovesToSpace[i] += possMovesToSpace[i - j];
            }
        }
        return possMovesToSpace[X - 1];
    }
}
