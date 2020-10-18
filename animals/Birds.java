package animals;

import java.util.List;

public class Birds extends AbstractAnimals {
    public Birds(String name, int id, int year, List<String> stomach) {
        super(name, id, year, stomach);
    }

    @Override
    public String getMovement() {
        return "Fly";
    }

    @Override
    public String getBeathingMethod() {
        return "Lungs";
    }

    @Override
    public String getReproductionMethod() {
        return "Eggs";
    }

    @Override
    public String toString() {
        return "Animal: " + name + " Movement: " + getMovement() + " reproduction method: " + getReproductionMethod()
                + " Ate: " + stomach;
    }

}
