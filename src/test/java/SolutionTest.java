import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  final private Solution sol = new Solution();
  @Test
  void longestCommonSubsequenceExample1() {
    assertEquals(3, sol.longestCommonSubsequence("abcde", "ace"));
  }
  @Test
  void longestCommonSubsequenceExample2() {
    assertEquals(3, sol.longestCommonSubsequence("abc", "abc"));
  }
  @Test
  void longestCommonSubsequenceExample3() {
    assertEquals(0, sol.longestCommonSubsequence("abc", "def"));
  }
}