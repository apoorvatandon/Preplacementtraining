class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        List<int[]> data = new ArrayList<>();
        dfs(root, 0, 0, data);
        data.sort((a, b) -> {
            if (a[0] != b[0]) return a[0] - b[0];
            if (a[1] != b[1]) return a[1] - b[1];
            return a[2] - b[2];
        });

        int prev = (int)1e5;
        for (int[] d : data){
            if (prev != d[0]){
                prev = d[0];
                List<Integer> list = new ArrayList<>();
                list.add(d[2]);
                ans.add(list);
            }else{
                ans.get(ans.size() - 1).add(d[2]);
            }
        }

        return ans;
    }

    private void dfs(TreeNode root, int d, int p, List<int[]> data){
        if (root == null) return;
        data.add(new int[]{p, d, root.val});
        dfs(root.left, d + 1, p - 1, data);
        dfs(root.right,d + 1, p + 1, data);
    }
}
