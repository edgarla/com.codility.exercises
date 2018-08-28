public class BinaryGap {

    private static int solution(int N){
        int longestBinaryGap = 0;
        String binaryNumber = Integer.toBinaryString(N);
        binaryNumber = binaryNumber.substring(0, binaryNumber.lastIndexOf("1") + 1);
        String[] binaryGap = binaryNumber.split("1");
        if(binaryGap.length > 1 && binaryNumber.contains("0")){
            int i = 1;
            while(i < binaryGap.length){
                String s = binaryGap[i];
                if(s.length() > longestBinaryGap){
                    longestBinaryGap = s.length();
                }
                i++;
            }
        }
        return longestBinaryGap;
    }

    public static void main(String[] args){
        System.out.println(solution(15));
        System.out.println(solution(20));
        System.out.println(solution(32));
        System.out.println(solution(529));
        System.out.println(solution(1041));
    }
}