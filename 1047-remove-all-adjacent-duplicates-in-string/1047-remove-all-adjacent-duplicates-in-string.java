class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        for(char ch:s.toCharArray()){
            if(st.isEmpty() || st.peek() != ch){
                st.push(ch);
            }else{
                st.pop();
            }
        }
        StringBuilder result = new StringBuilder();
        for(char ch:st){
            result.append(ch);
        }
        return result.toString();
    }
}