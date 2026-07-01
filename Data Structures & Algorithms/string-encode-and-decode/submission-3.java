class Solution {

    public String encode(List<String> strs) {
      StringBuilder res = new StringBuilder();
      for (String s:strs){
          res.append(s.length()).append("#").append(s);
      }
      return res.toString();
  }

     public List<String> decode(String str) {
int i =0;

        ArrayList<String> list = new ArrayList<>();
        while (i<str.length()){
            int j =i;

            while (str.charAt(j)!='#'){
               j++;
            }
            int length = Integer.parseInt(str.substring(i,j));
            String s = str.substring(j+1,j+length+1);
            i = j+length+1;
list.add(s);
        }

        return list;
    }

}
