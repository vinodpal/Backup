package com.vinoddesignpattern.designpattern.solid.open_closed_principle;

public class Product {
    private String name;
    private Size size;
    private Color color;

    public Product(String name, Size size, Color color) {
        this.name = name;
        this.size = size;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public Size getSize() {
        return size;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", color=" + color +
                '}';
    }
}
