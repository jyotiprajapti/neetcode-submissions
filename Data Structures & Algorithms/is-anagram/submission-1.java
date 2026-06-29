class Solution {
    static public boolean isAnagram(String s, String t) {
          String trim1 = s.trim();
          String trim2 = t.trim();
          if (trim1.length() != trim2.length()) {
              return false;
          }
          char[] arr1 = trim1.toLowerCase().toCharArray();
Arrays.sort(arr1);
          char[] arr2 = trim2.toLowerCase().toCharArray();
          Arrays.sort(arr2);
          for (int i = 0; i <arr2.length ; i++) {
              if(arr1[i]!=arr2[i]){
                  return false;
              }

          }
          return true;
      }
}
