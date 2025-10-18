package org.example.DesignPatterns.Problem1.BestCode;

public class Logger {
    private static volatile Logger instance; // volatile keywords ensure visibility across threads

    private Logger() {
    } // private Constructor to prevent initialisation

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

    //1 way
    public static synchronized Logger newLogger() {
        if (instance == null) instance = new Logger();
        return instance;
    }

    //     2nd way--> Synchronise only when we create an instance
    // Double check Locking
    public static Logger getLogger() {
        if (instance == null) { // First Check (no synchronization needed here)
            synchronized (Logger.class) { // synchronize only when creating the instance
                if (instance == null) { // Second check inside the synchronized block
                    instance = new Logger(); //Create an instance if it's still null
                }
            }
        }
        return instance; // returns the single instance
    }
}
