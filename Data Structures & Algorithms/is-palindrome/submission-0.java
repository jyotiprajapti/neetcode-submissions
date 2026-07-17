class Solution {
    public boolean isPalindrome(String s) {
        {
     String newStr=   s.toLowerCase().replaceAll("[^a-z0-9]","");
     int j;
        for (int i = 0; i <newStr.length()/2 ; i++) {
            j= newStr.length()-1-i;
            if(newStr.charAt(i)!=newStr.charAt(j)){
                return  false;
            }
        }
        return true;
    }
    }
}
