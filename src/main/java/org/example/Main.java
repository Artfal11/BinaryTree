package org.example;

public class Main {
    public static void main(String[] args) {
        BinaryTree BT = new BinaryTree();
        BT.add(5);
        BT.add(6);
        BT.add(4);
        BT.add(10);

        BT.traverseRecursivePreOrder();
        BT.traverseRecursiveInOrder();
        BT.traverseRecursivePostOrder();


    }
}
