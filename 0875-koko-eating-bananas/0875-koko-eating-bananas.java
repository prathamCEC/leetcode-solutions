class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left=1;
        int right=0;
        for(int pile:piles){
            right=Math.max(right,pile);
        }
        int answer=right;
        while(left<=right){
            int mid = left+(right-left)/2;
            long hour = 0;
            for(int pile:piles){
                hour+=(pile+mid-1)/mid;
            }
            if(hour<=h){
                answer=mid;
                right=mid-1;

            }else{
                left=mid+1;
            }
        }
        return answer;
    }
}