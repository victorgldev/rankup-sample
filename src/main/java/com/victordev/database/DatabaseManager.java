package com.victordev.database;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class DatabaseManager {

    private HikariDataSource dataSource;

    public DatabaseManager(String dbHost, String dbName, String dbUser, String dbPassword) {
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl("jdbc:mysql://" +dbHost + "/" + dbName + "?useSSL=false");
        config.setUsername(dbUser);
        config.setPassword(dbPassword);
        config.setMaximumPoolSize(10);
        config.setMinimumIdle(2);
        config.setConnectionTimeout(30000);
        config.setIdleTimeout(30000);
        config.setMaxLifetime(1800000);

        dataSource = new HikariDataSource(config);
    }

    public Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }

    public void disconnect() {
        if (dataSource != null) {
            dataSource.close();
        }
    }

}
