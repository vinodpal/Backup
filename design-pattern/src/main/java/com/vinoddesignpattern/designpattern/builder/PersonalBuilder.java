package com.vinoddesignpattern.designpattern.builder;

public class PersonalBuilder<SELF extends PersonalBuilder<SELF>> {
    private String name;

    public PersonalBuilder(String name) {
        this.name = name;
    }

    public SELF setName(String name){
        this.name = name;
        return self();
    }

    protected SELF self(){
        return (SELF) this;
    }
}
