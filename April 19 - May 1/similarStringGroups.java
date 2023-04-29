class Solution {

  public int numSimilarGroups(String[] strs) {
    int groups = 0;
    int n = strs.length;
    boolean[] vis = new boolean[n];
    for (int i = 0; i < n; i++) {
      if (vis[i]) continue;
      groups++;
      dfs(i, strs, vis);
    }
    return groups;
  }

  public void dfs(int i, String[] strs, boolean[] vis) {
    vis[i] = true;
    for (int j = 0; j < strs.length; j++) {
      if (vis[j]) continue;
      if (isSimilar(strs[i], strs[j])) {
        dfs(j, strs, vis);
      }
    }
  }

  boolean isSimilar(String a, String b) {
    int count = 0;
    for (int i = 0; i < a.length(); i++) {
      if (a.charAt(i) != b.charAt(i)) {
        count++;
      }
    }
    return (count == 2 || count == 0);
  }
}
