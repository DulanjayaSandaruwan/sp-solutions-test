import java.util.ArrayList;
import java.util.List;

public class SecondProblem {
    public static void main(String[] args) {
        List<String> list1 = List.of("a", "b", "c");
        List<Integer> list2 = List.of(1, 2, 3);

        List<Object> result = combineAlternating(list1, list2);
        System.out.println(result);
    }

    public static List<Object> combineAlternating(List<?> list1, List<?> list2) {
        List<Object> combinedList = new ArrayList<>();
        int maxLength = Math.max(list1.size(), list2.size());

        for (int i = 0; i < maxLength; i++) {
            if (i < list1.size()) {
                combinedList.add(list1.get(i));
            }
            if (i < list2.size()) {
                combinedList.add(list2.get(i));
            }
        }

        return combinedList;
    }
}
