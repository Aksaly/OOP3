package com.di;

public class GymClient {
    private String clientName;
    private Trainer trainer;

    // Впровадження залежності через конструктор
    public GymClient(String clientName, Trainer trainer) {
        this.clientName = clientName;
        this.trainer = trainer;
    }

    public String getClientName() {
        return clientName;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public void train() {
        System.out.println(clientName + " is training with " + trainer.getName() + ", specializing in " + trainer.getSpecialty());
    }
}
