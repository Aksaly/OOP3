package com.di;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.name.Names;

public class FitnessModule extends AbstractModule {
    @Override
    protected void configure() {
        // Впроваджуємо залежність для тренера
        bind(Trainer.class).toInstance(new Trainer("John Doe", "Strength Training"));
        
        // Впроваджуємо залежність для клієнта
        bind(GymClient.class).toInstance(new GymClient("ClientName", new Trainer("John Doe", "Strength Training")));
    }
}
