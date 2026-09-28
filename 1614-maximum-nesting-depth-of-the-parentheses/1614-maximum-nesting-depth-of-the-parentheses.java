class Solution {
    public int maxDepth(String s) {
        int dept = 0;
        int maxDept = 0;
        for(char ch:s.toCharArray()){
            if(ch == '('){
                dept++;
                if(dept>maxDept){
                    maxDept = dept;
                }
            }else if(ch == ')'){
                dept--;
            }
        }
        return maxDept;
    }
}