package animal;

public class Dog extends Animal {
    public Dog(AnimalIdentity identity) {
        super(identity);
    }

    @Override
    public String getSpecies() {
        return "Köpek";
    }
}
