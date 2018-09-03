import java.util.HashSet;

public class FrogRiverOne {

    private static int solution(int X, int[] A) {
        HashSet<Integer> numbers = new HashSet<>();
        int sumX = 0;
        int sumA = 0;
        for (int i = 1; i <= X; i++) {
            sumX += i;
        }
        for (int i = 0; i < A.length; i++) {
            if (A[i] <= X && !numbers.contains(A[i])) {
                numbers.add(A[i]);
                sumA += A[i];
                if (sumA == sumX){
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] A1 = {1, 3, 1, 4, 2, 3, 5, 4};
        System.out.println(solution(5, A1));

        int[] A2 = {1, 3, 1, 4, 2, 3, 5, 4};
        System.out.println(solution(4, A2));
    }
}
