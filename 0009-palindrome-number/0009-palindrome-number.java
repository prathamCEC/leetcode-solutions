class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int palindrome = 0;
        int temp=x;
        while(temp>0){
            int lastDigit = temp%10;
            palindrome = palindrome*10+lastDigit;
            temp/=10;
        }
        return palindrome == x;
    }
}