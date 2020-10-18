package animals;

import java.util.List;

public class Fish extends AbstractAnimals {

    public Fish(String name, int id, int year, List<String> stomach) {
        super(name, id, year, stomach);
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
        return "Animal: " + name + " Movement: " + getMovement() + " Reproduction Method: " + getReproductionMethod()
                + " Ate: " + stomach;
    }
}
