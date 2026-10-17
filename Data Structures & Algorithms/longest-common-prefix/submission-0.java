class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0 || strs == null)
            return "";

        String result = strs[0];
        for (int i = result.length() - 1; i >= 0; i--) {
            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length() || strs[j].charAt(i) != result.charAt(i)) {
                    result = result.substring(0, i);
                    break;
                }
            }
        }
        return result;
    }
}