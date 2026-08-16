class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] answer = new int[temperatures.length];
        Deque<Integer> monoStack = new ArrayDeque<>();
        for(int i=0;i<temperatures.length;i++){
            while(!monoStack.isEmpty() && temperatures[i]>temperatures[monoStack.peek()]){
                int prevIndex = monoStack.pop();
                answer[prevIndex] = i-prevIndex;   
            }
            monoStack.push(i);
        }
        return answer;
    }
}