package com.gTerminal.EngineCore;

import com.gTerminal.DataTypes.BinaryTreeNode;
import com.gTerminal.DataTypes.SingleLinkedNode;

import java.util.ArrayList;

public class DataUtils {
    public static SingleLinkedNode createLinkedList(String[] listOfStrings){
        if(listOfStrings.length <1) return null;

        SingleLinkedNode first = new SingleLinkedNode(listOfStrings[0]) ;
        SingleLinkedNode current = first;
        for(int i=1; i<listOfStrings.length; ++i){
            SingleLinkedNode newNode = new SingleLinkedNode(listOfStrings[i]);
            current.next = newNode;
            current = current.next;
        }
        return first;
    }

    public static SingleLinkedNode createLinkedList(int[] listOfInt){
        if(listOfInt.length <1) return null;

        SingleLinkedNode first = new SingleLinkedNode(listOfInt[0]) ;
        SingleLinkedNode current = first;
        for(int i=1; i<listOfInt.length; ++i){
            SingleLinkedNode newNode = new SingleLinkedNode(listOfInt[i]);
            current.next = newNode;
            current = current.next;
        }
        return first;
    }

    public static BinaryTreeNode createBinaryTree(int[] listOfInt){
        if(listOfInt == null || listOfInt.length < 1){
            return null;
        }else if(listOfInt.length==1){
            return new BinaryTreeNode(listOfInt[0]);
        }

        BinaryTreeNode root = new BinaryTreeNode(listOfInt[0]);

        int leftLen = (listOfInt.length - 1 + 1)/2;
        int rightLen = listOfInt.length - 1 -(leftLen);

        int[] left = new int[leftLen];
        int[] right = new int[rightLen];

        //copy left
        for(int i=0; i<leftLen; ++i){
            left[i] = listOfInt[1+i];
        }

        root.left = createBinaryTree(left);

        //copy right
        for(int i=0; i<rightLen; ++i){
            right[i] = listOfInt[1+leftLen+i];
        }
        root.right = createBinaryTree(right);

        return root;
    }

    public static String binaryTreeToString(BinaryTreeNode root){
        BinaryTreeNode cur; //protect root pointer
        ArrayList<BinaryTreeNode> curLevel = new ArrayList<>();
        ArrayList<BinaryTreeNode> nxtLevel = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        curLevel.add(root);
        while(curLevel.size()>0) {
            while (curLevel.size() > 0) {
                cur = curLevel.get(0);
                curLevel.remove(0);
                if (cur == null) {
                    sb.append('X').append(' ');
                    continue;
                }
                sb.append(cur.intValue).append(' ');
                nxtLevel.add(cur.left);
                nxtLevel.add(cur.right);
            }
            curLevel = nxtLevel;
            nxtLevel = new ArrayList<>();
            sb.append('\n');
        }
        return sb.toString();
    }

    public static String listToString(SingleLinkedNode first,String dataType) {
        StringBuilder sb = new StringBuilder("");
        SingleLinkedNode current = first; //Protect first object pointer
        while(current!=null){
            sb.append(current.getValueToString(dataType)).append(" -> ");
            current = current.next;
        }
        sb.append("done");

        return sb.toString();
    }

    public static String intListToString(SingleLinkedNode first) {
        return listToString(first,"int");
    }

    public static String stringListToString(SingleLinkedNode first) {
        return listToString(first,"string");
    }
}
