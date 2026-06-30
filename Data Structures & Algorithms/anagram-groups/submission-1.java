class Solution {
 public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> list = new HashMap<>();
        for (String str:strs){
        char[] strArr=   str.toCharArray();
        Arrays.sort(strArr);
       String sortedStr = new String(strArr);
       list.putIfAbsent(sortedStr,new ArrayList<>());
list.get(sortedStr).add(str);
        }
        return new ArrayList<>( list.values());
    }
}
