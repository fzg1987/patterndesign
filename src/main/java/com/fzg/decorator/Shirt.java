package com.fzg.decorator;

public class Shirt extends ClothesDecorator{

    public Shirt(Person person) {
        super(person);
    }

    @Override
    public Double cost() {
        return this.person.cost()+1000.00;
    }

    @Override
    public void show() {
        this.person.show();
        System.out.println("买了一件衬衫，累积消费：" + this.cost());
    }
}
