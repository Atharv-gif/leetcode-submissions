class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for (int x : nums1) {
            list1.add(x);
        }

        for (int y : nums2) {
            list2.add(y);
        }

        for (int i = 0; i < list1.size(); i++) {
            for (int j = 0; j < list2.size(); j++) {

                if (list1.get(i).equals(list2.get(j))) {
                    list3.add(list1.get(i));
                }
            }
        }

        Collections.sort(list3);

        for (int i = 0; i < list3.size() - 1; i++) {
            if (list3.get(i).equals(list3.get(i + 1))) {
                list3.remove(i + 1);
                i--;
            }
        }

        int[] result = new int[list3.size()];

        for (int i = 0; i < list3.size(); i++) {
            result[i] = list3.get(i);
        }

        return result;
    }
}