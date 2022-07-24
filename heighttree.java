public int findHeightOfBinaryTreeRecursive(Node root) {
 if (root == null) {
  return 0;
 }

 int lh = findHeightOfBinaryTreeRecursive(root.leftChild);
 int rh = findHeightOfBinaryTreeRecursive(root.rightChild);
 if (rh > lh) {
  return 1 + rh;
 } else {
  return 1 + lh;
 }
}
