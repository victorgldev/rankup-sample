package com.victordev.database;

public class Database {

    private DatabaseManager databaseManager;

    public void send() {
        databaseManager = new DatabaseManager();
        databaseManager.connect("127.0.0.1", "rankup", "root", "");
        System.out.println("Connected to database\n");
    }

    public void disconnect() {
        if (databaseManager != null) {
            databaseManager.disconnect();
        }
    }

}
