public class TapeEquilibrium {

    private static int solution(int[] A) {
        int accumulatorPPlus = 0;

        for (int i = 1; i < A.length; i++){
            accumulatorPPlus += A[i];
        }

        int accumulatorPMinus = A[0];
        int minDifference = Math.abs(accumulatorPMinus - accumulatorPPlus);

        for (int p = 1; p < A.length; p++) {
            if (Math.abs(accumulatorPMinus - accumulatorPPlus) < minDifference) {
                minDifference = Math.abs(accumulatorPMinus - accumulatorPPlus);
            }
            accumulatorPMinus += A[p];
            accumulatorPPlus -= A[p];
        }

        return minDifference;
    }

    public static void main (String[] args) {
        int[] A1 = {3, 1, 2, 4, 3};
        System.out.println(solution(A1));

        int[] A2 = {3, 1};
        System.out.println(solution(A2));

        int[] A3 = {5, 6, 2, 4, 1};
        System.out.println(solution(A3));
    }
}
