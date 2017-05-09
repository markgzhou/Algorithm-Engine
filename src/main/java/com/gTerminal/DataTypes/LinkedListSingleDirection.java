package com.gTerminal.DataTypes;

public class LinkedListSingleDirection {
    public SingleLinkedNode createLinkedList(String[] listOfStrings){
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

    public SingleLinkedNode createLinkedList(int[] listOfInt){
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
