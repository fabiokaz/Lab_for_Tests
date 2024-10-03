package com.kaz.testing.lab.service;

import java.util.logging.Logger;

public class DataBase {

    private static final Logger LOGGER = Logger.getLogger(DataBase.class.getName());

    /**
     * Start connection to data base
     */
    public static void startConection() {
        LOGGER.info("Start connection to data base");
    }

    /**
     * Stop connection to data base
     */
    public static void stopConection() {
        LOGGER.info("Stop connection to data base");
    }
    /**
     * Put data to data base
     */
    public static void putData() {
        LOGGER.info("Put data to data base");
    }
    /**
     * Delete data from data base
     */
    public static void deleteData() {
        LOGGER.info("Delete data from data base");
    }
    /**
     * Get data from data base
     */
    public static void getData() {
        LOGGER.info("Get data from data base");
    }
}
