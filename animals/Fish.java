package animals;

public class Fish extends AbstractAnimals {

    public Fish(String name, int year) {
        super(name, year);
    }

    @Override
    public String getMovement() {
        return "Swim";
    }

    @Override
    public String getBeathingMethod() {
        return "Gills";
    }

    @Override
    public String getReproductionMethod() {
        return "Spawning";
    }

    @Override
    public String toString() {
        return "ID :" + id + " Animal: " + name + " Movement: " + getMovement() + " Discovered: " + yearDiscovered
                + " reproduction method: " + getReproductionMethod() + " breathing method: " + getBeathingMethod()
                + " Ate: " + stomach;
    }
}
