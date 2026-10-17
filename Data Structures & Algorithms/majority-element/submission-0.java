class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int result = 0;
        int max = -999;
        for (int key : map.keySet()) {
            if (max < map.get(key)) {
                max =  map.get(key);
                result = key;
            }
        }
        return result;
    }
}