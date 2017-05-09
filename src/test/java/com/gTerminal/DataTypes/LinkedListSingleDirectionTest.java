package com.gTerminal.DataTypes;

import org.junit.Test;

import static org.junit.Assert.*;


public class LinkedListSingleDirectionTest {
    LinkedListSingleDirection testClass = new LinkedListSingleDirection();

    @Test
    public void createLinkedListUsingIntArrayNormalCase() throws Exception {
        SingleLinkedNode first = testClass.createLinkedList(new int[]{1,2,3,4,5,6,7});
        String result = LinkedListSingleDirection.intListToString(first);
        String expected = "1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> done";
        assertEquals(expected, result);
    }

}