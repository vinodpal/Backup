package com.vinoddesignpattern.designpattern.solid.open_closed_principle;

import java.util.List;
import java.util.stream.Stream;

public class BetterFilter implements Filter<Product> {

    @Override
    public Stream<Product> filter(List<Product> items, Specification<Product> specification) {
        return items.stream().filter(
                product -> specification.isSatisfied(product)
        );
    }
}
