class Solution {

    private boolean isVowel(char ch ){
            return ch == 'a'|| ch == 'e'|| ch == 'i'|| ch == 'o' || ch == 'u' ;
        }

    
    public int maxVowels(String s, int k) {

        int sum = 0 ;

        char[] arr = s.toCharArray();


        for(int i = 0 ; i < k ; i++){
            if(isVowel(arr[i])){
                sum++;
            }
        }

        int maxSum = sum;

        for(int i = k ; i < arr.length ; i++){
            if(isVowel(arr[i-k])){
                sum--;
            }
            if(isVowel(arr[i])){
                sum++;
            }

            maxSum = Math.max(maxSum , sum);
        }


        return maxSum;


    }
}

