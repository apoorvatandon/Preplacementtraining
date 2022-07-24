public static ArrayList<Integer> nodeToRootPath(Node root, int data) {
    ArrayList<Integer> res = new ArrayList<>();
    if (root == null) {
        return res;
    }
    if (root.data == data) {
        res.add(data);
        return res;
    }
    res = nodeToRootPath(root.left, data);
    if (res.size() != 0) {
        res.add(root.data);
        return res;
    }
    else {
        res.clear();
        res = nodeToRootPath(root.right, data);
        res.add(root.data);
        return res;
    }
}
