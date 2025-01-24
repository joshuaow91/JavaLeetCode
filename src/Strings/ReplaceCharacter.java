package Strings;

public class ReplaceCharacter {
    public static String replaceLetter(String word, char letterToReplace) {
        StringBuilder finalString = new StringBuilder();
        String newString = word.toLowerCase();

        for (char c : newString.toCharArray()) {
            if (c == letterToReplace) {
                char nextLetter = (c == 'z') ? 'a' : (char) (c + 1);
                finalString.append(nextLetter);
            } else {
                finalString.append(c);
            }
        }
        return finalString.toString().toLowerCase();
    }

    public static void main(String[] args) {
        String word = "MIssissippi";
        char letterToReplace = 'i';

        String result = replaceLetter(word, letterToReplace);
        System.out.println("Result: " + result);
    }
}
