class Solution {
    public boolean isAnagram(String s, String t) {
        //Brute-Force Approach
        // char []s1 = s.toCharArray();
        // char []t1 = t.toCharArray();
        // Arrays.sort(s1);
        // Arrays.sort(t1);
        // String sSorted = new String(s1);
        // String tSorted = new String(t1);
        // if(sSorted.equals(tSorted)){
        //     return true;
        // }else{
        //     return false;
        // }
        //Optimal Approach
        if(s.length() != t.length()){
            return false;
        }
        int[] frequencyArray = new int[26];
        for(int i=0;i<s.length();i++){
            frequencyArray[s.charAt(i) - 'a']++;
            frequencyArray[t.charAt(i)-'a']--;
        }
        for(int count:frequencyArray){
            if(count!=0){
                return false;
            }
        }
        return true;
    }
}