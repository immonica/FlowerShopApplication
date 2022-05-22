package org.example.exceptions;

public class UserDoesNotExist extends Exception {
    private String username;

    public UserDoesNotExist(String username) {
        super(String.format("An account with the username '%s' does not exist", username));
        this.username = username;
    }

    public String getUsername() {
        return this.username;
    }
}