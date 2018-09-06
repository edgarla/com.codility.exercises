public class PermCheck {

    private static int solution(int[] A) {
        int N = A.length;
        int[] countNumbers = new int[N + 1];
        for (int i : A) {
            if (i < 1 || i > N) {
                return 0;
            }
            if (countNumbers[i] == 1){
                return 0;
            }
            countNumbers[i]++;
        }
        return 1;
    }

    public static void main (String[] args) {
        int[] A1 = {4, 1, 3, 2};
        System.out.println(solution(A1));

        int[] A2 = {2};
        System.out.println(solution(A2));
    }
}
