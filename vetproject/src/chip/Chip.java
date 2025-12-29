package chip;

import animal.Animal;

public class Chip {
    private String chipId;
    private Animal animal;

    public Chip(String chipId, Animal animal) {
        this.chipId = chipId;
        this.animal = animal;
    }

    public Animal getAnimal() {
        return animal;
    }
}
