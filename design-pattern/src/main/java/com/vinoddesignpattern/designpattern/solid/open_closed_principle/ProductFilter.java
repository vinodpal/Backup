package com.vinoddesignpattern.designpattern.solid.open_closed_principle;

import java.util.List;
import java.util.stream.Stream;

public class ProductFilter {

    public Stream<Product> filterByColor(List<Product> products, Color color){
        return products.stream().filter(product ->
            product.getColor().equals(color)
        );
    }

    public Stream<Product> filterBySize(List<Product> products, Size size){
        return products.stream().filter(product -> product.getSize().equals(size));
    }

    public Stream<Product> fileterBySizeAndColor(List<Product> products, Size size, Color color){
        return products.stream().filter(product -> product.getSize().equals(size) && product.getColor().equals(color));
    }
}
