package org.example.DesignPatterns.Problem1.ProblematicCode;

public class Logger {

    public void info(String message) {
        System.out.println("INFO: " + message);
    }

    public void error(String message) {
        System.out.println("ERR: " + message);
    }

    public void debug(String message) {
        System.out.println("DEBUG: " + message);
    }

    public void warn(String message) {
        System.out.println("WARN: " + message);
    }
}
