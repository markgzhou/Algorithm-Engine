package com.gTerminal.Questions;

import java.util.Arrays;

public class TestClass {
    public void execute(){
        System.out.println("Test Class without args");
    }

    public void execute(String[] args){
        System.out.println("Test Class with args: " + Arrays.asList(args).toString());
    }
}
