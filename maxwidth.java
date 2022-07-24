class BinaryTree {
    Node root;
    int getMaxWidth(Node node)
    {
        int maxWidth = 0;
        int width;
        int h = height(node);
        int i;
        for (i = 1; i <= h; i++) {
            width = getWidth(node, i);
            if (width > maxWidth)
                maxWidth = width;
        }
 
        return maxWidth;
    }
    int getWidth(Node node, int level)
    {
        if (node == null)
            return 0;
 
        if (level == 1)
            return 1;
        else if (level > 1)
            return getWidth(node.left, level - 1)
                + getWidth(node.right, level - 1);
        return 0;
    }
 
    int height(Node node)
    {
        if (node == null)
            return 0;
        else {

            int lHeight = height(node.left);
            int rHeight = height(node.right);
 
            return (lHeight > rHeight) ? (lHeight + 1)
                                       : (rHeight + 1);
        }
    }
