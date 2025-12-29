package animal;

public class Cat extends Animal {
    public Cat(AnimalIdentity identity) {
        super(identity);
    }

    @Override
    public String getSpecies() {
        return "Kedi";
    }
}
