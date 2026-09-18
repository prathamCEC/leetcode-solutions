class Solution {
    public int firstMissingPositive(int[] nums) {
        // Arrays.sort(nums);
        // int target = 1;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i] == target){
        //         target++;
        //     }
        // }
        // return target;
        HashSet<Integer> set = new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int target = 1;
        while(set.contains(target)){
            target++;
        }
        return target;
    }
}