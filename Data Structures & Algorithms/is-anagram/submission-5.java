class Solution {
    public boolean isAnagram(String s, String t) {
if(s.length()!=t.length()){
    return false;
}

char[] charsS = s.toLowerCase().toCharArray();
Arrays.sort(charsS);

char[] charsT = t.toLowerCase().toCharArray();
Arrays.sort(charsT);

for(int i=0;i<charsT.length;i++){
    if(charsT[i]!=charsS[i]){
        return false;
    }
}
return true;

    }
}
