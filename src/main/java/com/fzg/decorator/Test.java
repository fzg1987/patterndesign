package com.fzg.decorator;

public class Test {
    public static void main(String[] args) {
        Person xiaoming = new XiaoMing();
        xiaoming = new Shirt(xiaoming);
        xiaoming = new Trousers(xiaoming);
        xiaoming.show();
        System.out.println("小明共消费：" + xiaoming.cost());
    }
}
