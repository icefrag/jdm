package org.example;

public class Util {
    static String osName = System.getProperty("os.name");
    static String osArch = System.getProperty("os.arch");

    public static boolean isWindows() {
        return osName != null && osName.toLowerCase().startsWith("windows");
    }

    
    public static boolean isMac() {
        return osName != null && osName.toLowerCase().startsWith("mac");
    }

    public static boolean is64Bit() {
        return osArch.contains("64");
    }

    
    public static boolean is32Bit() {
        return !is64Bit();
    }
}