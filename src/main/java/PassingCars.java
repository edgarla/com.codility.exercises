public class PassingCars {

    private static int solution(int[] A) {
        int zerosCount = 0;
        int totalCarPairs = 0;
        for (int i : A) {
            if (i == 0) {
                zerosCount++;
            } else {
                totalCarPairs += zerosCount * i;
            }
            if (totalCarPairs > 1000000000) {
                return -1;
            }
        }
        return totalCarPairs;
    }

    public static void main(String[] args) {
        int[] A1 = {0, 1, 0, 1, 1};
        System.out.println(solution(A1));

        int[] A2 = {1};
        System.out.println(solution(A2));
    }
}
