class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while(n!=1 && !set.contains(n)){
            set.add(n);
            n = getSum(n);
        }
        return n == 1;
    }
    public int getSum(int n){
        int totalSum = 0;
        while(n>0){
            int digit = n%10;
            totalSum += digit*digit;
            n/=10;
        }
        return totalSum;
    }
}