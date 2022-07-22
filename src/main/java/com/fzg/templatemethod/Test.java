package com.fzg.templatemethod;

public class Test {
    public static void main(String[] args) {
        Cook cook = new CookTomato();
        cook.cook();
        System.out.println("*********************");
        cook = new CookPotato();
        cook.cook();
    }
}
