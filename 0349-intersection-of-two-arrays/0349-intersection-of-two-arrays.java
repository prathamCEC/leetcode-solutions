class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> unique = new HashSet<>();
        for(int num:nums1){
            set.add(num);
        }
        for(int num:nums2){
            if(set.contains(num)){
                unique.add(num);
            }
        }
        int[] answer = new int[unique.size()];
        int i=0;
        for(int ele: unique){
            answer[i++] = ele;
        }
        return answer;
    }
}