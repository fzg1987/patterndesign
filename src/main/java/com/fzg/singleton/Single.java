package com.fzg.singleton;

public class Single {
    private volatile static Single instance;

    private Single(){
        System.out.println("创建了Single对象");
    }

    public static Single getInstance(){
        if(instance == null){
            synchronized (Single.class){
                if(instance == null){
                    instance = new Single();
                }
            }
        }
        return instance;
    }
}
