import java.util.Arrays;

public class GenomicRangeQuery {

    private static int[] solution(String S, int[] P, int[] Q) {
        int N = S.length();

        int[] genA = new int[N + 1];
        int[] genC = new int[N + 1];
        int[] genG = new int[N + 1];
        int[] genT = new int[N + 1];

        for (int i = 0; i < N; i++) {
            genA[i + 1] += genA[i];
            genC[i + 1] += genC[i];
            genG[i + 1] += genG[i];
            genT[i + 1] += genT[i];

            char c = S.charAt(i);

            switch (c) {
                case 'A' : {
                    genA[i + 1]++;
                    break;
                }
                case 'C' : {
                    genC[i + 1]++;
                    break;
                }
                case 'G' : {
                    genG[i + 1]++;
                    break;
                }
                case 'T' : {
                    genT[i + 1]++;
                    break;
                }
            }
        }

        int M = P.length;
        int[] result = new int[M];
        for (int i = 0; i < M; i++) {
            if (genA[Q[i] + 1] - genA[P[i]] > 0){
                result[i] = 1;
            } else if (genC[Q[i] + 1] - genC[P[i]] > 0) {
                result[i] = 2;
            } else if (genG[Q[i] + 1] - genG[P[i]] > 0) {
                result[i] = 3;
            } else if (genT[Q[i] + 1] - genT[P[i]] > 0) {
                result[i] = 4;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] P1 = {2, 5, 0};
        int[] Q1 = {4, 5, 6};
        System.out.println(Arrays.toString(solution("CAGCCTA", P1, Q1)));

        int[] P2 = {2, 5, 0};
        int[] Q2 = {4, 5, 6};
        System.out.println(Arrays.toString(solution("CAGCCTC", P2, Q2)));
    }
}
