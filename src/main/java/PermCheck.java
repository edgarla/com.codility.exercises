import java.util.HashSet;

public class PermCheck {

    private static int solution(int[] A) {
        if (A.length == 1) {
            if(A[0] > 1){
                return 0;
            }
            return 1;
        }

        int accumulator = 0;
        int accumulator2 = 0;
        int min = A[0];
        int max = A[0];
        HashSet<Integer> checkRepeated = new HashSet<>();
        int j = 1;
        for (int i : A) {
            if(checkRepeated.contains(i)) {
                return 0;
            }
            if (min > i) {
                min = i;
            }
            if (max < i) {
                max = i;
            }
            accumulator += i;
            checkRepeated.add(i);
            accumulator2 += j;
            j++;
        }

        if (min != 1 || max - min == 0 || max - min > A.length) {
            return 0;
        }

        if (accumulator != accumulator2) {
            return 0;
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
