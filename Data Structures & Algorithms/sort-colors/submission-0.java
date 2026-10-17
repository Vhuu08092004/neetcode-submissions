class Solution {
    public void sortColors(int[] nums) {
        int[] tmp = new int[3];

        for (int i  = 0; i < nums.length; i++) {
           if (nums[i] == 0) tmp[0]++;
           else if (nums[i] == 1) tmp[1]++;
           else tmp[2]++;
        }

        int index = 0;
        for (int color = 0; color < tmp.length; color++) {
            for (int i = 0; i < tmp[color] ; i++) {
                nums[index] = color;
                index++; 
            }
        }
    }
}