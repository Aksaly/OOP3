package com.di;

public class FitnessTrainer extends Participant {

    public FitnessTrainer(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "FitnessTrainer{name='" + getName() + "'}";
    }
}
