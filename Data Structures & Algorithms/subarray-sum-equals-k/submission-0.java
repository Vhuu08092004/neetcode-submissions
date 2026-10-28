class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum = 0 , count = 0;
        Map<Integer , Integer> prefixSum = new HashMap<>();
        prefixSum.put(0 , 1);

        for (int num : nums) {
            sum += num;

            count += prefixSum.getOrDefault(sum - k  , 0);
            prefixSum.put(sum , prefixSum.getOrDefault(sum , 0) + 1);
        }
        return count;

    }
}