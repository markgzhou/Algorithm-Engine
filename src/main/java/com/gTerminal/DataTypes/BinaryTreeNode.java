package com.gTerminal.DataTypes;

public class BinaryTreeNode {
    public int intValue;
    public BinaryTreeNode left;
    public BinaryTreeNode right;

    public BinaryTreeNode(int v){
        intValue = v;
    }

    public BinaryTreeNode(int v, BinaryTreeNode l, BinaryTreeNode r){
        left = l;
        right = r;
        intValue = v;
    }

    public boolean hasLeft(){
        return left!=null;
    }

    public boolean hasRight(){
        return right!=null;
    }

}
