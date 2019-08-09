package com.its4u.immo.publication.rest;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class HelloWorld {

    private String message;

    public HelloWorld(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
