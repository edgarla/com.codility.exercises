public class PermMissingElem {

    private static int solution(int[] A) {
        int accumulator = 0;
        int accumulator2 = A.length + 1;
        for(int i = 0; i < A.length; i++){
            accumulator = accumulator + A[i];
            accumulator2 = accumulator2 + i + 1;
        }
        return accumulator2 - accumulator;
    }

    public static void main(String[] args) {
        int[] A1 = {2, 3, 1, 5};
        System.out.println(solution(A1));
    }
}
