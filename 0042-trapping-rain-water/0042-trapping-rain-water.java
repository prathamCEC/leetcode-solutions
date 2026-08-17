class Solution {
    public int trap(int[] height) {
        int rainWater = 0;
        int left = 0;
        int right = height.length-1;
        int leftMax = height[left];
        int rightMax = height[right];
        while(left<right){
            if(height[left]<=height[right]){
                if(height[left]>leftMax){
                    leftMax = height[left];
                }else{
                    rainWater += leftMax - height[left];
                }
                left++;
            }else{
                if(height[right]>rightMax){
                    rightMax = height[right];
                }else{
                    rainWater += rightMax - height[right];
                }
                right--;
            }
        }
        return rainWater;
    }
}
