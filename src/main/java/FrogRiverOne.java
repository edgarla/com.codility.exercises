public class FrogRiverOne {

    private static int solution(int X, int[] A) {
        boolean[] leavesPosition = new boolean[X];
        int steps = X;
        for (int K = 0; K < A.length; K++) {
            if (!leavesPosition[A[K] - 1]) {
                leavesPosition[A[K] - 1] = true;
                steps--;
            }
            if (steps == 0) {
                return K;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] A1 = {1, 3, 1, 4, 2, 3, 5, 4};
        System.out.println(solution(5, A1));

        int[] A2 = {1, 3, 1, 4, 2, 3, 2, 4};
        System.out.println(solution(4, A2));
    }
}
