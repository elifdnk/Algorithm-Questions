import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfArrayElements {
    public static void main(String[] args) {

    }

    //Stream Solution1:
    public static Map<String, Long> solutionWithStream(String[] strings) {
        return Arrays.stream(strings)
                .filter(Objects::nonNull)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

    // Stream Solution2:
    public static Map<String, Integer> solutionWithStream2(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        Arrays.stream(strings)
                .filter(Objects::nonNull)
                .distinct()
                .forEach(
                        e -> map.put(e, (int) Arrays.stream(strings).filter(p -> p != null && p.equals(e)).count())
                );
        return map;
    }


}
/*
Question-4 Frequency of Array Elements
Write a function that takes a String array as parameter and returns a map object that
contains each element of array as key and their occurrence counts as value.
For calculating occurrence, array elements should be checked by regarding case sensitivity.
Order is not important.
EXAMPLE:
Input: {"Apple", "Banana", "apple", "Cherry", "Apple"}
Output: returning map elements: {Apple=2, apple=1, Cherry=1, Banana=1}
 */