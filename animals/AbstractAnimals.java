package animals;

import java.util.List;

abstract class AbstractAnimals {
    protected String name;
    protected int id;
    protected int yearDiscovered;
    protected List<String> stomach;

    public AbstractAnimals(String name, int id, int year, List<String> stomach) {
        this.name = name;
        this.id = id;
        this.yearDiscovered = year;
        this.stomach = stomach;
    }

    void eat(String food) {
        this.stomach.add(food);
    }

    abstract String getMovement();

    abstract String getBeathingMethod();

    abstract String getReproductionMethod();
}
