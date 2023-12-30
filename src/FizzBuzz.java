import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public List<String> fizzBuzz(int n) {

        List<String> answer = new ArrayList<>();

        for (int i = 1; i <= n; i++) { // Include n in the loop
            String toAdd = "";
            if (i % 3 == 0) toAdd += "Fizz";
            if (i % 5 == 0) toAdd += "Buzz";
            if (toAdd.isEmpty()) toAdd = String.valueOf(i); // If neither condition is met, add the number itself
            answer.add(toAdd); // Add the final string to the list
        }
        return answer;
    }
}


//Given an integer n, return a string array answer (1-indexed) where:
//
//answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
//answer[i] == "Fizz" if i is divisible by 3.
//answer[i] == "Buzz" if i is divisible by 5.
//answer[i] == i (as a string) if none of the above conditions are true.