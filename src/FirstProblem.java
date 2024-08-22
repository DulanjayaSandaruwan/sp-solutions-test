public class FirstProblem {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        findSumByUsingForLoop(arr);
        findSumByUsingWhileLoop(arr);
    }

    public static void findSumByUsingForLoop(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("The sum by using for loop of the array is: " + sum);
    }

    public static void findSumByUsingWhileLoop(int[] arr) {
        int sum = 0;
        int i = 0;
        while (i < arr.length) {
            sum += arr[i];
            i++;
        }
        System.out.println("The sum by using while loop of the array is: " + sum);
    }

//    public static void findSumByUsingRecursion(int[] arr) {
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            sum += arr[i];
//        }
//    }
}
