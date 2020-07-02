package com.vinoddesignpattern.designpattern.builder;

import java.util.List;

public final class ClassTest
{
    final List<String> name;

    public ClassTest(List<String> name) {
        this.name = name;
    }

    public List<String> getName() {
        return name;
    }
}
