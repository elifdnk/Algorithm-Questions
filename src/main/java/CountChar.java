import java.util.HashMap;
import java.util.Map;

public class CountChar {
    public static void main(String[] args) {

        String str = "indivisibility";
        System.out.println(countChars(str));


    }


    public static int countChars(String str){
        Map<Character,Integer> charCount = new HashMap<>();

        for(char c : str.toCharArray()){
            char lowerCaseChar= Character.toLowerCase(c);
            if (Character.isLetterOrDigit(lowerCaseChar)){
                charCount.put(lowerCaseChar,charCount.getOrDefault(lowerCaseChar,0)+1);
            }
        }
        int repeatedCount =0;
        for(int count : charCount.values()){
            if (count>1){
                repeatedCount++;
            }
        }
        return repeatedCount;
    }









}
/*
Write a function that will return the count of distinct case-insensitive alphabetic characters
and numeric digits that occur more than once in the input string.
The input string can be assumed to contain only alphabets (both uppercase and lowercase)
and numeric digits.
Example:
"abcde" -> 0 # no characters repeats more than once.
"aabbcde" -> 2 # 'a' and 'b'
"aabBcde" -> 2 # 'a' occurs twice and 'b' twice (`b` and `B`)
"indivisibility" -> 1 # 'i' occurs six times.
"Indivisibilities" -> 2 # 'i' occurs seven times and 's' occurs twice.
"aA11" -> 2 # 'a' and '1'
"ABBA" -> 2 # 'A' and 'B' each occur twice.
 */