class Solution {
    public int firstUniqChar(String s) {
        int[] frequency_array = new int[26];
        for(int i=0;i<s.length();i++){
            frequency_array[s.charAt(i) - 'a']++;
        }
        for(int i=0;i<s.length();i++){
            if(frequency_array[s.charAt(i) - 'a'] == 1){
                return i;
            }
        }
        return -1;
    }
}