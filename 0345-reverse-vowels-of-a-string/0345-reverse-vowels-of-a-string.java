class Solution {
    public String reverseVowels(String s) {
        char [] arr = s.toCharArray();
        int left = 0;
        int right = arr.length-1;
        while(left<right){
            while(left<right && !isVowels(arr[left])){
                left++;
            }while(left<right && !isVowels(arr[right])){
                right--;
            }
            if(left<right){
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        return new String(arr);
    }
    public Boolean isVowels(char ch){
        if(ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U')
            return true;
        return false;
    }
}