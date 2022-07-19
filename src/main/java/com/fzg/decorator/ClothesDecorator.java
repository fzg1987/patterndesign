package com.fzg.decorator;

public abstract class ClothesDecorator implements Person{

    protected Person person;

    public ClothesDecorator(Person person) {
        this.person = person;
    }

}
