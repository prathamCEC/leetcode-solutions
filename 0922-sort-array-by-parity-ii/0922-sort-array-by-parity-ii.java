class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int evenPointer = 0;
        int oddPointer = 1;
        int n = nums.length;
        while(evenPointer<n && oddPointer<n){
            if(nums[evenPointer]%2 == 0){
                evenPointer += 2; 
            }else if(nums[oddPointer]%2 != 0){
                oddPointer+=2;
            }else{
                int temp = nums[evenPointer];
                nums[evenPointer] = nums[oddPointer];
                nums[oddPointer] = temp;
                evenPointer+=2;
                oddPointer+=2;
            }
        }
        return nums;
    }
}