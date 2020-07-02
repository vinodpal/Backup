package com.vinoddesignpattern.designpattern.solid.open_closed_principle;

public enum Color {
    INVALID(0, "color.invalid"),
    RED(1, "color.red"),
    GREEN(2, "color.green"),
    BLUE(3, "color.blue");


    private final int code;
    private final String value;

    Color(int code, String value) {
        this.code = code;
        this.value = value;
    }

    public static Color fromInt(Integer code){
        Color color = Color.INVALID;
        switch (code){
            case 1 : color = Color.RED;
                break;
            case 2 : color = Color.GREEN;
                break;
            case 3 : color = Color.BLUE;
                break;
        }
        return color;
    }
}
