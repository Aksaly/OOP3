package com.di;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class Main {
    public static void main(String[] args) {
        // Створюємо інжектор з FitnessModule
        Injector injector = Guice.createInjector(new FitnessModule());

        // Отримуємо екземпляр GymProgram через Guice
        GymProgram gymProgram = injector.getInstance(GymProgram.class);

        // Запускаємо тренування
        gymProgram.startTraining();
    }
}
