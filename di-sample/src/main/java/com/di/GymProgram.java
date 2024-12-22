package com.di;

public class GymProgram {
    public static void main(String[] args) {
        Trainer trainer = new FitnessTrainer("Олександр");
        Client client = new GymClient("Іван");

        trainer.startTraining(client);
        client.performExercise("Присідання");
        trainer.endTraining(client);
    }
}