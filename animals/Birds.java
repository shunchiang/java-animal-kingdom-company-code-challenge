package animals;

public class Birds extends AbstractAnimals {
    public Birds(String name, int year) {
        super(name, year);
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
        return "ID :" + id + " Animal: " + name + " Movement: " + getMovement() + " Discovered: " + yearDiscovered
                + " reproduction method: " + getReproductionMethod() + " breathing method: " + getBeathingMethod()
                + " Ate: " + stomach;
    }

}
