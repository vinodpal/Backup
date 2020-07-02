package com.vinoddesignpattern.designpattern.solid.open_closed_principle;

public class SizeSpecification implements Specification<Product> {
    private Size size;

    public SizeSpecification(Size size) {
        this.size = size;
    }

    @Override
    public boolean isSatisfied(Product item) {
        return item.getSize().equals(size);
    }
}
