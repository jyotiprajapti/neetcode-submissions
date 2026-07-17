class Solution {
   public int[] twoSum(int[] numbers, int target) {
        Arrays.sort(numbers);
        int left =0;
        int right =numbers.length-1;
        int [] arr = new int[2];
        while (right<=numbers.length-1&&left>=0){
            if (numbers[left] + numbers[right] >target) {
                right--;

            }else if(numbers[left] + numbers[right] <target){
                left++;
            }else {

                arr[0]=left+1;
                arr[1] = right+1;
                return arr;
            }

        }
        return  arr;
    }
}
