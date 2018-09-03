import java.util.Arrays;

public class MissingInteger {

    private static int solution(int[] A) {
        int missingSmallestPositiveInteger = 1;
        Arrays.sort(A);
        for (int i : A) {
            if (i == missingSmallestPositiveInteger) {
                missingSmallestPositiveInteger++;
            }
        }
        return missingSmallestPositiveInteger;
    }

    public static void main(String[] args) {
        int[] A1 = {1, 3, 6, 4, 1, 2};
        System.out.println(solution(A1));
    }
}
