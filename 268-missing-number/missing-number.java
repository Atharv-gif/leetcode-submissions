class Solution {
    public int missingNumber(int[] arr) {

        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }

        int n = arr.length;

        int maxSum = n * (n + 1) / 2;

        int missing = maxSum - sum;

        return missing;
    }
}