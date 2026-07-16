class Solution {
 public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        if(nums.length==0){
            return 0;
        }
        int length =1;
        int biggestLength=1;
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i]==nums[i+1]){
                continue;
            }
            if(nums[i]+1==nums[i+1]){

                length=length+1;
                biggestLength = Math.max(length, biggestLength);
            }else {
                length=1;
            }
        }

   return biggestLength;
    }}