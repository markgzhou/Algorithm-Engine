package com.gTerminal.EngineCore;

import java.lang.reflect.Method;

public class Engine {

    public static void main(String[] args){

        if(args.length == 0){
            System.out.println("Please type in a <class name>! For example: com.gTerminal.Questions.TestClass");
            return;
        }


        String runnerClassName = args[0];

        try{
            Class cls = Class.forName(runnerClassName);
            Object runClassObject = cls.newInstance();
            System.out.println("Running Class "+ runnerClassName + "(including class name)");

            if(args.length==1) {
                Method method = cls.getDeclaredMethod("execute");
                method.invoke(runClassObject);
            }
            else{
                System.out.println("input args length:"+ args.length);

                Method method = cls.getDeclaredMethod("execute",new Class[]{args.getClass()});
                method.invoke(runClassObject,new Object[]{args});
            }

        }
        catch (Exception e){
            e.printStackTrace();
        }



    }
}
