package animals;

import java.util.List;

public class Mammals extends AbstractAnimals {

    public Mammals(String name, int id, int year, List<String> stomach) {
        super(name, id, year, stomach);
    }

    @Override
    public String getMovement() {
        return "Walk";
    }

    @Override
    public String getBeathingMethod() {
        return "Lungs";
    }

    @Override
    public String getReproductionMethod() {
        return "Live Birth";
    }

    @Override
    public String toString() {
        return "Animal: " + name + " Movement: " + getMovement() + " reproduction method: " + getReproductionMethod()
                + " Ate: " + stomach;
    }

}
