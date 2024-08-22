import java.util.Arrays;

public class FourthProblem {
    public static void main(String[] args) {
        int[] nums = {30, 9, 1, 8};
        System.out.println("Largest Number: " + largestNumber(nums));
    }

    public static String largestNumber(int[] nums) {
        String[] strNums = Arrays.stream(nums)
                .mapToObj(String::valueOf)
                .toArray(String[]::new);

        Arrays.sort(strNums, (a, b) -> (b + a).compareTo(a + b));

        if (strNums[0].equals("0")) {
            return "0";
        }
        return String.join("", strNums);
    }
}
