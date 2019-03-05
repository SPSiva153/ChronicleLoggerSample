package com.chronicle.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger chronicleLogger = LoggerFactory.getLogger(Main.class);
    private static final Logger fileLogger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        int runs = 100 * 1000;
        long start = System.nanoTime();
        for(int i=0;i< runs;i++) {
            fileLogger.info("File-Logger Hello World! " + i);
        }
        long time = System.nanoTime() - start;
        fileLogger.info("Average file log time was {} ns", time/runs);

        start = System.nanoTime();
        for(int i=0;i< runs;i++) {
            chronicleLogger.info("Chronicle-Logger Hello World! " + i);
        }
        time = System.nanoTime() - start;
        chronicleLogger.info("Average chronicle log time was {} ns", time/runs);
    }
}
