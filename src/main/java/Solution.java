public class Solution {
  public int longestCommonSubsequence(String text1, String text2) {
    int m = text1.length();
    int n = text2.length();
    int[][] dp = new int[m+1][n+1];
    // from last index to calculate max common substring length
    // dp[i][j] = dp[i+1][j+1]+1 if text1[i] == text2[j]
    // dp[i][j] = max(dp[i+1][j], dp[i][j+1]) if text1[i] != text2[j]
    for (int i = m-1; i >= 0; i--) {
      for (int j = n-1; j >= 0; j--) {
        if (text1.charAt(i) == text2.charAt(j)) {
          dp[i][j] = dp[i+1][j+1] + 1;
        } else {
          dp[i][j] = Math.max(dp[i+1][j], dp[i][j+1]);
        }
      }
    }
    return dp[0][0];
  }
}
