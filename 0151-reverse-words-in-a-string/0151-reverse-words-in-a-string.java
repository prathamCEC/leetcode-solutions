class Solution {
    public String reverseWords(String s) {
        String[] word = s.trim().split("\\s+");
        String s1="";
        for(int i=word.length-1;i>=0;i--){
            s1 = s1+word[i];
            if(i!=0){
                s1 = s1+" ";
            }
        }
        return s1;
    }
}