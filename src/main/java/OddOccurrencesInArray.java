import java.util.HashSet;

public class OddOccurrencesInArray {

    private static int solution(int[] A) {
        HashSet<Integer> oddOcurrences = new HashSet<>();
        for(int i : A) {
            if (oddOcurrences.contains(i)) {
                oddOcurrences.remove(i);
            } else {
                oddOcurrences.add(i);
            }
        }
        return oddOcurrences.iterator().next();
    }

    public static void main (String[] args) {
        int[] A1 = {9, 3, 9, 3, 9, 7, 9};
        System.out.println(solution(A1));
    }
}
