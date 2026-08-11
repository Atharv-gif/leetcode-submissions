class Solution {
    public boolean checkInclusion(String s1, String s2) {

        int left = 0 ; 
        int window = 0;
        boolean found = false ;

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

    // frequency of s1 
        for(char c1 : s1.toCharArray()){
            map1.put(c1, map1.getOrDefault(c1, 0) + 1);
        }
    // sliding window 
        for(int right = 0 ; right < s2.length() ; right++){
            map2.put(s2.charAt(right) , map2.getOrDefault(s2.charAt(right) , 0 ) + 1);
           
        window++;

        if(window>s1.length()){
            map2.put(s2.charAt(left) , map2.getOrDefault(s2.charAt(left) , 0) - 1);

            if (map2.get(s2.charAt(left)) == 0) {
                    map2.remove(s2.charAt(left));

                }

                left++;
                window--;

        }

        if(map1.equals(map2)){
            found = true;
        }

        
        
    }

    return found;
    
}

}
