package org.example.Task2;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class AuthorizationAdapter {
    private Авторизація authorization;

    public boolean authenticate(DatabaseAdapter db) {
        db.getUserData();
        return true;
    }
}
