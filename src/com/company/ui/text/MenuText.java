package com.company.ui.text;

public enum MenuText {
    
    TURN_OPTIONS("1. Accelerate\n2. Coast\n3. Decelerate\n99. Quit"),
    TURN_OPTIONS_ENGINE("1. Accelerate\n2. Coast\n3. Decelerate\n4. Start/Stop Engine\n99. Quit");

    private final String menuText;

    MenuText(String menuText) {
        this.menuText = menuText;
    }


    public String toString() {
        return menuText;
    }
}
