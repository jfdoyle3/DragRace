package com.company.ui;

public enum ErrorMessage {

    // example:
   // VARIABLE_NAME(output),
   // VARIABLE_NAME(output);

   INPUT_MISMATCH_EXCEPTION("Error: Input must be a number - Exiting");

    private final String errorMsg;

    ErrorMessage(String errorMsg) {
        this.errorMsg = errorMsg;
    }


    public String toString() {
        return errorMsg;
    }
}
