public class MissingInteger {

    private static int solution(int[] A) {
        int maxInteger = 0;
        for (int i : A) {
            maxInteger = Math.max(maxInteger, i);
        }

        if (maxInteger <= 0) {
            return 1;
        }

        boolean[] integers = new boolean[maxInteger];
        for (int i : A) {
            if (i > 0 && !integers[i - 1]){
                integers[i - 1] = true;
            }
        }

        for (int i = 0; i < integers.length; i++) {
            if (!integers[i]) {
                return i + 1;
            }
        }

        return maxInteger + 1;
    }

    public static void main(String[] args) {
        int[] A1 = {1, 3, 6, 4, 1, 2};
        System.out.println(solution(A1));
    }
}
