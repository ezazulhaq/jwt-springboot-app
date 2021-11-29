package com.haa.jwtspringbootapp.entity;

import lombok.Data;

@Data
public class UserResponse {

    private String token;
    private String message;

    public UserResponse() {
    }

    public UserResponse(String token, String message) {
        this.token = token;
        this.message = message;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "UserResponse [message=" + message + ", token=" + token + "]";
    }

}
