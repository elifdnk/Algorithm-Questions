import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {

        int pointerA=0;
        int pointerB=0;
        int max =0;
        HashSet<Character> hashSet = new HashSet<>();

        while(pointerB<s.length()){
            if(!hashSet.contains(s.charAt(pointerB))){
                hashSet.add((s.charAt(pointerB)));
                pointerB++;
                max= max = Math.max(max, hashSet.size());
            }else{
                hashSet.remove(s.charAt(pointerA));
                pointerA++;
            }
        }
return max;



}}
/*
3. Longest Substring Without Repeating Characters

Given a string s, find the length of the longest
substring
 without repeating characters.



Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

 */