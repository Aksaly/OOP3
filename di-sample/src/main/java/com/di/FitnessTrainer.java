package com.di;

public class FitnessTrainer implements Trainer {
    private String name;

    public FitnessTrainer(String name) {
        this.name = name;
    }

    @Override
    public void startTraining(Client client) {
        System.out.println(name + " почав тренування з " + client.getName());
    }

    @Override
    public void endTraining(Client client) {
        System.out.println(name + " завершив тренування з " + client.getName());
    }

    public String getName() {
        return name;
    }
}