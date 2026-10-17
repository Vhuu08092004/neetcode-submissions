class Solution {
    public boolean isAnagram(String s, String t) {
        char[] arrayCharS = s.toCharArray();
        char[] arrayCharT = t.toCharArray();
        Arrays.sort(arrayCharS);
        Arrays.sort(arrayCharT);

        return Arrays.equals(arrayCharS,arrayCharT);
    }
}
