package com.fzg.decorator;

public class Test {
    public void show(){
        System.out.println("卖衣服，花了1000元");
        System.out.println("买裤子，花了800元");
        System.out.println("买鞋子，花了900元");
    }

    public static void main(String[] args) {
        Person xiaoming = new XiaoMing();
        xiaoming = new Shirt(xiaoming);
        xiaoming = new Trousers(xiaoming);
        xiaoming.show();
        System.out.println("小明共消费：" + xiaoming.cost());
    }
}
