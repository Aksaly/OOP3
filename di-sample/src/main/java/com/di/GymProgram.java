package com.di;

public class GymProgram {
    private GymClient gymClient;

    // Впровадження залежності через конструктор
    public GymProgram(GymClient gymClient) {
        this.gymClient = gymClient;
    }

    public void startTraining() {
        gymClient.train();
    }
}
