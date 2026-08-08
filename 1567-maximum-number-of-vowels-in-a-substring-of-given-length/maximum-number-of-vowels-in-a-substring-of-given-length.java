class Solution {

    static boolean isVowel(char ch){
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    } 
    public int maxVowels(String s, int k) {

        int total = 0 ; 

        char[] arr = s.toCharArray();


        for(int i = 0 ; i < k ; i++){
            if(isVowel(arr[i])){
                total+=1;
            }
        }

        int maxTotal = total;

        for(int i = k ; i < arr.length ; i++){
            if(isVowel(arr[i-k])){
                total--;
            }
            if(isVowel(arr[i])){
                total++;
            }

            maxTotal = Math.max(maxTotal , total);
        }
        
        return maxTotal;

     }
}