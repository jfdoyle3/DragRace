package com.company.ui;

public enum ErrorMessage {

    // example:
   // WHITE_BACKGROUND_BRIGHT("\033[0;107m");     // WHITE

   INPUT_MISMATCH_EXCEPTION("Error: Input must be a number - Exiting");

    private final String errorMsg;

    ErrorMessage(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    @Override
    public String toString() {
        return errorMsg;
    }
}
