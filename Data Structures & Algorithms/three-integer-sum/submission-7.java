class Solution {
    public List<List<Integer>> threeSum(int[] nums)
       {
        Set<String> set = new HashSet<>();
        List<List<Integer>> sumOfThree = new ArrayList<>();
Arrays.sort(nums);
        if (nums[0]>0){
            return sumOfThree;
        }
    for(int i=0;i<nums.length;i++){


        int target = nums[i];
        int left = i+1;
        int right = nums.length-1;
        while (left<right){
            if(nums[left]+nums[right] +target==0){
                String s =""+nums[left]+nums[right]+nums[i];
             boolean isAdded=   set.add(s);
              if(isAdded){
                  sumOfThree.add(List.of(nums[left],nums[right], nums[i]));

              };
left++;
right--;
continue;

            }
            if(nums[left]+nums[right]+target <0){
                left++;
            }else if(nums[left]+nums[right]+target >0){
                right--;
            }

        }
    }
    return sumOfThree;
    }
    }