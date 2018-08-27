public class FrogJmp {

    private static int solution(int X, int Y, int D) {
        if (Y - X == 0) {
            return 0;
        }
        if((Y - X) <= D) {
            return 1;
        }
        if(((Y - X) / D) * D == (Y - X)) {
            return ((Y - X) / D);
        }
        return ((Y - X) / D) + 1;
    }

    public static void main (String[] args) {
        System.out.println(solution(10, 85, 30));
        System.out.println(solution(20, 80, 60));
    }
}
