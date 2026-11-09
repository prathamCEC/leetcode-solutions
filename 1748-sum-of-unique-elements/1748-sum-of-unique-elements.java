class Solution {
    public int sumOfUnique(int[] nums) {
        int [] freqArray = new int[101] ;// input range is from 1 to 100
        int sum = 0;
        for(int num:nums){
            freqArray[num]++;
        }
        for(int i=1;i<=100;i++){
            if(freqArray[i] == 1){
                sum+=i;
            }
        }
        return sum;
    }
}