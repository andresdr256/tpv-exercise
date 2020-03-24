package oop.inheritance.ingenico;

public class IngenicoKeyboard {

    private static IngenicoKeyboard ingenicoKeyboard;

    /**
     * @return key pressed
     */

    public static IngenicoKeyboard getingenicoKeyboard() {
        if (ingenicoKeyboard == null) {
            ingenicoKeyboard = new IngenicoKeyboard();
        }
        return ingenicoKeyboard;
    }

    public String get() {
        return "Key pressed";
    }

}
