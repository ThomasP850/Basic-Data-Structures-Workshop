package maps;

import java.util.HashMap;

public class ExampleProblemSolution {
    public static boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> balance = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            balance.put(s.charAt(i), balance.getOrDefault(s.charAt(i), 0) + 1);
        }

        for(int i = 0; i < t.length(); i++) {
            balance.put(t.charAt(i), balance.getOrDefault(t.charAt(i), 0) - 1);
        }

        for(int val : balance.values()) {
            if(val != 0) {
                return false;
            }
        }

        return true;
    }
}
