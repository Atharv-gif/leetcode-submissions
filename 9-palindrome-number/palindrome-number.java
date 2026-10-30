class Solution {
    public boolean isPalindrome(int x) {

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();

        int[] arr = String.valueOf(x).chars().map(Character::getNumericValue).toArray();

        for(int a : arr){
            list.add(a);
        }

        for(int b : arr){
            list1.add(b);
        }

        Collections.reverse(list);

        boolean isPalindrome = true;

        for(int i = 0 ; i < list.size() ; i++){
            if(!list.get(i).equals(list1.get(i))){
                isPalindrome = false;
                break;
            }
        }


        return isPalindrome;


        
    }
}