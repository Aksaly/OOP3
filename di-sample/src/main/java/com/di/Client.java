package com.di;

public class Client extends Participant {

    public Client(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Client{name='" + getName() + "'}";
    }
}
