import java.util.*;

class Solution {
    public String largestOddNumber(String num) {

        char[] arr = num.toCharArray();
        ArrayList<Integer> list = new ArrayList<>();
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            int digit = arr[i] - '0';

            if (digit % 2 == 1) {
                list.add(digit);
                index = i;
            }
        }

        if (index == -1) {
            return "";
        }

        return num.substring(0, index + 1);
    }
}