package org.example.DesignPatterns.Problem1.BetterCode;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.newLogger();

        logger.info("Hi this is my info log");
        logger.error("Hi something went wrong");
        logger.warn("Hi this is my warning log");
        logger.debug("Hi this is my debug log");
    }
}

