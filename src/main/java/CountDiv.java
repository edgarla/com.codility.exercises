public class CountDiv {

    private static int solution(int A, int B, int K) {
        int countDiv = B/K - A/K;
        if (A % K == 0) {
            countDiv++;
        }
        return countDiv;
    }

    public static void main(String[] args) {
        System.out.println(solution(6, 11, 2));
        System.out.println(solution(4, 6, 1));
    }
}
