package com.company;

public enum exEnum {

    WHITE_BACKGROUND_BRIGHT("\033[0;107m");     // WHITE

    private final String exEnums;

    exEnum(String exEnums) {
        this.exEnums = exEnums;
    }

    @Override
    public String toString() {
        return exEnums;
    }
}
