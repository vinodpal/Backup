package com.vinoddesignpattern.designpattern.solid.open_closed_principle;

import java.util.Arrays;
import java.util.List;

public class OpenClosedPrincipleTest {
    public static void main(String[] args) {
        Product apple = new Product("Apple", Size.SMALL, Color.GREEN );
        Product grapes = new Product("Grapes", Size.SMALL, Color.GREEN );
        Product mango = new Product("Mango", Size.MEDIUM, Color.RED );
        Product banana = new Product("Banana", Size.LARGE, Color.GREEN );
        List<Product> products = Arrays.asList(apple, grapes, mango, banana);
        ProductFilter productFilter = new ProductFilter();
        System.out.println("Green Product");
        productFilter.fileterBySizeAndColor(products, Size.LARGE, Color.GREEN)
                .forEach(product -> {
                    System.out.println(product.toString());
                });
        System.out.println("Using Better Filter");
        BetterFilter betterFilter = new BetterFilter();
        betterFilter.filter(products, new ColorSpecification(Color.GREEN))
                .forEach(product ->
                                System.out.println(product.toString())
                        );

        System.out.println("Apply And Operation");
        betterFilter.filter(products, new AndSpecification<>(new ColorSpecification(Color.GREEN),
                    new SizeSpecification(Size.LARGE)))
                .forEach(product -> System.out.println(product.toString()));
    }
}
