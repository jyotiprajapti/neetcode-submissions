class Solution {
     public int[] topKFrequent(int[] nums, int k) {
Map<Integer, Integer> map = new HashMap<>();
for (int num:nums){
    map.put(num,map.getOrDefault(num,0)+1 );

}

int[] list = map.entrySet().stream().sorted(Map.Entry.<Integer,Integer>comparingByValue().reversed()).map(Map.Entry::getKey).limit(k).mapToInt(Integer::intValue).toArray();
return list;

    }
}
