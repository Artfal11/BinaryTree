package org.example;

public class BinaryTree {
    public Node root;

    static class Node{
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
        }
    }
    public void add(int k) {
        Node x = root;
        Node y = null;
        while (x != null) {
            if (k == x.value) {
                x.value = k;
                return;
            } else {
                y = x;
                if (k < x.value) {
                    x = x.left;
                } else {
                    x = x.right;
                }
            }
        }
        Node newNode = new Node(k);
        if (y == null) {
            root = newNode;
        } else {
            if (k < y.value) {
                y.left = newNode;
            } else {
                y.right = newNode;
            }
        }
    }

    public void traverseRecursivePreOrder() {
        traverseRecursivePreOrder(root);
    }

    public void traverseRecursiveInOrder() {
        traverseRecursiveInOrder(root);
    }

    public void traverseRecursivePostOrder() {
        traverseRecursivePostOrder(root);
    }

    private void traverseRecursivePreOrder(Node node) {
        if (node != null) {
            System.out.println("node = " + node.value);
            traverseRecursivePreOrder(node.left);
            traverseRecursivePreOrder(node.right);
        }
    }

    private void traverseRecursiveInOrder(Node node) {
        if (node != null) {
            traverseRecursiveInOrder(node.left);
            System.out.println("node = " + node.value);
            traverseRecursiveInOrder(node.right);
        }
    }

    private void traverseRecursivePostOrder(Node node) {
        if (node != null) {
            traverseRecursivePostOrder(node.left);
            traverseRecursivePostOrder(node.right);
            System.out.println("node = " + node.value);
        }
    }
}
