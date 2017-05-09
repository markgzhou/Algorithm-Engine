package com.gTerminal.DataTypes;

public class SingleLinkedNode {
    public String stringValue;
    public int intValue;
    public SingleLinkedNode next;

    public SingleLinkedNode(String s){
        this.stringValue = s;
    }

    public SingleLinkedNode(int i){
        this.intValue = i;
    }

    public String getValueToString(String dataType){
        if(dataType.toLowerCase().equals("string")){
            return stringValue;
        }
        if(dataType.toLowerCase().equals("int")){
            return String.valueOf(intValue);
        }
        return null;
    }
}
