class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        int n = s.length();
        int[] A = new int[n];
        for (int[] it : shifts) {
            int leftIndex = it[0];
            int rightIndex = it[1];
            int direction = it[2];
            if (direction == 1) {
                A[leftIndex] += 1;
                if (rightIndex + 1 < n) {
                    A[rightIndex + 1] -= 1;
                }
            } else {
                A[leftIndex] -= 1;
                if (rightIndex + 1 < n) {
                    A[rightIndex + 1] += 1;
                }
            }
        }
        for (int i = 1; i < n; ++i) {
            A[i] += A[i - 1];
        }
        char[] chars = s.toCharArray();
        for (int i = 0; i < n; ++i) {
            int shift = (A[i] % 26 + 26) % 26; 
            int ch = chars[i] - 'a';
            ch = (ch + shift) % 26;
            chars[i] = (char) ('a' + ch);
        }
        return new String(chars);
    }
}