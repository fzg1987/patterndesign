package com.fzg.observer;

public class CustomerB extends Customer{
    @Override
    public void update() {
        System.out.println("客户B的报纸已送达");
    }
}
