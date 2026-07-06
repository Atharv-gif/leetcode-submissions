class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        ArrayList<Integer> list = new ArrayList<>();

        
        for(int[] row : matrix){
            for(int x : row){
                list.add(x);
            }
        }

        int start = 0;
        int end = list.size()-1;


        while(start<=end){
            int mid = start + (end - start)/2;

            if(list.get(mid)<target){
                start = mid + 1;
            }else if(list.get(mid) > target){
                end = mid - 1;
            }else{
                return true;
            }
        }

        return false;


    }
}
