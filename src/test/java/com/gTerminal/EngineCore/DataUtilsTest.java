package com.gTerminal.EngineCore;

import com.gTerminal.DataTypes.BinaryTreeNode;
import com.gTerminal.DataTypes.SingleLinkedNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class DataUtilsTest {
    DataUtils testClass = new DataUtils();

    @Test
    public void createLinkedListUsingIntArrayNormalCase() throws Exception {
        SingleLinkedNode first = testClass.createLinkedList(new int[]{1,2,3,4,5,6,7});
        String result = DataUtils.intListToString(first);
        String expected = "1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> done";
        assertEquals(expected, result);
    }

    @Test
    public void binaryTreeToString() {
        int[] inputs = new int[]{1,2,3,4,5,6,7,8,9,0};
        BinaryTreeNode root = DataUtils.createBinaryTree(inputs);
        StringBuilder sb = new StringBuilder();
        sb.append("1 ").append('\n');
        sb.append("2 7 ").append('\n');
        sb.append("3 5 8 0 ").append('\n');
        sb.append("4 X 6 X 9 X X X ").append('\n');
        sb.append("X X X X X X ").append('\n');
        String expected = sb.toString();

        assertEquals(expected, DataUtils.binaryTreeToString(root));


    }

}