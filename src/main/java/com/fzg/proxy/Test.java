package com.fzg.proxy;

public class Test {
    public static void main(String[] args) {
        House house = new Xiaoming();
        HouseProxy proxy = new HouseProxy(house);
        proxy.findHouse();
    }
}
