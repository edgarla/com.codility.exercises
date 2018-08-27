import java.util.Arrays;

public class CyclicRotation {

    private static int[] solution(int[] A, int K) {
        int[] result = Arrays.copyOf(A, A.length);
        K = (K > A.length && A.length > 0) ? K - (A.length * (K / A.length)) : K;
        if (K > 0 && K < A.length) {
            for (int i = 0; i < A.length; i++) {
                int index = (i + K < A.length) ? i + K : i + K - A.length;
                result[index] = A[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] A1 = {3, 8, 9, 7, 6};
        System.out.println(Arrays.toString(A1) + " -> " + Arrays.toString(solution(A1, 5)));

        int[] A2 = {0, 0, 0};
        System.out.println(Arrays.toString(A2) + " -> " + Arrays.toString(solution(A2, 1)));

        int[] A3 = {1, 2, 3, 4};
        System.out.println(Arrays.toString(A3) + " -> " + Arrays.toString(solution(A3, 4)));

        int[] A4 = {};
        System.out.println(Arrays.toString(A4) + " -> " + Arrays.toString(solution(A4, 1)));
    }
}
