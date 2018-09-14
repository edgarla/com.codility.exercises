public class MinAvgTwoSlice {

    private static int solution(int[] A) {
        int n = A.length + 1;
        int[] P = new int[n];
        for (int K = 0; K < A.length; K++) {
            P[K + 1] = P[K] + A[K];
        }

        int m = P.length;
        float minAvg =(P[2] - P[0])/2.0f;
        if (m > 3) {
            minAvg = Math.min(minAvg, (P[3] - P[0])/3.0f);
        }
        int minAvgIndex = 0;
        for (int K = 1; K < m - 2; K++) {
            if (K + 2 < m) {
                float sliceAvg = (P[K + 2] - P[K])/2.0f;
                if (sliceAvg < minAvg) {
                    minAvg = sliceAvg;
                    minAvgIndex = K;
                }
            }
            if (K + 3 < m) {
                float sliceAvg = (P[K + 3] - P[K])/3.0f;
                if (sliceAvg < minAvg) {
                    minAvg = sliceAvg;
                    minAvgIndex = K;
                }
            }
        }
        return minAvgIndex;
    }

    public static void main(String[] args) {
        int[] A1 = {4, 2, 2, 5, 1, 5, 8};
        System.out.println(solution(A1));

        int[] A2 = {1000, -1000};
        System.out.println(solution(A2));
    }
}
