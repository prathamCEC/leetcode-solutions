class Solution {
    public int maxSubArray(int[] nums) {
        int result = nums[0];
        int maxEnding  = nums[0];
        for(int i=1;i<nums.length;i++){
            maxEnding = Math.max(maxEnding+nums[i],nums[i]);
            result = Math.max(result,maxEnding);
        }
        return result;
    }
}