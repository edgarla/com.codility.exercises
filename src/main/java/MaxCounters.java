import java.util.Arrays;

public class MaxCounters {

    private static int[] solution(int N, int[] A) {
        int maxCounter = 0;
        int lastMaxCounter = 0;
        int[] result = new int[N];
        for (int i : A) {
            if (i <= N){
                result[i - 1] = Math.max(result[i - 1], lastMaxCounter) + 1;
                if (result[i - 1] > maxCounter) {
                    maxCounter = result[i - 1];
                }
            } else if (i == N + 1){
                lastMaxCounter = maxCounter;
            }
        }
        for (int i = 0; i < result.length; i++) {
            result[i] = Math.max(result[i], lastMaxCounter);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] A1 = {3, 4, 4, 6, 1, 4, 4};
        System.out.println(Arrays.toString(solution(5, A1)));

        int[] A2 = {3, 4, 4, 6, 1, 4, 4};
        System.out.println(Arrays.toString(solution(4, A2)));
    }
}
