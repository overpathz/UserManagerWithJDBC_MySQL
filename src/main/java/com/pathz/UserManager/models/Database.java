package com.pathz.UserManager.models;

import com.pathz.UserManager.entities.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Database {
    private static final Database instance = new Database();

    private List<User> database;

    public static Database getInstance() {
        return instance;
    }

    private Database() {
        database = new ArrayList<>();
    }

    public void add(User user) {
        database.add(user);
    }

    public void delete(User user) {
        if (database.stream().anyMatch(x->x.getUsername().equals(user.getUsername()))) {
            database.remove(user);
        }
    }

    public List<String> list() {
        return database.stream()
                .map(User::getUsername)
                .collect(Collectors.toList());
    }
}
