package com.javadevjournal.datastructure.tree.bst;


public class BinarySearchTree {

    private Node root;
    public void inOrderTraversal() {
        inOrderTraversal(root);
    }

    public void postOrderTraversal() {
        postOrderTraversal(root);
    }

    public void preOrderTraversal() {
        preOrderTraversal(root);
    }
    private void inOrderTraversal(Node node) {

        if (node != null) {
            inOrderTraversal(node.left);
            System.out.println(node.data);

            inOrderTraversal(node.right);
        }
    }
    private void preOrderTraversal(Node node) {
        if (node != null) {
            System.out.println(node.data);
            inOrderTraversal(node.left);
            inOrderTraversal(node.right);
        }
    }

    private void postOrderTraversal(Node node) {
        if (node != null) {

            inOrderTraversal(node.left);
            inOrderTraversal(node.right);
            System.out.println(node.data);
        }
    }
    class Node {

        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;

            this.left = null;
            this.right = null;
        }
    }
}

}
