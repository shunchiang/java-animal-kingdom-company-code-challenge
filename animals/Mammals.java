package animals;

public class Mammals extends AbstractAnimals {

    public Mammals(String name, int year) {
        super(name, year);
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
        return "ID :" + id + " Animal: " + name + " Movement: " + getMovement() + " Discovered: " + yearDiscovered
                + " reproduction method: " + getReproductionMethod() + " breathing method: " + getBeathingMethod()
                + " Ate: " + stomach;
    }

}
