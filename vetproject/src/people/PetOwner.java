package people;

import java.util.ArrayList;
import animal.Animal;

public class PetOwner extends Person {

    private ArrayList<Animal> animals = new ArrayList<>();

    public PetOwner(String id, String name, String email, String password) {
        super(id, name, email, password);
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    @Override
    public void showRole() {
        System.out.println("Rol: HASTA SAHİBİ");
    }
}

