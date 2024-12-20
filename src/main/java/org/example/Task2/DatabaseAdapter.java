package org.example.Task2;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class DatabaseAdapter {
    private БазаДаних database;

    public String getUserData() {
        return database.отриматиДаніКористувача();
    }

    public String getStatisticalData() {
        return database.отриматиСтатистичніДані();
    }
}

