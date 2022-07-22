package com.fzg.templatemethod;

public abstract class Cook {
    public void open(){
        System.out.println("打开抽油烟机");
    }
    public void fire(){
        System.out.println("生火");
    }
    public abstract void doCook();
    public void outfire(){
        System.out.println("关火");
    }
    public void close(){
        System.out.println("关闭抽油烟机");
    }

    public final void cook(){
        open();
        fire();
        doCook();
        outfire();
        close();
    }
}
