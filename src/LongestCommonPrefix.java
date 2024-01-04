public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";  // Check for empty input

        String prefix = strs[0];  // Start with the first string as the prefix

        for (int i = 1; i < strs.length; i++) {  // Iterate over all other strings
            while (strs[i].indexOf(prefix) != 0) {  // Check if current prefix is found at the start of strs[i]
                prefix = prefix.substring(0, prefix.length() - 1);  // Shorten the prefix
                if (prefix.isEmpty()) return "";  // If prefix is empty, no common prefix exists
            }
        }
        return prefix;  // The remaining prefix after all comparisons is the longest common prefix
    }
}


/*
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".



Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.


Constraints:

1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lowercase English letters.
 */
