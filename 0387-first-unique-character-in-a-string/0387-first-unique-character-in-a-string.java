class Solution {
    public int firstUniqChar(String s) {
        int[] frequencyArray = new int[26];
        for(char ch:s.toCharArray()){
            frequencyArray[ch-'a']++;
        }
        for(int i = 0;i<s.length();i++){
            if(frequencyArray[s.charAt(i)-'a'] == 1){
                return i;
            }
        }
        return -1;
    }   
}