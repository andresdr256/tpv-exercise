package oop.inheritance.ingenico;

public class IngenicoDisplay {

    private static IngenicoDisplay ingenicoDisplay;

    /**
     * Prints a message to specied position
     *
     * @param x       horizontal position
     * @param y       vertical position
     * @param message message to be printed
     */

    public static IngenicoDisplay getingenicoDisplay() {
        if (ingenicoDisplay == null) {
            ingenicoDisplay = new IngenicoDisplay();
        }
        return ingenicoDisplay;
    }


    public void showMessage(int x, int y, String message) {
    }

    /**
     * Clears the screen
     */
    public void clear() {

    }
}
