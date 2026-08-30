class Solution {
    public int[] decrypt(int[] code, int k) {

        int n = code.length ;

        int[] result = new int[n];


        for( int i = 0 ; i < code.length ; i++){
            int sum = 0;

            if(k > 0){
                for( int j = 0 ; j < k ; j ++){
                    int nextIndex = (i + j + 1)%n;
                    sum += code[nextIndex];
                }
            }else if(k == 0){
                sum = 0;
            }else{


                for(int j = 0 ; j < -k ; j++){
                    int prevIndex = (i - j - 1 + n)%n;
                    sum += code[prevIndex];
                }



            }
            result[i] = sum;
        }

        return result;
        
        
    }
}