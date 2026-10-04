class Solution {
    public String removeStars(String s) {
        StringBuilder st = new StringBuilder();
        for(char ch:s.toCharArray()){
            if(ch == '*'){
                st.deleteCharAt(st.length()-1);
            }else{
                st.append(ch);
            }
        }
        return st.toString();
    }
}