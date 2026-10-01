class Solution {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for(int num:nums){
            if(num>max){
                secondMax = max;
                max = num;
            }else if(num>secondMax){
                secondMax = num;
            }
        }
        return (secondMax - 1) * (max-1);
    }
}