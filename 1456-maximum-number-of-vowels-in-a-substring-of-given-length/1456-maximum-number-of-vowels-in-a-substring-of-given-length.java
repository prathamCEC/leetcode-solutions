class Solution {
    public int maxVowels(String s, int k) {
        int vowel = 0;
        int max = 0;
        for(int i=0;i<k;i++){
            if(isVowel(s.charAt(i)))
                vowel++;
        }
        max = vowel;
        for(int i=k;i<s.length();i++){
            if(isVowel(s.charAt(i-k)))
                vowel--;
            if(isVowel(s.charAt(i)))
                vowel++;
            max = Math.max(max,vowel);
        }
        return max;
    }
    public boolean isVowel(char c){
        return "aeiou".indexOf(c) >= 0; //or return c==a||c==e||c==i||c==o||c==u;
    }
}