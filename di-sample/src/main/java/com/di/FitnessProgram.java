package com.di;

import com.google.inject.Inject;
import java.util.List;

public class FitnessProgram {

    private List<Participant> participants;
    private FitnessTrainer fitnessTrainer;

    // Впровадження залежностей через конструктор
    @Inject
    public FitnessProgram(List<Participant> participants, FitnessTrainer fitnessTrainer) {
        this.participants = participants;
        this.fitnessTrainer = fitnessTrainer;
    }

    // Метод для запуску тренування
    public void startTraining() {
        System.out.println(fitnessTrainer.getName() + " is training:");
        for (Participant participant : participants) {
            System.out.println("Participant: " + participant.getName());
        }
    }
}
