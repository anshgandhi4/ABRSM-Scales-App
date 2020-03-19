package com.myapptest.abrsmpianoscalesandsightreading;

public class SaveSettings {
    private static boolean g12 = true;
    private static boolean sors = false;
    private static boolean darkMode = false;

    public static boolean getG12() {
        return g12;
    }
    public static boolean getSors() {
        return sors;
    }
    public static boolean getDarkMode() {return darkMode;}

    public static void setG12(boolean bool) {
        g12 = bool;
    }
    public static void setSors(boolean bool) {
        sors = bool;
    }
    public static void setDarkMode(boolean bool) {darkMode = bool;}
}
