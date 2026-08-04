class Solution {
    public int findNumbers(int[] nums) {
        int evenCount = 0;
        for(int num:nums){
            String number = String.valueOf(num);
            if(number.length()%2==0){
                evenCount++;
            }
        }
        return evenCount;
    }
}