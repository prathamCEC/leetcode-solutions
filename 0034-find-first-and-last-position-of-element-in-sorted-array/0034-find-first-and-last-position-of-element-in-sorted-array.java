class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = findFrist(nums, target);
        int last = findLast(nums, target);
        return new int[]{first,last};
    }
    public int findFrist(int[] nums, int target){
        int left=0;
        int right=nums.length-1;
        int pos = -1;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(nums[mid]==target){
                pos=mid;
                right=mid-1;
            }else if(nums[mid]<target){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return pos;

    }
    public int findLast(int[] nums, int target){
        int left=0;
        int right=nums.length-1;
        int pos = -1;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(nums[mid]==target){
                pos=mid;
                left=mid+1;
            }else if(nums[mid]<target){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return pos;

    }
}