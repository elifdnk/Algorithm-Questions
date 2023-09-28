import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class ValidParentheses {


    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();  // we created stack

        for (int i = 0; i < s.length(); i++) {  // we look all character in s
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') { // if it is true
                stack.push(ch); //we add to stack this ch
            } else {
                if (stack.isEmpty()) {
                    return false;  //if stack empty result is false
                }
                char out = stack.pop(); // we put inside the ch
                if (ch == ')' && out != '(') return false;     // and we look it is true or not
                else if (ch == '}' && out != '{') return false;
                else if (ch == ']' && out != '[') return false;
            }
        }
        return stack.isEmpty();
    }

}
/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.


Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false
 */