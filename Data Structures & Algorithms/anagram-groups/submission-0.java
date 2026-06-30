class Solution {

     public  boolean isAnagram(String str1,String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        char arr1[] = str1.toCharArray();
        char arr2[] = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1,arr2);
    }
     public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> anagrams = new ArrayList<>();
        for (int i = 0; i <strs.length ; i++) {
            if(strs[i]!=null){
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                for (int j = i+1; j < strs.length ; j++) {
                    if(strs[j]!=null){
                        if(isAnagram(strs[i],strs[j])){
                            list.add(strs[j]);
                            strs[j] = null;
                        }
                    }
                }
                anagrams.add(list);
                strs[i] = null;
            }
        }
        return anagrams;
    }
}
