class Solution {
    public int reverse(int x) {

        String text = String.valueOf(x);

        ArrayList<Character> list = new ArrayList<>();

     
        for (char c : text.toCharArray()) {
            if (c != '-') {
                list.add(c);
            }
        }

        int left = 0;
        int right = list.size() - 1;

        while (left < right) {
            char temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);

            left++;
            right--;
        }

    
        while (list.size() > 1 && list.get(0) == '0') {
            list.remove(0);
        }

       
        StringBuilder sb = new StringBuilder();

        for (char c : list) {
            sb.append(c);
        }

       
        long num = Long.parseLong(sb.toString());

        // Restore negative sign
        if (x < 0) {
            num = -num;
        }

        // Check int range
        if (num > Integer.MAX_VALUE || num < Integer.MIN_VALUE) {
            return 0;
        }

        return (int) num;
    }
}