class Solution {
    public int strStr(String haystack, String needle) {

        int index = -1;

        int k = needle.length();
        ArrayList<String> list = new ArrayList<>();

        for(int i = 0 ; i <= haystack.length()-k ; i ++){
            list.add(haystack.substring(i, i + k));
        }

        index = list.indexOf(needle);

        if(index != -1){
            return index;
        }


        return -1;




        
    }
}