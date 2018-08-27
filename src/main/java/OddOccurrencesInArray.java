import java.util.HashSet;

public class OddOccurrencesInArray {

    private static int solution(int[] A) {
        HashSet<Integer> oddOcurrences = new HashSet<>();
        for(int i = 0; i < A.length; i++) {
            if (oddOcurrences.contains(A[i])) {
                oddOcurrences.remove(A[i]);
            } else {
                oddOcurrences.add(A[i]);
            }
        }
        return oddOcurrences.iterator().next();
    }

    public static void main (String[] args) {
        int[] A1 = {9, 3, 9, 3, 9, 7, 9};
        System.out.println(solution(A1));
    }
}
