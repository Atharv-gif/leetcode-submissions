class Solution {
    public int findLHS(int[] nums) {


        int maxLength = 0;

        HashMap<Integer , Integer> map = new HashMap<>();


        // frequency 


        for(int num : nums){
            map.put(num , map.getOrDefault(num , 0)+ 1);
        }


        // consecutive numbers

        for(int num : map.keySet()){

            if(map.containsKey(num+1)){
                int length = map.get(num) + map.get(num + 1);
                maxLength = Math.max(maxLength , length);
            }
        }


        return maxLength;


        
    }
}