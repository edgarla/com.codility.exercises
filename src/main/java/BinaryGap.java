/*
 * A binary gap within a positive integer N is any maximal sequence of consecutive zeros that is surrounded by ones at
 * both ends in the binary representation of N.
 *
 * For example, number 9 has binary representation 1001 and contains a binary gap of length 2. The number 529 has binary
 * representation 1000010001 and contains two binary gaps: one of length 4 and one of length 3. The number 20 has binary
 * representation 10100 and contains one binary gap of length 1. The number 15 has binary representation 1111 and has no
 * binary gaps. The number 32 has binary representation 100000 and has no binary gaps.
 *
 * Write a function:
 *
 *   class BinaryGap { public int solution(int N); }
 *
 * that, given a positive integer N, returns the length of its longest binary gap. The function should return 0 if N
 * doesn't contain a binary gap.
 *
 * For example, given N = 1041 the function should return 5, because N has binary representation 10000010001 and so its
 * longest binary gap is of length 5. Given N = 32 the function should return 0, because N has binary representation
 * '100000' and thus no binary gaps.
 *
 * Assume that:
 *
 *   N is an integer within the range [1..2,147,483,647].
 *
 * Complexity:
 *
 *   expected worst-case time complexity is O(log(N));
 *   expected worst-case space complexity is O(1).
 **/
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