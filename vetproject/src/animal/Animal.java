package animal;

public abstract class Animal {

    protected AnimalIdentity identity;

    public Animal(AnimalIdentity identity) {
        this.identity = identity;
    }

    public AnimalIdentity getIdentity() {
        return identity;
    }

    // POLYMORPHISM
    public abstract String getSpecies();
}
