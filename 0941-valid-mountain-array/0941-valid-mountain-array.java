class Solution {
    public boolean validMountainArray(int[] arr) {
        int left = 1;
        int n = arr.length;
        if(n<3)
            return false;
        while(left<n && arr[left]>arr[left-1])
            left++;
        if(left == 1 || left == n)
            return false;
        while(left<n && arr[left]<arr[left-1])
            left++;
        if(left==n)
            return true;
        else
            return false;
    }
}