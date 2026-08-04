class Solution {
    public int characterReplacement(String s, int k) {
int maxLength = 0;
		Set<Character> characters = new HashSet<>();
		for (int i = 0; i < s.length(); i++) {
			characters.add(s.charAt(i));
		}
		for (Character c : characters){
			int count =0;
			int l = 0;
			for (int right = 0; right < s.length(); right++) {
if(s.charAt(right)==c){
	count++;
}
while ((right-l+1)-count>k){
	if(s.charAt(l)==c){
		count--;
	}
	l++;
}
maxLength=Math.max(maxLength,right-l+1); 
			}
		}
		return maxLength;
	}}