package com.vinoddesignpattern.designpattern.solid.open_closed_principle;

public interface Specification<T> {
    boolean isSatisfied(T item);
}
