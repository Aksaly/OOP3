package com.di;

public class GymClient implements Client {
    private String name;

    public GymClient(String name) {
        this.name = name;
    }

    @Override
    public void performExercise(String exercise) {
        System.out.println(name + " виконує вправу: " + exercise);
    }

    @Override
    public String getName() {
        return name;
    }
}