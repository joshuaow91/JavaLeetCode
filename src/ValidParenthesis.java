import java.util.Stack;

public class ValidParenthesis {
    public boolean isValid(String s) {
        // Create a Stack to hold the opening brackets.
        Stack<Character> stack = new Stack<>();

        // Loop through each character in the string.
        for (char c : s.toCharArray()) {
            // If the character is an opening bracket, push it onto the stack.
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            // Check for closing brackets:
            else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                // If the character is a closing round bracket,
                // and the top of the stack is an opening round bracket, pop the stack.
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                // Similarly for curly brackets.
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                // And for square brackets.
                stack.pop();
            } else {
                // If the character is a closing bracket, but there's no corresponding
                // opening bracket on the top of the stack, the string is invalid.
                return false;
            }
        }

        // After processing the entire string, if there's still an opening bracket
        // left on the stack, then it's unmatched and the string is invalid.
        return stack.isEmpty();
    }

}


//Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
//
//An input string is valid if:
//
//Open brackets must be closed by the same type of brackets.
//Open brackets must be closed in the correct order.
//Every close bracket has a corresponding open bracket of the same type.
//
//
//Example 1:
//
//Input: s = "()"
//Output: true
//Example 2:
//
//Input: s = "()[]{}"
//Output: true
//Example 3:
//
//Input: s = "(]"
//Output: false
//
//
//Constraints:
//
//1 <= s.length <= 104
//s consists of parentheses only '()[]{}'.
