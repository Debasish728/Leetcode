class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        int n = str1.length();
        int n2 = str2.length();
        int j = 0;

        for (int i = 0; i < n; i++) {
            if (
                j < n2 && (
                    (str1.charAt(i) == str2.charAt(j)) ||
                    (str1.charAt(i) + 1 == str2.charAt(j)) ||
                    (str1.charAt(i) == 'z' && str2.charAt(j) == 'a')
                )
            ) {
                j++;
            }
        }

        return j == n2;
    }
}
