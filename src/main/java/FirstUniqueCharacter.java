import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstUniqueCharacter {
    public static void main(String[] args) {

        String str = "success";
        System.out.println(solutionWithFor(str));
        System.out.println(solutionWithStream(str));


    }

    // Solution 1:
    public static char solutionWithFor(String str) {
        for (int i = 0; i < str.length(); i++) {
            int frequency = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    frequency++;
                }
            }
            if (frequency == 1) {
                return str.charAt(i);
            }
        }
        return '\0';
    }

// Stream Solution1:

    public static char solutionWithStream(String str) {
        LinkedHashMap<Character, Integer> frequencyMap = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            frequencyMap.put(currentChar, frequencyMap.getOrDefault(currentChar, 0) + 1);
        }
        Optional<Map.Entry<Character, Integer>> opt = frequencyMap.entrySet().stream()
                .filter(p -> p.getValue() == 1)
                .findFirst();
        if (opt.isPresent())
            return opt.get().getKey();
        return '\0';
    }


// Stream Solution2:

    public static char solutionWithStream2(String str) {
        Map<Character, Integer> frequencyMap = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }
        return frequencyMap.keySet().stream().filter(ch -> frequencyMap.get(ch) == 1).findFirst().orElse('\0');
    }

// Stream Solution3:

    public static char solutionWithStream3(String str) {
        Map<Character, Long> frequencyMap = str.chars()
                .mapToObj(i -> (char) i)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        return frequencyMap.entrySet().stream()
                .filter(ch -> ch.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst().orElse('\0');
    }


}
/*
Question-3 First Unique Character
Write a function that returns the first non-repeated character from a string.
If all characters are repeated return a space character.
EXAMPLE:
Input: "success" output: u
Explanation: u and e are non-repeated, u is the first non-repeated character
 */