class Solution {
    public int removeDuplicates(int[] nums) {

        ArrayList<Integer> list = new ArrayList<>();

        for(int x : nums){
            list.add(x);
        }

        for(int i = 0 ; i < list.size()-1 ; i++){
            if(list.get(i) == list.get(i+1)){
                list.remove(i+1);
                i--;
            }
        }

        for(int i = 0 ; i < list.size() ; i++){
            nums[i] = list.get(i);
        }


        return list.size();


        
    }
}