class Solution {
  public int[] productExceptSelf(int[] nums) {
    int [] output = new int[nums.length];

    for (int i = 0; i < nums.length ; i++) {
        int mul = 1;
      int  j=0;
      while (j< nums.length){
          if(j!=i){
              mul= nums[j]*mul;
       
          }
          j++;
      }
      output[i] = mul;


    }
    return output;
}
}  
