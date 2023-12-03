package ArraysHashing;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    // o(n * log n)
//    public boolean isAnagram(String s, String t) {
//        char[] sChars = s.toCharArray(), tChars = t.toCharArray();
//        Arrays.sort(sChars);
//        Arrays.sort(tChars);
//        return new String(sChars).equals(new String(tChars));
//
//    }

    // hashmap implementation
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) - 1);
        }

        for (char c : map.keySet()) {
            if (map.get(c) != 0){
                return false;
            }
        }
        return true;
    }
}


// Given two strings s and t, return true if t is an anagram of s, and false otherwise.
//
//An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
//
//
//
//Example 1:
//
//Input: s = "anagram", t = "nagaram"
//Output: true
//Example 2:
//
//Input: s = "rat", t = "car"
//Output: false
//
//
//Constraints:
//
//1 <= s.length, t.length <= 5 * 104
//s and t consist of lowercase English letters.