import java.util.Arrays;

public class ArrayOfDigit {
    public static void main(String[] args) {


        // Solution1:

        int number= 490;
        String s = Integer.toString(number);
        int[] arr = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr [i]= Character.getNumericValue(s.charAt(i));
        }
        System.out.println(Arrays.toString(arr));



        // Stream Solution
        int[] digits = Integer.toString(number).chars().map(c -> c-'0').toArray();
        System.out.println(Arrays.toString(digits));

        // Stream Solution2:
        int[] digit = String.valueOf(number)
                .chars()
                .map(Character::getNumericValue)
                .toArray();
        System.out.println(Arrays.toString(digit));







    }



}
/*
Question-5 Array of Digits
How to convert a positive int to an array of digits.
Input: 490 Output: [4, 9, 0] (as int Array)
 */