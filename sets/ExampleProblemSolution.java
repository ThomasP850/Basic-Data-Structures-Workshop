package sets;

import java.util.HashSet;

public class ExampleProblemSolution {
    public static boolean isHappy(int n) {
        HashSet<Integer> seen = new HashSet<Integer>();

        int curNum = n;
        while(true) {
            String digitString = curNum + "";
            int newNum = 0;

            for(char digit : digitString.toCharArray()) {
                newNum += Math.pow(digit - '0', 2);
            }

            if(newNum == 1) {
                return true;
            } else if(seen.contains(newNum)) {
                return false;
            }

            seen.add(newNum);
            curNum = newNum;
        }
    }
}