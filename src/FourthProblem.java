import java.util.Arrays;

public class FourthProblem {
    public static void main(String[] args) {
        int[] nums = {50, 2, 1, 9};
        System.out.println("Largest Number: " + largestNumber(nums));
    }

    public static String largestNumber(int[] nums) {
        String[] strNums = Arrays.stream(nums)
                .mapToObj(String::valueOf)
                .toArray(String[]::new);

        Arrays.sort(strNums, (a, b) -> (b + a).compareTo(a + b));
        return String.join("", strNums);
    }
}
