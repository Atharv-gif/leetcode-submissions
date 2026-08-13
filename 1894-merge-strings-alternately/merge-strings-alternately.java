class Solution {
    public String mergeAlternately(String word1, String word2) {

        char[] chars = word1.toCharArray();
        char[] chars1 = word2.toCharArray();

        int length;
        int length1;

        StringBuilder result = new StringBuilder();

        if (chars.length < chars1.length) {
            length = chars.length;
            length1 = chars1.length;
        } else {
            length = chars1.length;
            length1 = chars.length;
        }

        for (int i = 0; i < length; i++) {
            result.append(chars[i]);
            result.append(chars1[i]);
        }

        if (chars.length < chars1.length) {

            for (int i = length; i < length1; i++) {
                result.append(chars1[i]);
            }

        } else {

            for (int i = length; i < length1; i++) {
                result.append(chars[i]);
            }
        }

        return result.toString();
    }
}