class Solution {
    public int numberOfSteps(int num) {
        int step=0;
        while(num>0){
            int lastDigit = num%10;
            if((lastDigit&1)==0){ //if(lastDigit%2==0){}
                num/=2;
            }else{
                num-=1;
            }
            step++;
        } 
        return step;
    }
}