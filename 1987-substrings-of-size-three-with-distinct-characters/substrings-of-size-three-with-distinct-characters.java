class Solution {
    public int countGoodSubstrings(String s) {

        int k = 3;
        int count = 0;
        int sum = 0;

        if(s.length() < k){
            return 0;
        }

        HashMap<Character,Integer> map = new HashMap<>();


        // building the first window 

        for(int i = 0 ; i < k ; i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+ 1);
        }

        if(map.size()==3){
            count++;
        }

        for(int i= k ; i < s.length(); i++){

            char outgoing = s.charAt(i-k);
            map.put(outgoing , map.get(outgoing)- 1);

            if(map.get(outgoing)==0){
                map.remove(outgoing);
            }

            char incoming = s.charAt(i);
            map.put(incoming, map.getOrDefault(incoming, 0) + 1);

            if(map.size() == 3){
                count++;
            }

        }

        return count;
        
    }
}