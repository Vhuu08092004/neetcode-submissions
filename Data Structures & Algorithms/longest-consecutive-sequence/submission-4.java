class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0 ) return 0;
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int streaks = 0;
       for (int num : set) {
        if (!set.contains(num - 1)) {
            int temp = 1;
            int j = 1;
            while (set.contains(num + j)) {
                j++;
                temp++;
            }

            if (temp > streaks) {
                streaks = temp;
            }
        }
    }

        return streaks;
    }
}
