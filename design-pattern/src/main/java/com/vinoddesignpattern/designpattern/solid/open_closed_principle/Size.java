package com.vinoddesignpattern.designpattern.solid.open_closed_principle;

public enum Size {
    INVALID(0, "size.invalid"),
    SMALL(1, "size.small"),
    MEDIUM(2, "size.medium"),
    LARGE(3, "size.large"),
    YUGE(4, "size.yuge");

    private final int code;
    private final String value;

    Size(int code, String value) {
        this.code = code;
        this.value = value;
    }

    public static Size fromInt(Integer code){
        Size size = Size.INVALID;
        switch (code){
            case 1: size = Size.SMALL;
                    break;
            case 2: size = Size.MEDIUM;
                    break;
            case 3: size = Size.LARGE;
                    break;
            case 4: size = Size.YUGE;
                    break;
        }
        return size;
    }
}
